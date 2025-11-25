package com.crowdar.examples.services;

import com.crowdar.examples.constants.BusquedaProductoConstants;

import com.crowdar.core.actions.MobileActionManager;
import junit.framework.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class BusquedaProductoService {

    public static void homePage(){
        MobileActionManager.waitVisibility(BusquedaProductoConstants.BUTTON_MULTIPLE_ID);
        Assert.assertTrue("La app no se muestra correctamente.", MobileActionManager.isVisible(BusquedaProductoConstants.BUTTON_MULTIPLE_ID));
    }

    public static void multipleButtonClick(){
        MobileActionManager.click(BusquedaProductoConstants.BUTTON_MULTIPLE_ID);
    }

    public static void loginPageClick(){
        MobileActionManager.click(BusquedaProductoConstants.BUTTON_LOG_IN_ID);
    }

    public static void loginButtonClick(){
        MobileActionManager.click(BusquedaProductoConstants.BUTTON_LOGIN_ID);
    }

    public static void ingresoUsuario(String usuario, String pass){
        MobileActionManager.setInput(BusquedaProductoConstants.BOX_USERNAME_XPATH, usuario);
        MobileActionManager.setInput(BusquedaProductoConstants.BOX_PASSWORD_XPATH, pass);
    }

    public static void verificacionLogin(){
        MobileActionManager.waitVisibility(BusquedaProductoConstants.BUTTON_MULTIPLE_ID);
        Assert.assertTrue("El usuario no ha ingresado.", MobileActionManager.isVisible(BusquedaProductoConstants.BUTTON_MULTIPLE_ID));
    }

}
