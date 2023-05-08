package pages;

import base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoyaltyProgramPage extends BasePage {
    public LoyaltyProgramPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy( xpath ="//*[@data-testid='programs']")
    public WebElement loyaltyProgramBtnMenu;
    @Step
    public void clickLoyaltySideMenu()
    {
        loyaltyProgramBtnMenu.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @FindBy(xpath = "//*[@data-testid='earningMethods']")
    public WebElement earningWaysMenBtn;
    @Step
    public void clickEarningWaysMenBtn()

    {
        earningWaysMenBtn.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/section/div[2]/div[2]/div/div[1]/div[2]")
    public WebElement divPaperElevation;
    @Step
    public void CompleteِِAnOrder()
    {
        divPaperElevation.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @FindBy(xpath = "//*[@id='points']")
    public WebElement inputPoints;
    @Step
    public void inputPoints(String points)
    {
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        inputPoints.sendKeys(selectAll);
        inputPoints.sendKeys(points);
    }

    @FindBy(xpath = "//span[@class='MuiButton-label']")
    public WebElement span;
    @Step
    public void clickSpan()
    {
        span.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Step
    public void CompleteِِAnOrderWithOutOption()
    {
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        inputPoints.sendKeys(selectAll);
        inputPoints.sendKeys(Keys.DELETE);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        span.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/div/div/div/div[2]/form/div/div[1]/div[2]/span/span[1]/input")
    public WebElement checkbox;
    @Step
    public void inputPointsWithOption( )
    {
        threadSleep(500000);
        inputPoints.click();

        String selectAll = Keys.chord(Keys.CONTROL, "a");
        inputPoints.sendKeys(selectAll);
        CharSequence points = "50";
        inputPoints.sendKeys(points);
        checkbox.click();
        span.click();
    }

    private void threadSleep(int i) {
    }

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/section/div[2]/div[2]/div/div[1]/div[1]/span/span[1]/span/input")
    public WebElement CompleteAnOrderActive;
    @Step
    public <wait> void CompleteAnOrderActive() throws InterruptedException {
        CompleteAnOrderActive.click();
        Thread.sleep(5000);
        CompleteAnOrderActive.click();
        threadSleep(50000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));


    }
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/section/div[2]/div[2]/div/div[2]/div[2]")
    public WebElement SignInStore;
    @Step
    public void SignInStoreEarningMethods()
    {
        int TimeOut = 100;
        driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
        SignInStore.click();

    }
    @FindBy(xpath = "//*[@id='points']")
    public WebElement AddPoints;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/div/div/div/div[2]/form/div/div[2]/span/button")
    public WebElement SaveRegisterStoreBtn;
    @Step
    public void SignInStoreEarningMethodsWithoutPoints() throws InterruptedException {
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        AddPoints.sendKeys(selectAll);
        AddPoints.sendKeys(Keys.DELETE);
        Thread.sleep(5000);
        SaveRegisterStoreBtn.click();
        Thread.sleep(5000);
    }
    @Step
    public void AddPointsInSignInStore(String points) throws InterruptedException {
       String selectAll = Keys.chord(Keys.CONTROL, "a");
       AddPoints.sendKeys(selectAll);
       AddPoints.sendKeys(Keys.DELETE);
       AddPoints.sendKeys(points);
        Thread.sleep(5000);
        SaveRegisterStoreBtn.click();
    }
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/section/div[2]/div[2]/div/div[2]/div[1]/span/span[1]/span/input")
    public WebElement checkedRegisterStoreBtn;
    @Step
    public void checkedRegisterStoreBtn() throws InterruptedException {
        checkedRegisterStoreBtn.click();
        Thread.sleep(5000);
        checkedRegisterStoreBtn.click();

    }
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/section/div[2]/div[2]/div/div[3]/div[3]")
    public WebElement CelebrateABirthday;
    @Step
    public void CelebrateABirthdayEarningMethods() throws InterruptedException {
        int TimeOut = 100;
        driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
        CelebrateABirthday.click();
        Thread.sleep(5000);
    }
    @FindBy(xpath = "//*[@id='points']")
    public WebElement addPointsCelebrateABirthday;
    @Step
    public void addPointsCelebrateABirthday(String points)
    {
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        addPointsCelebrateABirthday.sendKeys(selectAll);
        addPointsCelebrateABirthday.sendKeys(points);
    }
    @FindBy(xpath = "//span[@class='MuiButton-label']")
    public WebElement saveBirthDayBtn;
    @Step
    public void saveBirthDayBtn()
    {
        saveBirthDayBtn.click();
    }
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/section/div[2]/div[2]/div/div[3]/div[2]/span/span[1]/span/input")
    public WebElement activeDeactivateCelebrateABirthday;
    @Step
    public void activeDeactiveCelebrateABirthday() throws InterruptedException {
        activeDeactivateCelebrateABirthday.click();
        Thread.sleep(5000);
        activeDeactivateCelebrateABirthday.click();
    }
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/section/div[2]/div[2]/div/div[4]/div[3]/h3")
    public WebElement TwitterFollow;
    @Step
    public void TwitterFollowEarningMethods() throws InterruptedException {
        int TimeOut = 1000;
        driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
        TwitterFollow.click();
        Thread.sleep(5000);
    }
    @FindBy(xpath = "//*[@id='wayUserName']")
    public WebElement addTwitterUserName;
    @Step
    public void addTwitterUserName(String userName)
    {
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        addTwitterUserName.sendKeys(selectAll);
        addTwitterUserName.sendKeys(userName);
        pointsOfTwitterFollow.sendKeys(selectAll);
        pointsOfTwitterFollow.sendKeys(" ");
        pointsOfTwitterFollow.clear();
    }
    @FindBy(xpath = "//*[@id='points']")
    public WebElement pointsOfTwitterFollow;
    @FindBy(xpath = "//span[@class='MuiButton-label']")
    public WebElement saveTwitterFollowBtn;
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/section/div[2]/div[2]/div/div[4]/div[2]/span/span[1]/span/input")
    public WebElement activeTwitterBtn;
    @Step
    public void pointsOfTwitterFollow()
    {
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        pointsOfTwitterFollow.sendKeys(selectAll);
        pointsOfTwitterFollow.clear();
        saveTwitterFollowBtn.click();

    }
    @Step
    public void AddTwitterUserNameAndPoints(String userName, String points)
    {
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        addTwitterUserName.sendKeys(selectAll);
        addTwitterUserName.sendKeys(userName);
        pointsOfTwitterFollow.sendKeys(selectAll);
        pointsOfTwitterFollow.sendKeys(points);
        saveTwitterFollowBtn.click();
    }
    @Step
    public void ActiveAndDeActiveTwitterFollowEarningMethods() throws InterruptedException {

        LoginPage LoyaltyProgram = new LoginPage(driver);
        activeTwitterBtn.click();
        Thread.sleep(5000);

    }

    @FindBy(xpath = "//div[contains(@style, '0px;')][.//*[@id='instagram']]")
    public WebElement instagramBtn;
    @Step
    public void instagramBtn() throws InterruptedException {
        int TimeOut = 1000;
        driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
        instagramBtn.click();
        Thread.sleep(5000);
    }
    @FindBy(xpath = "//*[@id='wayUserName']")
    public WebElement InstagramEmail;
    @FindBy(xpath = "//span[@class='MuiButton-label']")
    public WebElement saveInstagramBtn;
    @Step
    public void InstagramEmail() throws InterruptedException {
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        InstagramEmail.sendKeys(selectAll);
        InstagramEmail.sendKeys(Keys.DELETE);
        Thread.sleep(5000);
        saveInstagramBtn.click();
    }
    @FindBy(xpath = "//*[@id='points']")
    public WebElement instagramPoints;
    @Step
    public void SaveWithInstagramPoints()
    {
        InstagramEmail.sendKeys("Test Instagram");
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        instagramPoints.sendKeys(selectAll);
        instagramPoints.sendKeys(Keys.DELETE);
        saveInstagramBtn.click();
    }
    @Step
    public void AddInstagramEmailAndPoints(String email, String points)
    {
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        InstagramEmail.sendKeys(selectAll);
        InstagramEmail. sendKeys(Keys.DELETE);
        InstagramEmail.sendKeys(email);
        instagramPoints.sendKeys(selectAll);
        instagramPoints.sendKeys(Keys.DELETE);
        instagramPoints.sendKeys(points);
        saveInstagramBtn.click();
    }
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/section/div[2]/div[2]/div/div[5]/div[2]/span/span[1]/span/input")
    public WebElement instagramCheckBox;
    @Step
    public void instagramCheckBox() throws InterruptedException {
        instagramCheckBox.click();
        Thread.sleep(5000);
        instagramCheckBox.click();
    }
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/section/div[2]/div[2]/div/div[6]/div[2]/span/span[1]/span/input")
    public WebElement tiktokCheckBox;
    @FindBy(xpath = "//div[contains(@style, '0px;')][.//*[@id='tiktok']]")
    public WebElement tiktokBtn;
    @FindBy(xpath = "//*[@id='wayUserName']")
    public WebElement tiktokUserName;
    @FindBy(xpath = "//*[@id='points']")
    public WebElement tiktokPoints;
    @FindBy(xpath = "//span[@class='MuiButton-label']")
    public WebElement tiktokSaveBtn;
    @Step
    public void saveWithoutTiktokEmail() throws  InterruptedException
    {
        int TimeOut = 1000;
        driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
        tiktokBtn.click();
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        tiktokUserName.sendKeys(selectAll);
        tiktokUserName.sendKeys(Keys.DELETE);
        tiktokSaveBtn.click();
    }
    @Step
    public void saveWithoutTiktokPoints() throws  InterruptedException
    {

        String selectAll = Keys.chord(Keys.CONTROL, "a");
        tiktokPoints.sendKeys(selectAll);
        tiktokPoints.sendKeys(Keys.DELETE);
        tiktokSaveBtn.click();
    }
    @Step
    public void saveWithoutTiktokEmailAndPoints() throws  InterruptedException
    {

        String selectAll = Keys.chord(Keys.CONTROL, "a");
        tiktokUserName.sendKeys(selectAll);
        tiktokUserName.sendKeys(Keys.DELETE);
        tiktokPoints.sendKeys(selectAll);
        tiktokPoints.sendKeys(Keys.DELETE);
        tiktokSaveBtn.click();
    }
    @Step
    public void addTiktokEmailAndPoints(String email, String points)
    {
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        tiktokUserName.sendKeys(selectAll);
        tiktokUserName.sendKeys(Keys.DELETE);
        tiktokUserName.sendKeys(email);
        tiktokPoints.sendKeys(selectAll);
        tiktokPoints.sendKeys(Keys.DELETE);
        tiktokPoints.sendKeys(points);
        tiktokSaveBtn.click();
    }
    @Step
    public void tiktokCheckBox() throws InterruptedException {
        tiktokCheckBox.click();
        Thread.sleep(5000);
        tiktokCheckBox.click();
    }
    @FindBy(xpath = "//div[contains(@style, '2em;')]")
    public WebElement PointsExpiryBtn;
    @FindBy(xpath = "//*[@id='days']")
    public WebElement daysForPointExpiry;
    @FindBy(xpath = "//span[@class='MuiButton-label']")
    public WebElement saveDaysBtn;
    @Step
    public void saveWithoutDaysForPointExpiry()
    {
        PointsExpiryBtn.click();
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        daysForPointExpiry.sendKeys(selectAll);
        daysForPointExpiry.sendKeys(Keys.DELETE);
        saveDaysBtn.click();
    }
    @Step
    public void checkDaysLimit()
    {
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        daysForPointExpiry.sendKeys(selectAll);
        daysForPointExpiry.sendKeys(Keys.DELETE);
        daysForPointExpiry.sendKeys("10");
        saveDaysBtn.click();
    }
    @Step
    public void checkDaysLimitWithZero()
    {
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        daysForPointExpiry.sendKeys(selectAll);
        daysForPointExpiry.sendKeys(Keys.DELETE);
        daysForPointExpiry.sendKeys("0");
        saveDaysBtn.click();
    }
    @Step
    public void checkDaysLimitWithNegative()
    {
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        daysForPointExpiry.sendKeys(selectAll);
        daysForPointExpiry.sendKeys(Keys.DELETE);
        daysForPointExpiry.sendKeys("-10");
        saveDaysBtn.click();
    }
    @Step
    public void checkDaysLimitWithAlphabets()
    {
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        daysForPointExpiry.sendKeys(selectAll);
        daysForPointExpiry.sendKeys(Keys.DELETE);
        daysForPointExpiry.sendKeys("abc");
        saveDaysBtn.click();
    }
    @Step
    public void checkDaysLimitWithSpecialCharacters()
    {
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        daysForPointExpiry.sendKeys(selectAll);
        daysForPointExpiry.sendKeys(Keys.DELETE);
        daysForPointExpiry.sendKeys("@#$");
        saveDaysBtn.click();
    }
    @Step
    public void addDaysForPointExpiry(String days)
    {
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        daysForPointExpiry.sendKeys(selectAll);
        daysForPointExpiry.sendKeys(Keys.DELETE);
        daysForPointExpiry.sendKeys(days);
        saveDaysBtn.click();
    }

}