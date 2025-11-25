package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.MyDemoAppService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyDemoAppSteps extends PageSteps {

    //Step en comun para todos los features (Posible bg)
    @Given("Estoy en la app MYDEMOAPP")
    public void cargaApp(){
        MyDemoAppService.homePage();
    }

    //Steps utilizados en el feature BusquedaProducto

    @When("Hago click en el boton desplegable de la home page")
    public void clickDesplegable() {
        MyDemoAppService.multipleButtonClick();
    }
    @And("Hago click en la page 'Log In'")
    public void clickPageLogin() {
        MyDemoAppService.loginPageClick();
    }
    @And("^ingreso el usuario (.*) en la caja de texto 'Username' y la contraseña (.*) en la caja de texto 'Password'$")
    public void datosLogin(String user, String pass) {
        MyDemoAppService.ingresoUsuario(user, pass);
    }
    @And("hago click en el boton 'Login'")
    public void clickLoginButton() {
        MyDemoAppService.loginButtonClick();
    }
    @Then("la home page con los productos se muestra correctamente")
    public void verificacionProductosVisibles() {
        MyDemoAppService.verificacionLogin();
    }

    //Steps utilizados en el feature AgregarProducto
    @When("Hago click en un producto")
    public void clickUnProducto() {
        MyDemoAppService.productClick();
    }
    @And("Hago click en el botón 'Add to Cart'")
    public void clickBotonAddCart() {
        MyDemoAppService.addCartClick();
    }

    @And("Hago click en el botón 'Cart'")
    public void clickBotonCart() {
        MyDemoAppService.clickCartButton();
    }

    @Then("Se verifica que hay un producto en el carrito")
    public void verificacionCarritoCargado() {
        MyDemoAppService.verifyCartProduct();
    }
}





