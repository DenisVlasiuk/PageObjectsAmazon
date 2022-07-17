import org.testng.annotations.Test;

public class ProDj extends TestInit{

    @Test
public void runToProDj(){

        goToGoogle();
        getSearchField().sendKeys("prodj\n");
        goToProDj().click();
        searchToProDj().sendKeys("pioneer\n");
        goToPioneer().click();

    }
}
