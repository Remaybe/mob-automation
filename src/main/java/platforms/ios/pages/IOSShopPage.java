package platforms.ios.pages;

import factory.pages.AbstractBagPage;
import factory.pages.AbstractShopPage;
import factory.utils.Constants;
import factory.utils.SwipeDirection;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.NoSuchElementException;

@Slf4j
public class IOSShopPage extends AbstractShopPage {

    public IOSShopPage(AppiumDriver driver) {
        super(driver);
    }

    @iOSXCUITFindBy (accessibility = "categories.titleLabel.id.American Eagle")
    private MobileElement eagleSubcategory;

    @iOSXCUITFindBy (accessibility = "tabBar.button.shop")
    private MobileElement shopSectButton;

    private void shopSectButtonClick(){
        shopSectButton.click();
    }

    @Override
    public AbstractShopPage validLogin() {
        try {
            super.validLogin();
        } catch (Exception exception) {
            log.info("User already logged");
        }
        shopSectButtonClick();
        return this;
    }

    @Override
    public boolean presenceOfElement(MobileElement element) {
        try {
            return element.isEnabled();
        } catch (NoSuchElementException exception){
            return false;
        }
    }

    @Override
    public AbstractBagPage moveToBagPage() {
        swipePreset(SwipeDirection.DOWN, Constants.SWIPE_DISTANCE);
        return super.moveToBagPage();
    }

    @Override
    public AbstractShopPage selectAllTopsSubcategory() {
        selectEagleSubcategory();
        clickTopsSection();
        clickAllTopsButton();
        return this;
    }

    @Step("Selects 'Eagle' subcategory")
    private void selectEagleSubcategory(){
        swipeToElement(eagleSubcategory).click();
    }
}
