package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AmazonHomePage;
import pageObjects.AmazonSearchResultsPage;

public class testAmazon extends TestInit{

    @Test
    public void checkHeader(){
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.navigateAmazon();

        Assert.assertTrue(amazonHomePage.getLogoImage().isDisplayed());
        Assert.assertTrue(amazonHomePage.getDeliverTo().isDisplayed());
        Assert.assertTrue(amazonHomePage.getSearchField().isDisplayed());
        Assert.assertTrue(amazonHomePage.getSearchImageButton().isDisplayed());

    }
@Test
    public void checkSearch(){
    AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
    amazonHomePage.navigateAmazon();

    amazonHomePage.getSearchField().sendKeys("hat");
    amazonHomePage.getSearchImageButton().click();

    AmazonSearchResultsPage amazonSearchResultsPage = new AmazonSearchResultsPage(driver);
    Assert.assertTrue(amazonSearchResultsPage.getResultsField().isDisplayed());

    }

}
