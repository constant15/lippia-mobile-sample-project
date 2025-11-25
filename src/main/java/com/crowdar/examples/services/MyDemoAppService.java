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

    //Metodos utilizados en el feature CompraApp

    public static void clickButtonCheckout(){
        MobileActionManager.click(MyDemoAppConstants.PROCEED_CHECKOUT_BUTTON_ID);
    }

    public static void dataInput(){
        MobileActionManager.setInput(MyDemoAppConstants.NAME_BOX_XPATH, "Nicolas Olivos");
        MobileActionManager.setInput(MyDemoAppConstants.ADDRESS_BOX_XPATH, "Thedy 2050");
        MobileActionManager.setInput(MyDemoAppConstants.CITY_BOX_XPATH, "Rosario");
        MobileActionManager.setInput(MyDemoAppConstants.ZIPCODE_BOX_XPATH, "2000");
        MobileActionManager.setInput(MyDemoAppConstants.COUNTRY_BOX_XPATH, "Argentina");
    }

    public static void clickPayment(){
        MobileActionManager.click(MyDemoAppConstants.PAYMENT_BUTTON_ID);
    }

    public static void dataPaymentInput(){
        MobileActionManager.setInput(MyDemoAppConstants.NAME_BANK_BOX_XPATH, "Nicolas Olivos");
        MobileActionManager.setInput(MyDemoAppConstants.CARD_NUMBER_BOX_XPATH, "8484848484848484");
        MobileActionManager.setInput(MyDemoAppConstants.EXPIRATION_BOX_XPATH, "0829");
        MobileActionManager.setInput(MyDemoAppConstants.SECURITY_CODE_BOX_XPATH, "123");
    }

    public static void clickReviewOrder(){
        MobileActionManager.click(MyDemoAppConstants.ORDER_REVIEW_BUTTON_XPATH);
    }

    public static void clickPlaceOrder(){
        MobileActionManager.click(MyDemoAppConstants.PLACE_ORDER_BUTTON_ID);
    }

    public static void verifyBuyComplete(){
        boolean presentMessage = MobileActionManager.isPresent(MyDemoAppConstants.MESSAGE_BUY_XPATH);
        Assert.assertTrue("La compra no se completó.", presentMessage);
    }

    public static void verifyBuyError(){
        boolean errorMessage = MobileActionManager.isPresent(MyDemoAppConstants.ERROR_MESSAGE_XPATH);
        Assert.assertTrue("La compra se realizó.", errorMessage);
    }

}
