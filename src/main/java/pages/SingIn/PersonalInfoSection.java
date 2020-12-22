package pages.SingIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.AbstractPageObject;

import java.util.List;

public class PersonalInfoSection extends AbstractPageObject {
    @FindBy(css = ".radio-inline input")
    private List<WebElement> title;
    @FindBy(css = "#customer_firstname")
    private WebElement firstName;
    @FindBy(css = "#customer_lastname")
    private WebElement lastName;
    @FindBy(css = "#email")
    private WebElement email;
    @FindBy(css = "#passwd")
    private WebElement password;
    @FindBy(css = "#days")
    private WebElement dayDropdown;
    @FindBy(css = "#months")
    private WebElement monthDropdown;
    @FindBy(css = "#years")
    private WebElement yearDropdown;
    @FindBy(css = "#newsletter")
    private WebElement newsletterCheckbox;
    @FindBy(css = "#optin")
    private WebElement specialOfferCheckbox;

    public PersonalInfoSection(WebDriver driver) {
        super(driver);
    }

    public void selectTitle(int index) {
        this.title.get(index).click();
    }

    public void enterFirstName(String text) {
        this.firstName.sendKeys(text);
    }

    public void enterLastName(String text) {
        this.lastName.sendKeys(text);
    }

    public void enterEmail(String emaiAddress) {
        this.email.sendKeys(emaiAddress);
    }

    public void enterPassword(String text) {
        this.password.sendKeys(text);
    }

    public void selectDay(String value) {
        new Select(this.dayDropdown).selectByValue(value);
    }

    public void selectMonth(String value) {
        new Select(this.monthDropdown).selectByValue(value);
    }

    public void selectYear(String value) {
        new Select(this.yearDropdown).selectByValue(value);
    }

    public void signUpForNewsletter() {
        this.newsletterCheckbox.click();
    }

    public void chooseSpecialOffer() {
        this.specialOfferCheckbox.click();
    }


}
