package factory.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
