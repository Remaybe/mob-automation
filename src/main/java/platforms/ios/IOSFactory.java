package platforms.ios;

import io.appium.java_client.AppiumDriver;
import factory.PlatformFactory;
import platforms.ios.pages.IOSBagPage;
import platforms.ios.pages.IOSShopPage;
import factory.pages.BagPage;
import factory.pages.ShopPage;

public class IOSFactory implements PlatformFactory {

    AppiumDriver driver;

    public IOSFactory(AppiumDriver driver) {
        this.driver = driver;
    }

    @Override
    public ShopPage getShopPage() {
        return new IOSShopPage();
    }

    @Override
    public BagPage getBagPage() {
        return new IOSBagPage();
    }
}
