package TestCaseFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExportDataToTextFile {

    private static SeleniumHelper seleniumHelper;
    private static WebDriver driver;
    private static LocatorClass locatorClass;
    private static WaitHelper waitHelper;

    public ExportDataToTextFile(WebDriver driver) {

        this.driver = driver;
        seleniumHelper = new SeleniumHelper(driver);
        locatorClass = new LocatorClass();
        waitHelper = new WaitHelper(driver);
        PageFactory.initElements(driver, locatorClass);
}

    public String ExportData() throws IOException {

        File file =new File("C:\\Users\\omers\\IdeaProjects\\TestiniumProje\\tucetest.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fw);
        System.out.println(seleniumHelper.getWebElement(locatorClass.productName).getText());
        writer.write(seleniumHelper.getWebElement(locatorClass.productName).getText());
        writer.write("\n");
        System.out.println(seleniumHelper.getWebElement(locatorClass.productPrice).getText());
        writer.write(seleniumHelper.getWebElement(locatorClass.productPrice).getText());
        writer.close();
        return seleniumHelper.getWebElement(locatorClass.productPrice).getText();
    }

   /* public void VerifyAmount(){

        Assert.assertTrue(String.valueOf(seleniumHelper.getWebElement(locatorClass.productPrice)), true);
        System.out.println(String.valueOf(seleniumHelper.getWebElement(locatorClass.basketPrice).getText()));*/

    }
