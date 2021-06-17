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

    @AndroidFindBy(id = "com.ae.ae.debug:id/empty_bag_shop_button")
    @iOSXCUITFindBy(accessibility = "SHOP NOW")
    protected MobileElement shopNowButton;

    @AndroidFindBy (id = "com.ae.ae.debug:id/row_title")
    @iOSXCUITFindBy (accessibility = "ProductTableViewCellProductNameLabelID")
    protected MobileElement goodName;

    @AndroidFindBy (id = "com.ae.ae.debug:id/edit")
    @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeButton[`label == 'Edit'`]")
    protected MobileElement editButton;

    @AndroidFindBy (id = "com.ae.ae.debug:id/remove_button")
    @iOSXCUITFindBy (accessibility = "Delete")
    protected MobileElement removeGoodButton;

    @AndroidFindBy (id = "com.ae.ae.debug:id/move_to_favorites")
    @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeButton[`label == 'MOVE TO FAVORITES'`]")
    protected MobileElement moveToFavButton;
}
