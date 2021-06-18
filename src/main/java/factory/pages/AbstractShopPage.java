package factory.pages;

import factory.pages.elements.ShopElements;
import factory.utils.Constants;
import factory.utils.FactoryConfigurator;
import factory.utils.SwipeDirection;
import factory.utils.WaitUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public abstract class AbstractShopPage extends ShopElements {

    public AbstractShopPage(AppiumDriver driver) {
        super(driver);
    }

    protected void swipePreset(SwipeDirection direction, int swipeDistance) {
        Dimension dimension = driver.manage().window().getSize();
        PointOption pointOptionStart = PointOption.point(dimension.width / 2, dimension.height / 2);
        new TouchAction(driver)
                .press(pointOptionStart)
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(Constants.PRESS_TIME)))
                .moveTo(direction.getEndPoint(dimension, swipeDistance))
                .release().perform();
    }

    @Step("Allows limited access if needed")
    public AbstractShopPage allowLimAccess(){
        tapIfDisplayed(limAccessButton);
        return this;
    }

    @Step("Selects AEO menu")
    public AbstractShopPage selectAeoMenu(){
        slideMenuButton.click();
        return this;
    }

    @Step("Clicks sign button")
    public AbstractShopPage clickSign(){
        signingCategory.click();
        return this;
    }

    @Step("Types email in direction field")
    public AbstractShopPage typeEmail(){
        emailField.sendKeys(Constants.EMAIL);
        return this;
    }

    @Step("Types password in direction field")
    public AbstractShopPage typePassword(){
        passField.sendKeys(Constants.PASSWORD);
        return this;
    }

    @Step("Accepts sign from user")
    public AbstractShopPage clickSignIn(){
        signInButton.click();
        return this;
    }

    @Step("Logins due correct email and password")
    public AbstractShopPage validLogin(){
        clickSign();
        typeEmail();
        typePassword();
        clickSignIn();
        return this;
    }

    @Step("Checks is element present on page")
    public abstract boolean presenceOfElement(MobileElement element);

    private void swipeToElementWrapper(MobileElement element) {
        for (int i = 0; i < Constants.SWIPE_LIM; i++) {
            swipePreset(SwipeDirection.UP, Constants.SWIPE_DISTANCE);
            if (presenceOfElement(element)) break;
        }
    }

    @Step("Swipes to chosen element on page")
    public MobileElement swipeToElement(MobileElement element){
        swipeToElementWrapper(element);
        return element;
    }

    @Step("Taps on chosen element if its displayed")
    protected void tapIfDisplayed(MobileElement element){
        if (presenceOfElement(element)) element.click();
    }

    @Step("Clicks 'Shop Now' button on Eagle category")
    public AbstractShopPage clickShopNowEagle(){
        tapIfDisplayed(shopNowButtonEagle);
        return this;
    }

    @Step("Clicks 'categories' section")
    public AbstractShopPage clickOnCategories(){
        WaitUtils.waitForVisibilityElement(categoriesSection).click();
        WaitUtils.waitForVisibilityElement(categoriesSection).click();
        return this;
    }

    @Step("Selects 'men' category")
    public AbstractShopPage selectMenCategory(){
        swipeToElement(menCategoryButton).click();
        return this;
    }

    public AbstractShopPage acceptServices(){
        tapIfDisplayed(acceptSevicesButton);
        return this;
    }

    public AbstractShopPage declineNotifications(){
        tapIfDisplayed(declineNotificationsButton);
        return this;
    }

    @Step("Clicks 'tops' section")
    public AbstractShopPage clickTopsSection(){
        topsSection.click();
        return this;
    }

    @Step("Clicks 'all tops' section")
    public AbstractShopPage clickAllTopsButton(){
        WaitUtils.waitForVisibilityElement(viewAllTops).click();
        return this;
    }

    @Step("Selects subcategory called 'all tops'")
    public abstract AbstractShopPage selectAllTopsSubcategory();

    @Step("Verifies is users selected correct category")
    public AbstractShopPage verifyClothesCategory(String categoryName, SoftAssertions softAssertions){
        softAssertions.assertThat(clothesSectionHeader.getText().toLowerCase())
                .as("Category has been chased in wrong way")
                .isEqualTo(categoryName.toLowerCase());
        return this;
    }

    @Step("Selects first good from shop list")
    public AbstractShopPage selectFirstGood(){
        firstGoodFromList.click();
        return this;
    }

    @Step("Gets label of chosen good")
    public String getGoodsLabel() {
        return WaitUtils.waitForVisibilityElement(goodLabel).getText().toLowerCase();
    }

    @Step("Adds chosen good to bag")
    public AbstractShopPage addGoodToBag(){
        swipeToElement(addToBagButton).click();
        return this;
    }

    @Step("Selects medium size for good")
    public AbstractShopPage selectMediumSize(){
        if (!mediumSizeCheckbox.isSelected()) mediumSizeCheckbox.click();
        return this;
    }

    @Step("Moves to bag page")
    public AbstractBagPage moveToBagPage(){
        bagSectionButton.click();
        return FactoryConfigurator.getCurrentFactory().getBagPage();
    }
}
