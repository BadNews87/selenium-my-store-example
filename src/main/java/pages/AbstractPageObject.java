package pages;

import config.Configuration;
import config.ConfigurationManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public abstract class AbstractPageObject {

    private WebDriver driver;

    protected AbstractPageObject(WebDriver driver) {
        this.driver = driver;
        Configuration configuration = ConfigurationManager.getConfiguration();
        int timeout = configuration.timeout();

        PageFactory.initElements(new AjaxElementLocatorFactory(driver, timeout), this);
    }

    protected WebDriver getDriver(){
        return driver;
    }


}
