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

    @AndroidFindBy (accessibility = "Show menu")
    @iOSXCUITFindBy (accessibility = "tabBar.button.myAEO")
    protected MobileElement slideMenuButton;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text = 'Create Account / Sign In']")
    @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeButton[`label == 'SIGN IN'`]")
    protected MobileElement signingCategory;

    @AndroidFindBy (xpath = "//android.widget.EditText[@text = 'Email']")
    @iOSXCUITFindBy (accessibility = "emailTextFieldId")
    protected MobileElement emailField;

    @AndroidFindBy (xpath = "//android.widget.EditText[@text = 'Password']")
    @iOSXCUITFindBy (accessibility = "passwordTextFieldId")
    protected MobileElement passField;

    @AndroidFindBy (id = "sign_in_text")
    @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeButton[`label == 'SIGN IN'`]")
    protected MobileElement signInButton;

    @AndroidFindBy (id = "ccpa_accept")
    protected MobileElement acceptSevicesButton;

    @AndroidFindBy (id = "disable")
    protected MobileElement declineNotificationsButton;

    @AndroidFindBy (id = "txt_limited_access")
    @iOSXCUITFindBy (iOSNsPredicate = "label == 'ALLOW LIMITED ACCESS FOR THE FUNCTIONAL EXPERIENCE' AND name == 'ALLOW LIMITED ACCESS FOR THE FUNCTIONAL EXPERIENCE'")
    protected MobileElement limAccessButton;

    @AndroidFindBy (id = "button_shop_aeo")
    @iOSXCUITFindBy (iOSNsPredicate = "label == 'SHOP NOW' AND name == 'onboardingBrandView.button.americanEagle'")
    protected MobileElement shopNowButtonEagle;

    @AndroidFindBy (xpath = "//android.widget.LinearLayout[@content-desc='CATEGORIES']")
    @iOSXCUITFindBy (iOSNsPredicate = "label == 'CATEGORIES' AND name == 'CategoriesId'")
    protected MobileElement categoriesSection;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text = 'Men']")
    @iOSXCUITFindBy (accessibility = "categories.titleLabel.id.Men")
    protected MobileElement menCategoryButton;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text = 'New']")
    @iOSXCUITFindBy (accessibility = "categories.titleLabel.id.New")
    protected MobileElement newCategory;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text = 'Tops']")
    @iOSXCUITFindBy (iOSNsPredicate = "label == 'Tops'")
    protected MobileElement topsSection;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text = 'VIEW ALL TOPS']")
    @iOSXCUITFindBy (iOSNsPredicate = "label == 'View All Tops'")
    protected MobileElement viewAllTops;

    @AndroidFindBy (id = "android:id/text1")
    @iOSXCUITFindBy (accessibility = "T-Shirts")
    protected MobileElement clothesSectionHeader;

    @AndroidFindBy (xpath = "(//android.widget.ImageView[@content-desc='product image'])[1]")
    @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeImage[`label == 'productImageView'`][4]")
    protected MobileElement firstGoodFromList;

    @AndroidFindBy (id = "toolbar_title")
    @iOSXCUITFindBy (accessibility = "ProductTitleLabelId")
    protected MobileElement goodLabel;

    @AndroidFindBy (id = "add_to_bag_textView")
    @iOSXCUITFindBy (accessibility = "AddToBagRegular")
    protected MobileElement addToBagButton;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text = 'M']/preceding-sibling::android.widget.RadioButton")
    @iOSXCUITFindBy (iOSNsPredicate = "label == 'M'")
    protected MobileElement mediumSizeCheckbox;

    @AndroidFindBy (id = "shoppingBagImageView")
    @iOSXCUITFindBy (accessibility = "tabBar.button.bag")
    protected MobileElement bagSectionButton;
}
