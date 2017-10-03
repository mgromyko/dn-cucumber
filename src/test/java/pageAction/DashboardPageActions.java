package pageAction;

import pageObject.DashboardPage;

public class DashboardPageActions extends BasePageActions {

    public static void verifyPageIsActive() {
        DashboardPage.treatDashboardElement().isDisplayed();
    }

    public static void verifyItemDisplayedAtStoryList(String storyName) {
        DashboardPage.StoryList.storyTitle(storyName).isDisplayed();
    }
}