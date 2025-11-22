
Feature: Búsqueda de productos por rubro y gestión de favoritos
  @Demo
  Scenario Outline: Búsqueda exitosa de productos en un rubro específico
    Given que el usuario hace click en el boton 'Iniciar sesion'
    And que el usuario ingresa a su cuenta con su <user> y su <contraseña>
    When el usuario introduce un <rubro> en el buscador
    Then el sistema muestra una lista de productos del rubro seleccionado

    Examples:
      | user                    | contraseña             | rubro                  |
      | TESTUSER450396697       | QZb9VY6okr             | Zapatillas Hombre      |

#@Ignore
#  Scenario: Guardar producto en favoritos
#    Given que el usuario ha encontrado un producto de interés en los resultados de búsqueda
#    When el usuario presiona el botón de "Agregar a favoritos"
#    Then el sistema guarda el producto en la lista de favoritos del usuario
#@Ignore
#  Scenario: Visualizar productos guardados en favoritos
#    Given que el usuario ha agregado productos a su lista de favoritos
#    When el usuario navega a la sección de favoritos
#   Then el sistema muestra los productos guardados previamente



