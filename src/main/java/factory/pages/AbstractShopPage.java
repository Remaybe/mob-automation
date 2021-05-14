package factory.pages;

import factory.pages.elements.ShopElements;
import io.appium.java_client.AppiumDriver;

public abstract class AbstractShopPage extends ShopElements {

    public AbstractShopPage(AppiumDriver driver) {
        super(driver);
    }

    public AbstractShopPage clickCategoriesSection(){
        categoriesSection.click();
        return this;
    }

    public AbstractShopPage clickMenSection(){
        menSection.click();
        return this;
    }

    public AbstractShopPage selectTopsSection(){
        clothesTops.click();
        return this;
    }

    public AbstractShopPage selectAllTopsCategory(){
        clothesAllTops.click();
        return this;
    }

    public abstract AbstractShopPage viewAllTops();
}
