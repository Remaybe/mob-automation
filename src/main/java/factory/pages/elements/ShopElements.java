package factory.pages.elements;

import factory.pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ShopElements extends BasePage {

    public ShopElements(AppiumDriver driver) {
        super(driver);
    }

    @iOSXCUITFindBy (accessibility = "CATEGORIES")
    @AndroidFindBy (xpath = "//android.widget.LinearLayout[@content-desc='CATEGORIES']")
    protected MobileElement categoriesSection;

}
