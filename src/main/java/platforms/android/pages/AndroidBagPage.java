package platforms.android.pages;

import factory.pages.AbstractBagPage;
import io.appium.java_client.AppiumDriver;

public class AndroidBagPage extends AbstractBagPage {

    public AndroidBagPage(AppiumDriver driver) {
        super(driver);
    }

    @Override
    public AbstractBagPage removeGood() {
        clickRemoveButton();
        return this;
    }
}
