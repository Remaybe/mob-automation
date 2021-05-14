package factory.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.http.HttpClient;
import factory.PlatformFactory;
import platforms.android.AndroidFactory;
import platforms.ios.IOSFactory;

public class FactoryConfigurator {

    public static PlatformFactory getFactory(DesiredCapabilities capabilities) throws Exception {

        PlatformFactory factory = null;

        switch (capabilities.getPlatformName()) {
            case ANDROID:
                factory = new AndroidFactory(new AndroidDriver(HttpClient.Factory.create("uri"), capabilities));
            case IOS:
                factory = new IOSFactory(new IOSDriver(HttpClient.Factory.create("uri"), capabilities));
        }

        return factory;
    }
}
