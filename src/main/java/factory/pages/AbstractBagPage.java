package factory.pages;

import factory.pages.elements.BagElements;
import factory.utils.WaitUtils;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;
import org.assertj.core.api.SoftAssertions;

public abstract class AbstractBagPage extends BagElements {

    public AbstractBagPage(AppiumDriver driver) {
        super(driver);
    }

    @Step("Gets title of good")
    public String getGoodTitle() {
        return goodName.getText().toLowerCase();
    }

    public AbstractBagPage edit(){
        editButton.click();
        return this;
    }

    public AbstractBagPage addToFav(){
        moveToFavButton.click();
        return this;
    }

    @Step("Clicks remove button")
    public AbstractBagPage clickRemoveButton(){
        WaitUtils.waitForVisibilityElement(removeGoodButton).click();
        return this;
    }

    public abstract AbstractBagPage removeGood();

    @Step("Verifies is good has a valid name")
    public AbstractBagPage verifyGoodsName(String expectedLabel,String actualLabel, SoftAssertions softAssertions){
        softAssertions.assertThat(actualLabel)
                .as("Invalid good in bag")
                .isEqualTo(expectedLabel);
        return this;
    }
}
