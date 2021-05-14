package platforms.ios.pages;

import factory.pages.AbstractShopPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class IOSShopPage extends AbstractShopPage {

    public IOSShopPage(AppiumDriver driver) {
        super(driver);
    }

    @iOSXCUITFindBy(accessibility = "categories.titleLabel.id.American Eagle")
    private MobileElement clothesAESection;

    @Override
    public AbstractShopPage viewAllTops() {
        clickMenSection();
        selectAESection();
        selectTopsSection();
        selectAllTopsCategory();
        return this;
    }

    public AbstractShopPage selectAESection(){
        clothesAESection.click();
        return this;
    }
}
