import org.testng.annotations.Test;

public class ShopTest extends BaseTest {

    @Test(description = "summary of test")
    public void sampleTest(){
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
