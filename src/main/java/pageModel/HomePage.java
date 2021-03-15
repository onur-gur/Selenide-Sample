package pageModel;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.open;

public class HomePage extends BasePage {
    String url="https://www.trendyol.com/";
    String btnClosePopUp=".fancybox-close";
    String btnAccountUser =".account-user";
    String btnNotificationClose = "modal-close";

    public void goToPage(){
        open(url);
    }

    public void closePopup(){
        findByCss(btnClosePopUp).click();
    }

    public void clickAccountUser(){
        findByCss(btnAccountUser).click();
    }

    public void closeNotification(){
        SelenideElement element = findByClassName(btnNotificationClose);
        if(element.isDisplayed()){
            element.click();
        }
    }
}
