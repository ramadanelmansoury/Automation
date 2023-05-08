package pages;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;


public class RewardSystemPage extends BasePage {
    public RewardSystemPage(WebDriver driver) {
        super(driver);
    }

    @FindBy( xpath ="//*[@data-testid='programs']")
    public WebElement loyaltyProgramBtnMenu;

    @FindBy( xpath ="//*[@data-testid='loyaltyProgram']")
    public WebElement RewardsButton;

    public void clickRewardsBtn() throws InterruptedException {
        loyaltyProgramBtnMenu.click();
        Thread.sleep(1000);
        RewardsButton.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//button[@rouneded='0']")
    public WebElement addNewRewardBtn;

    public void clickAddNewRewardBtn() throws InterruptedException {
        addNewRewardBtn.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/div[1]")
    public WebElement fixedAmountDiscountBtn;
    @FindBy(xpath = "//*[@id='pointAmount']")
    public WebElement inputPointAmount;
    @FindBy(xpath = "//*[@id='discountAmount']")
    public WebElement inputDiscountAmount;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/form/div[2]/div[1]/span/span[1]/input")
    public WebElement SpecificDiscountedProductsCheckbox;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/form/div[2]/div[2]/span/span[1]/input")
    public WebElement SpecificCategoriesCheckbox;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/form/div[2]/div[3]/span/span[1]/input")
    public WebElement SpecificProductsCheckbox;
    @FindBy(xpath = "//*[@id='expiryPeriod']")
    public WebElement inputExpiryPeriod;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveRewardBtn;

    @FindBy(css = "div[class*='input-container']")
    public WebElement dropdownSpecificProducts;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/form/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]")
    public WebElement chosenBtn;

    @FindBy(xpath = "//p[contains(@style, '4.1px;')]")
    public WebElement backToRewardsBtn;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/div[2]")
    public WebElement discountPercentageBtn;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveDiscountPercentageBtn;
    @FindBy(xpath = "//*[@id='pointAmount']")
    public WebElement pointsDiscountPercentage;
    @FindBy(xpath = "//*[@id='discountAmount']")
    public WebElement discoutAmountDiscountPercentage;
    @FindBy(xpath = "//*[@id='expiryPeriod']")
    public WebElement discountExpiryPeriod;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/form/div[2]/div/span/span[1]/span/input")
    public WebElement maxDiscountAmountCheckbox;
    @FindBy(xpath = "//*[@id='maxCouponDiscount']")
    public WebElement inputMaxCouponDiscount;

    @FindBy(css = "button[class='MuiButtonBase-root MuiButton-root MuiButton-contained css-dilg49 MuiButton-containedPrimary']")
    public WebElement freeShippingSaveBtn;

    @FindBy(xpath = "//*[@id='pointAmount']")
    public WebElement pointForFreeShipping;

    @FindBy(xpath = "//*[@id='expiryPeriod']")
    public WebElement freeShippingExpiryPeriod;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/div[3]")
    public WebElement freeShippingMenuBtn;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/div[4]")
    public WebElement freeProductMenuBtn;

    @FindBy(css = "button[class='MuiButtonBase-root MuiButton-root MuiButton-contained css-dilg49 MuiButton-containedPrimary']")
    public WebElement saveFreeProductBtn;

    @FindBy(css = "input[id='pointAmount']")
    public WebElement pointsFreeProduct;
    @FindBy(css = "input[id='expiryPeriod']")
    public WebElement daysFreeProduct;
    @FindBy(css = "div[class*='input-container']")
    public WebElement freeProudct;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveBtnFreeProduct;
    @FindBy(xpath = "//p[contains(@style, '32px;')]")
    public WebElement spaceFreeProduct;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/form/div[2]/div[2]/span/span[1]/input")
    public WebElement specificCategories;
    @FindBy(xpath = "//div[contains(@class, 'css-ackcql')]")
    public WebElement categoreisDropdown;
    @FindBy(xpath = "//p[contains(@style, '32px;')]")
    public WebElement spaceBtn;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div[2]/form/div[2]/div[3]/span/span[1]/input")
    public WebElement proudctSpecific;
    @FindBy(xpath = "//div[contains(@class, 'css-ackcql')]")
    public WebElement proudctNameDropdown;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[3]/div/p[2]")
    public WebElement fixedAmountTab;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[3]/div/p[3]")
    public WebElement percentageDiscountTab;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[3]/div/p[4]")
    public WebElement freeShippingTab;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[3]/div/p[5]")
    public WebElement freeProudctTab;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div[1]/div[1]/span/span[1]/span/input")
    public WebElement inputCheckedDiscountFixedAmount;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div[1]/div[1]/span/span[1]/span/input")
    public WebElement inputCheckedPercntageDiscount;
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div[1]/div[1]/span/span[1]/span/input")
    public WebElement inputCheckedFreeShipping;
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div[1]/div[1]/span/span[1]/span/input")
    public WebElement inputCheckedFreeProduct;


    public void fillInRewardFormWithoutInputs() throws InterruptedException {
        fixedAmountDiscountBtn.click();
        saveRewardBtn.click();
        Thread.sleep(5000);
    }

    public void addPointAmountOnly(String pointAmount) throws InterruptedException {
        inputPointAmount.sendKeys(pointAmount);
        Thread.sleep(5000);
    }

    public void addDiscountAmountOnly(String discountAmount) throws InterruptedException {
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        inputPointAmount.sendKeys(selectAll);
        inputPointAmount.sendKeys(Keys.DELETE);
        inputDiscountAmount.sendKeys(discountAmount);
        Thread.sleep(5000);
    }

    public void addExpiryPeriod(String expiryPeriod) throws InterruptedException {
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        inputDiscountAmount.sendKeys(selectAll);
        inputDiscountAmount.sendKeys(Keys.DELETE);
        inputExpiryPeriod.sendKeys(expiryPeriod);
        Thread.sleep(5000);
    }

    public void addSpecificDiscountedProducts() throws InterruptedException {

        inputPointAmount.sendKeys("100");
        inputDiscountAmount.sendKeys("100");
        SpecificDiscountedProductsCheckbox.click();
        specificCategories.click();
        categoreisDropdown.click();
        Thread.sleep(5000);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Thread.sleep(5000);
        spaceBtn.click();
        Thread.sleep(5000);
        proudctSpecific.click();
        Thread.sleep(5000);
        proudctNameDropdown.click();
        Thread.sleep(5000);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Thread.sleep(5000);
        spaceBtn.click();
        saveRewardBtn.click();
        Thread.sleep(5000);
    }

    public void addSpecificCategories() throws InterruptedException {
        addNewRewardBtn.click();
        fixedAmountDiscountBtn.click();
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        inputDiscountAmount.sendKeys(selectAll);
        inputDiscountAmount.sendKeys(Keys.DELETE);
        inputPointAmount.sendKeys(selectAll);
        inputPointAmount.sendKeys(Keys.DELETE);
        inputPointAmount.sendKeys("100");
        inputDiscountAmount.sendKeys("100");
        SpecificCategoriesCheckbox.click();

    }

    public void setBackToRewardsBtn() throws InterruptedException {
        backToRewardsBtn.click();
        Thread.sleep(5000);
        discountPercentageBtn.click();
    }

    public void clickSaveDiscountPercentageBtn() throws InterruptedException {
        saveDiscountPercentageBtn.click();
        Thread.sleep(5000);
        pointsDiscountPercentage.sendKeys("100");
        saveDiscountPercentageBtn.click();
        Thread.sleep(5000);
        discoutAmountDiscountPercentage.sendKeys("35");
        saveDiscountPercentageBtn.click();
        Thread.sleep(5000);
        discountExpiryPeriod.sendKeys("78");
        saveDiscountPercentageBtn.click();
        Thread.sleep(5000);
    }

    public void AddPercentageDiscountWithMaxValues() throws InterruptedException {
        addNewRewardBtn.click();
        discountPercentageBtn.click();
        pointsDiscountPercentage.sendKeys("100");
        discoutAmountDiscountPercentage.sendKeys("35");
        discountExpiryPeriod.sendKeys("78");
        Thread.sleep(5000);
        maxDiscountAmountCheckbox.click();
        inputMaxCouponDiscount.sendKeys("100");
        Thread.sleep(5000);
        saveDiscountPercentageBtn.click();
        Thread.sleep(5000);
    }

    public void AddFreeShipping() throws InterruptedException {
        addNewRewardBtn.click();
        freeShippingMenuBtn.click();
        freeShippingSaveBtn.click();
        pointForFreeShipping.sendKeys("36");
        freeShippingSaveBtn.click();
        Thread.sleep(5000);
        freeShippingExpiryPeriod.sendKeys("12");
        freeShippingSaveBtn.click();
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        freeShippingExpiryPeriod.sendKeys(selectAll);
        freeShippingExpiryPeriod.sendKeys(Keys.DELETE);
        freeShippingExpiryPeriod.sendKeys("35");
        Thread.sleep(5000);
        freeShippingSaveBtn.click();
        Thread.sleep(5000);
    }

    public void FreeProduct() throws InterruptedException {
        addNewRewardBtn.click();
        Thread.sleep(5000);
        freeProductMenuBtn.click();
        Thread.sleep(5000);
        saveFreeProductBtn.click();
        pointsFreeProduct.sendKeys("100");
        saveFreeProductBtn.click();
        Thread.sleep(5000);
        daysFreeProduct.sendKeys("64");
        freeProudct.click();
        Thread.sleep(5000);

        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        Thread.sleep(5000);
        spaceFreeProduct.click();
        saveBtnFreeProduct.click();
        Thread.sleep(5000);
    }

    public void checkTheTabs() throws InterruptedException {
        fixedAmountTab.click();
        Thread.sleep(5000);
        inputCheckedDiscountFixedAmount.click();
        Thread.sleep(5000);
        percentageDiscountTab.click();
        Thread.sleep(5000);
        inputCheckedPercntageDiscount.click();
        Thread.sleep(5000);
        freeShippingTab.click();
        Thread.sleep(5000);
        inputCheckedFreeShipping.click();
        Thread.sleep(5000);
        freeProudctTab.click();
        Thread.sleep(5000);
        inputCheckedFreeProduct.click();



    }
}
