package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckoutSteps extends BaseSteps{

    @Step
    public void checkOutWithLogin(){
         checkoutPage.setClickHereToLogin();
    }
    @Step
    public void setUserEmail(String username) {
        checkoutPage.setEmailField(username);
    }
    @Step
    public void setPassword(String password) {
       checkoutPage.setPasswordField(password);
    }
    @Step
    public void selectRemembermeBox() {
        checkoutPage.selectRemembermeBox();
    }
    @Step
    public void clickLogin() {
        checkoutPage.clickLoginButton();
    }
    @Step
    public void doLoginForCheckout(String email, String pass) {
        setUserEmail(email);
        setPassword(pass);
        selectRemembermeBox();
        clickLogin();
    }
    @Step
    public void applyCouponCodeCheckout(){
        checkoutPage.setClickHereToEnterYourCouponCode();
    }
    @Step
    public void setcheckoutCouponCodeField(String couponcode){
        checkoutPage.setcheckoutCouponCode(couponcode);
    }
    @Step
    public void clickButtonApplyCouponForCheckout(){
        checkoutPage.clickApplyCouponButtonAtCheckout();
    }
    @Step
    public void setCouponCodeAndCheckout(String couponcode){
        applyCouponCodeCheckout();
        setcheckoutCouponCodeField(couponcode);
        clickButtonApplyCouponForCheckout();
    }
    @Step
    public void checkCheckoutCouponMessage(){
        Assert.assertEquals("Coupon code applied successfully.",checkoutPage.getMessageForAplliedCheckoutCoupon());
    }
    @Step
    public void checkCheckoutCouponErrorMessage(){
        Assert.assertEquals("The minimum spend for this coupon is lei100.00.",checkoutPage.getErrorMessageForAplliedCheckoutCoupon());
    }
    @Step
    public void getbillingFirstNameField(String bfirstname){
        checkoutPage.setbillingFirstNameField(bfirstname);
    }
    @Step
    public void getbillingLastNameField(String blastname){
        checkoutPage.setbillingLastNameField(blastname);
    }
    @Step
    public void getBillingAddress1(String bAddress1){
        checkoutPage.setBillingAddress1Field(bAddress1);
    }
    @Step
    public void getbillingCityField(String bCity){
        checkoutPage.setbillingCityField(bCity);
    }
    @Step
    public void setfindCountyInListAndClick(String bCounty){
        checkoutPage.setBillingCountyField();
        checkoutPage.findCountyInListAndClick(bCounty);
    }
    @Step
    public void getbillingPostCodeField(String bPostcode){
        checkoutPage.setbillingPostCodeField(bPostcode);
    }
    @Step
    public void getbillingPhoneField(String bPhone){
        checkoutPage.setbillingPhoneField(bPhone);
    }
    @Step
    public void getBillingEmailField(String bEmail){
        checkoutPage.setbillingEmailField(bEmail);
    }
    @Step
    public void clickPlaceOrder(){
        checkoutPage.setPlaceOrder();
    }
    @Step
    public void getOrderMessage(){
        Assert.assertEquals( "ORDER RECEIVED", checkoutPage.setOrderMessage().toUpperCase());
    }
    @Step
    public void setBillingDetailsAndPlaceOrder(String bfirstname, String blastname,String bAddress1, String bCounty, String bCity,  String bPostcode,String bPhone, String bEmail){
        getbillingFirstNameField(bfirstname);
        getbillingLastNameField(blastname);
        getBillingAddress1(bAddress1);
        getbillingCityField(bCity);
        setfindCountyInListAndClick(bCounty);
        getbillingPostCodeField(bPostcode);
        getbillingPhoneField(bPhone);
        getBillingEmailField(bEmail);
        clickPlaceOrder();


    }
}
