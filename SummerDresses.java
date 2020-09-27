package Projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SummerDresses {
    private static String secondDressXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/h5[1]/a[1]";

    public static WebElement getSecondDress(WebDriver driver) {
        return driver.findElement(By.xpath(secondDressXpath));
    }
    public static void clickSecondDress (WebDriver driver){
        getSecondDress(driver).click();
    }
    public static String summerDressesURL(WebDriver driver) {
        return driver.getCurrentUrl();
    }
}
