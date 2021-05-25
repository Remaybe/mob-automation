package factory.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BasePage {

    protected static final String EMAIL = "remaybe23@gmail.com";
    protected static final String PASSWORD = "371234eGor";
    protected static AppiumDriver driver;
    public static final int PRESS_TIME = 1000;
    public static final int SWIPE_DISTANCE_MEN_CATEGORY = 10;

    public BasePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
        this.driver = driver;
    }

    public void verifyAll(SoftAssertions softAssertions){
        softAssertions.assertAll();
    }
}
