package TestCaseFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EnterDataToSearchBox{

    private SeleniumHelper seleniumHelper;
    private WebDriver driver;
    private LocatorClass locatorClass;
    private WaitHelper waitHelper;
    public EnterDataToSearchBox(WebDriver driver) {
        this.driver = driver;
        this.seleniumHelper = new SeleniumHelper(driver);
        this.waitHelper = new WaitHelper(driver);
        this.locatorClass = new LocatorClass();
        PageFactory.initElements(driver, locatorClass);
    }

    public void searchProduct(String searchText) throws InterruptedException {
       try {
           Thread.sleep(1000);
       }catch (Exception e) {
       }
        waitHelper.waitUntilElementIsVisiable(locatorClass.accountId, 30);
        seleniumHelper.clickToElement(seleniumHelper.getWebElement(locatorClass.inputSearchBar));
        Thread.sleep(1000);
        seleniumHelper.enterValue(seleniumHelper.getWebElement(locatorClass.inputSearchBar), searchText);
        waitHelper.waitUntilElementIsVisiable(locatorClass.suggestionResutls, 30);
        List<WebElement> list = seleniumHelper.getWebElementList(locatorClass.suggestionResutls);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getText().equalsIgnoreCase(searchText)) {
                list.get(i).click();
                break;
            }
        }
    }
}




