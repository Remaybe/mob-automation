package platforms.android.pages;

import factory.pages.AbstractShopPage;
import io.appium.java_client.AppiumDriver;

public class AndroidShopPage extends AbstractShopPage {

    public AndroidShopPage(AppiumDriver driver) {
        super(driver);
    }

    @Override
    public AbstractShopPage viewAllTops() {
        clickMenSection();
        selectTopsSection();
        selectAllTopsCategory();
        return this;
    }
}
