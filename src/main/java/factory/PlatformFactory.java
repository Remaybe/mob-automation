package factory;

import factory.pages.AbstractBagPage;
import factory.pages.AbstractShopPage;

public interface PlatformFactory {
    AbstractShopPage getShopPage();
    AbstractBagPage getBagPage();
}
