package TestCaseFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddProductToBasket {

    private static SeleniumHelper seleniumHelper;
    private static WebDriver driver;
    private static LocatorClass locatorClass;
    private static WaitHelper waitHelper;

    public AddProductToBasket(WebDriver driver) {

        this.driver = driver;
        this.seleniumHelper = new SeleniumHelper(driver);
        this.locatorClass = new LocatorClass();
        waitHelper = new WaitHelper(driver);
        PageFactory.initElements(driver, locatorClass);
    }


    public void AddProduct() throws InterruptedException {

        seleniumHelper.clickToElement(seleniumHelper.getWebElement(locatorClass.AddBasketButton));

    }
}

