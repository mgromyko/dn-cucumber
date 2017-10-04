package pageAction.desktop;

import pageAction.BasePageActions;
import pageObject.desktop.StoryIdeasPage;

public class StoryIdeasPageActions extends BasePageActions {

    public static void verifyTextInSection(String text, String section) {
        StoryIdeasPage.textInSection(text, section);
    }
}
