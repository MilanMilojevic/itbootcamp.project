package Projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResults {
    private static String numOfItemsXpath = "/html/body/div/div[2]/div/div[3]/div[2]/h1/span[2]";
    private static String colorOfFirstItemXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[3]/ul[1]/li[4]/a[1]";
    private static String colorOfSecondItemXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/div[3]/ul[1]/li[2]/a[1]";
    private static String colorOfThirdItemXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[3]/div[1]/div[2]/div[3]/ul[1]/li[2]/a[1]";

    public static WebElement getNumOfItems(WebDriver driver) {
        return driver.findElement(By.xpath(numOfItemsXpath));
    }
    public static String numOfItems(WebDriver driver) {
        return driver.findElement(By.xpath(numOfItemsXpath)).getText();
    }
    public static WebElement getColorOfFirstItem(WebDriver driver) {
        return driver.findElement(By.xpath(colorOfFirstItemXpath));
    }
    public static String colorOfFirstItem(WebDriver driver) {
        return driver.findElement(By.xpath(colorOfFirstItemXpath)).getAttribute("style");
    }
    public static WebElement getColorOfSecondItem(WebDriver driver) {
        return driver.findElement(By.xpath(colorOfSecondItemXpath));
    }
    public static String colorOfSecondItem(WebDriver driver) {
        return driver.findElement(By.xpath(colorOfSecondItemXpath)).getAttribute("style");
    }
    public static WebElement getColorOfThirdItem(WebDriver driver) {
        return driver.findElement(By.xpath(colorOfThirdItemXpath));
    }
    public static String colorOfThirdItem(WebDriver driver) {
        return driver.findElement(By.xpath(colorOfThirdItemXpath)).getAttribute("style");
    }
}
