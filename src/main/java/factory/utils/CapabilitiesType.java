package factory.utils;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public enum CapabilitiesType {

    IOS {
        public DesiredCapabilities getCapabilities(){
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
            capabilities.setCapability(MobileCapabilityType.UDID, "DDE2693C-2984-41BC-BCFF-907CB2C1DFC9");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.5");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12 Pro Max");
            capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.ae.uat");
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 2000);
            capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
            return capabilities;
        }
    },
    ANDROID {
        public DesiredCapabilities getCapabilities() {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
            capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android SDK built for x86");
            capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.ae.ae.debug");
            capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.aeo.mvvm.splash.SplashActivity");
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 2000);
            return capabilities;
        }
    };

    public abstract DesiredCapabilities getCapabilities();
}
