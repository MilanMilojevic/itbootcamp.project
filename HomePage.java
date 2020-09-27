package Projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    public static String url = "http://automationpractice.com/index.php";
    private static String womenXpath = "//a[@class='sf-with-ul'][contains(text(),'Women')]";
    private static String womenSummerDressesXpath = "//li[@class='sfHover']//a[contains(text(),'Summer Dresses')]";
    private static String dressesXpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]";
    private static String dressesSummerDressesXpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[3]/a[1]";
    private static String contactUsXpath = "//div[@id='contact-link']//a[contains(text(),'Contact us')]";
    private static String searchBarXpath = "//input[@id='search_query_top']";
    private static String searchBarButtonXpath = "//button[@name='submit_search']";
    private static String facebookXpath = "//li[@class='facebook']//a";
    private static String twitterXpath = "//li[@class='twitter']//a";
    private static String youtubeXpath = "//li[@class='youtube']//a";
    private static String googleXpath = "//li[@class='google-plus']//a";

    public static WebElement getWomen(WebDriver driver) {
        return driver.findElement(By.xpath(womenXpath));
    }
    public static WebElement getWomenSummerDresses(WebDriver driver) {
        return driver.findElement(By.xpath(womenSummerDressesXpath));
    }
    public static void clickWomenSummerDresses(WebDriver driver){
        getWomenSummerDresses(driver).click();
    }
    public static WebElement getDresses(WebDriver driver) {
        return driver.findElement(By.xpath(dressesXpath));
    }
    public static WebElement getDressesSummerDresses(WebDriver driver) {
        return driver.findElement(By.xpath(dressesSummerDressesXpath));
    }
    public static void clickDressesSummerDresses(WebDriver driver){
        getDressesSummerDresses(driver).click();
    }
    public static WebElement getContactUs(WebDriver driver) {
        return driver.findElement(By.xpath(contactUsXpath));
    }
    public static void clickContactUs(WebDriver driver){
        getContactUs(driver).click();
    }
    public static WebElement getSearchBar(WebDriver driver) {
        return driver.findElement(By.xpath(searchBarXpath));
    }
    public static void inputItem (WebDriver driver, String item) {
        getSearchBar(driver).sendKeys(item);
    }
    public static WebElement getSearchBarButton(WebDriver driver) {
        return driver.findElement(By.xpath(searchBarButtonXpath));
    }
    public static void clickSearchButton(WebDriver driver){
        getSearchBarButton(driver).click();
    }
    public static WebElement getFacebook(WebDriver driver) {
        return driver.findElement(By.xpath(facebookXpath));
    }
    public static void clickFacebook (WebDriver driver){
        getFacebook(driver).click();
    }
    public static WebElement getTwitter(WebDriver driver) {
        return driver.findElement(By.xpath(twitterXpath));
    }
    public static void clickTwitter (WebDriver driver){
        getTwitter(driver).click();
    }
    public static WebElement getYoutube(WebDriver driver) {
        return driver.findElement(By.xpath(youtubeXpath));
    }
    public static void clickYoutube (WebDriver driver){
        getYoutube(driver).click();
    }
    public static WebElement getGoogle(WebDriver driver) {
        return driver.findElement(By.xpath(googleXpath));
    }
    public static void clickGoogle (WebDriver driver){
        getGoogle(driver).click();
    }
}