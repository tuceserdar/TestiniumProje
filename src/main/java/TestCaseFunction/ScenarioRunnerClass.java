package TestCaseFunction;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class ScenarioRunnerClass {

    private static String productPrice;

    public static void main(String[] args) throws InterruptedException, IOException {

        DriverManager driverManager = new DriverManager();
        WebDriver driver = driverManager.getWebDriver("chrome");
        driver.get("https://www.trendyol.com/");
        driver.manage().window().maximize();

        Login login = new Login(driver);
        EnterDataToSearchBox enterDataToSearchBox = new EnterDataToSearchBox(driver);
        SelectRandomPC selectRandomPC = new SelectRandomPC(driver);
        ExportDataToTextFile exportDataToTextFile= new ExportDataToTextFile(driver);
        AddProductToBasket addProductToBasket= new AddProductToBasket(driver);
        ChangeProductItemCount changeProductItemCount = new ChangeProductItemCount(driver);
        RemoveProductFromBasket removeProductFromBasket= new RemoveProductFromBasket(driver);


        login.verifyPage();
        login.login();
        enterDataToSearchBox.searchProduct("Bilgisayar");
        selectRandomPC.selectRandomProduct();
        productPrice = exportDataToTextFile.ExportData();
        addProductToBasket.AddProduct();
        changeProductItemCount.IncreaseItemCount();
        changeProductItemCount.verifyAmount();
        removeProductFromBasket.RemoveProduct();


    }
}
