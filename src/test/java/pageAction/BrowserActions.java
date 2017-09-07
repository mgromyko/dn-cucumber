package pageAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webDriver.Driver;

public class BrowserActions {

    static WebDriver driver = Driver.getCurrentDriver();
    static WebDriverWait wait = new WebDriverWait(driver, 10);

    public static void openUrl(String websiteUrl) {
        driver.get(websiteUrl);
        wait.until(ExpectedConditions.titleContains("Login - Desk-Net"));
    }
}