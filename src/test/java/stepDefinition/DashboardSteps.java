package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObject.DashboardPage;

public class DashboardSteps {
    @Then("^I am at Dashboard page$")
    public void iAmAtDashboardPage() throws Throwable {
        DashboardPage.treatDashboardElement().isDisplayed();
    }

    @And("^I verify that \"([^\"]*)\" displayed at Story List$")
    public void iVerifyThatDisplayedAtStoryList(String title) throws Throwable {
        DashboardPage.StoryList.storyTitle(title).isDisplayed();
    }
}
