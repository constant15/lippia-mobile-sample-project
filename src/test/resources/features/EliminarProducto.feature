@Ignore
Feature: Eliminar un producto del carrito

  Scenario: Eliminación de un producto del carrito de compras por defecto
    Given Estoy en la app MydemoApp
    When Hago click en un producto
    And Hago click en el botón 'Add to cart'
    And Hago click en el botón 'Cart'
    And Hago click en el botón 'Remove Item' del producto agregado
    Then Se verifica que se ha eliminado un producto en el carrito


  Scenario: Eliminación de un producto del carrito de compras con usuario logueado
    Given Estoy en la app MydemoApp
    When Hago click en un producto
    And Hago click en el botón 'Add to cart'
    And Hago click en el botón desplegable
    And Hago click en la page 'Catalog'
    And Hago click en otro producto del catalogo
    And Hago click en el botón 'Add to cart'
    And Hago click en el botón 'Cart'
    And Hago click en el botón 'Remove Item' de uno de los productos del carrito
    Then Se verifica que se ha eliminado un producto en el carrito






