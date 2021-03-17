package pageModel;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends BasePage {
    String url = "https://www.trendyol.com/";
    String btnClosePopUp=".fancybox-close";
    String btnAccountUser =".account-user";
    String btnNotificationClose = ".modal-close";
    String btnMyAccount = ".user-login-container";

    public void goToPage() {
        open(url);
    }

    public void closePopup() {
        findByCss(btnClosePopUp).click();

    }

    public void clickAccountUser() {
        findByCss(btnAccountUser).click();
    }

    public void closeNotification() {
        findByCss(btnNotificationClose).click();
    }

    public void clickMyAccount() {
        findByCss(btnMyAccount).click();
    }
}
