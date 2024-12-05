package factory.utils;

import factory.PlatformFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import platforms.android.AndroidFactory;
import platforms.ios.IOSFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class FactoryConfigurator {

    private static AppiumDriver driver;
    public static PlatformFactory factory;

    public static PlatformFactory getFactory(DesiredCapabilities capabilities) throws MalformedURLException {

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        switch (capabilities.getPlatform()){
            case ANDROID:
                driver = new AndroidDriver(url, capabilities);
                factory = new AndroidFactory(driver);
                break;
            case IOS:
                driver = new IOSDriver(url, capabilities);
                factory = new IOSFactory(driver);
                break;
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return factory;
    }

    public static AppiumDriver getCurrentDriver(){
        return driver;
    }

    public static PlatformFactory getCurrentFactory() {
        return factory;
    }
}
