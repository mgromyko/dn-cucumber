package stepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pageAction.ControlPanelActions;
import pageObject.ControlPanel;

import java.util.List;

public class ControlPanelSteps {
    @And("^I click MoreFilters link at Control Panel$")
    public void iClickMoreFiltersLinkAtControlPanel() throws Throwable {
        ControlPanelActions.clickMoreFiltersLink();
    }

    @And("^I click HideFilters link at Control Panel$")
    public void iClickHideFiltersLinkAtControlPanel() throws Throwable {
        ControlPanelActions.clickHideFiltersLink();
    }

    @Then("^I verify that (Status|Tasks|Users) additional filter has \"([^\"]*)\" value$")
    public void iVerifyThatAdditionalFilterHasValue(String filterName, String filterValue) throws Throwable {
        switch (filterName) {
            case "Status":
                Assert.assertTrue(ControlPanelActions.getStatusFilterDescription().getText().equalsIgnoreCase(filterValue));
                break;
            case "Tasks":
                Assert.assertTrue(ControlPanelActions.getTasksFilterDescription().getText().equalsIgnoreCase(filterValue));
                break;
            case "Users":
                Assert.assertTrue(ControlPanelActions.getUsersFilterDescription().getText().equalsIgnoreCase(filterValue));
                break;
            default:
                throw new Exception("You have indicated wrong filter name. Allowed options: [\"Status\",\"Tasks\",\"Users\"]");
        }

    }

    @Then("^I click on (Status|Tasks|Users) filter$")
    public void iClickOnTasksFilter(String filterName) throws Throwable {
        switch (filterName) {
            case "Status":
                ControlPanel.statusFilterDescription().click();
                break;
            case "Tasks":
                ControlPanel.tasksFilterDescription().click();
                break;
            case "Users":
                ControlPanel.usersFilterDescription().click();
                break;
        }
    }

    @And("^I verify that parent filter option \"([^\"]*)\" is (checked|unchecked)$")
    public void iVerifyThatValueIsPresentedAndChecked(String optionName, String verifyStatus) throws Throwable {
        switch (verifyStatus) {
            case "checked":
                ControlPanel.checkedFilterParentOption(optionName);
                break;
            case "unchecked":
                ControlPanel.uncheckedFilterParentOption(optionName);
                break;
        }
    }

    @And("^I verify that child filter option \"([^\"]*)\" is (checked|unchecked)$")
    public void iVerifyThatChildFilterOptionIsChecked(String optionName, String verifyStatus) throws Throwable {
        switch (verifyStatus) {
            case "checked":
                ControlPanel.checkedFilterChildOption(optionName);
                break;
            case "unchecked":
                ControlPanel.uncheckedFilterChildOption(optionName);
                break;
        }
    }

    @And("^I verify child filter options checked status$")
    public void iVerifyThatChildFilterOptionIs(DataTable filterOptionsList) throws Throwable {
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

    @And("^I press (ENTER|CANCEL) in filters pop-up$")
    public void iPressENTERorCANCELInFiltersPopUp(String btnName) throws Throwable {
        switch (btnName) {
            case "ENTER":
                ControlPanel.enterBtnFilterPopUp().click();
                break;
            case "CANCEL":
                ControlPanel.cancelBtnFilterPopUp().click();
                break;
        }
    }

    @And("^I verify APPLY filters button is (enabled|disabled)$")
    public void iVerifyAPPLYFiltersButtonIsDisabled(String btnState) throws Throwable {
        switch (btnState) {
            case "enabled":
                ControlPanel.applyBtnEnabled().isDisplayed();
            case "disabled":
                ControlPanel.applyBtnDisabled().isDisplayed();
        }
    }
}
