package Projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SecondDress {
    private static String QuantityXpath =      "/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/p[1]/input";
    private static String sizeSelectXpath =       "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[2]/div[1]/fieldset[1]/div[1]/div[1]/select[1]";
    private static String colorWhiteXpath =       "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[2]/div[1]/fieldset[2]/div[1]/ul[1]/li[1]/a[1]";
    private static String addToCartXpath =        "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[3]/div[1]/p[1]/button[1]/span[1]";
    private static String cartXpath =             "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]";
    private static String continueShoppingXpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/span[1]/span[1]";

    public static WebElement getQuantity(WebDriver driver) {
        return driver.findElement(By.xpath(QuantityXpath));
    }
    public static void inputQuantity(WebDriver driver, String quantity) {
        getQuantity(driver).sendKeys(quantity);
    }
    public static WebElement getSize(WebDriver driver) {
        return driver.findElement(By.xpath(sizeSelectXpath));
    }
    public static Select getSizeSelect(WebDriver driver){
        return new Select(getSize(driver));
    }
    public static void chooseSize (WebDriver driver, int size) {
        getSizeSelect(driver).selectByIndex(size);
    }
    public static WebElement getColorWhite(WebDriver driver) {
        return driver.findElement(By.xpath(colorWhiteXpath));
    }
    public static void clickColorWhite(WebDriver driver){
        getColorWhite(driver).click();
    }
    public static WebElement getAddToCart(WebDriver driver) {
        return driver.findElement(By.xpath(addToCartXpath));
    }
    public static void clickAddToCart(WebDriver driver){
        getAddToCart(driver).click();
    }

    public static WebElement getCart(WebDriver driver) {
        return driver.findElement(By.xpath(cartXpath));
    }
    public static void clickCart(WebDriver driver){
        getCart(driver).click();
    }

    public static WebElement getContinueShopping(WebDriver driver) {
        return driver.findElement(By.xpath(continueShoppingXpath));
    }
    public static void clickContinueShopping(WebDriver driver){
        getContinueShopping(driver).click();
    }

}