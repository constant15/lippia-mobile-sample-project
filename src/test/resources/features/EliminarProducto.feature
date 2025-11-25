@EliminarProducto

  @Demo
Feature: Eliminar un producto del carrito

  Scenario: Eliminación de un producto del carrito de compras por defecto
    Given Estoy en la app MYDEMOAPP
    When Hago click en un producto
    And Hago click en el botón 'Add to Cart'
    And Hago click en el botón 'Cart'
    And Hago click en el botón 'Remove Item' del producto agregado
    Then Se verifica que se ha eliminado un producto en el carrito

  @Demo
  Scenario Outline: Eliminación de un producto del carrito de compras con usuario logueado
    Given Estoy en la app MYDEMOAPP
    When Hago click en el boton desplegable de la home page
    And Hago click en la page 'Log In'
    And ingreso el usuario <username> en la caja de texto 'Username' y la contraseña <password> en la caja de texto 'Password'
    And hago click en el boton 'Login'
    And Hago click en un producto
    And Hago click en el botón 'Add to Cart'
    And Hago click en el botón 'Cart'
    And Hago click en el botón 'Remove Item' del producto agregado
    Then Se verifica que se ha eliminado un producto en el carrito

  Examples:
    | username                | password  |
    |bod@example.com          | 10203040  |





