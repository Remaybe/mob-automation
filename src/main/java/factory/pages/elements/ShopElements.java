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

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.TextView")
    @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeButton[`label == \"SIGN IN\"`]")
    protected MobileElement signingCategory;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
    @iOSXCUITFindBy (accessibility = "emailTextFieldId")
    protected MobileElement emailField;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
    @iOSXCUITFindBy (accessibility = "passwordTextFieldId")
    protected MobileElement passField;

    @AndroidFindBy (id = "com.ae.ae.debug:id/sign_in_text")
    @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeButton[`label == \"SIGN IN\"`]")
    protected MobileElement signInButton;

    @AndroidFindBy (id = "com.ae.ae.debug:id/ccpa_accept")
    protected MobileElement acceptSevicesButton;

    @AndroidFindBy (id = "com.ae.ae.debug:id/disable")
    protected MobileElement declineNotificationsButton;

    @AndroidFindBy (id = "com.ae.ae.debug:id/txt_limited_access")
    @iOSXCUITFindBy (iOSNsPredicate = "label == \"ALLOW LIMITED ACCESS FOR THE FUNCTIONAL EXPERIENCE\" AND name == \"ALLOW LIMITED ACCESS FOR THE FUNCTIONAL EXPERIENCE\"")
    protected MobileElement limAccessButton;

    @AndroidFindBy (id = "com.ae.ae.debug:id/button_shop_aeo")
    @iOSXCUITFindBy (iOSNsPredicate = "label == \"SHOP NOW\" AND name == \"onboardingBrandView.button.americanEagle\"")
    protected MobileElement shopNowButtonEagle;

    @AndroidFindBy (xpath = "//android.widget.LinearLayout[@content-desc=\"CATEGORIES\"]")
    @iOSXCUITFindBy (iOSNsPredicate = "label == \"CATEGORIES\" AND name == \"CategoriesId\"")
    protected MobileElement categoriesSection;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]")
    @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]")
    protected MobileElement menCategoryButton;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]")
    protected MobileElement orientedCategory;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")
    @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeTable/XCUIElementTypeCell[1]")
    protected MobileElement topsSection;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]")
    @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeTable/XCUIElementTypeCell[2]")
    protected MobileElement viewAllTops;

    @AndroidFindBy (id = "android:id/text1")
    @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
    protected MobileElement clothesSectionHeader;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
    @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeStaticText")
    protected MobileElement pageHeader;

    @AndroidFindBy (xpath = "(//android.widget.ImageView[@content-desc=\"product image\"])[1]")
    @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeImage[`label == \"productImageView\"`][4]")
    protected MobileElement firstGoodFromList;

    @AndroidFindBy (id = "com.ae.ae.debug:id/toolbar_title")
    @iOSXCUITFindBy (accessibility = "ProductTitleLabelId")
    protected MobileElement goodLabel;

    @AndroidFindBy (id = "com.ae.ae.debug:id/add_to_bag_textView")
    @iOSXCUITFindBy (accessibility = "AddToBagRegular")
    protected MobileElement addToBagButton;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[3]/android.widget.RadioButton")
    @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeCell[`name == \"PickSizeNewSizeCellId\"`][3]/XCUIElementTypeOther[1]")
    protected MobileElement mediumSizeCheckbox;

    @AndroidFindBy (id = "com.ae.ae.debug:id/shoppingBagImageView")
    @iOSXCUITFindBy (accessibility = "tabBar.button.bag")
    protected MobileElement bagSectionButton;
}
