package TestSuite;
import org.testng.annotations.Test;
import pages.RewardSystemPage;

public class RewardSystem extends LoginTest {
    RewardSystemPage loyaltyProgramWays = new RewardSystemPage(driver);
    public RewardSystem()
    {
        super();
    }
    @Test (priority = 1)
    public void clickRewardsButton() throws InterruptedException {
        loyaltyProgramWays.clickRewardsBtn();
    }
    @Test (priority = 2)
    public void clickAddNewRewardButton() throws InterruptedException {
        loyaltyProgramWays.clickAddNewRewardBtn();
    }
    @Test (priority = 3)
    public void fillInRewardFormWithoutInputs() throws InterruptedException {
        loyaltyProgramWays.fillInRewardFormWithoutInputs();
    }
    @Test (priority = 4)
    public void addPointAmountOnly() throws InterruptedException {
        loyaltyProgramWays.addPointAmountOnly("100");
    }
    @Test (priority = 5)
    public void addDiscountAmountOnly() throws InterruptedException {
        loyaltyProgramWays.addDiscountAmountOnly("100");
    }
    @Test (priority = 6)
    public void addExpiryPeriodOnly() throws InterruptedException {
        loyaltyProgramWays.addExpiryPeriod("100");
    }
    @Test (priority = 7)
    public void addPointAmountAndDiscountAmountThenSave() throws InterruptedException {
        loyaltyProgramWays.addSpecificDiscountedProducts();
    }
    @Test (priority = 8)
    public void addSpecificCategories() throws InterruptedException {
        loyaltyProgramWays.addSpecificCategories();
    }
    @Test (priority = 9)
    public void clickBackToRewardsButton() throws InterruptedException {
        loyaltyProgramWays.setBackToRewardsBtn();
    }
    @Test (priority = 10)
    public void checkValidationMessage() throws InterruptedException {
        loyaltyProgramWays.clickSaveDiscountPercentageBtn();
    }
    @Test (priority = 11)
    public void addPointAmountAndDiscountPercentageWithMaxLimit() throws InterruptedException {
        loyaltyProgramWays.AddPercentageDiscountWithMaxValues();
    }
    @Test (priority = 12)
    public void addFreeShipping() throws InterruptedException {
        loyaltyProgramWays.AddFreeShipping();
    }
    @Test (priority = 13)
    public void addFreeProduct() throws InterruptedException {
        loyaltyProgramWays.FreeProduct();
    }

    @Test (priority = 14)
    public void checkTabsClickAbility() throws InterruptedException {
        loyaltyProgramWays.checkTheTabs();
    }
}