package pageAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.TopPanel;
import webDriver.Driver;

public class TopPanelActions {
    static WebDriver driver = Driver.getCurrentDriver();
    static WebDriverWait wait = new WebDriverWait(driver, 10);

    public static String getSelectedTopPanelMenuItem(){
        return TopPanel.selectedMenuItem().getText();
    }
}
