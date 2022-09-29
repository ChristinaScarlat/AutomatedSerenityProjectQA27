package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CheckoutPage extends BasePage{

    //do login to checkout
    @FindBy(css = "a.showlogin")
    private WebElementFacade clickHereToLogin;
    @FindBy(css= "p #username")
    private WebElementFacade checkoutUser;
    @FindBy(css= "p #password")
    private WebElementFacade checkoutPass;
    @FindBy(css= "label #rememberme")
    private WebElementFacade checkoutRemembermeBox;
    @FindBy(css= "p.form-row button.button")
    private WebElementFacade checkoutLoginButton;
    //apply coupon and checkout
    @FindBy(css= "a.showcoupon")
    private  WebElementFacade clickHereToEnterYourCode;
    @FindBy(id="coupon_code")
    private WebElementFacade checkoutCouponCode;
    @FindBy(css= "p.form-row.form-row-last button.button")
    private WebElementFacade checkoutApplyCouponButton;
    @FindBy(css="ul.woocommerce-error li")
    private WebElementFacade errorMessageForAplliedCheckoutCoupon;
    @FindBy(css="div.woocommerce-message")
    private WebElementFacade messageForAplliedCheckoutCoupon;
    @FindBy(id="billing_first_name")
    private WebElementFacade billingFirstNameField;
    @FindBy(id="billing_last_name")
    private WebElementFacade billingLastNameField;
    @FindBy(id="billing_address_1")
    private WebElementFacade billingAddress1Field;
    @FindBy(id="billing_city")
    private WebElementFacade billingCityField;
    @FindBy(id="select2-billing_state-container")
    private WebElementFacade clickbillingCountyField;
    @FindBy(css="span input.select2-search__field")
    private WebElementFacade billingSearchCountyField;
    @FindBy(id="billing_postcode")
    private WebElementFacade billingPostCodeField;
    @FindBy(id="billing_phone")
    private WebElementFacade billingPhoneField;
    @FindBy(id="billing_email")
    private WebElementFacade billingEmailField;
    @FindBy(id="place_order")
    private WebElementFacade PlaceOrder;
    @FindBy(css="h2.post-title")//.woocommerce-order p 2//.woocommerce-order p.woocommerce-notice.woocommerce-notice--success.woocommerce-thankyou-order-received
    private WebElementFacade orderMessage;
    @FindBy(css = ".select2-results__options li")
    private List<WebElementFacade> listOfCountys;

    public void setClickHereToLogin() {
        clickOn(clickHereToLogin.waitUntilClickable());
    }
    public void setEmailField(String value) {
        typeInto(checkoutUser, value);
    }
    public void setPasswordField(String value) {
        typeInto(checkoutPass, value);
    }
    public void selectRemembermeBox(){
        clickOn(checkoutRemembermeBox);
    }
    public void clickLoginButton() {
        clickOn(checkoutLoginButton);
    }
    public void setClickHereToEnterYourCouponCode() {
        clickOn(clickHereToEnterYourCode.waitUntilClickable());
    }
    public void setcheckoutCouponCode(String value) {
        typeInto(checkoutCouponCode, value);
    }
    public void clickApplyCouponButtonAtCheckout(){
        clickOn(checkoutApplyCouponButton);
    }
    public String getMessageForAplliedCheckoutCoupon(){
        return messageForAplliedCheckoutCoupon.getText();
    }
    public String getErrorMessageForAplliedCheckoutCoupon() {
        return errorMessageForAplliedCheckoutCoupon.getText();
    }

    public void setbillingFirstNameField(String value) {
        typeInto(billingFirstNameField, value);
    }
    public void setbillingLastNameField(String value) {
        typeInto(billingLastNameField, value);
    }
    public void setBillingAddress1Field(String value){
        typeInto(billingAddress1Field, value);
    }
    public void setbillingCityField(String value) {
        typeInto(billingCityField, value);
    }
    public void setBillingCountyField(){
        clickbillingCountyField.click();
    }
    public void setbillingCountySearchField(String value){
    typeInto(billingSearchCountyField, value);
    }
    public boolean findCountyInListAndClick(String countyName){
        for (WebElementFacade element : listOfCountys){
            if (element.getText().equalsIgnoreCase(countyName)){
                element.click();
                return true;
            }
        }
        return false;
    }
    public void setbillingPostCodeField(String value) {
        typeInto(billingPostCodeField, value);
    }
    public void setbillingPhoneField(String value) {
        typeInto(billingPhoneField, value);
    }
    public void setbillingEmailField(String value) {
        typeInto(billingEmailField, value);
    }
    public void setPlaceOrder() {
        clickOn(PlaceOrder);
    }
    public String setOrderMessage(){
        return orderMessage.getText();
    }
}
