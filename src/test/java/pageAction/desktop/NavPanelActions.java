package pageAction.desktop;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageAction.BasePageActions;
import pageObject.desktop.NavPanel;

public class NavPanelActions extends BasePageActions {
    public static String getSelectedTopPanelMenuItem() {
        return NavPanel.selectedMenuItem().getText();
    }

    public static void verifySelectedMenu(String menuItemLabel) {
        Assert.assertTrue(NavPanelActions.getSelectedTopPanelMenuItem().equalsIgnoreCase(menuItemLabel));
    }

    public static void clickOnAdvancedSearchLink() throws InterruptedException {
        waitForPageLoadingIsCompleted();
        NavPanel.searchIcon().click();
        wait.until(ExpectedConditions.elementToBeClickable(NavPanel.advancedSearchLink()));
        NavPanel.advancedSearchLink().click();
    }

    public static void clickImageLogo() {
        NavPanel.imageLogo().click();
    }

    public static void createNewItem(String itemName) {
        NavPanel.callItemsToCreatePopUp().click();
        NavPanel.selectItemToCreatePopUp(itemName).click();
    }

    public static void navigateTo(String navigationItem) throws InterruptedException {
        //TODO: handle hamburger menu first if displayed
        switch (navigationItem) {
            case "Dashboard":
                NavPanel.mainMenuNavigationItem(navigationItem).click();
                break;
            case "Story List":
                NavPanel.mainMenuNavigationItem(navigationItem).click();
                break;
            case "Story - planning":
                callSecondaryMenuForNavigationItem(NavPanel.mainMenuNavigationItem("Story Lists"));
                NavPanel.secondaryMenuNavigationItem("Story planning").click();
                break;
            case "Story - Short-term":
                callSecondaryMenuForNavigationItem(NavPanel.mainMenuNavigationItem("Story Lists"));
                NavPanel.secondaryMenuNavigationItem("Short-term").click();
                break;
            case "Story - Long-term":
                callSecondaryMenuForNavigationItem(NavPanel.mainMenuNavigationItem("Story Lists"));
                NavPanel.secondaryMenuNavigationItem("Long-term").click();
                break;
            case "Story - Ideas":
                callSecondaryMenuForNavigationItem(NavPanel.mainMenuNavigationItem("Story Lists"));
                NavPanel.secondaryMenuNavigationItem("Story Ideas").click();
                break;
            case "Story - Topics":
                callSecondaryMenuForNavigationItem(NavPanel.mainMenuNavigationItem("Story Lists"));
                NavPanel.secondaryMenuNavigationItem("Topics").click();
                break;
            case "Tasks":
                NavPanel.mainMenuNavigationItem(navigationItem).click();
                break;
            case "Calendar":
                NavPanel.mainMenuNavigationItem(navigationItem).click();
                break;
            case "Calendar - Editorial events":
                callSecondaryMenuForNavigationItem(NavPanel.mainMenuNavigationItem("Calendar"));
                NavPanel.secondaryMenuNavigationItem("Editorial events").click();
                break;
            case "Calendar - Short-term":
                callSecondaryMenuForNavigationItem(NavPanel.mainMenuNavigationItem("Calendar"));
                NavPanel.secondaryMenuNavigationItem("Short-term").click();
                break;
            case "Calendar - Long-term":
                callSecondaryMenuForNavigationItem(NavPanel.mainMenuNavigationItem("Calendar"));
                NavPanel.secondaryMenuNavigationItem("Long-term").click();
                break;
            case "Calendar - Event Feeds":
                callSecondaryMenuForNavigationItem(NavPanel.mainMenuNavigationItem("Calendar"));
                NavPanel.secondaryMenuNavigationItem("Event Feeds").click();
                break;
            case "Management":
                NavPanel.mainMenuNavigationItem(navigationItem).click();
                break;
            case "Management - Availability":
                callSecondaryMenuForNavigationItem(NavPanel.mainMenuNavigationItem("Management"));
                NavPanel.secondaryMenuNavigationItem("Availability").click();
                break;
            case "Management - Short-term":
                callSecondaryMenuForNavigationItem(NavPanel.mainMenuNavigationItem("Management"));
                NavPanel.secondaryMenuNavigationItem("Short-term").click();
                break;
            case "Management - Monthly":
                callSecondaryMenuForNavigationItem(NavPanel.mainMenuNavigationItem("Management"));
                NavPanel.secondaryMenuNavigationItem("Monthly").click();
                break;
            case "Management - Timeline":
                callSecondaryMenuForNavigationItem(NavPanel.mainMenuNavigationItem("Management"));
                NavPanel.secondaryMenuNavigationItem("Timeline").click();
                break;
            case "Management - Shifts":
                callSecondaryMenuForNavigationItem(NavPanel.mainMenuNavigationItem("Management"));
                NavPanel.secondaryMenuNavigationItem("Shifts").click();
                break;
            case "Management - Inbox":
                callSecondaryMenuForNavigationItem(NavPanel.mainMenuNavigationItem("Management"));
                NavPanel.secondaryMenuNavigationItem("Inbox").click();
                break;
            case "Management - Alerts":
                callSecondaryMenuForNavigationItem(NavPanel.mainMenuNavigationItem("Management"));
                NavPanel.secondaryMenuNavigationItem("Alerts").click();
                break;
            case "My Schedule":
                NavPanel.mainMenuNavigationItem(navigationItem).click();
                break;
            case "Advanced Search":
                clickOnAdvancedSearchLink();
                break;
        }
    }

    public static void callSecondaryMenuForNavigationItem(WebElement ele) {
        action.moveToElement(ele).perform();
    }
}
