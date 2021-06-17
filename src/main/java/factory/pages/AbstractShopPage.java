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

    @Step("name of step")
    public AbstractShopPage allowLimAccess(){
        tapIfDisplayed(limAccessButton);
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
        emailField.sendKeys(Constants.EMAIL);
        return this;
    }

    public AbstractShopPage typePassword(){
        passField.sendKeys(Constants.PASSWORD);
        return this;
    }

    public AbstractShopPage clickSignIn(){
        signInButton.click();
        return this;
    }

    public AbstractShopPage validLogin(){
        clickSign();
        typeEmail();
        typePassword();
        clickSignIn();
        return this;
    }

    public abstract boolean presenceOfElement(MobileElement element);

    private void swipeToElementWrapper(MobileElement element) {
        for (int i = 0; i < Constants.SWIPE_LIM; i++) {
            swipePreset(SwipeDirection.UP, Constants.SWIPE_DISTANCE);
            if (presenceOfElement(element)) break;
        }
    }

    public MobileElement swipeToElement(MobileElement element){
        swipeToElementWrapper(element);
        return element;
    }

    protected void tapIfDisplayed(MobileElement element){
        if (presenceOfElement(element)) element.click();
    }

    public AbstractShopPage clickShopNowEagle(){
        tapIfDisplayed(shopNowButtonEagle);
        return this;
    }

    public AbstractShopPage clickOnCategories(){
        WaitUtils.waitForVisibilityElement(categoriesSection).click();
        WaitUtils.waitForVisibilityElement(categoriesSection).click();
        return this;
    }

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

    public AbstractShopPage clickTopsSection(){
        topsSection.click();
        return this;
    }

    public AbstractShopPage clickAllTopsButton(){
        WaitUtils.waitForVisibilityElement(viewAllTops).click();
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

    public String getGoodsLabel() {
        return WaitUtils.waitForVisibilityElement(goodLabel).getText().toLowerCase();
    }

    public AbstractShopPage addGoodToBag(){
        swipeToElement(addToBagButton).click();
        return this;
    }

    public AbstractShopPage selectMediumSize(){
        if (!mediumSizeCheckbox.isSelected()) mediumSizeCheckbox.click();
        return this;
    }

    public AbstractBagPage moveToBagPage(){
        bagSectionButton.click();
        return FactoryConfigurator.getCurrentFactory().getBagPage();
    }
}
