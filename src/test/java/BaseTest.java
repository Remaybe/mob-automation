import factory.PlatformFactory;
import factory.pages.AbstractBagPage;
import factory.pages.AbstractShopPage;
import factory.utils.CapabilitiesType;
import factory.utils.FactoryConfigurator;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;

import static factory.utils.Constants.TEST_PLATFORM;

public class BaseTest {

    protected static AbstractBagPage bagPage;
    protected static AbstractShopPage shopPage;
    protected static PlatformFactory factory;
    protected static SoftAssertions softAssertions = new SoftAssertions();
    protected static CapabilitiesType capabilitiesType;

    @BeforeTest
    public void setUp(){

        switch (TEST_PLATFORM) {
            case "Android":
                capabilitiesType = CapabilitiesType.ANDROID;
                break;
            case "IOS":
                capabilitiesType = CapabilitiesType.IOS;
                break;
        }

        try {
            factory = FactoryConfigurator.getFactory(capabilitiesType.getCapabilities());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        bagPage = factory.getBagPage();
        shopPage = factory.getShopPage();
    }

    @AfterTest
    public void tearDown(){
        FactoryConfigurator.getCurrentDriver().quit();
    }
}
