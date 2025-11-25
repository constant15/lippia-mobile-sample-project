@AgregarProducto

@Demo
Feature: Agregar productos al carrito
  Scenario: Agregar un producto al carrito por defecto
    Given Estoy en la app MYDEMOAPP
    When Hago click en un producto
    And Hago click en el botón 'Add to Cart'
    And Hago click en el botón 'Cart'
    Then Se verifica que hay un producto en el carrito

  @Demo
  Scenario Outline: Agregar un producto al carrito con usuario logueado
    Given Estoy en la app MYDEMOAPP
    When Hago click en el boton desplegable de la home page
    And Hago click en la page 'Log In'
    And ingreso el usuario <username> en la caja de texto 'Username' y la contraseña <password> en la caja de texto 'Password'
    And hago click en el boton 'Login'
    And Hago click en un producto
    And Hago click en el botón 'Add to Cart'
    And Hago click en el botón 'Cart'
    Then Se verifica que hay un producto en el carrito

    Examples:
    | username                | password |
    |bod@example.com          | 10203040  |


