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

    public static void callContextMenuForElement(WebElement ele){
        action.moveToElement(ele).perform();
    }

    public static void deleteArticle(WebElement ele){
        callContextMenuForElement(ele);
        EventCreationPage.TasksPanel.deleteLinkContextMenu().click();
    }

    public static void setPlatformCategory(String categoryName){
        EventCreationPage.PlatformsPanel.selectCategory().click();
        wait.until(ExpectedConditions.visibilityOf(EventCreationPage.PlatformsPanel.selectCategoryPopUp(categoryName)));
        EventCreationPage.PlatformsPanel.selectCategoryPopUp(categoryName).click();
    }
}
