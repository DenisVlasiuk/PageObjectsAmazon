package TestDrW;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestDriverW {

    @Test
    public void runGoog(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com.ua/");
        driver.findElement(By.xpath("//input[@name= 'q']")).sendKeys("dog\n");
        driver.findElement(By.xpath("//h3[contains(text(), 'Wikipedia')]")).click();
        driver.findElement(By.xpath("//a[contains(@title, 'Evolution')]")).click();





    }

}
