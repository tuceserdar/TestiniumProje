package TestCaseFunction;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ChangeProductItemCount {
    private static SeleniumHelper seleniumHelper;
    private static WebDriver driver;
    private static LocatorClass locatorClass;
    private static WaitHelper waitHelper;

    public ChangeProductItemCount (WebDriver driver) {

        this.seleniumHelper = new SeleniumHelper(driver);
        this.locatorClass = new LocatorClass();
        waitHelper = new WaitHelper(driver);
        PageFactory.initElements(driver, locatorClass);
    }

    public void IncreaseItemCount(){

        seleniumHelper.clickToElement(seleniumHelper.getWebElement(locatorClass.BasketIcon));
        seleniumHelper.clickToElement(seleniumHelper.getWebElement(locatorClass.AddProduct));


    }

    public void verifyAmount(){

        Assert.assertTrue(String.valueOf(seleniumHelper.getWebElement(locatorClass.ProductCount)), true);
        System.out.println(String.valueOf(seleniumHelper.getWebElement(locatorClass.ProductCount).equals(2)));
    }

}
