package factory.pages;

import factory.pages.elements.BagElements;
import factory.utils.WaitUtils;
import io.appium.java_client.AppiumDriver;
import org.assertj.core.api.SoftAssertions;

public abstract class AbstractBagPage extends BagElements {

    public AbstractBagPage(AppiumDriver driver) {
        super(driver);
    }

    public abstract String getGoodTitle();

    public AbstractBagPage edit(){
        editButton.click();
        return this;
    }

    public AbstractBagPage addToFav(){
        moveToFavButton.click();
        return this;
    }

    public AbstractBagPage clickRemoveButton(){
        WaitUtils.waitForVisibilityElement(removeGoodButton);
        removeGoodButton.click();
        return this;
    }

    public abstract AbstractBagPage removeGood();

    public AbstractBagPage verifyGoodsName(String expectedLabel,String actualLabel, SoftAssertions softAssertions){
        softAssertions.assertThat(actualLabel)
                .as("Invalid good in bag")
                .isEqualTo(expectedLabel);
        return this;
    }

    public AbstractBagPage selectFavCategory(){
        favButton.click();
        return this;
    }
}
