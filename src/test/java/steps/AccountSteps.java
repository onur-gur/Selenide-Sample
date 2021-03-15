package steps;

import org.testng.annotations.Test;
import pageModel.BasePage;
import pageModel.HomePage;
import pageModel.LoginPage;
import pageModel.LoginPage.*;

import java.util.regex.Pattern;

import static org.testng.Assert.assertEquals;

public class AccountSteps {


    @Test
    public void checkLogin(){
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();

        homePage.goToPage();
        homePage.closePopup();
        homePage.clickAccountUser();

        loginPage.login();
        homePage.closeNotification();
        assertEquals("hesabım",loginPage.checkLogin().toLowerCase());
        //Boolean c = Pattern.compile(Pattern.quote(s), Pattern.CASE_INSENSITIVE).matcher(text).find();


    }
}
