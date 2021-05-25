package factory.utils;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class WaitUtils {

    private static FluentWait getWait() {
        return new FluentWait<>(FactoryConfigurator.getCurrentDriver())
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
    }

    public static void waitForVisibilityElement(MobileElement element) {
        getWait().until(ExpectedConditions.visibilityOf(element));
    }
}