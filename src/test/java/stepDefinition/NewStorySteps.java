package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObject.StoryCreationPage;

public class NewStorySteps {
    @And("^I am at new Story creation page$")
    public void iAmAtNewStoryCreationPage() throws Throwable {
        StoryCreationPage.treatStoryCreationElement().isDisplayed();
    }

    @And("^I enter Story Description \"([^\"]*)\"$")
    public void iEnterStoryDescription(String text) throws Throwable {
        StoryCreationPage.descriptionTextArea().sendKeys(text);
    }

    @And("^I add (Text|Photo|Photo Gallery|Graphic|Video|Audio) to Story$")
    public void iAddItemToStory(String itemName) throws Throwable {
        switch (itemName){
            case "Text":
                StoryCreationPage.addTextIcon().click();
                break;
            case "Photo":
                StoryCreationPage.addPhotoIcon().click();
                break;
            case "Photo Gallery":
                StoryCreationPage.addPhotoGalleryIcon().click();
                break;
            case "Graphic":
                StoryCreationPage.addGraphicIcon().click();
                break;
            case "Video":
                StoryCreationPage.addVideoIcon().click();
                break;
            case "Audio":
                StoryCreationPage.addAudioIcon().click();
                break;
        }
    }

    @Then("^I click Save Story bottom$")
    public void iClickSaveStoryBottom() throws Throwable {
        StoryCreationPage.saveBtnBottom().click();
    }

    @Then("^I click Save Story top link$")
    public void iClickSaveStoryTop() throws Throwable {
        StoryCreationPage.saveLinkTop().click();
    }
}
