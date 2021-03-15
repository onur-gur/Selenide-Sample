package pageModel;

public class LoginPage extends BasePage {
    String txtEmail ="#login-email";
    String txtPassword = "#login-password-input";
    String btnSubmit = ".q-primary.q-fluid";
    String txtMyAccount ="div[class='link account-user']>p[class='link-text']";


    public void login(){
        findByCss(txtEmail).sendKeys("tttest31234@gmail.com");
        findByCss(txtPassword).sendKeys("UU2W!EBNtsNp+-n");
        findByCss(btnSubmit).click();
    }

    public String checkLogin(){
        return findByCss(txtMyAccount).getText();
    }


}