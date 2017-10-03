package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageAction.BrowserActions;
import pageAction.BasePageActions;
import testRunner.TestRunner;

public class NavigationSteps {
    @Given("^I open URL \"([^\"]*)\"$")
    public void iOpenUrl(String webURL) throws Throwable {
        BrowserActions.openUrl(webURL);
    }

    @When("^I open a browser and go to login page$")
    public void iOpenDesktopVersionOfSite() throws Throwable {
        String siteUrl = TestRunner.config.get("siteUrl");
        BrowserActions.openUrl(siteUrl);
    }

    @Then("^I am at \"([^\"]*)\" page$")
    public void iAmAtPage(String expectedHeader) throws Throwable {
        Assert.assertTrue(BasePageActions.getControlHeaderName().equalsIgnoreCase(expectedHeader));
    }
}