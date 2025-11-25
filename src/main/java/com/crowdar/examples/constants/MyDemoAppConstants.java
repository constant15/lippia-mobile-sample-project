package com.crowdar.examples.constants;

public class MyDemoAppConstants {

    //Locators utilizadas para el feature Busqueda productos
    public static final String BUTTON_MULTIPLE_ID = "ACCESSIBILITY_ID:View menu";
    public static final String BUTTON_LOG_IN_ID = "ACCESSIBILITY_ID:Login Menu Item";
    public static final String BUTTON_LOGIN_ID = "XPATH://android.widget.Button[@content-desc=\"Tap to login with given credentials\"]";
    public static final String BOX_USERNAME_XPATH = "XPATH://android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/nameET\"]";
    public static final String BOX_PASSWORD_XPATH = "XPATH://android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/passwordET\"]";

    //Locators utilizadas para el feature Agregar Producto

    public static final String PRODUCT1_IMAGE_XPATH = "XPATH:(//android.widget.ImageView[@content-desc=\"Product Image\"])[4]";
    public static final String ADD_CART_PRODUCT_ID = "ACCESSIBILITY_ID:Tap to add product to cart";
    public static final String CART_BUTTON_XPATH = "XPATH://android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]";
    public static final String REMOVE_PRODUCT_CART_ID = "ACCESSIBILITY_ID:Removes product from cart";

    //Locators usados en el feature eliminar producto
    public static final String SHOPPING_BUTTON_XPATH = "XPATH://android.widget.Button[@resource-id=\"com.saucelabs.mydemoapp.android:id/shoppingBt\"]";

    //Locators usados en el feature CompraApp

    public static final String PROCEED_CHECKOUT_BUTTON_ID = "ACCESSIBILITY_ID:Confirms products for checkout";
    public static final String NAME_BOX_XPATH = "XPATH://android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/fullNameET\"]";
    public static final String ADDRESS_BOX_XPATH = "XPATH://android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/address1ET\"]";
    public static final String CITY_BOX_XPATH = "XPATH://android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/cityET\"]";
    public static final String ZIPCODE_BOX_XPATH = "XPATH://android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/zipET\"]";
    public static final String COUNTRY_BOX_XPATH = "XPATH://android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/countryET\"]";
    public static final String PAYMENT_BUTTON_ID = "ACCESSIBILITY_ID:Saves user info for checkout";

    public static final String NAME_BANK_BOX_XPATH = "XPATH://android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/nameET\"]";

    public static final String CARD_NUMBER_BOX_XPATH = "XPATH://android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/cardNumberET\"]";
    public static final String EXPIRATION_BOX_XPATH = "XPATH://android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/expirationDateET\"]";
    public static final String SECURITY_CODE_BOX_XPATH = "XPATH://android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/securityCodeET\"]";

    public static final String ORDER_REVIEW_BUTTON_XPATH = "ACCESSIBILITY_ID:Saves payment info and launches screen to review checkout data";
    public static final String PLACE_ORDER_BUTTON_ID = "ACCESSIBILITY_ID:Completes the process of checkout";
    public static final String MESSAGE_BUY_XPATH = "XPATH://android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/swagTV\"]";
    public static final String ERROR_MESSAGE_XPATH = "XPATH://android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/nameErrorTV\"]";

}

