import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {


    @Test
    public void searchBox() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.typeInSearchBar("Siemanko");
        Thread.sleep(12000);
    }
}
