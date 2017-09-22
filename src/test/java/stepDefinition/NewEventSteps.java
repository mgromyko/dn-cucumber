package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObject.EventCreationPage;
import webDriver.Driver;

public class NewEventSteps {
    @And("^I am at new Event creation page$")
    public void iAmAtNewEventCreationPage() throws Throwable {
        EventCreationPage.treatEventCreationPage().isDisplayed();
    }

    @And("^I enter Event Description \"([^\"]*)\"$")
    public void iEnterEventDescription(String text) throws Throwable {
        EventCreationPage.descriptionTextArea().sendKeys(Driver.timeStamp + "-" + text);
    }

    @And("^I add (Text|Photo|Photo Gallery|Graphic|Video|Audio|Live) task to Event$")
    public void iAddTaskToEvent(String itemName) throws Throwable {
        switch (itemName){
            case "Text":
                EventCreationPage.TasksPanel.addTextIcon().click();
                break;
            case "Photo":
                EventCreationPage.TasksPanel.addPhotoIcon().click();
                break;
            case "Photo Gallery":
                EventCreationPage.TasksPanel.addPhotoGalleryIcon().click();
                break;
            case "Graphic":
                EventCreationPage.TasksPanel.addGraphicIcon().click();
                break;
            case "Video":
                EventCreationPage.TasksPanel.addVideoIcon().click();
                break;
            case "Audio":
                EventCreationPage.TasksPanel.addAudioIcon().click();
                break;
            case "Live":
                EventCreationPage.TasksPanel.allTasksBtn().click();
                EventCreationPage.TasksPanel.allTasksElementPopUp("Live").click();
                break;
        }
    }

    @Then("^I add \"([^\"]*)\" platform to Event$")
    public void iAddPlatformToEvent(String platformName) throws Throwable {
        EventCreationPage.PlatformsPanel.addPlatform(platformName).click();
    }

    @Then("^I set platform category to \"([^\"]*)\"$")
    public void iSetPlatformCategoryTo(String categoryName) throws Throwable {
        EventCreationPage.PlatformsPanel.selectCategory().click();
        EventCreationPage.PlatformsPanel.selectCategoryPopUp(categoryName).click();
    }

    @And("^I set publication date to \"([^\"]*)\"$")
    public void iSetPublicationDateTo(String pubDate) throws Throwable {
        EventCreationPage.PlatformsPanel.publicationDate().click();
        EventCreationPage.PlatformsPanel.publicationDatePopUp(pubDate).click();
    }
}
