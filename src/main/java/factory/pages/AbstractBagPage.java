package factory.pages;

import factory.pages.elements.BagElements;
import io.appium.java_client.AppiumDriver;

public abstract class AbstractBagPage extends BagElements {

    public AbstractBagPage(AppiumDriver driver) {
        super(driver);
    }

    public AbstractBagPage clickShopNowButton(){
        shopNowButton.click();
        return this;
    }
}
