package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pageObject.AdvancedSearchPage;

public class AdvancedSearchSteps {

    @Then("^I select (Any user|Limit to these) for 'Assigned to' option$")
    public void iSelectLimitToTheseForAssignedToOption(String radioBtnName) throws Throwable {
        AdvancedSearchPage.assignedToRadioBtn(radioBtnName).click();
    }

    @And("^I enter \"([^\"]*)\" into advanced search$")
    public void iEnterIntoAdvancedSearch(String textToSearch) throws Throwable {
        AdvancedSearchPage.searchTermInput().sendKeys(textToSearch);
    }

    @Then("^I click on Search button$")
    public void iClickOnSearchButton() throws Throwable {
        AdvancedSearchPage.searchBtn().click();
    }

    @And("^I (see|do not see) \"([^\"]*)\" at searching results$")
    public void iSeeAtSearchingResults(String expectation, String text) throws Throwable {
        switch (expectation){
            case "see":
                AdvancedSearchPage.expectedSearchResult(text).isDisplayed();
                break;
            case "do not see":
                try{
                    AdvancedSearchPage.expectedSearchResult(text).isDisplayed();
                }
                catch (Exception e){
                    break;
                }
                throw new Exception("Text: '" + text + "' was unexpectedly found");
        }
    }
}