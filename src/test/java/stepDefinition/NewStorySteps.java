package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageAction.desktop.StoryCreationPageActions;

public class NewStorySteps {
    @And("^I am at new Story creation page$")
    public void iAmAtNewStoryCreationPage() {
        StoryCreationPageActions.verifyPageIsActive();
    }

    @And("^I enter Story Description \"([^\"]*)\"$")
    public void iEnterStoryDescription(String storyDescription) {
        StoryCreationPageActions.setDescription(storyDescription);
    }

    @And("^I add (Text|Photo|Photo Gallery|Graphic|Video|Audio) task to Story$")
    public void iAddTaskToStory(String storyTaskName) {
        StoryCreationPageActions.addTask(storyTaskName);
    }

    @Then("^I click Save Story bottom$")
    public void iClickSaveStoryBottom() {
        StoryCreationPageActions.clickSaveBtn();
    }

    @Then("^I click Save Story top link$")
    public void iClickSaveStoryTop() {
        StoryCreationPageActions.clickSaveTopLink();
    }

    @Then("^I click (SAVE|SAVE & NEXT|CANCEL) bottom button$")
    public void iClickSAVENEXTCANCELBottomButton(String btnLabel) {
        switch (btnLabel) {
            case "SAVE":
                StoryCreationPageActions.clickSaveBtn();
                break;
            case "SAVE & NEXT":
                StoryCreationPageActions.clickSaveAndNextBtn();
                break;
            case "Cancel":
                StoryCreationPageActions.clickCancelBtn();
                break;
        }
    }

    @And("^I delete first Text article at Tasks Panel$")
    public void iDeleteFirstTextArticleAtTasksPanel() {
        StoryCreationPageActions.deleteFirstTextArticle();
    }
}
