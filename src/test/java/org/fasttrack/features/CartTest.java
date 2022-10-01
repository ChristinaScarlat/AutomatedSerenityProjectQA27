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
    public void addQtyOnLogoProductsAndAddToCart(){
        searchSteps.searchForKeyword("logo");
        cartSteps.clickViewAllLogoCollection();
        cartSteps.selectLogoProductsAndAddQtyAndAddToCart(1);
        cartSteps.addProductToCart();
    }
    @Test
    public void addDifferentQtyOnLogoProductsAndAddToCart(){
        searchSteps.searchForKeyword("logo");
        cartSteps.clickViewAllLogoCollection();
        cartSteps.addProductsQty(1);
        cartSteps.clickQtyOnLogoProductTShirt(2);
        cartSteps.clickQtyOnLogoProductBeanie(1);
        cartSteps.addProductToCart();
    }
    @Test
    public void removeAllProductsFromCart(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        cartSteps.viewCart();
        cartSteps.getCartEmpty();
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
