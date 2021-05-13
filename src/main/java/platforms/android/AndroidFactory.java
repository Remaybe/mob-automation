package platforms.android;

import io.appium.java_client.AppiumDriver;
import factory.PlatformFactory;
import platforms.android.pages.AndroidBagPage;
import platforms.android.pages.AndroidShopPage;
import factory.pages.BagPage;
import factory.pages.ShopPage;

public class AndroidFactory implements PlatformFactory {

    AppiumDriver driver;

    public AndroidFactory(AppiumDriver driver) {
        this.driver = driver;
    }

    @Override
    public ShopPage getShopPage() {
        return new AndroidShopPage();
    }

    @Override
    public BagPage getBagPage() {
        return new AndroidBagPage();
    }
}
