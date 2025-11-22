
Feature: Agregar productos al carrito
Scenario: Agregar un producto al carrito por defecto
Given Estoy en la app MydemoApp
When Hago click en un producto
And Hago click en el botón 'Add to cart'
And Hago click en el botón 'Cart'
Then Se verifica que hay un producto en el carrito


Scenario Outline: Agregar un producto al carrito con usuario logueado
Given Estoy en la app MydemoApp
When Hago click en el botón desplegable
And Hago click en la page 'Log In'
And ingreso el <username> y el <password>
And hago click en el botón 'Login'
And Hago click en un producto
And Hago click en el botón 'Add to cart'
And Hago click en el botón 'Cart'
Then Se verifica que hay un producto en el carrito
  Examples:
    | username | password |


