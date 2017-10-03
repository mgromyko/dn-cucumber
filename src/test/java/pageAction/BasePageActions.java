package pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.ControlPanel;
import testRunner.TestRunner;
import webDriver.Driver;

public class BasePageActions {
    static WebDriver driver = Driver.getCurrentDriver();
    static String wdWait = TestRunner.config.get("wdWait");
    static WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(wdWait));
    static Actions action = new Actions(driver);

    public static String getControlHeaderName() {
        return ControlPanel.controlHeader().getText();
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
