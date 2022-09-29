package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends BasePage{

    @FindBy(id = "reg_email")
    private WebElementFacade regEmailAddressField;
    @FindBy(id = "reg_password")
    private WebElementFacade regPasswordField;
    @FindBy(css = "p.woocommerce-FormRow.form-row button")
    private WebElementFacade registerButton;
    @FindBy(css = ".woocommerce-error li")
    private WebElementFacade errorMessageForRegister;

    public void setRegEmailField(String value) {
        typeInto(regEmailAddressField, value);
    }
    public void setPasswordField(String value) {
        typeInto(regPasswordField, value);
    }
        public void clickRegisterButton() {
        clickOn(registerButton);
    }
    public String getErrorMessageForAlReadyRegistered(){
        return errorMessageForRegister.getText();
    }

}
