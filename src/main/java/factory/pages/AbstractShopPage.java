package factory.pages;

import factory.pages.elements.ShopElements;
import factory.utils.FactoryConfigurator;
import factory.utils.SwipeDirection;
import factory.utils.WaitUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public abstract class AbstractShopPage extends ShopElements {

    public AbstractShopPage(AppiumDriver driver) {
        super(driver);
    }

    public AbstractShopPage swipeToMenCategory(SwipeDirection direction) {
        WaitUtils.waitForVisibilityElement(orientedCategory);
        swipePreset(direction, SWIPE_DISTANCE_MEN_CATEGORY);
        return this;
    }

    private void swipePreset(SwipeDirection direction, int swipeDistance) {
        Dimension dimension = driver.manage().window().getSize();
        PointOption pointOptionStart = PointOption.point(dimension.width / 2, dimension.height / 2);
        new TouchAction(driver)
                .press(pointOptionStart)
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(BasePage.PRESS_TIME)))
                .moveTo(direction.getEndPoint(dimension, swipeDistance))
                .release().perform();
    }

    public AbstractShopPage allowLimAccess(){
        try {
            limAccessButton.click();
        } catch (Exception exception){
        }
        return this;
    }

    public AbstractShopPage selectAeoMenu(){
        slideMenuButton.click();
        return this;
    }

    public AbstractShopPage clickSign(){
        signingCategory.click();
        return this;
    }

    public AbstractShopPage typeEmail(){
        emailField.sendKeys(EMAIL);
        return this;
    }

    public AbstractShopPage typePassword(){
        passField.sendKeys(PASSWORD);
        return this;
    }

    public AbstractShopPage clickSignIn(){
        signInButton.click();
        return this;
    }

    public abstract AbstractShopPage validLogin();

    protected AbstractShopPage validLoginWrapper(){
        clickSign();
        typeEmail();
        typePassword();
        clickSignIn();
        return this;
    }

    public AbstractShopPage clickShopNowEagle(){
        try {
            shopNowButtonEagle.click();
        } catch (Exception exception) {
        }
        return this;
    }

    public AbstractShopPage clickOnCategories(){
        WaitUtils.waitForVisibilityElement(categoriesSection);
        categoriesSection.click();
        return this;
    }

    public AbstractShopPage selectMenCategory(){
        WaitUtils.waitForVisibilityElement(menCategoryButton);
        menCategoryButton.click();
        return this;
    }

    public AbstractShopPage acceptServices(){
        try {
            WaitUtils.waitForVisibilityElement(acceptSevicesButton);
            acceptSevicesButton.click();
        } catch (Exception exception) {
            return this;
        }
        return this;
    }

    public AbstractShopPage declineNotifications(){
        try {
            WaitUtils.waitForVisibilityElement(declineNotificationsButton);
            declineNotificationsButton.click();
        } catch (Exception exception) {
            return this;
        }
        return this;
    }

    public AbstractShopPage clickTopsSection(){
        topsSection.click();
        return this;
    }

    public AbstractShopPage clickAllTopsButton(){
        WaitUtils.waitForVisibilityElement(viewAllTops);
        viewAllTops.click();
        return this;
    }

    public abstract AbstractShopPage selectAllTopsSubcategory();

    public AbstractShopPage verifyClothesCategory(String categoryName, SoftAssertions softAssertions){
        softAssertions.assertThat(clothesSectionHeader.getText().toLowerCase())
                .as("Category has been chased in wrong way")
                .isEqualTo(categoryName.toLowerCase());
        return this;
    }

    public AbstractShopPage selectFirstGood(){
        firstGoodFromList.click();
        return this;
    }

    public abstract String getGoodsLabel();

    public AbstractShopPage addGoodToBag(){
        swipePreset(SwipeDirection.UP, SWIPE_DISTANCE_MEN_CATEGORY);
        addToBagButton.click();
        return this;
    }

    public AbstractShopPage selectMediumSize(){
        mediumSizeCheckbox.click();
        return this;
    }

    public AbstractBagPage moveToBagPage(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bagSectionButton.click();
        return FactoryConfigurator.getCurrentFactory().getBagPage();
    }

}
