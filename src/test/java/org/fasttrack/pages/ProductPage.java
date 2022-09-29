package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class ProductPage extends BasePage {

    @FindBy(css="button.single_add_to_cart_button.button.alt")
    private WebElementFacade addToCartButton;
    @FindBy(css ="a.collection_title h3")
    private WebElementFacade albumWOO;
    @FindBy(css = "a.button.product_type_simple.add_to_cart_button.ajax_add_to_cart")
    private WebElementFacade addToCartButtonAlbum;
    @FindBy(css = "a[href=http://qa5.fasttrackit.org:8008/?product=beanie-with-logo] h3")
    private WebElementFacade BeanieWithLogo;
    @FindBy(css = "li.post-43.product.type-product.status-publish.has-post-thumbnail.product_cat-accessories.instock.sale.shipping-taxable.purchasable.product-type-simple div.collection_desc.clearfix a.button.product_type_simple.add_to_cart_button.ajax_add_to_cart")
    private WebElementFacade addToCartButtonBeanieWithLogo;
    @FindBy(css = "a[href*= http://qa5.fasttrackit.org:8008/?product=hoodie] h3")
    private WebElementFacade Hoodie;
    @FindBy(css="li.post-23.product.type-product.status-publish.has-post-thumbnail.product_cat-hoodies.first.instock.sale.shipping-taxable.purchasable.product-type-variable.has-default-attributes.has-children > div.collection_desc.clearfix > div > a")
    private WebElementFacade hoodieSelectOptions;
    @FindBy (id="pa_color")
    private WebElementFacade chooseColor;
    @FindBy(css="a.button.product_type_grouped")
    private WebElementFacade viewAllLogoCollection;
    @FindBy(css = "#product-44 > div.summary.entry-summary > form > table")
    private List<WebElementFacade> LogoProducts;
    @FindBy(css=" tr#product-25 input.input-text.qty.text")
    private WebElementFacade logoProductTShirt;
    @FindBy(css=" tr#product-26 input.input-text.qty.text")
    private WebElementFacade logoProductBeanie;
    @FindBy(css=".input-text.qty.text")
    private WebElementFacade setQtyFieldProducts;




    public void selectAlbumWOO() {
        clickOn(albumWOO);
    }
    public void clickAddToCartButton() {
        clickOn(addToCartButton);
    }

    public void clickviewAllLogoCollection(){
        clickOn(viewAllLogoCollection);
    }
    public void getQtyFieldProducts(int Qty) {
        setQtyFieldProducts.clear();
        setQtyFieldProducts.sendKeys(Qty + "");
    }
    public void clickQtyLogoProductTShirt(int Qty){
        logoProductTShirt.clear();
        logoProductTShirt.sendKeys(Qty + "");
    }
    public void clickQtyLogoProductBeanie(int Qty){
        logoProductBeanie.clear();
        logoProductBeanie.sendKeys(Qty + "");
    }




}