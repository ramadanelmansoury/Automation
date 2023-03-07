package TestSuite;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    public LoginTest()
    {

        super(driver);
    }

    @Test(testName = "Login to the website")
    public static void submitForm() throws InterruptedException {

        LoginPage login = new LoginPage(driver);
        login.fillLoginForm();
    }



}
