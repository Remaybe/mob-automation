package factory.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.http.HttpClient;
import factory.PlatformFactory;
import platforms.android.AndroidFactory;
import platforms.ios.IOSFactory;

import java.net.MalformedURLException;
import java.net.URL;

public class FactoryConfigurator {

    public static PlatformFactory getFactory(DesiredCapabilities capabilities) {

        PlatformFactory factory = null;
        URL property = null;

        try {
            property = new URL("http://0.0.0.0:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        switch (capabilities.getPlatformName()) {
            case ANDROID:
                factory = new AndroidFactory(new AndroidDriver(property, capabilities));
            case IOS:
                factory = new IOSFactory(new IOSDriver(property, capabilities));
        }

        return factory;
    }
}
