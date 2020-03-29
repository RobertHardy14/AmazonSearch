package POMs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.xml.ws.WebEndpoint;

public class AmazonCart extends BasePage
{
    @FindBy(name = "proceedToRetailCheckout")
    WebElement bProceedToPayment;
    @FindBy(xpath = "//input[@value='Guardar para más tarde']")
    WebElement bSaveForLater;
    @FindBy(xpath = "//input[@value='Eliminar']")
    WebElement bDelete;
    public AmazonCart(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public void proceedToPayment() throws InterruptedException {
        bProceedToPayment.click();
        Thread.sleep(5000);
    }
    public void saveForLater() throws InterruptedException {
        //wait.until(ExpectedConditions.visibilityOf(bSaveForLater));
        bSaveForLater.click();
        Thread.sleep(5000);
    }
    public void thenDelete() throws InterruptedException {
        bDelete.click();
        Thread.sleep(5000);
    }
}