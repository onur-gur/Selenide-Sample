package pageModel;

import com.codeborne.selenide.SelenideElement;
import org.jsoup.Connection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MyAccountPage extends BasePage {
    String btnAccountInfo = "a[href=\"/Hesabim/KullaniciBilgileri\"]>i";

    public void clickAccountInfo(){
        findByCss(btnAccountInfo);
    }
}
