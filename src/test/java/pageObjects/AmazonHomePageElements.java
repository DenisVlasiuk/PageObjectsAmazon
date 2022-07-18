package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePageElements extends BasePage{


    public AmazonHomePageElements(WebDriver driver) {
        super(driver);
    }


    public WebElement getLogoImage(){

        return driver.findElement(By.xpath("//a[contains(@href, 'ref=nav_logo')]"));
    }

    public WebElement getDeliverTo(){
        return driver.findElement(By.xpath("//div[@id='glow-ingress-block']"));

    }

    public WebElement getSearchField(){
        return driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));


    }

    public WebElement getSearchImageButton(){
        return driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));


    }


}
