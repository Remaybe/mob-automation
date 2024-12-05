package platforms.android;

import factory.pages.AbstractBagPage;
import factory.pages.AbstractShopPage;
import io.appium.java_client.AppiumDriver;
import factory.PlatformFactory;
import platforms.android.pages.AndroidBagPage;
import platforms.android.pages.AndroidShopPage;

public class AndroidFactory implements PlatformFactory {

    AppiumDriver driver;

    public AndroidFactory(AppiumDriver driver) {
        this.driver = driver;
    }

    @Override
    public AbstractShopPage getShopPage() {
        return new AndroidShopPage(driver);
    }

    @Override
    public AbstractBagPage getBagPage() {
        return new AndroidBagPage(driver);
    }
}
