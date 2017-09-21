package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import enums.Browser;
import pageAction.BrowserActions;
import webDriver.Driver;

public class GeneralPurpose {
    @Then("^Take a screenshot named \"([^\"]*)\"$")
    public void takeAScreenshotNamed(String filename) throws Throwable {
        Driver.takeScreenshot(filename);
    }

    @Then("^Embed a screenshot in the report$")
    public void embedAScreenshotInTheReport() throws Throwable {
        Driver.embedScreenshot();
    }

    @Then("^I wait for (\\d+) seconds$")
    public void iWaitForSeconds(int sec) throws Throwable {
        Thread.sleep(sec*1000);
    }

    @Then("^I wait for a second$")
    public void iWaitForASecond() throws Throwable {
        Thread.sleep(1000);
    }

    @Then("^I wait for page loading has been completed$")
    public void iWaitForPageLoadingHasBeenCompleted() throws Throwable {
        BrowserActions.waitForPageLoadingIsCompleted();
        Thread.sleep(1000);
    }

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String anyText) throws Throwable {
        BrowserActions.findElementWithText(anyText).click();
    }
}
