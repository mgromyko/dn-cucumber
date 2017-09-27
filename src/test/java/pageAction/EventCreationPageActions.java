package pageAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.EventCreationPage;
import webDriver.Driver;

public class EventCreationPageActions {
    static WebDriver driver = Driver.getCurrentDriver();
    static WebDriverWait wait = new WebDriverWait(driver, 10);
    static Actions action = new Actions(driver);

    public static void callContextMenuForElement(WebElement ele) {
        action.moveToElement(ele).perform();
    }

    public static void verifyPageIsActive() {
        EventCreationPage.treatEventCreationPage().isDisplayed();
    }

    public static void setDescription(String description) {
        EventCreationPage.descriptionTextArea().sendKeys(Driver.timeStamp + "-" + description);
    }

    public static void deleteArticle(WebElement ele) {
        callContextMenuForElement(ele);
        EventCreationPage.TasksPanel.deleteLinkContextMenu().click();
    }

    public static void setPlatformCategory(String categoryName) {
        //TODO: verify if required platfor is already selected
        System.out.println(EventCreationPage.PlatformsPanel.selectCategory().getText());
        EventCreationPage.PlatformsPanel.selectCategory().click();
        wait.until(ExpectedConditions.visibilityOf(EventCreationPage.PlatformsPanel.selectCategoryPopUp(categoryName)));
        EventCreationPage.PlatformsPanel.selectCategoryPopUp(categoryName).click();
    }

    public static void setPublicationDate(String pubDate) {
        EventCreationPage.PlatformsPanel.publicationDate().click();
        EventCreationPage.PlatformsPanel.publicationDatePopUp(pubDate).click();
    }

    public static void addTask(String taskName) {
        switch (taskName) {
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

    public static void addPlatform(String platformName) {
        EventCreationPage.PlatformsPanel.addPlatform(platformName).click();
    }

    public static void clickSaveTopLink() {
        EventCreationPage.saveLinkTop().click();
    }
}
