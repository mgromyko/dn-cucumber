package pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public static void waitForPageLoadingIsCompleted() throws InterruptedException {
        wait.until(ExpectedConditions.attributeContains(By.xpath("//div[@id='waitWidget']"), "aria-hidden", "true"));
        Thread.sleep(1500);
    }

    public static WebElement findElementWithText(String text) {
        return driver.findElement(By.xpath("//*[text()='" + text + "']"));
    }

    public static void scrollToElement(WebElement ele) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele);
    }
}