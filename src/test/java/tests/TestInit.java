package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();


    }

    public void sleep(int s) {
        try {
            Thread.sleep(s * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void goToGoogle() {
        driver.get("https://www.google.com.ua/");
    }

    public void goToYahoo() {
        driver.get("https://www.yahoo.com/");
    }



    public WebElement clickDogList() {
        return driver.findElement(By.xpath("//*[contains(text(), 'List of Dog Breeds')]"));

    }
public WebElement Pintscher(){
 return driver.findElement(By.xpath("//h2[contains(@class, 'contentCard-body-hdg u-vr1x')] [contains(text(), 'Affenpinscher')] "));
}
public WebElement goToProDj(){
        return driver.findElement(By.xpath("//h3[contains(text(), 'инт')]"));

}
public WebElement searchToProDj(){
        return driver.findElement(By.xpath("//input[@name='s']"));

}

public WebElement goToPioneer(){
        return driver.findElement(By.xpath("//a[contains(text(), 'CDJ-2000NXS2 (2')]"));

}

}
