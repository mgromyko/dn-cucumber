package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pageAction.ControlPanelActions;
import pageObject.ControlPanel;

public class ControlPanelSteps {
    @And("^I click MoreFilters link at Control Panel$")
    public void iClickMoreFiltersLinkAtControlPanel() throws Throwable {
        ControlPanelActions.clickMoreFiltersLink();
    }

    @And("^I click HideFilters link at Control Panel$")
    public void iClickHideFiltersLinkAtControlPanel() throws Throwable {
        ControlPanelActions.clickHideFiltersLink();
    }

    @Then("^I verify that \"([^\"]*)\" additional filter has \"([^\"]*)\" value$")
    public void iVerifyThatAdditionalFilterHasValue(String filterName, String filterValue) throws Throwable {
        switch (filterName){
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
}
