package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.BusquedaProductoService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BusquedaProductoSteps extends PageSteps {

    @Given("Estoy en la app MYDEMOAPP")
    public void cargaApp(){
        BusquedaProductoService.homePage();
    }

    @When("Hago click en el boton desplegable de la home page")
    public void clickDesplegable() {
        BusquedaProductoService.multipleButtonClick();
    }

    @And("Hago click en la page 'Log In'")
    public void clickPageLogin() {
        BusquedaProductoService.loginPageClick();
    }


    @And("^ingreso el usuario (.*) en la caja de texto 'Username' y la contraseña (.*) en la caja de texto 'Password'$")
    public void datosLogin(String user, String pass) {
        BusquedaProductoService.ingresoUsuario(user, pass);
    }

    @And("hago click en el boton 'Login'")
    public void clickLoginButton() {
        BusquedaProductoService.loginButtonClick();
    }
    @Then("la home page con los productos se muestra correctamente")
    public void verificacionProductosVisibles() {
        BusquedaProductoService.verificacionLogin();
    }


}





