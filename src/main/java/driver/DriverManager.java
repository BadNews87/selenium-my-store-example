package driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    private WebDriver driver;

    public DriverManager(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

}