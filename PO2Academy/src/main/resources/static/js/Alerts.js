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
function logOut(){
Toast.fire({
  icon: 'success',
  title: 'Se ha cerrado sesión exitosamente.',
  iconColor: '#028090'
})
}

function congratulations(){
Swal.fire({
  icon: 'success',
  title: 'Has completado todos nuestros desafíos!',
  confirmButtonColor: '#028090',
   confirmButtonText: 'Genial!',
  iconColor: '#028090'
})
}