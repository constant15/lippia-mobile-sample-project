@CompraCompleta
Feature: Completar la compra con los valores por defecto

  @Demo
Scenario Outline: Compra de productos exitosa
  Given Estoy en la app MYDEMOAPP
  When Hago click en el boton desplegable de la home page
  And Hago click en la page 'Log In'
  And ingreso el usuario <username> en la caja de texto 'Username' y la contraseña <password> en la caja de texto 'Password'
  And hago click en el boton 'Login'
  And Hago click en un producto
  And Hago click en el botón 'Add to Cart'
  And Hago click en el botón 'Cart'
  And hago click en el botón 'Proceed To Checkout'
  And Ingreso los datos personales: 'Full Name', 'Address Line 1', 'City', 'Zip Code', 'Country'
  And hago click en el botón 'To Payment'
  And Ingreso los datos de la forma de pago: 'Full Name', 'Card Number', 'Expiration Date', 'Security Code'
  And hago click en el botón 'Review Order'
  And hago click en el botón 'Place Order'
  Then se verifica que se realiza la compra correctamente
  Examples:
    | username                | password |
    |bod@example.com          | 10203040  |

  @Demo
  Scenario Outline: Compra incompleta por falta de datos bancarios
    Given Estoy en la app MYDEMOAPP
    When Hago click en el boton desplegable de la home page
    And Hago click en la page 'Log In'
    And ingreso el usuario <username> en la caja de texto 'Username' y la contraseña <password> en la caja de texto 'Password'
    And hago click en el boton 'Login'
    And Hago click en un producto
    And Hago click en el botón 'Add to Cart'
    And Hago click en el botón 'Cart'
    And hago click en el botón 'Proceed To Checkout'
    And Ingreso los datos personales: 'Full Name', 'Address Line 1', 'City', 'Zip Code', 'Country'
    And hago click en el botón 'To Payment'
    And hago click en el botón 'Review Order'
    Then se verifica que no se completa la compra por falta de datos
    Examples:
      | username                 | password |
      |bod@example.com          | 10203040  |
