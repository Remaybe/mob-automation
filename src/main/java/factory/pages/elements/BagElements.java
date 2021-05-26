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

    @AndroidFindBy (id = "com.ae.ae.debug:id/row_title")
    @iOSXCUITFindBy (accessibility = "ProductTableViewCellProductNameLabelID")
    protected MobileElement goodName;

    @AndroidFindBy (id = "com.ae.ae.debug:id/edit")
    @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeButton[`label == \"Edit\"`]")
    protected MobileElement editButton;

    @AndroidFindBy (id = "com.ae.ae.debug:id/remove_button")
    @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    protected MobileElement removeGoodButton;

    @AndroidFindBy (id = "com.ae.ae.debug:id/move_to_favorites")
    @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeButton[`label == \"MOVE TO FAVORITES\"`]")
    protected MobileElement moveToFavButton;

    @iOSXCUITFindBy (accessibility = "tabBar.button.favorites")
    protected MobileElement favButton;
}
