package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends AbstractPageObject {

    @FindBy(css = "#search_query_top")
    private WebElement searchBar;
    @FindBy(css = ".product-container .product-name")
    private List<WebElement> productNames;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getProductName(int number) {
        return productNames.get(number).getTagName();
    }

    public void typeInSearchBar(String text) {
        searchBar.sendKeys(text);
    }
}
