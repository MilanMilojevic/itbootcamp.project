package Projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {
    private static String colorAndSzieXpath = "/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[2]/small[2]/a";
    private static String quantityXpath = "/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[5]/input[1]";

    public static WebElement getColorAndSize(WebDriver driver) {
        return driver.findElement(By.xpath(colorAndSzieXpath));
    }
    public static String colorAndSize(WebDriver driver) {
        return driver.findElement(By.xpath(colorAndSzieXpath)).getText();
    }
    public static WebElement getQuantity(WebDriver driver) {
        return driver.findElement(By.xpath(quantityXpath));
    }
    public static String quantity(WebDriver driver) {
        return driver.findElement(By.xpath(quantityXpath)).getAttribute("value");
    }
}
