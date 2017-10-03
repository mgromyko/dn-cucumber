package webDriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import supportFactory.WebdriverFactory;
import testRunner.TestRunner;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriver webdriver;
    public static long timeStamp;
    private static int implicitWait = Integer.parseInt(TestRunner.config.get("implicitWait"));
    private static int pageLoadTimeout = Integer.parseInt(TestRunner.config.get("pageLoadTimeout"));

    public synchronized static WebDriver getCurrentDriver() {

        if (webdriver == null) {
            webdriver = WebdriverFactory.createWebdriver();
            assert webdriver != null;
            webdriver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
            webdriver.manage().timeouts().pageLoadTimeout(pageLoadTimeout, TimeUnit.SECONDS);
            webdriver.manage().deleteAllCookies();
            Calendar calendar = Calendar.getInstance();
            Date now = calendar.getTime();
            timeStamp = now.getTime();
        }
        return webdriver;
    }

    public static String takeScreenshot(String filename) throws IOException {

        try {
            File file = ((TakesScreenshot) getCurrentDriver()).getScreenshotAs(OutputType.FILE);
            String filePath = ("./screenshot/" + filename + ".jpg");
            FileUtils.copyFile(file, new File(filePath));
            return filePath;
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            return null;
        }
    }

    public static void embedScreenshot() {
        try {
            byte[] screenshot = ((TakesScreenshot) getCurrentDriver()).getScreenshotAs(OutputType.BYTES);
            TestRunner.scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
    }

    public static void writeToReport(String string) {
        TestRunner.scenario.write(string);
    }

    public static void waitForElement(WebElement ele) {
        WebDriverWait wait = new WebDriverWait(webdriver, implicitWait);
        wait.until(ExpectedConditions.visibilityOf(ele));
    }

    public static void waitForElementToDisappear(WebElement ele) {
        WebDriverWait wait = new WebDriverWait(webdriver, implicitWait);
        wait.until(ExpectedConditions.invisibilityOf(ele));
    }
}
