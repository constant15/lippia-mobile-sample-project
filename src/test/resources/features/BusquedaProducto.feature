@BusquedaProducto

Feature: Búsqueda de productos

  @Demo
Scenario Outline: Búsqueda exitosa de los productos de la home page
  Given Estoy en la app MYDEMOAPP
  When Hago click en el boton desplegable de la home page
  And Hago click en la page 'Log In'
  And ingreso el usuario <username> en la caja de texto 'Username' y la contraseña <password> en la caja de texto 'Password'
  And hago click en el boton 'Login'
  Then la home page con los productos se muestra correctamente

  Examples:
    | username                | password  |
    |bod@example.com          | 10203040  |


