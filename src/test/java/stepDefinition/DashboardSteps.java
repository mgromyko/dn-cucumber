package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import pageObject.DashboardPage;

public class DashboardSteps {
    @Then("^I am at Dashboard page$")
    public void iAmAtDashboardPage() throws Throwable {
        DashboardPage.controlHeader().isDisplayed();
    }
}
