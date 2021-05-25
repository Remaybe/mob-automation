package factory.pages.elements;

import factory.pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class BagElements extends BasePage {

    public BagElements(AppiumDriver driver) {
        super(driver);
    }

    @iOSXCUITFindBy(accessibility = "SHOP NOW")
    @AndroidFindBy(id = "com.ae.ae.debug:id/empty_bag_shop_button")
    protected MobileElement shopNowButton;

    @AndroidFindBy (id = "com.ae.ae.debug:id/row_title") // text
    @iOSXCUITFindBy (accessibility = "ProductTableViewCellProductNameLabelID") // label
    protected MobileElement goodName;

    @AndroidFindBy (id = "com.ae.ae.debug:id/edit")
    @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeButton[`label == \"Edit\"`]")
    protected MobileElement editButton;

    @AndroidFindBy (id = "com.ae.ae.debug:id/remove_button")
    @iOSXCUITFindBy (accessibility = "Delete")
    protected MobileElement removeGoodButton;
}
