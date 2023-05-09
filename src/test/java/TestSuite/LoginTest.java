package TestSuite;

import base.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import pages.LoginPage;
@Feature("Login Feature")
public class LoginTest extends BaseTest {
    public LoginTest()
    {
        super();
    }
    @Story("Login With Email And Password")
    @Test(description = "Login With A Valid Email And Password To Bonat ECOM")

    public static void submitForm() throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        login.fillLoginForm();
    }



}
