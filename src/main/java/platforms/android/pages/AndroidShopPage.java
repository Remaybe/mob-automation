package platforms.android.pages;

import factory.pages.AbstractShopPage;
import io.appium.java_client.AppiumDriver;

public class AndroidShopPage extends AbstractShopPage {

    public AndroidShopPage(AppiumDriver driver) {
        super(driver);
    }

    @Override
    public AbstractShopPage validLogin() {
        validLoginWrapper();
        return this;
    }

    @Override
    public AbstractShopPage selectAllTopsSubcategory() {
        clickTopsSection();
        clickAllTopsButton();
        return this;
    }

    @Override
    public String getGoodsLabel() {
        return goodLabel.getText().toLowerCase();
    }

}
