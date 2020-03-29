package POMs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage
{
    @FindBy (id="a-autoid-3-announce")
    WebElement bCdDeAudio;
    @FindBy (xpath="//span[contains(.,'Disponible')]")
    WebElement isAvailable;
    @FindBy(xpath = "//span[@class='a-size-medium a-color-price offer-price a-text-normal']")
    WebElement productPrice;
    @FindBy(id="add-to-cart-button")
    WebElement bAddToCart;
    @FindBy(xpath="//a[@href='https://www.amazon.com.mx/gp/cart/view.html?ref_=nav_cart']")
    WebElement viewCart;
    public ProductPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public void verifyAvailable()
    {
        Assert.assertEquals(true, isAvailable);
    }
    public void selectCD()
    {
        bCdDeAudio.click();
    }
    public WebElement getPrice()
    {
        return productPrice;
    }
    public void addToCart()
    {
        bAddToCart.click();
    }
    public void gotoCart()
    {
        viewCart.click();
    }
}