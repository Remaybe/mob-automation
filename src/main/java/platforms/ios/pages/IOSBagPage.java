package platforms.ios.pages;

import factory.pages.AbstractBagPage;
import io.appium.java_client.AppiumDriver;

public class IOSBagPage extends AbstractBagPage {

    public IOSBagPage(AppiumDriver driver) {
        super(driver);
    }

    @Override
    public String getGoodTitle() {
        return goodName.getAttribute("label").toLowerCase();
    }
}
