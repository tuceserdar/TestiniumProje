package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.xml.sax.Locator;

public class BasePage {

    /*driver tanımlama */

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }
public WebDriver driver;

    public WebElement element(By Locator) {

        return driver.findElement(Locator);
    }


}
