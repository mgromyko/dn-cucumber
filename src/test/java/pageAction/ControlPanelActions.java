package pageAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.ControlPanel;
import pageObject.LoginPage;
import webDriver.Driver;

public class ControlPanelActions {
    static WebDriver driver = Driver.getCurrentDriver();
    static WebDriverWait wait = new WebDriverWait(driver, 10);

    public static void clickMoreFiltersLink(){
        ControlPanel.moreFiltersLink().click();
    }

    public static void clickHideFiltersLink(){
        ControlPanel.hideFiltersLink().click();
    }

    public static WebElement getStatusFilterDescription(){
        return ControlPanel.statusFilterDescription();
    }

    public static WebElement getTasksFilterDescription(){
        return ControlPanel.tasksFilterDescription();
    }

    public static WebElement getUsersFilterDescription(){
        return ControlPanel.usersFilterDescription();
    }
}
