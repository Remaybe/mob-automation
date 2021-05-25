import factory.PlatformFactory;
import factory.pages.AbstractBagPage;
import factory.pages.AbstractShopPage;
import factory.utils.CapabilitiesType;
import factory.utils.FactoryConfigurator;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;

public class BaseTest {

    protected AbstractBagPage bagPage;
    protected AbstractShopPage shopPage;
    protected static PlatformFactory factory;
    protected SoftAssertions softAssertions = new SoftAssertions();

    @BeforeTest
    public void setUp(){
        try {
            factory = FactoryConfigurator.getFactory(CapabilitiesType.ANDROID.getCapabilities());
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
