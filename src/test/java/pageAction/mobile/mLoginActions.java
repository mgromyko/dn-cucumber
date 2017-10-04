package pageAction.mobile;

import org.openqa.selenium.support.ui.ExpectedConditions;
import pageAction.BasePageActions;
import pageObject.mobile.mLoginPage;

public class mLoginActions extends BasePageActions {
    public static void login(String mail, String pwd) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(mLoginPage.loginBtn()));
        mLoginPage.inputEmail().sendKeys(mail);
        mLoginPage.inputPassword().sendKeys(pwd);
        mLoginPage.loginBtn().click();
        waitForPageLoadingIsCompleted();
    }

    public static void verifyPageIsActive() {
        mLoginPage.treatLoginPageElement().isDisplayed();
    }
}