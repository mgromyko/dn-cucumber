package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
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
}
