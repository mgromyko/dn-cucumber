package pageAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.LoginPage;
import webDriver.Driver;

public class LoginActions {

    static WebDriver driver = Driver.getCurrentDriver();
    static WebDriverWait wait = new WebDriverWait(driver, 10);

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