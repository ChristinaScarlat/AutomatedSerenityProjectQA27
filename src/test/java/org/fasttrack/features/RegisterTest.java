package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void registerWithValidCredentialsTest(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        registerSteps.setRegEmailAddress(Constants.USER_EMAIl);
        registerSteps.setPassword(Constants.USER_PASS);
        registerSteps.clickRegister();
        registerSteps.verifyErrorMessageForRegister();
    }
}
