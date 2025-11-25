package com.crowdar.examples.constants;

public class MyDemoAppConstants {

    //Constantes utilizadas para el feature Busqueda productos
    public static final String BUTTON_MULTIPLE_ID = "ACCESSIBILITY_ID:View menu";
    public static final String BUTTON_LOG_IN_ID = "ACCESSIBILITY_ID:Login Menu Item";
    public static final String BUTTON_LOGIN_ID = "XPATH://android.widget.Button[@content-desc=\"Tap to login with given credentials\"]";
    public static final String BOX_USERNAME_XPATH = "XPATH://android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/nameET\"]";
    public static final String BOX_PASSWORD_XPATH = "XPATH://android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/passwordET\"]";

    //Constantes utilizadas para el feature Agregar Producto

    public static final String PRODUCT1_IMAGE_XPATH = "XPATH:(//android.widget.ImageView[@content-desc=\"Product Image\"])[4]";
    public static final String ADD_CART_PRODUCT_ID = "ACCESSIBILITY_ID:Tap to add product to cart";
    public static final String CART_BUTTON_XPATH = "XPATH://android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]";
    public static final String REMOVE_PRODUCT_CART_ID = "ACCESSIBILITY_ID:Removes product from cart";

}

