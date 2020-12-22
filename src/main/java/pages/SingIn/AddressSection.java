package pages.SingIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.AbstractPageObject;

public class AddressSection extends AbstractPageObject {

    @FindBy(css = "#firstname")
    private WebElement firstName;
    @FindBy(css = "#lastname")
    private WebElement lastName;
    @FindBy(css = "#company")
    private WebElement company;
    @FindBy(css = "#address1")
    private WebElement address;
    @FindBy(css = "#city")
    private WebElement city;
    @FindBy(css = "#id_state")
    private WebElement state;
    @FindBy(css = "#postcode")
    private WebElement zipCode;
    @FindBy(css = "#id_country")
    private WebElement country;
    @FindBy(css = "#other")
    private WebElement additionalInfo;
    @FindBy(css = "#phone")
    private WebElement phone;
    @FindBy(css = "#phone_mobile")
    private WebElement mobilePhone;
    @FindBy(css = "#alias")
    private WebElement alias;

    public AddressSection(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(String text) {
        this.firstName.sendKeys(text);
    }

    public void enterLastName(String text) {
        this.lastName.sendKeys(text);
    }

    public void enterCompanyName(String text) {
        this.company.sendKeys(text);
    }

    public void enterAddress(String text) {
        this.address.sendKeys(text);
    }

    public void enterCity(String text) {
        this.city.sendKeys(text);
    }

    public void selectSate(String value) {
        new Select(this.state).selectByValue(value);
    }

    public void enterZipCiode(String text) {
        this.zipCode.sendKeys(text);
    }

    public void selectCountry(String value) {
        new Select(this.country).selectByValue(value);
    }

    public void enterAdditionalInfo(String text) {
        this.additionalInfo.sendKeys(text);
    }

    public void enterPhoneNumber(String text) {
        this.phone.sendKeys(text);
    }

    public void enterMobilePhoneNumber(String text) {
        this.mobilePhone.sendKeys(text);
    }

    public void enterAlias(String text) {
        this.alias.sendKeys(text);
    }

}
