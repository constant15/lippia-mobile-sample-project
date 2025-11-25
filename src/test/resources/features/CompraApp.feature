@Ignore

Feature: Completar la compra con los valores por defecto

Scenario: Compra de productos exitosa
  Given Estoy en la app MydemoApp
  When Hago click en el botón desplegable
  And Hago click en la page 'Log in'
  And ingreso el <username> y el <password>
  And hago click en el botón 'Login'
  And Hago click en un producto
  And Hago click en el botón 'Add to cart'
  And Hago click en el botón 'Cart'
  And hago click en el botón 'Proceed To Checkout'
  And Ingreso los datos personales: 'Full Name', 'Address Line 1', 'City', 'Zip Code', 'Country'
  And hago click en el botón 'To Payment'
  And Ingreso los datos de la forma de pago: 'Full Name', 'Card Number', 'Expiration Date', 'Security Code'
  And hago click en el botón 'Review Order'
  And hago click en el botón 'Place Order'
  Then se verifica que se realiza la compra correctamente



Scenario: Compra incompleta por falta de datos bancarios
  Given Estoy en la app MydemoApp
  When Hago click en el botón desplegable
  And Hago click en la page 'Log in'
  And ingreso el <username> y el <password>
  And hago click en el botón 'Login'
  And Hago click en un producto
  And Hago click en el botón 'Add to cart'
  And Hago click en el botón 'Cart'
  And hago click en el botón 'Proceed To Checkout'
  And Ingreso los datos personales: 'Full Name', 'Address Line 1', 'City', 'Zip Code', 'Country'
  And hago click en el botón 'To Payment'
  And Ingreso los datos de la forma de pago: 'Full Name', 'Card Number', 'Expiration Date', 'Security Code'
  And hago click en el botón 'Review Order'
  And hago click en el botón 'Place Order'
  Then se verifica que se realiza la compra correctamente

