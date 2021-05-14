import factory.pages.AbstractBagPage;
import factory.pages.AbstractShopPage;
import factory.utils.CapabilitiesType;
import factory.utils.FactoryConfigurator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected AbstractBagPage bagPage;
    protected AbstractShopPage shopPage;

    @BeforeTest
    public void setUp(){
        DesiredCapabilities capabilities = CapabilitiesType.ANDROID.getCapabilities();

        bagPage = FactoryConfigurator.getFactory(capabilities).getBagPage();
        shopPage = FactoryConfigurator.getFactory(capabilities).getShopPage();
    }
}
