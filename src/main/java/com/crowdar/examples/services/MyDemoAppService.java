package com.crowdar.examples.services;

import com.crowdar.examples.constants.MyDemoAppConstants;

import com.crowdar.core.actions.MobileActionManager;
import junit.framework.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class MyDemoAppService {

    //Metodos utilizados en el feature Busqueda de productos
    public static void homePage(){
        MobileActionManager.waitVisibility(MyDemoAppConstants.BUTTON_MULTIPLE_ID);
        Assert.assertTrue("La app no se muestra correctamente.", MobileActionManager.isVisible(MyDemoAppConstants.BUTTON_MULTIPLE_ID));
    }

    public static void multipleButtonClick(){
        MobileActionManager.click(MyDemoAppConstants.BUTTON_MULTIPLE_ID);
    }

    public static void loginPageClick(){
        MobileActionManager.click(MyDemoAppConstants.BUTTON_LOG_IN_ID);
    }

    public static void loginButtonClick(){
        MobileActionManager.click(MyDemoAppConstants.BUTTON_LOGIN_ID);
    }

    public static void ingresoUsuario(String usuario, String pass){
        MobileActionManager.setInput(MyDemoAppConstants.BOX_USERNAME_XPATH, usuario);
        MobileActionManager.setInput(MyDemoAppConstants.BOX_PASSWORD_XPATH, pass);
    }

    public static void verificacionLogin(){
        MobileActionManager.waitVisibility(MyDemoAppConstants.BUTTON_MULTIPLE_ID);
        Assert.assertTrue("El usuario no ha ingresado.", MobileActionManager.isVisible(MyDemoAppConstants.BUTTON_MULTIPLE_ID));
    }

    //Metodos utilizados en el feature Agregat producto

    public static void productClick(){
        MobileActionManager.click(MyDemoAppConstants.PRODUCT1_IMAGE_XPATH);
    }
    public static void addCartClick(){
        MobileActionManager.click(MyDemoAppConstants.ADD_CART_PRODUCT_ID);
    }
    public static void clickCartButton(){
        MobileActionManager.click(MyDemoAppConstants.CART_BUTTON_XPATH);
    }

    public static void verifyCartProduct(){
        boolean present = MobileActionManager.isPresent(MyDemoAppConstants.REMOVE_PRODUCT_CART_ID);
        Assert.assertTrue("El producto no esta presente en el carrito.", present);
    }

    public static void clickRemoveItem(){
        MobileActionManager.click(MyDemoAppConstants.REMOVE_PRODUCT_CART_ID);
    }

    public static void verifyDeleteProduct(){
        boolean carritoVacio = MobileActionManager.isPresent(MyDemoAppConstants.SHOPPING_BUTTON_XPATH);
        Assert.assertTrue("El carrito no se encuenta vacio.", carritoVacio);
    }
}
