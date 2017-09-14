package pageAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.StoryCreationPage;
import webDriver.Driver;

public class StoryCreationPageActions {
    static WebDriver driver = Driver.getCurrentDriver();
    static WebDriverWait wait = new WebDriverWait(driver, 10);
    static Actions action = new Actions(driver);

    public static void callContextMenuForElement(WebElement ele){
        action.moveToElement(ele).perform();
    }

    public static void deleteArticle(WebElement ele){
        callContextMenuForElement(ele);
        StoryCreationPage.TasksPanel.deleteLinkContextMenu().click();
    }
}
