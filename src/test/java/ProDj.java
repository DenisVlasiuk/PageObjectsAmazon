import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.TestInit;

public class ProDj extends TestInit {

    @Test
public void runToProDj(){

        goToGoogle();
        getSearchField().sendKeys("prodj\n");
        goToProDj().click();
        searchToProDj().sendKeys("pioneer\n");
        goToPioneer().click();

    }

    private WebElement getSearchField() {
        return null;
    }
}
