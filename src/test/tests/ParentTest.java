package test.tests;

import io.qameta.allure.Attachment;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import test.pages.HomePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ParentTest {

    WebDriver webDriver ;
    HomePage homePage;
    DesiredCapabilities  capabilities = DesiredCapabilities.chrome();

    @Attachment()
    public static byte[] attachString(String attachString){
        return attachString.getBytes();
    }

    @Attachment()
    public static byte[] attachBrowserScreenShot(WebDriver driver){
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }




    @BeforeTest
    @Parameters({"bla"})
    public void beforeTest(@Optional(value = "qwe") String bla) throws MalformedURLException {
       // webDriver  = new ChromeDriver();
        webDriver  = new ChromeDriver();
        //webDriver = new RemoteWebDriver(new URL("http://192.168.145.5:4444/wd/hub"), this.capabilities);

        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        System.out.println(bla);
        homePage = new HomePage(webDriver);

    }

    @AfterMethod
    public void waiter() throws InterruptedException {
        Thread.sleep(2000);

    }

    @AfterTest
    public void close() {
      //  webDriver.quit();
    }

}
