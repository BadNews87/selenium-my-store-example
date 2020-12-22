package pages.SingIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPageObject;

public class CreateAccountSection extends AbstractPageObject {
    protected CreateAccountSection(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#email_create")
    private WebElement emailField;

    @FindBy(css = "#SubmitCreate")
    private WebElement createAccountButton;


    public void enterEmali(String text){
        this.emailField.sendKeys(text);
    }

    public void createAccount(){
        this.createAccountButton.click();
    }

}
