package pages.SingIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPageObject;

public class SingInPage extends AbstractPageObject {

    private final CreateAccountSection createAccountSection;
    private final AddressSection addressSection;
    private final PersonalInfoSection personalInfoSection;
    private final String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
    @FindBy(id = "submitAccount")
    private WebElement registerButton;

    public SingInPage(WebDriver driver) {
        super(driver);
        createAccountSection = new CreateAccountSection(driver);
        personalInfoSection = new PersonalInfoSection(driver);
        addressSection = new AddressSection(driver);
    }

    public CreateAccountSection getCreateAccountSection(){
        return createAccountSection;
    }

    public PersonalInfoSection getPersonalInfoSection(){
        return personalInfoSection;
    }

    public AddressSection getAddressSection(){
        return addressSection;
    }

    public void registerUser() {
        this.registerButton.click();
    }

    public void openPage() {
        WebDriver driver = getDriver();
        driver.get(URL);

    }

}
