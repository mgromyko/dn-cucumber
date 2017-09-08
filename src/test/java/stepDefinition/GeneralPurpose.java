package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
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
}
