package factory.pages;

import factory.utils.WaitUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

@Slf4j
public class BasePage {

    protected static AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
        this.driver = driver;
    }

    public void verifyAll(SoftAssertions softAssertions){
        softAssertions.assertAll();
    }
}
