import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFormProduct extends PageObject{

    private final String SEARCH_TEXT = "notebook";

    @FindBy(id = "testId-SearchBar-Input")
    private WebElement search_text;

    @FindBy(id = "SearchBar-module_searchBtnIcon__2L2s0")
    private WebElement button_search;

    public SearchFormProduct(WebDriver driver){
        super(driver);
    }

    public void enterSearchText(){this.search_text.sendKeys(SEARCH_TEXT);}

    public void pressSearchButton(){this.button_search.click();}
}
