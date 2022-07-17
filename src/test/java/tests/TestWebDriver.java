package tests;

import org.testng.annotations.Test;
import pageObjects.GoogleHomePage;

public class TestWebDriver extends TestInit {

    @Test
    public void runGoogle(){
        goToGoogle();
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.getSearchField().sendKeys("dogs\n");
        googleHomePage.getSearchField().click();
        clickDogList().click();
        Pintscher().click();



    }

    @Test
    public void clickEnterBtn(){
        goToGoogle();
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.getEnterButton().click();

    }

}
