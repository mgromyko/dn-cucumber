package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageAction.DashboardPageActions;

public class DashboardSteps {
    @Then("^I am at Dashboard page$")
    public void iAmAtDashboardPage() throws Throwable {
        DashboardPageActions.verifyPageIsActive();
    }

    @And("^I verify that \"([^\"]*)\" displayed at Story List$")
    public void iVerifyThatDisplayedAtStoryList(String storyTitle) throws Throwable {
        DashboardPageActions.verifyItemDisplayedAtStoryList(storyTitle);
    }
}
