package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class AccountPage extends BasePage {
    @FindBy(css = "div.woocommerce-MyAccount-content p")
    private WebElementFacade welcomeTextElement;
    @FindBy(css=" li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--dashboard > a")
    private WebElementFacade dashboardButton;
    @FindBy(css=" li.woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--orders > a")
    private WebElementFacade ordersButton;
    @FindBy(css=" li.woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--downloads > a")
    private WebElementFacade downloadsButton;
    @FindBy(css=" li.woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-address > a")
    private WebElementFacade editAddressesButton;
    @FindBy(css=" woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-account > a")
    private WebElementFacade editAccountDetailsButton;
    @FindBy(css=" li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--customer-logout > a")
    private WebElementFacade logoutButton;

    public String getWelcomeText() {
        return welcomeTextElement.getText();
    }
    public void clickDashboardButton(){
        clickOn(dashboardButton);}
    public void clickOrdersButton(){
        clickOn(ordersButton);}
    public void clickDownloadsButton(){
        clickOn(downloadsButton);}
    public void clickEditAddressesButton(){
        clickOn(editAddressesButton);}
    public void clickEditAccountDetailsButton(){
        clickOn(editAccountDetailsButton);}
    public void clickLogoutButton(){
        clickOn(logoutButton);}
}
