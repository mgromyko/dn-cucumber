package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.junit.Assert;
import pageAction.TopPanelActions;
import pageObject.TopPanel;

public class TopPanelSteps {
    @And("^I verify that \"([^\"]*)\" is selected in navigation panel menu$")
    public void iVerifyThatIsSelectedInNavigationPanelMenu(String expectedMenuItem) throws Throwable {
        Assert.assertTrue(TopPanelActions.getSelectedTopPanelMenuItem().equalsIgnoreCase(expectedMenuItem));
    }
}
