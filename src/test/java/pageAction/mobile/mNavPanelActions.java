package pageAction.mobile;

import pageAction.BasePageActions;
import pageObject.mobile.mNavPanel;

public class mNavPanelActions extends BasePageActions {
    public static void createNewItem(String itemName) {
        mNavPanel.callItemsToCreatePopUp().click();
        mNavPanel.selectItemToCreatePopUp(itemName).click();
    }

    public static void navigateTo(String navigationItem) throws InterruptedException {
        switch (navigationItem) {
            case "Story List":
                mNavPanel.menuHamburger().click();
                sleep();
                mNavPanel.itemHamburgerPopUp("Stories").click();
                break;
            case "Calendar":
                mNavPanel.menuHamburger().click();
                sleep();
                mNavPanel.itemHamburgerPopUp("Calendar").click();
                break;
            case "My Schedule":
                mNavPanel.menuHamburger().click();
                sleep();
                mNavPanel.itemHamburgerPopUp("My Schedule").click();
                break;
        }
        waitForPageLoadingIsCompleted();
    }
}