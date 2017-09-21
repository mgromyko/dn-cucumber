package pageAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.LoginPage;
import pageObject.TopPanel;
import webDriver.Driver;

public class TopPanelActions {
    static WebDriver driver = Driver.getCurrentDriver();
    static WebDriverWait wait = new WebDriverWait(driver, 10);
    static Actions action = new Actions(driver);

    public static String getSelectedTopPanelMenuItem(){
        return TopPanel.selectedMenuItem().getText();
    }

    public static void callSecondaryMenuForNavigationItem(WebElement ele){
        action.moveToElement(ele).perform();
    }

    public static void clickOnAdvancedSearchLink(){
        BrowserActions.waitForPageLoadingIsCompleted();
        TopPanel.searchIcon().click();
        wait.until(ExpectedConditions.elementToBeClickable(TopPanel.advancedSearchLink()));
        TopPanel.advancedSearchLink().click();
    }
}
