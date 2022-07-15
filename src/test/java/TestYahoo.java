import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestYahoo extends TestInit {

    @Test
    public void clickEnterBtn(){
        goToYahoo();
        driver.findElement(By.xpath("//a[text()='Войти']")).click();


    }

    @Test
    public void clickEnterBtn2(){
        driver.get("https://www.bing.com/");
        driver.findElement(By.xpath("//a[text()='Войти']")).click();


    }

}
