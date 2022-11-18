package dns.tests.UITests;

import dns.Pages.DNSPage;
import dns.base.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class DNSTests extends TestBase {

    DNSPage page = new DNSPage();

    @Tag("UITest")
    @DisplayName("Смена города")
    @Test
    void cityChangeTest() {
        String city = "Уфа";

        page.openMainPage()
                .clearAll()
                .citySelectorClick()
                .chooseCity(city)
                .checkCity(city);
    }

    @Tag("UITest")
    @DisplayName("Работоспособности поиска")
    @Test
    void searchSystemTest() {
        String tech = "Ноутбуки";

        page.openMainPage()
                .clearAll()
                .inputTextInSearchField(tech)
                .isItEnd()
                .checkTitle(tech);
    }

    @Tag("UITest")
    @DisplayName("Работоспособность католога")
    @Test
    void catalogTest() {
        String mainCatalogChapter = "Отдых и развлечения",
                catalogChapter = "Развлечения и хобби",
                subCatalogChapter = "Настольные игры";

        page.openMainPage()
                .clearAll()
                .chooseMainCatalog(mainCatalogChapter)
                .chooseCatalogById(catalogChapter)
                .chooseCatalogById(subCatalogChapter)
                .checkTitle(subCatalogChapter);
    }

    @Tag("UITest")
    @DisplayName("Добавление техники в корзину")
    @Test
    void addTechInCartTest() {
        String tech = "Ноутбуки";

        page.openMainPage()
                .clearAll()
                .inputTextInSearchField(tech)
                .addProductInCart()
                .openPageByWay("/cart")
                .checkAmountOfProductInCart();
    }

    @Tag("UITest")
    @DisplayName("Добавление техники в список желаемого")
    @Test
    void addTechInWishListTest() {
        String tech = "Ноутбуки";

        page.openMainPage()
                .clearAll()
                .inputTextInSearchField(tech)
                .addProductInWishList()
                .openPageByWay("/profile/wishlist/")
                .checkAmountOfProductInWishList();
    }

    @Tag("UITest")
    @DisplayName("Удаление техники из корзины")
    @Test
    void delTechFromCartTest() {
        String tech = "Ноутбуки";

        page.openMainPage()
                .clearAll()
                .inputTextInSearchField(tech)
                .addProductInCart()
                .openPageByWay("/cart")
                .checkAmountOfProductInCart()
                .delProductFromCart()
                .checkCartIsEmpty();
    }

    @Tag("UITest")
    @DisplayName("Удаление техники из списока желаемого")
    @Test
    void delTechFromWishListTest() {
        String tech = "Ноутбуки";

        page.openMainPage()
                .clearAll()
                .inputTextInSearchField(tech)
                .addProductInWishList()
                .openPageByWay("/profile/wishlist/")
                .checkAmountOfProductInWishList()
                .delProductFromWishList()
                .checkWishListIsEmpty();
    }

    @Tag("UITest")
    @DisplayName("Работоспособность помощи")
    @Test
    void helpTest() {
        page.openMainPage()
                .clearAll()
                .clickHelp()
                .checkHelp();
    }
}
