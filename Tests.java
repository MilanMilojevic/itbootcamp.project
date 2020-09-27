package Projekat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

public class Tests {
    @BeforeMethod
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.get(HomePage.url);
    }
    static WebDriver wd;
    @AfterMethod
    public static void after(){
        wd.quit();
    }


    @Test
    public static void testForme() throws InterruptedException {
        HomePage.clickContactUs(wd);
        Thread.sleep(2000);
        ContactUs.chooseSubject(wd, 1);
        ContactUs.inputEmail(wd, "milan@gmail.com");
        ContactUs.inputOrder(wd, "22");
        ContactUs.getChooseFile(wd).sendKeys("/home/milan/1.jpg");
        ContactUs.inputMessage(wd, "Looooool");
        ContactUs.clickSend(wd);
        SoftAssert sf = new SoftAssert();
        sf.assertEquals(ContactUs.statusOfMessage(wd), "Your message has been successfully sent to our team.");
        sf.assertAll();
    }
    @Test
    public static void testWomenLink() {
        Actions ac = new Actions(wd);
        ac.moveToElement(HomePage.getWomen(wd)).build().perform();
        HomePage.clickWomenSummerDresses(wd);
        SoftAssert sf = new SoftAssert();
        sf.assertEquals(SummerDresses.summerDressesURL(wd), "http://automationpractice.com/index.php?id_category=11&controller=category");
        sf.assertAll();
    }
    @Test
    public static void testDressesLink() {
        Actions ac = new Actions(wd);
        ac.moveToElement(HomePage.getDresses(wd)).build().perform();
        HomePage.clickDressesSummerDresses(wd);
        SoftAssert sf = new SoftAssert();
        sf.assertEquals(SummerDresses.summerDressesURL(wd), "http://automationpractice.com/index.php?id_category=11&controller=category");
        sf.assertAll();

    }
    @Test
    public static void testCartContents() throws InterruptedException {
        Actions ac = new Actions(wd);
        ac.moveToElement(HomePage.getWomen(wd)).build().perform();
        HomePage.clickWomenSummerDresses(wd);
        Thread.sleep(1000);
        SummerDresses.clickSecondDress(wd);
        SecondDress.getQuantity(wd).clear();
        SecondDress.inputQuantity(wd, "2");
        SecondDress.chooseSize(wd, 1);
        SecondDress.clickColorWhite(wd);
        SecondDress.clickAddToCart(wd);
        Thread.sleep(2000);
        SecondDress.clickContinueShopping(wd);
        SecondDress.clickCart(wd);
        SoftAssert sf = new SoftAssert();
        sf.assertEquals(Cart.colorAndSize(wd), "Color : White, Size : M");
        sf.assertEquals(Cart.quantity(wd), "2");
        sf.assertAll();
    }
    @Test
    public static void seachResultTest() {
        HomePage.inputItem(wd, "yellow");
        HomePage.clickSearchButton(wd);
        SoftAssert sf = new SoftAssert();
        sf.assertEquals(SearchResults.numOfItems(wd),"3 results have been found.");
        sf.assertEquals(SearchResults.colorOfFirstItem(wd),"background: rgb(241, 196, 15);");
        sf.assertEquals(SearchResults.colorOfSecondItem(wd),"background: rgb(241, 196, 15);");
        sf.assertEquals(SearchResults.colorOfThirdItem(wd),"background: rgb(241, 196, 15);");
        sf.assertAll();
    }
    @Test
    public static void facebookLinkTest() throws InterruptedException {
        HomePage.clickFacebook(wd);
        ArrayList<String> tabs = new ArrayList<String>(wd.getWindowHandles());
        wd.switchTo().window(tabs.get(1));
        Thread.sleep(1000);
        SoftAssert sf = new SoftAssert();
        sf.assertEquals(wd.getCurrentUrl(),"https://www.facebook.com/groups/525066904174158/");
        sf.assertAll();
    }
    @Test
    public static void twitterLinkTest() throws InterruptedException {
        HomePage.clickTwitter(wd);
        ArrayList<String> tabs = new ArrayList<String>(wd.getWindowHandles());
        wd.switchTo().window(tabs.get(1));
        Thread.sleep(1000);
        SoftAssert sf = new SoftAssert();
        sf.assertEquals(wd.getCurrentUrl(),"https://twitter.com/seleniumfrmwrk");
        sf.assertAll();
    }
    @Test
    public static void youtubeLinkTest() throws InterruptedException {
        HomePage.clickYoutube(wd);
        ArrayList<String> tabs = new ArrayList<String>(wd.getWindowHandles());
        wd.switchTo().window(tabs.get(1));
        Thread.sleep(1000);
        SoftAssert sf = new SoftAssert();
        sf.assertEquals(wd.getCurrentUrl(),"https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA");
        sf.assertAll();
    }
    @Test
    public static void googleLinkTest() throws InterruptedException {
        HomePage.clickGoogle(wd);
        ArrayList<String> tabs = new ArrayList<String>(wd.getWindowHandles());
        wd.switchTo().window(tabs.get(1));
        Thread.sleep(1000);
        SoftAssert sf = new SoftAssert();
        sf.assertEquals(wd.getCurrentUrl(),"https://accounts.google.com/signin/v2/identifier?passive=1209600&osid=1&continue=https%3A%2F%2Fplus.google.com%2F111979135243110831526%2Fposts&followup=https%3A%2F%2Fplus.google.com%2F111979135243110831526%2Fposts&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        sf.assertAll();
    }
    @Test(dataProvider = "testData")
    public static void testSendMessage(String email, String id, String message) throws InterruptedException {
        HomePage.clickContactUs(wd);
        Thread.sleep(2000);
        ContactUs.chooseSubject(wd, 1);
        ContactUs.inputEmail(wd, email);
        ContactUs.inputOrder(wd, id);
        ContactUs.getChooseFile(wd).sendKeys("/home/milan/1.jpg");
        ContactUs.inputMessage(wd, message);
        ContactUs.clickSend(wd);
        SoftAssert sf = new SoftAssert();
        sf.assertEquals(ContactUs.statusOfMessage(wd), "Your message has been successfully sent to our team.");
        sf.assertAll();
        }
    @DataProvider(name = "testData")
    public Object[][] testDataFeed() {
        ReadExcel config = new ReadExcel("testData.xlsx");
        int rows = config.getRowCount(0);
        Object[][] credentials = new Object[rows][3];

        for (int i = 0; i < rows; i++) {
            credentials[i][0] = config.getData(0, i, 0);
            credentials[i][1] = config.getData(0, i, 1);
            credentials[i][2] = config.getData(0, i, 2);
        }

        return credentials;
    }
}
