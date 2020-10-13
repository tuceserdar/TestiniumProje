package TestCaseFunction;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Login {

    private SeleniumHelper seleniumHelper;
    private LocatorClass locatorClass;
    private WebDriver driver;
    public Login(WebDriver driver) {
        this.seleniumHelper = new SeleniumHelper(driver);
        this.locatorClass = new LocatorClass();
        this.driver = driver;
    }

    public void login(){

        File file = new File("C:\\Users\\omers\\IdeaProjects\\TestiniumProje\\login.xlsx");
        FileInputStream fis = null;
        XSSFWorkbook workbook = null;
        try {
            fis = new FileInputStream(file);
            workbook =new XSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        XSSFSheet sheet = workbook.getSheetAt(0);
        String cellValue = ((org.apache.poi.xssf.usermodel.XSSFSheet) sheet).getRow(0).getCell(0).getStringCellValue();
        String cellValue2 = sheet.getRow(0).getCell(1).getStringCellValue();
        seleniumHelper.clickToElement(seleniumHelper.getWebElement(locatorClass.closeOpenPopup));
        seleniumHelper.clickToElement(seleniumHelper.getWebElement(locatorClass.loginButton));
        seleniumHelper.clickToElement(seleniumHelper.getWebElement(locatorClass.inputEmail));
        seleniumHelper.enterValue(seleniumHelper.getWebElement(locatorClass.inputEmail), cellValue);
        seleniumHelper.clickToElement(seleniumHelper.getWebElement(locatorClass.inputPassword));
        seleniumHelper.enterValue(seleniumHelper.getWebElement(locatorClass.inputPassword), cellValue2);
        seleniumHelper.clickToElement(seleniumHelper.getWebElement(locatorClass.submitButton));
    }
    
    public void verifyPage() {

        Assert.assertTrue(String.valueOf(driver.getTitle().contains("Trendyol")), true);
        System.out.println(String.valueOf(driver.getTitle().contains("Trendyol")));
    }

}






