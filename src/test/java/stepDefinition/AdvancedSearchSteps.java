package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageAction.AdvancedSearchPageActions;

public class AdvancedSearchSteps {
    @Then("^I select (Any user|Limit to these) for 'Assigned to' option$")
    public void iSelectLimitToTheseForAssignedToOption(String option) {
        AdvancedSearchPageActions.setAssignedTo(option);
    }

    @And("^I enter \"([^\"]*)\" into advanced search$")
    public void iEnterIntoAdvancedSearch(String text) {
        AdvancedSearchPageActions.inputTextForSearch(text);
    }

    @Then("^I click on Search button$")
    public void iClickOnSearchButton() {
        AdvancedSearchPageActions.clickSearchButton();
    }

    @And("^I (see|do not see) \"([^\"]*)\" at searching results$")
    public void iSeeAtSearchingResults(String expectation, String text) throws Exception {
        switch (expectation) {
            case "see":
                AdvancedSearchPageActions.verifySearchingResult(text, true);
                break;
            case "do not see":
                AdvancedSearchPageActions.verifySearchingResult(text, false);
                break;
        }
    }
}