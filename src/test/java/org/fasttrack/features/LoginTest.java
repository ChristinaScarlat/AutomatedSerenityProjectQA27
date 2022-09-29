package org.fasttrack.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.fasttrack.utils.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidCredentialsTest() {
        loginSteps.navigateToHomepage();
        loginSteps.verifyHomePageMessage();
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.USER_EMAIl);
        loginSteps.setPassword(Constants.USER_PASS);
        loginSteps.selectRemembermeBox();
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn("alexandra.christina");
    }

    @Test
    public void loginWithInvalidPasswordTest() {
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.USER_EMAIl);
        loginSteps.setPassword("123456a");
        loginSteps.clickLogin();
        loginSteps.verifyUserLoggedInWithWrongPassword();
    }
    @Test
    public void loginWithInvalidPasswordAndLostPasswordTest() {
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.USER_EMAIl);
        loginSteps.setPassword("123456a");
        loginSteps.clickLogin();
        loginSteps.verifyUserLoggedInWithWrongPassword();
        loginSteps.clickLostPassword();
        loginSteps.verifyMessageforLostPassword();
        loginSteps.completeUserOrEmailFieldToResetPassword(Constants.USER_EMAIl);
        loginSteps.clickResetPasswordButton();
        loginSteps.VerifyMessageForResetPassword();
    }


}
