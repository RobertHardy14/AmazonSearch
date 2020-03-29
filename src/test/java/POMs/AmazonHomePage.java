package POMs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage extends BasePage
{
    @FindBy (id = "twotabsearchtextbox")
    WebElement searchBar;
    @FindBy (xpath = "//input[@value='Ir']")
    WebElement searchButton;
    public AmazonHomePage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void goToWebpage()
    {
        driver.navigate().to("https://amazon.com.mx");
    }
    public String getTitle()
    {
        return driver.getTitle();
    }
    public void searchItem()
    {
        searchBar.click();
        searchBar.sendKeys("Silverstein");
        searchButton.click();
    }
}
