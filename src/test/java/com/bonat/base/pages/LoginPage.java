package com.bonat.base.pages;

import com.bonat.base.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    private final String email = "m.hussein@bonat.io";
    private final String password = "d4&$6d457";

    @FindBy(xpath = "//*[@name=\"email\"]")
    private WebElement emailTxtBox;

    @FindBy(xpath = "//*[@name=\"password\"]")
    private WebElement PasswordTxtBox;

    @FindBy(xpath = "//*[@id=\"root\"]/div/section/div[1]/div[2]/form/div[4]/span/button")
    private WebElement loginBtn;

    @FindBy(xpath = "//button[@class='uf-button']")
    public WebElement button;

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    public void enterEmail(String email)
    {
        this.emailTxtBox.sendKeys(email);
    }

    public void enterPassword(String password)
    {

        this.PasswordTxtBox.sendKeys(password);
    }
    @Step
    public void pressLoginButton()
    {
        this.loginBtn.click();
    }
    @Step
    public void fillLoginForm() throws InterruptedException {
        enterEmail(this.email);
        enterPassword(this.password);
        pressLoginButton();

    }
}
