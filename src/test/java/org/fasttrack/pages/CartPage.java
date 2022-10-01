package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade successMessageSpan;
    @FindBy(css = "a.button.wc-forward")
    private WebElementFacade viewCartButton;
    @FindBy(css = " td.actions button.button")
    private WebElementFacade updateCartButton;
    @FindBy(css="a.remove")
    private WebElementFacade removeProductFromCartButton;
    @FindBy(css = "a.checkout-button.button.alt.wc-forward")
    private WebElementFacade proceedToCheckOutButton;
//    @FindBy(css = "tr.woocommerce-cart-form__cart-item.cart_item td.product-remove a.remove")
//    private List<WebElementFacade> deleteButtonsCartProducts;

//div.woocommerce table


    //verify price
    @FindBy(css = "span.woocommerce-Price-amount.amount")
    private List<WebElementFacade> subtotalProductsList;
    @FindBy(css="td.product-subtotal span")
    private WebElementFacade leisimbol;
    @FindBy(css = "#post-5 div.cart-collaterals div table tr.cart-subtotal span")
    private WebElementFacade subtotalCartPrice;
    @FindBy(css = "#post-5 div.cart-collaterals tr.shipping span")
    private WebElementFacade flatRate;
    @FindBy(css = "#post-5 div.cart-collaterals tr.order-total span")
    private WebElementFacade totalCartPrice;



    public String getSuccessMessageSpan() {
        return successMessageSpan.getText().replace("View cart\n","");
    }
    public void clickViewCartButton() {
        clickOn(viewCartButton);
    }

    public void removeFromCartButton() {
        clickOn(removeProductFromCartButton);
    }
    public void clickUpdateCart(){
        clickOn(updateCartButton);
    }
    public void clickProceedToCheckOutButton() {
        clickOn(proceedToCheckOutButton);
    }

    public void emptyCart(){
        List<WebElementFacade> deleteButtonsCartProducts = findAll(By.cssSelector("tr.woocommerce-cart-form__cart-item.cart_item td.product-remove a.remove"));
        if(deleteButtonsCartProducts.size()>0){
        for (int i = 1; i < deleteButtonsCartProducts.size(); i++) {
            deleteButtonsCartProducts.get(0).click();
        }

}}


    public int getProductsSubtotal(){
        int sum = 0;
        for(WebElementFacade elementFacade:subtotalProductsList){
            sum+= convertStringToInteger(elementFacade.getText());
        }
        return sum;
    }
    public boolean checkIfSubtotalMatches(){
        int expected = getProductsSubtotal();
        int actual = convertStringToInteger(subtotalCartPrice.getText());
        return expected == actual;
    }
    public boolean checkIfTotalPriceMatches(){
        int subtotal = getProductsSubtotal();
        int fee = convertStringToInteger(flatRate.getText());
        int expectedTotal = subtotal + fee;
        int actualTotal = convertStringToInteger(totalCartPrice.getText());
        return expectedTotal == actualTotal;
    }

}
