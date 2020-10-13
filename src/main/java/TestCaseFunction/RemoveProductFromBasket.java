package TestCaseFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RemoveProductFromBasket {

    private static SeleniumHelper seleniumHelper;
    private static WebDriver driver;
    private static LocatorClass locatorClass;
    private static WaitHelper waitHelper;

    public RemoveProductFromBasket (WebDriver driver) {

        this.driver = driver;
        this.seleniumHelper = new SeleniumHelper(driver);
        this.locatorClass = new LocatorClass();
        waitHelper = new WaitHelper(driver);
        PageFactory.initElements(driver, locatorClass);
}

    public void RemoveProduct(){

        seleniumHelper.clickToElement(seleniumHelper.getWebElement(locatorClass.RemoveButton));
        seleniumHelper.clickToElement(seleniumHelper.getWebElement(locatorClass.deleteButton));

    }

    /*public void verifyEmptyBasket(){

        Assert.assertTrue(String.valueOf(seleniumHelper.getWebElement(locatorClass.EmptyBasketText)), true);
        System.out.println(String.valueOf(seleniumHelper.getWebElement(locatorClass.EmptyBasketText).equals("Sepette ürün bulunmamaktadır")));*/

    }
