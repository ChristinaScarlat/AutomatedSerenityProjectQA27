package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://qa5.fasttrackit.org:8008")
public class HomePage extends BasePage {

    @FindBy(css="h2 a")
    private WebElementFacade messageHomePage;
    @FindBy(css= ".account")
    private WebElementFacade accountLogin;
    @FindBy( css = ".search-field")
    private WebElementFacade searchField;

    @FindBy(css = "button.searchsubmit")
    private WebElementFacade searchButton;
    @FindBy(css="#menu-item-70 a")
    private WebElementFacade MyAccountMenuButton;
    @FindBy(css="#menu-item-71 a")
    private WebElementFacade CheckoutMenuButton;
    @FindBy(css="#menu-item-72 a")
    private WebElementFacade CartMenuButton;
    @FindBy(css="#menu-item-73 a")
    private WebElementFacade ShopMenuButton;
    public String messageHomePage(){
        return messageHomePage.getText();
    }
    public void clickAccountLink() {
        clickOn(accountLogin);
    }
    public void setSearchField(String value){
        typeInto(searchField,value);
    }
    public void clickSearchButton(){
        clickOn(searchButton);
    }
    public void clickMyAccountMenuButton(){
        clickOn(MyAccountMenuButton);
    }
    public void clickCheckoutMenuButton(){
        clickOn(CheckoutMenuButton);
    }
    public void clickCartMenuButton(){
        clickOn(CartMenuButton);
    }
    public void clickShopMenuButton(){
        clickOn(ShopMenuButton);
    }
}
