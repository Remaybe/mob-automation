package platforms.ios.pages;

import factory.pages.AbstractShopPage;
import factory.utils.WaitUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class IOSShopPage extends AbstractShopPage {

    public IOSShopPage(AppiumDriver driver) {
        super(driver);
    }

    @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]")
    private MobileElement eagleSubcategory;

    @iOSXCUITFindBy (accessibility = "tabBar.button.shop")
    private MobileElement shopSectButton;

    private void shopSectButtonClick(){
        shopSectButton.click();
    }

    @Override
    public AbstractShopPage validLogin() {
        try {
            validLoginWrapper();
        } catch (Exception exception) {}
        shopSectButtonClick();
        return this;
    }

    @Override
    public AbstractShopPage selectAllTopsSubcategory() {
        selectEagleSubcategory();
        clickTopsSection();
        clickAllTopsButton();
        return this;
    }

    @Override
    public String getGoodsLabel() {
        WaitUtils.waitForVisibilityElement(goodLabel);
        return goodLabel.getAttribute("label").toLowerCase();
    }

    private void selectEagleSubcategory(){
        try {
            eagleSubcategory.click();
        } catch (Exception exception) {}
    }
}
