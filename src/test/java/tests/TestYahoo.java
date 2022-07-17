package tests;

import org.testng.annotations.Test;
import pageObjects.YahooHomePage;

public class TestYahoo extends TestInit {

    @Test
    public void clickEnterBtn(){
        goToYahoo();
        YahooHomePage yahooHomePage = new YahooHomePage(driver);
        yahooHomePage.getEnterButton().click();


    }

    @Test
    public void clickEnterBtn2(){
        driver.get("https://www.bing.com/");
        YahooHomePage yahooHomePage = new YahooHomePage(driver);
        yahooHomePage.getEnterButton().click();


    }

}
