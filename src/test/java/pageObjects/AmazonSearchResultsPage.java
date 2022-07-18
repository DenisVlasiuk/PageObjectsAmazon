package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchResultsPage extends BasePage {


    public AmazonSearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getResultsField(){
        return driver.findElement(By.xpath("//span[text()='RESULTS']"));



    }

}
