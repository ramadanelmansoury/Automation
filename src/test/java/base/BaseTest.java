package base;

import io.qameta.allure.Allure;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static String baseUrl = "https://ecom-stg.bonat.io/";

    protected static WebDriver driver = new ChromeDriver();

    public BaseTest()
    {

        BaseTest.driver = driver;
    }

    @BeforeSuite
    public static void startBrowser() {
        System.setProperty("web-driver.chrome.driver", "chromedriver");
        driver.get(baseUrl);
        driver.manage().window().maximize();

        int TimeOut = 25;
        driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);

    }

    @AfterSuite
   public void tearDown() throws InterruptedException {
   driver.manage().deleteAllCookies();
   driver.quit();
  }

  @AfterMethod
  public void takeScreenShotOnFailure(ITestResult result) throws IOException {
      if (result.getStatus() == ITestResult.SUCCESS) {
          System.out.println(result.getStatus());
          System.out.println(ITestResult.SUCCESS);
          System.out.println("Failed");
          String testCaseName= result.getMethod().getMethodName();
          File destFile = new File("target\\screenshots\\" + testCaseName+ ".png");
          takeScreenShot(destFile);
      }
  }


public void takeScreenShot(File destFile)
{
    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    try {
        FileUtils.copyFile(scrFile, new File(destFile + ".png"));
        InputStream is = new FileInputStream(destFile);
        Allure.addAttachment("screenShot", is);
    } catch (IOException e) {
        e.printStackTrace();
}
}
}