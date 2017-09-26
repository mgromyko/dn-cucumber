package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageAction.EventCreationPageActions;

public class NewEventSteps {
    @And("^I am at new Event creation page$")
    public void iAmAtNewEventCreationPage() {
        EventCreationPageActions.verifyPageIsActive();
    }

    @And("^I enter Event Description \"([^\"]*)\"$")
    public void iEnterEventDescription(String text) {
        EventCreationPageActions.setDescription(text);
    }

    @And("^I add (Text|Photo|Photo Gallery|Graphic|Video|Audio|Live) task to Event$")
    public void iAddTaskToEvent(String eventTaskName) {
        EventCreationPageActions.addTask(eventTaskName);
    }

    @Then("^I add \"([^\"]*)\" platform to Event$")
    public void iAddPlatformToEvent(String eventPlatformName) {
        EventCreationPageActions.addPlatform(eventPlatformName);
    }

    @Then("^I set platform category to \"([^\"]*)\"$")
    public void iSetPlatformCategoryTo(String eventCategoryName) {
        EventCreationPageActions.setPlatformCategory(eventCategoryName);
    }

    @And("^I set publication date to \"([^\"]*)\"$")
    public void iSetPublicationDateTo(String eventPubDate) {
        EventCreationPageActions.setPublicationDate(eventPubDate);
    }

    @Then("^I click Save Event top link$")
    public void iClickSaveEventTopLink() {
        EventCreationPageActions.clickSaveTopLink();
    }
}