package factory.utils;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public enum CapabilitiesType {

    IOS {
        public DesiredCapabilities getCapabilities(){
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
            capabilities.setCapability(MobileCapabilityType.UDID, "DDE2693C-2984-41BC-BCFF-907CB2C1DFC9");
            capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
            return capabilities;
        }
    },
    ANDROID {
        public DesiredCapabilities getCapabilities() {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
            capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
            return capabilities;
        }
    };

    public abstract DesiredCapabilities getCapabilities();
}
