package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory implements IDriver {
    @Override
    public WebDriver createInstance(String browser) {
        WebDriver driverInstance;
        DriverManagerType driverManagerType = DriverManagerType.valueOf(browser.toUpperCase());
        WebDriverManager.getInstance(driverManagerType).setup();

        switch (driverManagerType) {
            case CHROME:
                driverInstance = new ChromeDriver();
                break;
            case FIREFOX:
                driverInstance = new FirefoxDriver();
                break;
            case SAFARI:
                driverInstance = new SafariDriver();
                break;
            case EDGE:
                driverInstance = new EdgeDriver();
                break;
            case OPERA:
                driverInstance = new OperaDriver();
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + driverManagerType);
        }
        return driverInstance;
    }
}
