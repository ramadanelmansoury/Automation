package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BasePage {
        protected WebDriver driver;
        public BasePage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(this.driver, this);
            this.driver.manage().timeouts().implicitlyWait(Duration.ZERO.withSeconds(20));
        }
        
        
        
        
    }

















