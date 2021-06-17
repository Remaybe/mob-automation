package platforms.ios;

import factory.pages.AbstractBagPage;
import factory.pages.AbstractShopPage;
import io.appium.java_client.AppiumDriver;
import factory.PlatformFactory;
import platforms.ios.pages.IOSBagPage;
import platforms.ios.pages.IOSShopPage;

public class IOSFactory implements PlatformFactory {

    AppiumDriver driver;

    public IOSFactory(AppiumDriver driver) {
        this.driver = driver;
    }

    @Override
    public AbstractShopPage getShopPage() {
        return new IOSShopPage(driver);
    }

    @Override
    public AbstractBagPage getBagPage() {
        return new IOSBagPage(driver);
    }
}
