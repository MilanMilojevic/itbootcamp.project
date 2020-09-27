package Projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactUs {
        private static String subjectNameXpath = "/html/body/div/div[2]/div/div[3]/div/form/fieldset/div[1]/div[1]/div[1]/div/select";
        private static String emailXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/p[4]/input[1]";
        private static String orderXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[2]/input[1]";
        private static String chooseFileXpath = "//input[@id='fileUpload']";
        private static String messageXpath = "//textarea[@id='message']";
        private static String sendXpath = "//span[contains(text(),'Send')]";
        private static String successfulSendXpath = "/html/body/div/div[2]/div/div[3]/div/p";


    public static WebElement getSubject(WebDriver driver) {
        return driver.findElement(By.xpath(subjectNameXpath));
    }
    public static Select getSubjectSelect (WebDriver driver){
        return new Select(getSubject(driver));
    }

    public static void chooseSubject (WebDriver driver, int index) {
        getSubjectSelect(driver).selectByIndex(index);
    }

    public static WebElement getEmail(WebDriver driver) {
        return driver.findElement(By.xpath(emailXpath));
    }
    public static void inputEmail(WebDriver driver, String email) {
        getEmail(driver).sendKeys(email);
    }
    public static WebElement getOrder(WebDriver driver) {
        return driver.findElement(By.xpath(orderXpath));
    }
    public static void inputOrder(WebDriver driver, String order) {
        getOrder(driver).sendKeys(order);
    }
    public static WebElement getChooseFile(WebDriver driver) {
        return driver.findElement(By.xpath(chooseFileXpath));
    }
    public static void inputFile(WebDriver driver, String file) {
        getChooseFile(driver).sendKeys(file);
    }
    public static WebElement getMessage(WebDriver driver) {
        return driver.findElement(By.xpath(messageXpath));
    }
    public static void inputMessage(WebDriver driver, String message) {
        getMessage(driver).sendKeys(message);
    }
    public static WebElement getSend(WebDriver driver) {
        return driver.findElement(By.xpath(sendXpath));
    }
    public static void clickSend (WebDriver driver){
        getSend(driver).click();
    }
    public static WebElement getSuccessfulSend(WebDriver driver) {
        return driver.findElement(By.xpath(successfulSendXpath));
    }
    public static String statusOfMessage(WebDriver driver) {
        return driver.findElement(By.xpath(successfulSendXpath)).getText();
    }

}
