const answerArray = [];
const question = document.querySelectorAll(".question");
const responseContainer = document.getElementById("response-container");
const backdropLoader = document.getElementById("backdrop-loader")
const dialogTitle = document.getElementById("dialog-title")
var questions;

function setQuestions(ques, challenge) {
  dialogTitle.innerText = 'Desafío ' + challenge;
  questions = ques.sort(() => Math.random - 0.5)
  nextQuestion();
}

function nextQuestion() {
  openIsLoading()
  setTimeout(() => {
    closeIsLoading()
    if (questions.length > 0) {
      responseContainer.innerHTML = ''
      var index = questions.length - 1
      question.forEach(ques => {
        ques.innerText = questions[index].question
      })
      questions[index].answerList.forEach(answer => {
        var card = document.createElement("article");
        card.className = 'card'
        card.className = 'round no-elevate large-padding wave center-align middle-align'
        card.id = answer.id;
        card.addEventListener('click', () => {
          answerArray.push(card.id)
          nextQuestion()
        })

        var h6 = document.createElement("h6");
        h6.innerText = answer.optionAnswer;

        card.append(h6);
        responseContainer.append(card);
      })
      questions.pop()
    } else {
      openIsLoading()
      sentAnswers()
    }
  }, 300);
}

function sentAnswers() {
  var myHeaders = new Headers();
  myHeaders.append("Content-Type", "application/json");
  var data = JSON.stringify(answerArray);
  var requestOptions = {
    method: 'POST',
    headers: myHeaders,
    body: data
  };
  fetch("http://localhost:8080/po2academy/grade", requestOptions)
    .then(res => res.ok ? res.json() : Promise.reject(res))
    .then(res => {
      Swal.fire({
        position: 'center',
        icon: 'success',
        title: 'Respuestas enviadas exitosamente.',
        showConfirmButton: false,
        timer: 3000,
        iconColor: '#456990'
      }).then((result) => {
        setTimeout(() => { grade(res) }, 500);
      })

    })
    .catch(error => failSentQuiz());
}

function openIsLoading() {
  backdropLoader.classList.add("active")
}

function closeIsLoading() {
  backdropLoader.classList.remove("active")
}

function grade(res) {
  closeIsLoading()
  document.getElementById("dialog-total-questions").append(' ' + res.correct + '/' + res.total)
  document.getElementById("dialog-score").append(' ' + res.score + '%')
  openModal()
}

function openModal() {
  document.getElementById("backdrop-result").classList.add("active")
  document.getElementById("dialog-result").classList.add("active")
}