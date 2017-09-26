package pageAction;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.TopPanel;
import webDriver.Driver;

public class TopPanelActions {
    static WebDriver driver = Driver.getCurrentDriver();
    static WebDriverWait wait = new WebDriverWait(driver, 10);
    static Actions action = new Actions(driver);

    public static String getSelectedTopPanelMenuItem() {
        return TopPanel.selectedMenuItem().getText();
    }

    public static void verifySelectedMenu(String menuItemLabel) {
        Assert.assertTrue(TopPanelActions.getSelectedTopPanelMenuItem().equalsIgnoreCase(menuItemLabel));
    }

    public static void clickOnAdvancedSearchLink() throws InterruptedException {
        BrowserActions.waitForPageLoadingIsCompleted();
        Thread.sleep(500);
        TopPanel.searchIcon().click();
        wait.until(ExpectedConditions.elementToBeClickable(TopPanel.advancedSearchLink()));
        TopPanel.advancedSearchLink().click();
    }

    public static void clickImageLogo() {
        TopPanel.imageLogo().click();
    }

    public static void createNewItem(String itemName) {
        TopPanel.callItemsToCreatePopUp().click();
        TopPanel.selectItemToCreatePopUp(itemName).click();
    }

    public static void navigateTo(String navigationItem) throws InterruptedException {
        //TODO: handle hamburger menu first if displayed
        switch (navigationItem) {
            case "Dashboard":
                TopPanel.mainMenuNavigationItem(navigationItem).click();
                break;
            case "Story - planning":
                TopPanelActions.callSecondaryMenuForNavigationItem(TopPanel.mainMenuNavigationItem("Story Lists"));
                TopPanel.secondaryMenuNavigationItem("Story planning").click();
                break;
            case "Story - Short-term":
                TopPanelActions.callSecondaryMenuForNavigationItem(TopPanel.mainMenuNavigationItem("Story Lists"));
                TopPanel.secondaryMenuNavigationItem("Short-term").click();
                break;
            case "Story - Long-term":
                TopPanelActions.callSecondaryMenuForNavigationItem(TopPanel.mainMenuNavigationItem("Story Lists"));
                TopPanel.secondaryMenuNavigationItem("Long-term").click();
                break;
            case "Story - Ideas":
                TopPanelActions.callSecondaryMenuForNavigationItem(TopPanel.mainMenuNavigationItem("Story Lists"));
                TopPanel.secondaryMenuNavigationItem("Story Ideas").click();
                break;
            case "Story - Topics":
                TopPanelActions.callSecondaryMenuForNavigationItem(TopPanel.mainMenuNavigationItem("Story Lists"));
                TopPanel.secondaryMenuNavigationItem("Topics").click();
                break;
            case "Tasks":
                TopPanel.mainMenuNavigationItem(navigationItem).click();
                break;
            case "Calendar - Editorial events":
                TopPanelActions.callSecondaryMenuForNavigationItem(TopPanel.mainMenuNavigationItem("Calendar"));
                TopPanel.secondaryMenuNavigationItem("Editorial events").click();
                break;
            case "Calendar - Short-term":
                TopPanelActions.callSecondaryMenuForNavigationItem(TopPanel.mainMenuNavigationItem("Calendar"));
                TopPanel.secondaryMenuNavigationItem("Short-term").click();
                break;
            case "Calendar - Long-term":
                TopPanelActions.callSecondaryMenuForNavigationItem(TopPanel.mainMenuNavigationItem("Calendar"));
                TopPanel.secondaryMenuNavigationItem("Long-term").click();
                break;
            case "Calendar - Event Feeds":
                TopPanelActions.callSecondaryMenuForNavigationItem(TopPanel.mainMenuNavigationItem("Calendar"));
                TopPanel.secondaryMenuNavigationItem("Event Feeds").click();
                break;
            case "Management - Availability":
                TopPanelActions.callSecondaryMenuForNavigationItem(TopPanel.mainMenuNavigationItem("Management"));
                TopPanel.secondaryMenuNavigationItem("Availability").click();
                break;
            case "Management - Short-term":
                TopPanelActions.callSecondaryMenuForNavigationItem(TopPanel.mainMenuNavigationItem("Management"));
                TopPanel.secondaryMenuNavigationItem("Short-term").click();
                break;
            case "Management - Monthly":
                TopPanelActions.callSecondaryMenuForNavigationItem(TopPanel.mainMenuNavigationItem("Management"));
                TopPanel.secondaryMenuNavigationItem("Monthly").click();
                break;
            case "Management - Timeline":
                TopPanelActions.callSecondaryMenuForNavigationItem(TopPanel.mainMenuNavigationItem("Management"));
                TopPanel.secondaryMenuNavigationItem("Timeline").click();
                break;
            case "Management - Shifts":
                TopPanelActions.callSecondaryMenuForNavigationItem(TopPanel.mainMenuNavigationItem("Management"));
                TopPanel.secondaryMenuNavigationItem("Shifts").click();
                break;
            case "Management - Inbox":
                TopPanelActions.callSecondaryMenuForNavigationItem(TopPanel.mainMenuNavigationItem("Management"));
                TopPanel.secondaryMenuNavigationItem("Inbox").click();
                break;
            case "Management - Alerts":
                TopPanelActions.callSecondaryMenuForNavigationItem(TopPanel.mainMenuNavigationItem("Management"));
                TopPanel.secondaryMenuNavigationItem("Alerts").click();
                break;
            case "My Schedule":
                TopPanel.mainMenuNavigationItem(navigationItem).click();
                break;
            case "Advanced Search":
                TopPanelActions.clickOnAdvancedSearchLink();
                break;
        }
    }

    public static void callSecondaryMenuForNavigationItem(WebElement ele) {
        action.moveToElement(ele).perform();
    }
}
