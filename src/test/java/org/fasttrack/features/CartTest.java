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
        ///loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.searchForKeyword("Cap");
        cartSteps.addProductToCart();
        cartSteps.viewCartWhenProductAdded();
        cartSteps.removeFromCart("Cap");
    }
    @Test
    public void removeProductFromCart(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        cartSteps.viewCart();
        cartSteps.removeFromCart("White Hat"); //removes the last item
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
