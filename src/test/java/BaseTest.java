import config.Configuration;
import config.ConfigurationManager;
import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {

    public static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    @Parameters("browser")
    public void preCondition(@Optional("chrome") String browser) {
        Configuration configuration = ConfigurationManager.getConfiguration();

        DriverFactory driverFactory = new DriverFactory();
        driver = driverFactory.createInstance(browser);

        driver.get(configuration.baseUrl());
    }

    @AfterMethod(alwaysRun = true)
    public void postCondition() {
        driver.quit();
    }
}
