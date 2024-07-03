package constants;

import org.openqa.selenium.By;

public class Elements {
    public static By searchBox = By.id("com.dmall.mfandroid:id/tvHomeSearchBar");
    public static By searchInput = By.id("com.dmall.mfandroid:id/etSearch");
    public static By searchItem = By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.dmall.mfandroid:id/viewSearchRV\"]/android.view.ViewGroup[2]");
    public static By BTN_categories = By.id("com.dmall.mfandroid:id/navigation_category");
    public static By BTN_myCart = By.id("com.dmall.mfandroid:id/navigation_basket");
    public static By BTN_myFavorite = By.id("com.dmall.mfandroid:id/navigation_favorite");
    public static By BTN_myAccount = By.id("com.dmall.mfandroid:id/navigation_account");
    public static By BTN_login = By.id("com.dmall.mfandroid:id/btn_login");
    public static By TextBox_email = By.id("com.dmall.mfandroid:id/text_input_edit_text");
    public static By TextBox_password = By.xpath("//android.widget.EditText[@resource-id=\"com.dmall.mfandroid:id/text_input_edit_text\" and @text=\"Şifre\"]");
    public static By loginUserTitle = By.id("com.dmall.mfandroid:id/tv_user_name_title");
    public static By BTN_accountSettings = By.id("com.dmall.mfandroid:id/iv_account_settings");
    public static By BTN_logOut = By.id("com.dmall.mfandroid:id/accountFragmentLogOutRL");
    public static By BTN_secondaryLogOut = By.id("com.dmall.mfandroid:id/btn_secondary");
    public static By BTN_loginBar = By.xpath("//android.widget.TextView[@text=\"Üye Ol / Giriş Yap\"]");
    public static By MSG_invalidLogin = By.id("com.dmall.mfandroid:id/titleTV");
    public static By TITLE_categoryPage = By.id("com.dmall.mfandroid:id/tvCategoryTitle");
    public static By BTN_electronic = By.xpath("//android.widget.TextView[@resource-id=\"com.dmall.mfandroid:id/tvCategoryItem\" and @text=\"Elektronik\"]");
    public static By BTN_computer = By.xpath("//android.widget.TextView[@resource-id=\"com.dmall.mfandroid:id/tvCategoryItem\" and @text=\"Bilgisayar\"]");
    public static By BTN_laptop = By.xpath("//android.widget.TextView[@resource-id=\"com.dmall.mfandroid:id/tvCategoryItem\" and @text=\"Dizüstü Bilgisayar\"]");
    public static By filter = By.id("com.dmall.mfandroid:id/listingFilterTV");
    public static By brand = By.xpath("//android.widget.TextView[@resource-id=\"com.dmall.mfandroid:id/typeNameTV\" and @text=\"Marka\"]");
    public static By brandList = By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.dmall.mfandroid:id/attributeList\"]/androidx.appcompat.widget.LinearLayoutCompat");
    public static By BTN_apply = By.id("com.dmall.mfandroid:id/applyBtn");
    public static By productScore = By.xpath("//android.widget.TextView[@text=\"Ürün Puanı\"]");
    public static By ICON_fourthScore = By.id("com.dmall.mfandroid:id/rlFourthScore");
    public static By BTN_showResult = By.id("com.dmall.mfandroid:id/giybiFilterShowResultsBTN");
    public static By sortList = By.id("com.dmall.mfandroid:id/listingSortTV");
    public static By bestSellers = By.xpath("//android.widget.TextView[@resource-id=\"com.dmall.mfandroid:id/sortingName\" and @text=\"Çok Satanlar\"]");
    public static By ICON_delete = By.id("com.dmall.mfandroid:id/firstItemView");
    public static By BTN_delete = By.id("com.dmall.mfandroid:id/deleteTv");
    public static By TITLE_emptyBasket = By.id("com.dmall.mfandroid:id/emptyBasketTitleTv");
    public static By ICON_favorite = By.xpath("(//android.widget.ImageView[@resource-id=\"com.dmall.mfandroid:id/ivFullImagesFavorite\"])");
    public static By ICON_deleteFavorite = By.xpath("(//android.widget.ImageView[@resource-id=\"com.dmall.mfandroid:id/removeFromFavoritesIV\"])[1]");
    public static By BTN_deleteFavorite = By.id("com.dmall.mfandroid:id/customInfoDialogBtn1");
    public static By BTN_goToHome = By.id("com.dmall.mfandroid:id/goToHomeButton");
    public static By firstProductPrice = By.id("com.dmall.mfandroid:id/tvProductBannerItemPrice");
    public static By ICON_addToCart = By.xpath("(//android.widget.ImageView[@resource-id=\"com.dmall.mfandroid:id/ivAddToBasket\"])[1]");
    public static By basketItemPrice = By.id("com.dmall.mfandroid:id/basketItemPriceTV");
    public static By TITLE_productName = By.id("com.dmall.mfandroid:id/tvTitle");
    public static By TITLE_productTitle = By.id("com.dmall.mfandroid:id/productTitleTV");
    public static By BTN_closePopup = By.id("com.dmall.mfandroid:id/closeIV");


}
