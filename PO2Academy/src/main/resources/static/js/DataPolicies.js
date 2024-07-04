function dataPolicies() {
  var myHeaders = new Headers();
  myHeaders.append("Content-Type", "application/json");
  var requestOptions = {
    method: 'POST',
    headers: myHeaders
  };
  console.log("HOLA")
  Swal.fire({
    icon: 'info',
    title: 'Política de Tratamiento de Datos Personales de PO2Academy.',
    iconColor: '#028090',
    html:
      '<div style="text-align: justify; height: 40vh;"> ' +
      ' <p>PO2Academy se compromete a proteger la privacidad y seguridad de la información ' +
      ' personal de nuestros usuarios("usted" o "su").Esta Política de Tratamiento de Datos Personales describe cómo ' +
      'recopilamos, usamos y compartimos su información personal cuando utiliza nuestro sitio web y nuestros servicios ' +
      'relacionados(colectivamente, los "Servicios"). Al acceder o utilizar nuestros Servicios, usted acepta la ' +
      'recopilación, el uso y la divulgación de su información personal según lo establecido en esta Política de ' +
      'Tratamiento de Datos Personales.</p> ' +
      '<h4>1. Información que Recopilamos</h4> ' +

      '<p>Recopilamos información personal que usted nos proporciona directamente cuando utiliza nuestros Servicios. Esto ' +
      'puede incluir, entre otros, su nombre, dirección de correo electrónico, información de contacto y detalles de ' +
      'pago cuando realiza una compra. También recopilamos información automáticamente cuando usted interactúa con ' +
      'nuestros Servicios, como su dirección IP, tipo de dispositivo, navegador web y patrones de comportamiento de ' +
      'navegación.</p> ' +
      '<h4>2. Uso de la Información</h4> ' +
      '<p>Utilizamos la información personal que recopilamos para:</p> ' +
      '<ul> ' +
      '<li>Proporcionar, mantener y mejorar nuestros Servicios.</li> ' +
      '<li>Procesar transacciones y enviar confirmaciones relacionadas con compras que realice.</li> ' +
      '<li>Enviarle comunicaciones sobre actualizaciones de productos, ofertas especiales y otros avisos promocionales. ' +
      '</li> ' +
      '<li>Detectar y prevenir actividades fraudulentas o ilegales.</li> ' +
      '</ul> ' +
      '<h4>3. Compartir Información</h4> ' +
      '<p>No compartimos su información personal con terceros, excepto en las siguientes circunstancias:</p> ' +

      '<ul> ' +
      '<li>Con su consentimiento explícito.</li> ' +
      '<li>Con proveedores de servicios que necesitan acceder a su información para brindar servicios en nuestro nombre ' +
      '(por ejemplo, procesadores de pagos y servicios de entrega).</li> ' +
      '<li>En respuesta a solicitudes legales o para cumplir con las leyes aplicables y regulaciones.</li> ' +
      '<li>Para proteger nuestros derechos, privacidad, seguridad o propiedad, y/o los de nuestros afiliados, usted o ' +
      'otros usuarios.</li> ' +
      '</ul> ' +
      '<h4>4. Cookies y Tecnologías Similares</h4> ' +
      '<p>Utilizamos cookies y tecnologías similares para recopilar información sobre su interacción con nuestros Servicios. ' +
      'Estas tecnologías nos ayudan a mejorar la funcionalidad de nuestro sitio web y a personalizar su experiencia de ' +
      'usuario. Puede configurar su navegador para rechazar todas las cookies o para indicar cuándo se está enviando ' +
      'una cookie.</p> ' +
      '<h4>5. Seguridad</h4> ' +
      '<p>Implementamos medidas de seguridad para proteger su información personal contra accesos no autorizados, alteraciones, ' +
      'divulgaciones o destrucciones no autorizadas. Sin embargo, tenga en cuenta que ninguna transmisión por internet ' +
      'o método de almacenamiento electrónico es 100% seguro y, por lo tanto, no podemos garantizar la seguridad ' +
      'absoluta de su información.</p> ' +
      '<h4>6. Acceso y Control de su Información</h4> ' +
      '<p>Usted tiene derecho a acceder, corregir, actualizar o eliminar su información personal en cualquier momento. También ' +
      'puede optar por no recibir comunicaciones promocionales de nuestra parte siguiendo las instrucciones de exclusión' +
      'proporcionadas en dichas comunicaciones.</p> ' +
      '<h4>7. Cambios en esta Política de Tratamiento de Datos Personales</h4> ' +
      '<p>Nos reservamos el derecho de modificar esta Política de Tratamiento de Datos Personales en cualquier momento. ' +
      'Cualquier cambio entrará en vigencia inmediatamente después de la publicación en nuestro sitio web. Le ' +
      'recomendamos que revise periódicamente esta página para estar al tanto de cualquier cambio.</p> ' +
      '<h4>8. Contacto</h4> ' +
      '<p>Si tiene alguna pregunta sobre esta Política de Tratamiento de Datos Personales, puede comunicarse con nosotros a ' +
      'través de <a href="mailto:correo@dominio.com">correo electrónico de contacto</a> o por correo postal a <br> ' +
      '[Dirección Postal].</p> ' +
      '<p>Al utilizar nuestros Servicios, usted indica su aceptación de esta Política de Tratamiento de Datos Personales. Si ' +
      'no está de acuerdo con esta política, por favor no utilice nuestros Servicios.</p> ' +
      '</div>',

    footer: '<p><em>Última actualización: 1 de noviembre de 2023</em></p>',
    allowOutsideClick: false,
    allowEscapeKey: false,
    confirmButtonColor: '#028090',
    confirmButtonText: 'Aceptar',
    width: '60rem',
    height: '30rem',
    preConfirm: (login) => {
      return fetch('/po2academy/data-policies', requestOptions)
        .then(response => {
          if (!response.ok) {
            return response.text().then(errorData => {
              throw new Error(errorData);
            });
          }
        })
        .catch(error => {
          Swal.showValidationMessage(
            `Request failed: ${error}`
          )
        })
    }
  }).then((result) => {
    if (result.isConfirmed) {
      Swal.fire({
        position: 'bottom-end',
        icon: 'success',
        showConfirmButton: false,
        timer: 1000
      })
    }
  })
}

























