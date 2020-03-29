package POMs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchResults extends BasePage
{
    @FindBy(xpath="//*[text()='Beautiful Place To Drown']")
    WebElement product;
    public AmazonSearchResults(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public void selectProduct()
    {
        product.click();
    }
}
