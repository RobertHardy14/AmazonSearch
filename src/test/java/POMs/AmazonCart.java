package POMs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonCart extends BasePage
{
    @FindBy(name = "proceedToRetailCheckout")
    WebElement bProceedToPayment;
    public AmazonCart(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public void proceedToPayment()
    {
        bProceedToPayment.click();
    }
}