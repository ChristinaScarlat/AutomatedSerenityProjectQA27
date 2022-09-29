package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void loginAndAddToCartTest(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.searchForKeyword("Cap");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessageSpan("Cap");
    }
    @Test
    public void addProductToCart(){
        cartSteps.addAlbumWOOToCart();
        cartSteps.checkSuccessMessageSpan("Album");
    }
    @Test
    public void loginAndRemoveProductFromCart(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.searchForKeyword("Cap");
        cartSteps.addProductToCart();
        cartSteps.viewCartWhenProductAdded();
        cartSteps.removeFromCart();
    }
    @Test
    public void removeProductFromCart(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        cartSteps.viewCart();
        cartSteps.removeFromCart();
    }
    @Test
    public void addQtyCartProductAndUpdate(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        cartSteps.viewCart();
        cartSteps.addProductsQty(3);
        cartSteps.clickUpdateCart();
    }
    @Test
    public void addQtyOnLogoProductTShirtAndAddToCart(){
        searchSteps.searchForKeyword("logo");
        cartSteps.clickViewAllLogoCollection();
        cartSteps.addProductsQty(2);
        cartSteps.clickQtyOnLogoProductTShirt(3);
        cartSteps.clickQtyOnLogoProductBeanie(5);
        cartSteps.addProductToCart();
    }
    @Test
    public void checkTotalAndSubtotalTest(){
        searchSteps.searchForKeyword("cap");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessageSpan("Cap");

//        searchSteps.searchForKeyword("Cap");
//        cartSteps.addProductToCart();
//        cartSteps.checkSuccessMessageSpan("Cap");

        cartSteps.viewCart();
        cartSteps.checkSubtotalPrice();//For input string: ""
        cartSteps.checkTotalPrice();
    }

}
