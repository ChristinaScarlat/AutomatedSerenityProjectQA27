package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends BasePage {


    @FindBy(id = "username")
    private WebElementFacade usernameOrEmailAddressField;
    @FindBy(id = "password")
    private WebElementFacade passwordField;
    @FindBy(id = "rememberme")
    private WebElementFacade remembermeBox;
    @FindBy(css = ".woocommerce-Button.button")
    private WebElementFacade loginButton;
    @FindBy(css = "ul.woocommerce-error li")
    private WebElementFacade errorMessageForLogin;
    @FindBy(css="p.woocommerce-LostPassword.lost_password a")
    private WebElementFacade lostPassword;
    @FindBy(css="form.woocommerce-ResetPassword.lost_reset_password p")
    private WebElementFacade lostPasswordMessage;
    @FindBy(id = "user_login")
    private WebElementFacade userOrEmailFieldForLostPassField;
    @FindBy(css = "button.woocommerce-Button.button")
    private WebElementFacade resetPasswordButton;
    @FindBy(css="div.woocommerce p")
    private WebElementFacade resetPasswordMessage;

    public void setEmailField(String value) {
        typeInto(usernameOrEmailAddressField, value);
    }
    public void setPasswordField(String value) {
        typeInto(passwordField, value);
    }
    public void selectRemembermeBox(){
        clickOn(remembermeBox);
   }
    public void clickLoginButton() {
        clickOn(loginButton);
    }
    public String getErrorMessageForLogin(){
        return errorMessageForLogin.getText();
    }
    public void clicklostPassword(){
        clickOn(lostPassword);
    }
    public String getLostPasswordMessage(){
        return lostPasswordMessage.getText();
    }
    public void completeUsernameOrEmailToResetPassword(String value) {
        typeInto(userOrEmailFieldForLostPassField, value);
    }
    public void clickResetPasswordButton() {
        clickOn(resetPasswordButton);
    }
    public String getResetPasswordMessage(){
        return resetPasswordMessage.getText();
    }

}
