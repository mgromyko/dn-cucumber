package pageAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.DashboardPage;
import webDriver.Driver;

public class DashboardPageActions {
    static WebDriver driver = Driver.getCurrentDriver();
    static WebDriverWait wait = new WebDriverWait(driver, 10);

    public static void verifyPageIsActive() {
        DashboardPage.treatDashboardElement().isDisplayed();
    }

    public static void verifyItemDisplayedAtStoryList(String storyName) {
        DashboardPage.StoryList.storyTitle(storyName).isDisplayed();
    }
}