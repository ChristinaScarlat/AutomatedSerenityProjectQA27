package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;


public class SearchTest extends BaseTest {
    @Test
    public void loginAndSearchForProductNameTest(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.navigateToProductName("beanie");
    }

    @Test
    public void loginAndSearchForSecondProductNameTest(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.searchForKeyword("shirt");
    }
    @Test
    public void loginAndSearchForProductLogoAndAddToCart(){
        //loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.searchForKeyword("logo");
        cartSteps.clickViewAllLogoCollection();
        cartSteps.addProductsQty(2);
        cartSteps.addProductToCart();
    }
    @Test
    public void searchForProductAndAddToCart(){
        searchSteps.searchForKeyword("belt");
        cartSteps.addProductsQty(2);
        cartSteps.addProductToCart();


    }
}
