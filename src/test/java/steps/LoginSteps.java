package steps;

import driver.Driver;
import methods.BaseMethods;
import com.thoughtworks.gauge.Step;
import constants.Elements;

public class LoginSteps extends Driver {
    BaseMethods methods = new BaseMethods();

    @Step("Hesabim butonuna tikla")
    public void clickToMyAccount() {
        methods.click(Elements.BTN_myAccount);
    }

    @Step("Giris Yap tabina tikla")
    public void clickToLoginButton() {
        methods.click(Elements.BTN_login);
    }

    @Step("E-posta alanina <email> degerini gir")
    public void sendEmail(String email) {
        methods.sendText(Elements.TextBox_email, email);
    }

    @Step("Sifre alanina <password> degerini gir")
    public void sendPassword(String password) {
        methods.sendText(Elements.TextBox_password, password);
    }

    @Step("Giris Yap butonuna tikla")
    public void clickToLogin() {
        methods.click(Elements.BTN_login);
    }

    @Step("<text> degeri ile kontrol et")
    public void checkValidLogin(String text) {
        methods.checkText(Elements.loginUserTitle, text);
    }

    @Step("Hesap Ayarlari butonuna tikla")
    public void clickAccountSettings() {
        methods.click(Elements.BTN_accountSettings);
    }

    @Step("Cikis Yap butonuna tikla")
    public void clickLogOutButton() {
        methods.click(Elements.BTN_logOut);
    }

    @Step("Acilan popupda Cikis Yap butonuna tikla")
    public void clickSecondaryLogOut() {
        methods.click(Elements.BTN_secondaryLogOut);
    }

    @Step("Anasayfaya yonlendirildigini <text> ile kontrol et")
    public void checkNavigateToHomePage(String login) throws InterruptedException {
        methods.wait(4);
        methods.checkText(Elements.BTN_loginBar, login);
    }

    @Step("<text> uyari textini kontrol et")
    public void invalidLoginWarning(String text) {
        methods.checkText(Elements.MSG_invalidLogin, text);
    }

    @Step("popup kapatilir")
    public void closePopup(){methods.click(Elements.BTN_closePopup);}


}
