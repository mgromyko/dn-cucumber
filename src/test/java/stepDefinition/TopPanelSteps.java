package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageAction.TopPanelActions;
import pageObject.TopPanel;

public class TopPanelSteps {
    @And("^I verify that \"([^\"]*)\" is selected in navigation panel menu$")
    public void iVerifyThatIsSelectedInNavigationPanelMenu(String expectedMenuItem) throws Throwable {
        Assert.assertTrue(TopPanelActions.getSelectedTopPanelMenuItem().equalsIgnoreCase(expectedMenuItem));
    }

    @Then("^I create a new (Story|Event|Note|Absence|Shift|Topic)$")
    public void iCreateNewStory(String itemToCreate) throws Throwable {
        TopPanel.callItemsToCreatePopUp().click();
        TopPanel.selectItemToCreatePopUp(itemToCreate).click();
    }

    @When("^I click on logo image$")
    public void iClickOnLogoImage() throws Throwable {
        TopPanel.imageLogo().click();
    }

    @Then("^I navigate to Dashboard$")
    public void iNavigateToDashboard() throws Throwable {
        TopPanel.mainMenuNavigationItem("Dashboard").click();
    }

    @Then("^I navigate to Story Lists - (Story planning|Short-term|Long-term|Story Ideas|Topics)$")
    public void iNavigateToStoryListsSubMenu(String subItemName) throws Throwable {
        TopPanelActions.callSecondaryMenuForNavigationItem(TopPanel.mainMenuNavigationItem("Story Lists"));
        TopPanel.secondaryMenuNavigationItem(subItemName).click();
    }

    @Then("^I navigate to Tasks$")
    public void iNavigateToTasks() throws Throwable {
        TopPanel.mainMenuNavigationItem("Tasks").click();
    }

    @Then("^I navigate to Calendar - (Editorial events|Short-term|Long-term|Event Feeds)$")
    public void iNavigateToCalendarSubMenu(String subItemName) throws Throwable {
        TopPanelActions.callSecondaryMenuForNavigationItem(TopPanel.mainMenuNavigationItem("Calendar"));
        TopPanel.secondaryMenuNavigationItem(subItemName).click();
    }

    @Then("^I navigate to Management - (Availability|Short-term|Monthly|Timeline|Shifts|Inbox|Alerts)$")
    public void iNavigateToManagementSubMenu(String subItemName) throws Throwable {
        TopPanelActions.callSecondaryMenuForNavigationItem(TopPanel.mainMenuNavigationItem("Management"));
        TopPanel.secondaryMenuNavigationItem(subItemName).click();
    }

    @Then("^I navigate to My Schedule$")
    public void iNavigateToMySchedule() throws Throwable {
        TopPanel.mainMenuNavigationItem("My Schedule").click();
    }

    @When("^I navigate to Advanced Search$")
    public void iNavigateToAdvancedSearch() throws Throwable {
        TopPanelActions.clickOnAdvancedSearchLink();
    }
}