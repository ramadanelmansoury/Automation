package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static String baseUrl = "https://ecom-stg.bonat.io/";

    protected static WebDriver driver = new ChromeDriver();

    public BaseTest(WebDriver driver)
    {

        this.driver = driver;
    }


    @BeforeSuite
    public static void startBrowser() {
        System.setProperty("web-driver.chrome.driver", "chromedriver");
        driver.get(baseUrl);
        driver.manage().window().maximize();

        int TimeOut = 25;
        driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);

    }

 /*
   @AfterSuite
   public void tearDown() throws InterruptedException {

   driver.manage().deleteAllCookies();
   driver.quit();
  }
*/

}