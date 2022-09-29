package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {
    @Step
    public void navigateToHomepage() {
        homePage.open();
    }
    @Step
    public void verifyHomePageMessage(){
        Assert.assertEquals("Hello world!", homePage.messageHomePage());
    }
    @Step
    public void navigateToLoginPage() {
        homePage.clickAccountLink();
    }
    @Step
    public void setUserEmail(String username) {
        loginPage.setEmailField(username);
    }
    @Step
    public void setPassword(String password) {
        loginPage.setPasswordField(password);
    }
    @Step
    public void selectRemembermeBox() {
        loginPage.selectRemembermeBox();
    }
    @Step
    public void clickLogin() {
        loginPage.clickLoginButton();
    }
    @Step
    public void verifyUserIsLoggedIn(String userName) {
        Assert.assertEquals("Hello " + userName + " (not alexandra.christina? Log out)", accountPage.getWelcomeText());
    }
    @Step
    public void verifyUserLoggedInWithWrongPassword() {
        Assert.assertEquals("ERROR: The password you entered for the email address alexandra.christina@yahoo.com is incorrect. Lost your password?", loginPage.getErrorMessageForLogin());
    }
    @Step
    public void clickLostPassword(){
        loginPage.clicklostPassword();
    }
    @Step
    public void verifyMessageforLostPassword() {
        Assert.assertEquals("Lost your password? Please enter your username or email address. You will receive a link to create a new password via email.", loginPage.getLostPasswordMessage());
    }
    @Step
    public void completeUserOrEmailFieldToResetPassword(String email){
        loginPage.completeUsernameOrEmailToResetPassword(email);
    }
    @Step
    public void clickResetPasswordButton(){
        loginPage.clickResetPasswordButton();
    }
    @Step
    public void VerifyMessageForResetPassword(){
        Assert.assertEquals("A password reset email has been sent to the email address on file for your account, but may take several minutes to show up in your inbox. Please wait at least 10 minutes before attempting another reset.",loginPage.getResetPasswordMessage());
    }


    @Step
    public void doLogin(String email, String pass) {
        navigateToLoginPage();
        setUserEmail(email);
        setPassword(pass);
        selectRemembermeBox();
        clickLogin();
    }

}
