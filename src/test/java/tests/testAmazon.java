package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AmazonHomePageHelper;
import pageObjects.AmazonSearchResultsPage;

public class testAmazon extends TestInit{

    @Test
    public void checkHeader(){
        AmazonHomePageHelper amazonHomePageHelper = new AmazonHomePageHelper(driver);
        amazonHomePageHelper.navigateAmazon();

        Assert.assertTrue(amazonHomePageHelper.getLogoImage().isDisplayed());
        Assert.assertTrue(amazonHomePageHelper.getDeliverTo().isDisplayed());
        Assert.assertTrue(amazonHomePageHelper.getSearchField().isDisplayed());
        Assert.assertTrue(amazonHomePageHelper.getSearchImageButton().isDisplayed());

    }
@Test
    public void checkSearch(){
    AmazonHomePageHelper amazonHomePageHelper = new AmazonHomePageHelper(driver);
    amazonHomePageHelper.navigateAmazon();

    amazonHomePageHelper.getSearchField().sendKeys("hat");
    amazonHomePageHelper.getSearchImageButton().click();

    AmazonSearchResultsPage amazonSearchResultsPage = new AmazonSearchResultsPage(driver);
    Assert.assertTrue(amazonSearchResultsPage.getResultsField().isDisplayed());

    }

    @Test
    public void checkSearchPen(){
        AmazonHomePageHelper amazonHomePageHelper = new AmazonHomePageHelper(driver);
        amazonHomePageHelper.navigateAmazon();

        AmazonSearchResultsPage AmazonSearchResultsPage = amazonHomePageHelper.search("Pen");

        AmazonSearchResultsPage amazonSearchResultsPage = new AmazonSearchResultsPage(driver);
        Assert.assertTrue(amazonSearchResultsPage.getResultsField().isDisplayed());
        Assert.assertTrue(amazonSearchResultsPage.getElementsWithPenText().size() > 10);
    }

}
