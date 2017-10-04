package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageAction.BrowserActions;
import pageAction.desktop.DashboardPageActions;

public class DashboardSteps {
    @Then("^I am at Dashboard page$")
    public void iAmAtDashboardPage() throws Throwable {
        BrowserActions.waitForPageLoadingIsCompleted();
        DashboardPageActions.verifyPageIsActive();
    }

    @And("^I verify that \"([^\"]*)\" displayed at Story List$")
    public void iVerifyThatDisplayedAtStoryList(String storyTitle) throws Throwable {
        DashboardPageActions.verifyItemDisplayedAtStoryList(storyTitle);
    }
}
