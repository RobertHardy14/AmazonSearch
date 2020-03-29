package Tests;

import POMs.AmazonCart;
import POMs.AmazonHomePage;
import POMs.AmazonSearchResults;
import POMs.ProductPage;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BaseTest
{
    public WebDriver driver;
    public AmazonHomePage home;
    public AmazonSearchResults result;
    public ProductPage prodPage;
    public AmazonCart cart;

    @Before
    public void Setup()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        home = new AmazonHomePage(driver);
        result = new AmazonSearchResults(driver);
        prodPage = new ProductPage(driver);
        cart = new AmazonCart(driver);
    }

    @Test
    public void SilversteinSearch()
    {
        home.goToWebpage();
        home.getTitle();
        home.searchItem();
    }
    @Test
    public void SelectAlbum()
    {
        result.selectProduct();
    }
    @Test
    public void VerifyAlbumInfo()
    {
        prodPage.verifyAvailable();
        prodPage.selectCD();
        prodPage.getPrice();
        prodPage.addToCart();
        prodPage.gotoCart();
    }

    @Test
    public void goToPayment()
    {
        cart.proceedToPayment();
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }
}
