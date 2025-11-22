
Feature: Búsqueda de productos

Scenario Outline: Búsqueda exitosa de los productos de la home page
Given Estoy en la app mydemo sauce
When Hago click en el botón desplegable
And Hago click en la page 'Log in'
And ingreso el <username> y el <password>
And hago click en el botón 'Login'
Then la home page con los productos se muestra correctamente
  Examples:
    | username | password |



