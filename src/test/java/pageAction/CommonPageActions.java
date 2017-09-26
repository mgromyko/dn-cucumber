package pageAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.ControlPanel;
import webDriver.Driver;

public class CommonPageActions {
    static WebDriver driver = Driver.getCurrentDriver();
    static WebDriverWait wait = new WebDriverWait(driver, 10);

    public static String getControlHeaderName() {
        return ControlPanel.controlHeader().getText();
    }
}
