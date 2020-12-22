import org.testng.annotations.Test;
import pages.SingIn.AddressSection;
import pages.SingIn.CreateAccountSection;
import pages.SingIn.PersonalInfoSection;
import pages.SingIn.SingInPage;

public class UserRegistrationTest extends BaseTest {

    @Test
    public void registerUser() throws InterruptedException {
        SingInPage singInPage = new SingInPage(driver);
        singInPage.openPage();

        CreateAccountSection createAccountSection = singInPage.getCreateAccountSection();
        createAccountSection.enterEmali("Krzysztof.Jarzyna@gmail.com");
        createAccountSection.createAccount();

        PersonalInfoSection personalInfoSection = singInPage.getPersonalInfoSection();
        personalInfoSection.selectTitle(0);
        personalInfoSection.enterFirstName("Krzysztof");
        personalInfoSection.enterLastName("Jarzyna");
        personalInfoSection.enterPassword("Ram Pam Pam");
        personalInfoSection.selectDay("22");
        personalInfoSection.selectMonth("1");
        personalInfoSection.selectYear("1982");
        personalInfoSection.signUpForNewsletter();
        personalInfoSection.chooseSpecialOffer();

        AddressSection addressSection = singInPage.getAddressSection();
        addressSection.enterFirstName("Krzysztof");
        addressSection.enterLastName("Jarzyna");
        addressSection.enterCompanyName("EPAM");
        addressSection.enterAddress("Wall Street 22");
        addressSection.enterCity("New York");
        addressSection.enterZipCiode("95233");
        addressSection.selectSate("15");
        addressSection.enterAdditionalInfo("I'am the line manager of Media Apps teams");
        addressSection.enterPhoneNumber("555-234-367");
        addressSection.enterMobilePhoneNumber("777-892-332");
        addressSection.enterAlias("Warzywo");

        singInPage.registerUser();

    }
}
