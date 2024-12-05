package com.ae.inter;

import org.testng.annotations.Test;

public class ShopTest extends BaseTest {

    @Test(description = "Checks user case due adding good into the bag and validates it")
    public void addingGoodToBag(){
        String expectedGoodName =
                shopPage.allowLimAccess()
                        .clickShopNowEagle()
                        .selectAeoMenu()
                        .validLogin()
                        .clickOnCategories()
                        .selectMenCategory()
                        .selectAllTopsSubcategory()
                        .verifyClothesCategory("T-SHIRTS", softAssertions)
                        .selectFirstGood()
                        .getGoodsLabel();

        String actualGoodName =
                shopPage.addGoodToBag()
                        .selectMediumSize()
                        .moveToBagPage()
                        .getGoodTitle();

        bagPage.verifyGoodsName(expectedGoodName, actualGoodName, softAssertions)
                .verifyAll(softAssertions);
    }
}
