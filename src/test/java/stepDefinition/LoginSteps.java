package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pageAction.LoginActions;
import pageObject.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;

public class LoginSteps {
    @When("^I login as valid user$")
    public void iLoginAsValidUser() throws Throwable {
        LoginActions.login("org1", "tomcattom");
    }

    @And("^I am at Login page$")
    public void iAmAtNewStoryCreationPage() throws Throwable {
        LoginPage.treatLoginPageElement().isDisplayed();
    }
}
