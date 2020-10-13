package TestCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumHelper {
    private  WebDriver driver;
    private WaitHelper waitHelper;
    public SeleniumHelper(WebDriver driver) {

        this.driver = driver;
        this.waitHelper = new WaitHelper(driver);
    }

    public void scrollToElementViewCenterOfScreen (By by){

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].scrollIntoView({block: 'center'})", driver.findElement(by));
    }

    public WebElement getWebElement(By by) {

        waitHelper.waitUntilElementIsVisiable(by, 30);
        scrollToElementViewCenterOfScreen(by);
        return driver.findElement(by);
    }


    public List<WebElement> getWebElementList(By by) {

        scrollToElementViewCenterOfScreen(by);
        return driver.findElements(by);
    }

    public void clickToElement(WebElement element){
        element.click();
    }


    public void enterValue(WebElement element, String value) {

        element.sendKeys(value);
    }

    }

