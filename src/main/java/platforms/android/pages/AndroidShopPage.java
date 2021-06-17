package platforms.android.pages;

import factory.pages.AbstractShopPage;
import factory.utils.Constants;
import factory.utils.SwipeDirection;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.NoSuchElementException;

public class AndroidShopPage extends AbstractShopPage {

    public AndroidShopPage(AppiumDriver driver) {
        super(driver);
    }

    @Override
    public boolean presenceOfElement(MobileElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException exception){
            return false;
        }
    }

    @Override
    public AbstractShopPage selectAllTopsSubcategory() {
        swipePreset(SwipeDirection.UP, Constants.SWIPE_DISTANCE);
        clickTopsSection();
        clickAllTopsButton();
        return this;
    }
}
