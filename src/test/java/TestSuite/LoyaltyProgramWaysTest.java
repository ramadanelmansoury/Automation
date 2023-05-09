package TestSuite;

import base.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.LoyaltyProgramPage;

import java.time.Duration;
@Feature("Earning Methods Feature")
public class LoyaltyProgramWaysTest extends BaseTest {
    LoyaltyProgramPage earning = new LoyaltyProgramPage(driver);
    public LoyaltyProgramWaysTest()
    {
        super();
    }
    @Test(priority = 1,description = "test descrpion ")
    @Story("Successful Login Then Navigate To Earning Methods Page")
    public void LoyaltyProgram() throws InterruptedException {
        LoginPage LoyaltyProgram = new LoginPage(driver);
        LoyaltyProgram.fillLoginForm();
        earning.clickLoyaltySideMenu();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        earning.clickEarningWaysMenBtn();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(100000));
    }
    @Test(priority = 2)
    @Story("Click On Complete An Order Then Change The Points To 60 Points")
    public void CompleteAnOrderMethod() throws InterruptedException {
        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.CompleteِِAnOrder();
        earning.inputPoints("60");
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(100));

    }

    @Test(priority = 3)
    @Story("Click On Save Button And Check The Successful Message ")
    public void ClickOnSaveButton() throws InterruptedException {
        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.clickSpan();
        ExpectedConditions.alertIsPresent();
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(100));
    }

    @Test(priority = 4)
    @Story("Click On Complete An Order Then Change The Points To 60 Points")
    public void CompleteAnOrderMethod2() throws InterruptedException {
        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.CompleteِِAnOrder();
        earning.inputPoints("60");
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(100));
    }
    @Test(priority = 5)
    @Story("Check Only award points when the order is completed Option")
    public void CompleteِِAnOrderWithOutOption() throws InterruptedException {
        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.CompleteِِAnOrderWithOutOption();
        ExpectedConditions.alertIsPresent();
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(100));
    }
    @Test(priority = 6)
    @Story("Check Only award points when the order is completed Option Without Points")
    public void registerInStoreWithoutPoints() throws InterruptedException {
        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.SignInStoreEarningMethodsWithoutPoints();
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(100));
    }
    @Test(priority = 7)
    @Story("Check Only award points when the order is completed Option With Points")
    public void inputPointsWithOption() {
        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.inputPointsWithOption();
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(100));
    }
    @Test(priority = 8)
    @Story("Check the user can uncheck the checkbox Of CompleteAnOrder by clicking on it")
    public void CompleteAnOrderActiveAndDeActive() throws InterruptedException {
        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.CompleteAnOrderActive();
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(100));
    }

    @Test(priority = 9)
    @Story("Navigate to Sign In Store Earning Method")
    public void ClickOnSignInStoreEarningMethods() throws InterruptedException {
        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.SignInStoreEarningMethods();
    }
    @Test(priority = 10)
    @Story("Add Points To Sign InStore Earning Method")
    public void AddPointsInSignInStore() throws InterruptedException {
        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.AddPointsInSignInStore("60");
    }

    @Test(priority = 11)
    @Story("Click On Save Button Sign In Store Without Add Points")
    public void ClickOnSaveButtonSignInStoreWithoutPoints() throws InterruptedException {
        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.SignInStoreEarningMethodsWithoutPoints();
    }

    @Test(priority = 12)
    @Story("Check the user can uncheck the checkbox Of RegisterInStoreEarningMethods by clicking on it")
    public void ActiveAndDeActiveRegisterInStoreEarningMethods() throws InterruptedException {
        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.checkedRegisterStoreBtn();
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(100));
    }
    @Test(priority = 13)
    @Story("Click On save button ")
    public void ClickOnSaveButtonRegisterInStore() throws InterruptedException {
        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.CelebrateABirthdayEarningMethods();
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(100));
    }
    @Test(priority = 14)
    public void ActiveAndDeActiveCelebrateABirthdayEarningMethods() throws InterruptedException {
        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.addPointsCelebrateABirthday("100");
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(100));
    }

    @Test(priority = 15)
    public void ClickOnSaveButtonCelebrateABirthday() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.saveBirthDayBtn();
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(100));
    }

    @Test(priority = 16)
    public void ActiveAndDeActiveCelebrateABirthdayMethods() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.activeDeactiveCelebrateABirthday();
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(1000));
        earning.activeDeactiveCelebrateABirthday();
    }

    @Test(priority = 17)
    public void ClickOnTwitterFollowEarningMethods() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.TwitterFollowEarningMethods();
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(100));

    }

    @Test(priority = 18)
    public void AddPointsInTwitterFollow() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.addTwitterUserName("Automation");
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(1000));
        Thread.sleep(1000);
    }

    @Test(priority = 19)
    public void ClickOnSaveButtonTwitterFollowWithoutPoints() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.pointsOfTwitterFollow();
        Thread.sleep(1000);
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(1000));
    }

    @Test(priority = 20)
    public void AddTwitterUserNameAndPoints() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.AddTwitterUserNameAndPoints("Automation Edit", "70");
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(1000));

    }

    @Test(priority = 21)
    public void ActiveAndDeActiveTwitterFollowEarningMethods() throws InterruptedException {
        earning.ActiveAndDeActiveTwitterFollowEarningMethods();
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(1000));
    }
    @Test(priority = 22)
    public void ClickOnInstagramFollowEarningMethods() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.instagramBtn();
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(1000));
    }
    @Test (priority = 23)
    public void SaveWithoutInstagramEmail() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.InstagramEmail();
        FluentWait wait = new FluentWait(driver);
        Thread.sleep(2000);
        wait.withTimeout(Duration.ofSeconds(1000));
    }
    @Test (priority = 24)
    public void SaveWithoutInstagramPoints() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.SaveWithInstagramPoints();
        FluentWait wait = new FluentWait(driver);
        Thread.sleep(2000);
        wait.withTimeout(Duration.ofSeconds(1000));
    }
    @Test (priority = 25)
    public void SaveWithInstagramEmailAndPoints() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.AddInstagramEmailAndPoints("AutomationTest","70");
        FluentWait wait = new FluentWait(driver);
        Thread.sleep(2000);
        wait.withTimeout(Duration.ofSeconds(1000));
    }
    @Test (priority = 26)   //Active and DeActive Instagram Follow Earning Methods
    public void ActiveAndDeActiveInstagramFollowEarningMethods() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.instagramCheckBox();
        FluentWait wait = new FluentWait(driver);
        Thread.sleep(2000);
        earning.instagramCheckBox();
        wait.withTimeout(Duration.ofSeconds(1000));
    }
    @Test (priority = 27)   //Click on Save Button Without TikTok Email
    public void ClickOnSaveButtonWithoutTikTokUserName() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.saveWithoutTiktokEmail();
        FluentWait wait = new FluentWait(driver);
        Thread.sleep(2000);
        wait.withTimeout(Duration.ofSeconds(1000));
    }
    @Test (priority = 28)   //Click on Save Button Without TikTok Points
    public void ClickOnSaveButtonWithoutTikTokPoints() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.saveWithoutTiktokPoints();
        FluentWait wait = new FluentWait(driver);
        Thread.sleep(2000);
        wait.withTimeout(Duration.ofSeconds(1000));
    }
    @Test (priority = 29)   //Click on Save Button With TikTok Email and Points
    public void ClickOnSaveButtonWithOutTikTokEmailAndPoints() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.saveWithoutTiktokEmailAndPoints();
        FluentWait wait = new FluentWait(driver);
        Thread.sleep(2000);
        wait.withTimeout(Duration.ofSeconds(1000));
    }
    @Test   (priority = 30)
    public void AddTikTokUserNameAndPoints() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.addTiktokEmailAndPoints("TiktokTest","35");
        FluentWait wait = new FluentWait(driver);
        Thread.sleep(2000);
        wait.withTimeout(Duration.ofSeconds(1000));
    }
    @Test   (priority = 31)  //Active and DeActive TikTok Follow Earning Methods
    public void ActiveAndDeActiveTikTokFollowEarningMethods() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.tiktokCheckBox();
        FluentWait wait = new FluentWait(driver);
        Thread.sleep(2000);
        earning.tiktokCheckBox();
        wait.withTimeout(Duration.ofSeconds(1000));
    }
    @Test   (priority = 32)  //
    public void SaveWithoutDays() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.saveWithoutDaysForPointExpiry();
        FluentWait wait = new FluentWait(driver);
        Thread.sleep(2000);
        wait.withTimeout(Duration.ofSeconds(1000));
    }
    @Test   (priority = 33)
    public void AddDaysLessThan90() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.checkDaysLimit();
        FluentWait wait = new FluentWait(driver);
        Thread.sleep(2000);
        wait.withTimeout(Duration.ofSeconds(1000));
    }
    @Test   (priority = 34)
    public void AddDaysWithZero() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.checkDaysLimitWithZero();
        FluentWait wait = new FluentWait(driver);
        Thread.sleep(2000);
        wait.withTimeout(Duration.ofSeconds(1000));
    }
    @Test   (priority = 35)
    public void AddDaysWithNegative() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.checkDaysLimitWithNegative();
        FluentWait wait = new FluentWait(driver);
        Thread.sleep(2000);
        wait.withTimeout(Duration.ofSeconds(1000));
    }
    @Test   (priority = 36)
    public void AddDaysWithAlphabets() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.checkDaysLimitWithAlphabets();
        FluentWait wait = new FluentWait(driver);
        Thread.sleep(2000);
        wait.withTimeout(Duration.ofSeconds(1000));
    }
    @Test   (priority = 37)
    public void AddDaysWithSpecialCharacters() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.checkDaysLimitWithSpecialCharacters();
        FluentWait wait = new FluentWait(driver);
        Thread.sleep(2000);
        wait.withTimeout(Duration.ofSeconds(1000));
    }
    @Test   (priority = 38)
    public void AddDaysWithMoreThan90() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        earning.addDaysForPointExpiry("100");
        FluentWait wait = new FluentWait(driver);
        Thread.sleep(2000);
        wait.withTimeout(Duration.ofSeconds(1000));
    }
}
