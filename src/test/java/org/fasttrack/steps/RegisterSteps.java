package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterSteps extends BaseSteps{

    @Step
    public void setRegEmailAddress(String RegEmail) {
        registerPage.setRegEmailField(RegEmail);
    }
    @Step
    public void setPassword(String password) {
        registerPage.setPasswordField(password);
    }
    @Step
    public void clickRegister() {
        registerPage.clickRegisterButton();
    }
    @Step
    public void verifyErrorMessageForRegister(){
    Assert.assertEquals("Error: An account is already registered with your email address. Please log in.", registerPage.getErrorMessageForAlReadyRegistered());
}

}
