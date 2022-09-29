package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void validCheckoutTest(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.searchForKeyword("album");
        cartSteps.addProductToCart();
        cartSteps.viewCartWhenProductAdded();
        cartSteps.proceedToCheckOut();
        checkoutSteps.setBillingDetailsAndPlaceOrder("Christina", "S", "Aleea Florilor nr.3","București", "București","7222222", "0722334455", "alexandra.christina@yahoo.com");
        checkoutSteps.getOrderMessage();
        //aici cred ca este un bug la Order Message!

    }
    @Test
    public void valid2CheckoutTest(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        cartSteps.viewCart();
        cartSteps.proceedToCheckOut();
        checkoutSteps.clickPlaceOrder();
        checkoutSteps.getOrderMessage();
    }
    @Test
    public void findProductAddToCartAndCheckOutAndApplyCouponCode() {
        searchSteps.searchForKeyword("T-Shirt with Logo");
        cartSteps.addProductToCart();
        cartSteps.viewCartWhenProductAdded();
        cartSteps.proceedToCheckOut();
        checkoutSteps.setCouponCodeAndCheckout("Yellow Sale On Smiles");
        checkoutSteps.checkCheckoutCouponErrorMessage();
    }

    @Test
    public void findProductAddToCartAndCheckOutWithLoginAndCouponCode(){
        searchSteps.searchForKeyword("Beanie Logo");
        cartSteps.addProductToCart();
        cartSteps.viewCartWhenProductAdded();
        cartSteps.proceedToCheckOut();
        checkoutSteps.checkOutWithLogin();
        checkoutSteps.doLoginForCheckout(Constants.USER_EMAIl,Constants.USER_PASS);
        checkoutSteps.setCouponCodeAndCheckout("Yellow Sale On Smiles");
        checkoutSteps.checkCheckoutCouponMessage();
    }
}
