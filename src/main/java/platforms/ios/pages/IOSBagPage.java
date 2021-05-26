package platforms.ios.pages;

import factory.pages.AbstractBagPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class IOSBagPage extends AbstractBagPage {

    public IOSBagPage(AppiumDriver driver) {
        super(driver);
    }

    @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeButton[`label == \"REMOVE\"`][1]")
    protected MobileElement deleteGoodButton;

    @Override
    public String getGoodTitle() {
        return goodName.getAttribute("label").toLowerCase();
    }

    @Override
    public AbstractBagPage removeGood() {
        clickRemoveButton();
        deleteGood();
        return null;
    }

    private void deleteGood(){
        deleteGoodButton.click();
    }
}
