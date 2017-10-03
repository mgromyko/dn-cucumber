package pageAction;

import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObject.LoginPage;

public class LoginActions extends BasePageActions {

    public static void login(String mail, String pwd) {
        wait.until(ExpectedConditions.elementToBeClickable(LoginPage.loginBtn()));
        LoginPage.inputEmail().sendKeys(mail);
        LoginPage.inputPassword().sendKeys(pwd);
        LoginPage.loginBtn().click();
    }

    public static void verifyPageIsActive() {
        LoginPage.treatLoginPageElement().isDisplayed();
    }
}