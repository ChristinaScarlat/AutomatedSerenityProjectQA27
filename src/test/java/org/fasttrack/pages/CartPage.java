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

    @FindBy(css="a.remove")
    private WebElementFacade removeProductFromCartButton;
    @FindBy(css = "a.checkout-button.button.alt.wc-forward")
    private WebElementFacade proceedToCheckOutButton;
    @FindBy(css = "div.woocommerce table tr.woocommerce-cart-form__cart-item.cart_item")
    private List<WebElementFacade> cartProducts;

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

    public void removeFromCartButton(String nameProduct) {
        for (WebElementFacade element : cartProducts) {
            if (element.getText().contains(nameProduct)) {
                clickOn(removeProductFromCartButton);
                clickOn(element.findElement(By.cssSelector("tbody a.remove")));
            }
        }
    }

    public void clickProceedToCheckOutButton() {
        clickOn(proceedToCheckOutButton);
    }

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
