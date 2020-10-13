package TestCaseFunction;

import org.openqa.selenium.By;

public class LocatorClass {

    public By enterPopup = By.xpath("//a[@class='fancybox-item fancybox-close']");
    public By inputSearchBar = By.cssSelector(".search-box.search-box");
    public By clickSearchButton = By.xpath("//i[@class='search-icon']");
    public By resultsList = By.cssSelector(".p-card-wrppr a");
    public By loginButton = By.xpath("//li[@class='login-register-button-container']");
    public By inputEmail = By.xpath("//input[@name='login email']");
    public By inputPassword = By.xpath("//input[@name='login-password']");
    public By closeOpenPopup = By.xpath("//a[@class='fancybox-item fancybox-close']");
    public By submitButton = By.xpath("//button[@class='q-primary q-fluid q-button-medium q-button submit']");
    public By suggestionResutls =  By.cssSelector(".suggestion-result a.suggestion");
    public By accountId = By.id("accountBtn");
    public By AddBasketButton = By.xpath("//div[@class='add-to-bs-tx']");
    public By BasketIcon = By.xpath("//i[@class='icon navigation-icon-basket']");
    public By AddProduct = By.xpath("//button[@class='ty-numeric-counter-button']");
    public By ProductCount = By.xpath("//input[@class='counter-content']");
    public By RemoveButton= By.className("i-trash");
    public By deleteButton= By.xpath("//span[@ng-if='!isLoading.remove']");
    public By EmptyBasketText =By.cssSelector(".col-lg-8 > p:nth-child(1) > span:nth-child(1)");
    public By productName = By.cssSelector("h1.pr-in-br");
    public By productPrice = By.cssSelector("div.pr-in-w span.prc-slg");
    public By basketPrice = By.xpath("//div[@class=pb-basket-item-price]");
}
