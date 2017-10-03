package pageAction;

import cucumber.api.DataTable;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.ControlPanel;
import webDriver.Driver;

import java.util.List;

public class ControlPanelActions extends BasePageActions {

    public static void clickApplyBtn() {
        try {
            scrollToElement(ControlPanel.applyBtnEnabled());
            ControlPanel.applyBtnEnabled().click();
        } catch (Exception e) {
            System.out.println("Apply button is either not visible or disabled");
        }
    }

    public static void clickMoreFiltersLink() {
        try {
            ControlPanel.moreFiltersLink().click();
        } catch (Exception e) {
            System.out.println("Filters are already expanded or 'More Filters' link was not found!");
        }
    }

    public static void clickHideFiltersLink() {
        try {
            ControlPanel.hideFiltersLink().click();
        } catch (Exception e) {
            System.out.println("Filters are already collapsed or 'Hide Filters' link was not found!");
        }
    }

    public static void clickStatusDescription() {
        Driver.waitForElement(ControlPanel.statusFilterDescription());
        ControlPanel.statusFilterDescription().click();
    }

    public static void clickTasksDescription() {
        Driver.waitForElement(ControlPanel.tasksFilterDescription());
        ControlPanel.tasksFilterDescription().click();
    }

    public static void clickUsersDescription() {
        Driver.waitForElement(ControlPanel.usersFilterDescription());
        ControlPanel.usersFilterDescription().click();
    }

    public static void clickEnterBtnPopUp() {
        ControlPanel.enterBtnFilterPopUp().click();
    }

    public static void clickCancelBtnPopUp() {
        ControlPanel.cancelBtnFilterPopUp().click();
    }

    public static void checkFilterParentOption(String parentOptionName) {
        //TODO: verify if it already checked
        ControlPanel.uncheckedFilterParentOption(parentOptionName).click();
    }

    public static void uncheckFilterParentOption(String parentOptionName) {
        //TODO: verify if it already unchecked
        ControlPanel.checkedFilterParentOption(parentOptionName).click();
    }

    public static void checkFilterChildOption(String childOptionName) {
        //TODO: verify if it already checked
        ControlPanelActions.scrollFiltersTo(childOptionName);
        ControlPanel.uncheckedFilterChildOption(childOptionName).click();
    }

    public static void uncheckFilterChildOption(String childOptionName) {
        //TODO: verify if it already unchecked
        ControlPanelActions.scrollFiltersTo(childOptionName);
        ControlPanel.checkedFilterChildOption(childOptionName).click();
    }

    public static String getStatusFilterDescription() {
        return ControlPanel.statusFilterDescription().getText();
    }

    public static String getTasksFilterDescription() {
        return ControlPanel.tasksFilterDescription().getText();
    }

    public static String getUsersFilterDescription() {
        return ControlPanel.usersFilterDescription().getText();
    }

    public static String getActiveFiltersText() {
        return ControlPanel.activeFilters().getText();
    }

    public static void verifyStatusFilterSelectedValue(String currentStatus) {
        Assert.assertTrue(ControlPanelActions.getStatusFilterDescription().equalsIgnoreCase(currentStatus));
    }

    public static void verifyTasksFilterSelectedValue(String currentStatus) {
        Assert.assertTrue(ControlPanelActions.getTasksFilterDescription().equalsIgnoreCase(currentStatus));
    }

    public static void verifyUsersFilterSelectedValue(String currentStatus) {
        Assert.assertTrue(ControlPanelActions.getUsersFilterDescription().equalsIgnoreCase(currentStatus));
    }

    public static void verifyParentFilterIsChecked(String parentOptionName, boolean isChecked) {
        if (isChecked) {
            ControlPanel.checkedFilterParentOption(parentOptionName);
        } else {
            ControlPanel.uncheckedFilterParentOption(parentOptionName);
        }
    }

    public static void verifyChildFilterIsChecked(String childOptionName, boolean isChecked) {
        if (isChecked) {
            ControlPanel.checkedFilterChildOption(childOptionName);
        } else {
            ControlPanel.uncheckedFilterChildOption(childOptionName);
        }
    }

    public static void verifyFilterOptionsCheckedStatus(DataTable filterOptionsList) {
        List<List<String>> optionList = filterOptionsList.raw();

        for (List<String> option : optionList) {
            String optionName = option.get(0);
            String optionStatus = option.get(1);
            switch (optionStatus) {
                case "checked":
                    ControlPanel.checkedFilterChildOption(optionName);
                    break;
                case "unchecked":
                    ControlPanel.uncheckedFilterChildOption(optionName);
            }
        }
    }

    public static void verifyApplyBtnEnabledStatus(boolean isEnabled) {
        if (isEnabled) {
            ControlPanel.applyBtnEnabled().isDisplayed();
        } else {
            ControlPanel.applyBtnDisabled().isDisplayed();
        }
    }

    public static void verifyActiveFilters(String expectedValue) {
        scrollToElement(ControlPanel.controlHeader());
        Assert.assertTrue(getActiveFiltersText().equalsIgnoreCase(expectedValue));
    }

    @Test(expected = NoSuchElementException.class)
    public static void verifyFilterIsMissing(String filterName) throws Exception {
        Assert.assertTrue(filterIsMissing(filterName));
    }

    public static void scrollFiltersTo(String filterName) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//div[@class='overview-scroll']//span[text()='" + filterName + "']")));
    }

    public static boolean filterIsMissing(String filterName) throws Exception {
        switch (filterName) {
            case "Status":
                try {
                    ControlPanel.statusFilterDescription();
                } catch (NoSuchElementException e) {
                    return true;
                }
                return false;
            case "Tasks":
                try {
                    ControlPanel.tasksFilterDescription();
                } catch (NoSuchElementException e) {
                    return true;
                }
                return false;
            case "Users":
                try {
                    ControlPanel.usersFilterDescription();
                } catch (NoSuchElementException e) {
                    return true;
                }
                return false;
            default:
                throw new Exception("You have indicated wrong filter name. Allowed options: [\"Status\",\"Tasks\",\"Users\"]");
        }
    }

    public static void resetAllFilters() throws InterruptedException {
        ControlPanelActions.clickMoreFiltersLink();
        if (!ControlPanelActions.getStatusFilterDescription().equalsIgnoreCase("All statuses")) {
            ControlPanelActions.clickStatusDescription();
            ControlPanelActions.checkFilterParentOption("All");
            ControlPanel.enterBtnFilterPopUp().click();
        }
        if (!ControlPanelActions.getTasksFilterDescription().equalsIgnoreCase("Any task")) {
            ControlPanelActions.clickTasksDescription();
            ControlPanelActions.checkFilterParentOption("All");
            ControlPanel.enterBtnFilterPopUp().click();
        }
        if (!ControlPanelActions.getUsersFilterDescription().equalsIgnoreCase("All")) {
            ControlPanelActions.clickUsersDescription();
            ControlPanelActions.checkFilterParentOption("All");
            ControlPanel.enterBtnFilterPopUp().click();
        }
        ControlPanelActions.clickApplyBtn();
        BrowserActions.waitForPageLoadingIsCompleted();
    }
}