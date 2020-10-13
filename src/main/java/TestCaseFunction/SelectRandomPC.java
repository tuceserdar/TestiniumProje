package TestCaseFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SelectRandomPC {

    private static SeleniumHelper seleniumHelper;
    private static WebDriver driver;
    private static LocatorClass locatorClass;
    private static WaitHelper waitHelper;

    public SelectRandomPC(WebDriver driver) {

        this.seleniumHelper = new SeleniumHelper(driver);
        this.locatorClass = new LocatorClass();
        waitHelper = new WaitHelper(driver);
        PageFactory.initElements(driver, locatorClass);
    }

    public void selectRandomProduct(){

        seleniumHelper.clickToElement(seleniumHelper.getWebElement(locatorClass.clickSearchButton));
        waitHelper.waitUntilElementIsVisiable(locatorClass.resultsList, 30);
        List<WebElement> list = seleniumHelper.getWebElementList(locatorClass.resultsList);
        Random r = new Random();
        int result = r.nextInt(list.size()-1) + 1;
        list.get(result).click();
    }
}