package steps;

import com.thoughtworks.gauge.Step;
import constants.Elements;
import methods.BaseMethods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchSteps {
    private static Logger log = LoggerFactory.getLogger(SearchSteps.class);
    BaseMethods methods = new BaseMethods();

    @Step("Kategoriler butonuna tikla")
    public void clickToCategoriesButton() {
        methods.click(Elements.BTN_categories);
    }

    @Step("<text> texti ile kontrol et")
    public void checkCategoriesPage(String text) {
        methods.checkText(Elements.TITLE_categoryPage, text);
    }

    @Step("Elektronik butonuna tikla")
    public void clickToElectronicButton() {
        methods.click(Elements.BTN_electronic);
    }

    @Step("Bilgisayar butonuna tikla")
    public void clickToComputerButton() {
        methods.click(Elements.BTN_computer);
    }

    @Step("Dizustu Bilgisayar elementine tikla")
    public void clickToLaptop() {
        methods.click(Elements.BTN_laptop);
    }

    @Step("Filtrele elementine tikla")
    public void clickFilter() {
        methods.click(Elements.filter);
    }

    @Step("Marka elementine tikla")
    public void clickToBrand() {
        methods.click(Elements.brand);
    }

    @Step("Marka li elementlerinden rastgele sec")
    public void selectRandomBrand() {
        methods.randomClick(Elements.brandList);
    }

    @Step("Uygula butonuna tikla")
    public void clickToApplyButton() {
        methods.click(Elements.BTN_apply);
    }

    @Step("Urun Puani elementine kaydir")
    public void scrollToProductScore() {
        methods.scrollUntilElementVisible(Elements.productScore, 0.2);
    }

    @Step("4 yildiz elementine tikla")
    public void clickToFourthScore() {
        methods.click(Elements.ICON_fourthScore);
    }

    @Step("Sonuclari Goster butonuna tikla")
    public void clickToShowResult() {
        methods.click(Elements.BTN_showResult);
    }

    @Step("Akilli Siralama elementine tikla")
    public void clickToSort() {
        methods.click(Elements.sortList);
    }

    @Step("Cok Satanlar elementine tikla")
    public void clickToBestSellers() {
        methods.click(Elements.bestSellers);
    }

    @Step("Ilk urunun fiyat bilgisini kaydet")
    public void savePrice() {
        methods.saverMethod(Elements.firstProductPrice, "prodPrice");
    }

    @Step("Sepete Ekle butonuna tikla")
    public void addToCart() {
        methods.click(Elements.ICON_addToCart);
        methods.click(Elements.BTN_myCart);
    }

    @Step("Sepetteki fiyat ile karsilastir")
    public void checkPrice() {
        methods.checkerMethod(Elements.basketItemPrice, "prodPrice");
    }

    @Step("Urun Sil iconuna tikla")
    public void clickToDeleteProductIcon() {
        methods.click(Elements.ICON_delete);
        methods.click(Elements.BTN_delete);
    }

    @Step("Sepetin bos oldugunu <text> ile kontrol et")
    public void checkIsBasketEmpty(String text) {
        methods.checkText(Elements.TITLE_emptyBasket, text);
    }

    @Step("SearchBox elementine <text> degerini gir")
    public void searchProduct(String text) {
        methods.click(Elements.searchBox);
        methods.sendText(Elements.searchInput, text);
        methods.click(Elements.searchItem);
    }

    @Step("Urun ismini kaydet")
    public void saveProdName() {
        methods.saverMethod(Elements.TITLE_productName, "prodName");
    }

    @Step("Favori iconuna tikla")
    public void clickToFavoriteIcon() {
        methods.click(Elements.ICON_favorite);
    }

    @Step("Listelerim butonuna tikla")
    public void clickToListButton() {
        methods.click(Elements.BTN_myFavorite);
    }

    @Step("Urunun listede oldugunu kontrol et")
    public void checkProdName() {
        methods.checkerMethod(Elements.TITLE_productTitle, "prodName");
    }

    @Step("Sil iconuna tikla")
    public void clickDeleteIcon() {
        methods.click(Elements.ICON_deleteFavorite);
    }

    @Step("Sil butonuna tikla")
    public void clickDeleteButton() {
        methods.click(Elements.BTN_deleteFavorite);
    }

    @Step("Bos oldugunu Favori Urunlerini Bul ile kontrol et")
    public void checkFavorite() {
        if (methods.isElementDisplayed(Elements.BTN_goToHome)) {
            methods.click(Elements.BTN_goToHome);
            log.info("Favorilerin bos oldugu dogrulandi ");
        } else {
            log.info("Favori listesi bos degil!");
        }
    }


}
