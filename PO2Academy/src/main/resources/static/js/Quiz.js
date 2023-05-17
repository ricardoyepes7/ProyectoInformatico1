const answerArray = [];
const pregunta=document.querySelector('.question');
const body =document.querySelector('.bodyContent');
const modalTitle =document.querySelector('.modal-title')
var questions;


function setQuestions(ques,challenge){
    modalTitle.innerText='Desafío '+challenge;
    questions=ques.sort(()=>Math.random-0.5)
    nextQuestion();
}

function nextQuestion(){
openIsLoading()
setTimeout(()=> { closeIsLoading()
if(questions.length>0){
   body.innerHTML=''
   var index = questions.length -1
    pregunta.innerText=questions[index].question
    questions[index].answerList.forEach(answer=>{
        var card= document.createElement("div");
        card.className='card'
        var cardBody = document.createElement("div");
        cardBody.className='card-body answer-btn'
        cardBody.id=answer.id;
        cardBody.addEventListener('click',()=>{
             answerArray.push(cardBody.id)
             nextQuestion()
        })
        var h6 = document.createElement("h6");
        h6.innerText=answer.optionAnswer;

        cardBody.append(h6);
        card.append(cardBody);
         body.append(card);
    })
    questions.pop()
}else{
    openIsLoading()
    sentAnswers()
}
}, 300);
}
function sentAnswers(){
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
  .then(res=>{
        Swal.fire({
          position: 'center',
          icon: 'success',
          title: 'Respuestas enviadas exitosamente.',
          showConfirmButton: false,
          timer: 3000,
          iconColor: '#456990'
        }).then((result) => {
            setTimeout(()=> {grade(res)}, 500);
        })

  })
  .catch(error => failSentQuiz());
}
function grade(res){
     closeIsLoading()
     document.querySelector('.modalTotalQuestions').append(' '+res.correct+'/'+res.total)
     document.querySelector('.modalScore').append(' '+res.score+'%')
     openModal()
}
function openIsLoading() {
         document.getElementById("backdropIsLoading").style.display = "block"
         document.getElementById("isLoading").style.display = "block"
         document.getElementById("isLoading").classList.add("show")
}
 function closeIsLoading() {
        document.getElementById("backdropIsLoading").style.display = "none"
        document.getElementById("isLoading").style.display = "none"
        document.getElementById("isLoading").classList.remove("show")
 }
 function openModal() {
         document.getElementById("backdrop").style.display = "block"
         document.getElementById("exampleModal").style.display = "block"
         document.getElementById("exampleModal").classList.add("show")
 }