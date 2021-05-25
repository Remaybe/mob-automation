package factory.pages;

import factory.pages.elements.BagElements;
import io.appium.java_client.AppiumDriver;
import org.assertj.core.api.SoftAssertions;

public abstract class AbstractBagPage extends BagElements {

    public AbstractBagPage(AppiumDriver driver) {
        super(driver);
    }

    public abstract String getGoodTitle();

    public AbstractBagPage verifyGoodsName(String expectedLabel,String actualLabel, SoftAssertions softAssertions){
        softAssertions.assertThat(actualLabel)
                .as("Invalid good in bag")
                .isEqualTo(expectedLabel);
        return this;
    }
}
