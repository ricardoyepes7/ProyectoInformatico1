const Toast = Swal.mixin({
  toast: true,
  position: 'bottom-end',
  showConfirmButton: false,
  timer: 3000,
  timerProgressBar: true,
  didOpen: (toast) => {
    toast.addEventListener('mouseenter', Swal.stopTimer)
    toast.addEventListener('mouseleave', Swal.resumeTimer)
  }
});
function loginError(){
Toast.fire({
  icon: 'error',
  title: 'Usuario o contraseña incorrectos.',
  iconColor: '#F45B69'
})
}
function error(message){
Toast.fire({
  icon: 'error',
  title: message,
  iconColor: '#F45B69'
})
}
function bigError(title,message){
Swal.fire({
  icon: 'error',
  title: title,
  text: message,
  confirmButtonColor: '#028090',
  confirmButtonText: 'Volver',
  allowOutsideClick: false,
  allowEscapeKey: false,
}).then((result) => {
    window.location = "/po2academy/login"
  })
}
function logOut(){
Toast.fire({
  icon: 'success',
  title: 'Se ha cerrado sesión exitosamente.',
  iconColor: '#028090'
})
}

function congratulations(nivel){
Swal.fire({
  icon: 'success',
  title: '¡Completaste todos los desafíos de este nivel!',
  text: 'Has conseguido subir a nivel '+(nivel+1),
  confirmButtonColor: '#028090',
  confirmButtonText: 'Genial!',
  allowOutsideClick:false,
  allowEscapeKey: false,
  iconColor: '#028090',
  preConfirm: (login) => {
      return fetch('/po2academy/grade')
        .then(response => {
          if (!response.ok) {
             return response.text().then(errorData => {
                     throw new Error(errorData);
                   });
          }
          return response.json()
        })
        .catch(error => {
          Swal.showValidationMessage(
            `Request failed: ${error}`
          )
        })
    },
  allowOutsideClick: () => !Swal.isLoading()
}).then((result) => {
    window.location = "/po2academy/home"
   })
}

function failSentQuiz(){
Swal.fire({
  icon: 'error',
  title: 'No fue posible enviar tú respuestas.',
  text: 'Estamos presentando problemas en estos momentos, por favor inténtalo más tarde.',
  confirmButtonColor: '#028090',
  confirmButtonText: 'Volver',
  iconColor: '#F45B69',
  allowOutsideClick: false,
  allowEscapeKey: false,
  showLoaderOnConfirm: true,
}).then((result) => {
  		if (result.isConfirmed) {
  			window.location = "/po2academy/home"
  		}
  	})
}