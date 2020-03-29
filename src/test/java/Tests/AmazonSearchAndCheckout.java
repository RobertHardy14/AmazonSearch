package Tests;

import org.junit.Test;

public class AmazonSearchAndCheckout extends BaseTest
{
    @Test
    public void SilversteinSearch() throws InterruptedException {
        home.goToWebpage();
        home.getTitle();
        home.searchItem();
        result.selectProduct();
        prodPage.verifyAvailable();
        prodPage.selectCD();
        prodPage.getPrice();
        prodPage.addToCart();
        prodPage.gotoCart();
        cart.proceedToPayment();
    }
    @Test
    public void SearchButSaveForLater() throws InterruptedException {
        home.goToWebpage();
        home.getTitle();
        home.searchItem();
        result.selectProduct();
        prodPage.verifyAvailable();
        prodPage.selectCD();
        prodPage.getPrice();
        prodPage.addToCart();
        prodPage.gotoCart();
        cart.saveForLater();
    }
    @Test
    public void SearchButThenDelete() throws InterruptedException {
        home.goToWebpage();
        home.getTitle();
        home.searchItem();
        result.selectProduct();
        prodPage.verifyAvailable();
        prodPage.selectCD();
        prodPage.getPrice();
        prodPage.addToCart();
        prodPage.gotoCart();
        cart.thenDelete();
    }
}
