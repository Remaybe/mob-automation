package factory;

import factory.pages.BagPage;
import factory.pages.ShopPage;

public interface PlatformFactory {
    ShopPage getShopPage();
    BagPage getBagPage();
}
