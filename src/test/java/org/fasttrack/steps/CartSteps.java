package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps {

    @Step
    public void addAlbumWOOToCart() {
        productPage.selectAlbumWOO();
        productPage.clickAddToCartButton();
    }

    @Step
    public void addProductToCart() {
        productPage.clickAddToCartButton();
    }

    @Step
    public void viewCartWhenProductAdded() {
        cartPage.clickViewCartButton();
    }

    @Step
    public void viewCart() {
        homePage.clickCartMenuButton();
    }
    @Step
    public void clickUpdateCart() {
        cartPage.clickUpdateCart();
    }
    @Step
    public void removeFromCart() {
        cartPage.removeFromCartButton();
    }
    @Step
    public void checkSuccessMessageSpan(String productName) {
        String expected = "“" + productName + "” has been added to your cart.";
        String actual = cartPage.getSuccessMessageSpan();
        Assert.assertEquals(expected, actual);
    }
    @Step
    public void proceedToCheckOut() {
        cartPage.clickProceedToCheckOutButton();
    }
    @Step
    public void clickViewAllLogoCollection(){
        productPage.clickviewAllLogoCollection();
    }
    @Step
    public void addProductsQty(int Qty){
        productPage.getQtyFieldProducts(Qty);
    }
    @Step
    public void clickQtyOnLogoProductTShirt(int Qty){
        productPage.clickQtyLogoProductTShirt(Qty);
    }
    @Step
    public void clickQtyOnLogoProductBeanie(int Qty){
        productPage.clickQtyLogoProductBeanie(Qty);
    }
//    @Step
//    public void selectLogoProductsAndAddQty(String nameProduct){
//        productPage.selectLogoProducts(nameProduct);
//    }

     @Step
    public void checkSubtotalPrice() {
        Assert.assertTrue(cartPage.checkIfSubtotalMatches());
    }

    @Step
    public void checkTotalPrice() {
        Assert.assertTrue(cartPage.checkIfTotalPriceMatches());
    }
}
