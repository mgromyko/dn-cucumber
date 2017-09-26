package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageAction.TopPanelActions;

public class TopPanelSteps {
    @And("^I verify that \"([^\"]*)\" is selected in navigation panel menu$")
    public void iVerifyThatIsSelectedInNavigationPanelMenu(String expectedMenuItem) {
        TopPanelActions.verifySelectedMenu(expectedMenuItem);
    }

    @Then("^I create a new (Story|Event|Note|Absence|Shift|Topic)$")
    public void iCreateNewStory(String itemToCreate) {
        TopPanelActions.createNewItem(itemToCreate);
    }

    @When("^I click on logo image$")
    public void iClickOnLogoImage() {
        TopPanelActions.clickImageLogo();
    }

    @Then("^I navigate to Dashboard$")
    public void iNavigateToDashboard() throws InterruptedException {
        TopPanelActions.navigateTo("Dashboard");
    }

    @Then("^I navigate to (Story - planning|Story - Short-term|Story - Long-term|Story - Ideas|Story - Topics)$")
    public void iNavigateToStoryListsSubMenu(String subItemName) throws InterruptedException {
        TopPanelActions.navigateTo(subItemName);
    }

    @Then("^I navigate to Tasks$")
    public void iNavigateToTasks() throws InterruptedException {
        TopPanelActions.navigateTo("Tasks");
    }

    @Then("^I navigate to (Calendar - Editorial events|Calendar - Short-term|Calendar - Long-term|Calendar - Event Feeds)$")
    public void iNavigateToCalendarSubMenu(String subItemName) throws InterruptedException {
        TopPanelActions.navigateTo(subItemName);
    }

    @Then("^I navigate to (Management - Availability|Management - Short-term|Management - Monthly|Management - Timeline|Management - Shifts|Management - Inbox|Management - Alerts)$")
    public void iNavigateToManagementSubMenu(String subItemName) throws InterruptedException {
        TopPanelActions.navigateTo(subItemName);
    }

    @Then("^I navigate to My Schedule$")
    public void iNavigateToMySchedule() throws InterruptedException {
        TopPanelActions.navigateTo("My Schedule");
    }

    @When("^I navigate to Advanced Search$")
    public void iNavigateToAdvancedSearch() throws InterruptedException {
        TopPanelActions.navigateTo("Advanced Search");
    }
}