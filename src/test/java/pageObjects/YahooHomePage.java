package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YahooHomePage extends BasePage{


    public YahooHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField(){
        return driver.findElement(By.xpath("//input[@name='q']"));

    }

    public WebElement getEnterButton() {
        return driver.findElement(By.xpath("//a[text()='Войти']"));
    }
}
