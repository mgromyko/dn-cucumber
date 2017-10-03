package pageAction;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class BrowserActions extends BasePageActions {

    public static void openUrl(String websiteUrl) {
        driver.get(websiteUrl);
        wait.until(ExpectedConditions.titleContains("Desk-Net"));
    }
}