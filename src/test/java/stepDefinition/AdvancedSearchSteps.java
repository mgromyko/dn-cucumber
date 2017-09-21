package stepDefinition;

import cucumber.api.java.en.Then;
import pageObject.AdvancedSearchPage;

public class AdvancedSearchSteps {

    @Then("^I select (Any user|Limit to these) for 'Assigned to' option$")
    public void iSelectLimitToTheseForAssignedToOption(String radioBtnName) throws Throwable {
        AdvancedSearchPage.assignedToRadioBtn(radioBtnName).click();
    }
}
