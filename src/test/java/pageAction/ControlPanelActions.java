package pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

    public static String getStatusFilterDescription(){
        return ControlPanel.statusFilterDescription().getText();
    }

    public static String getTasksFilterDescription(){
        return ControlPanel.tasksFilterDescription().getText();
    }

    public static String getUsersFilterDescription(){
        return ControlPanel.usersFilterDescription().getText();
    }

    public static String getActiveFiltersText(){
        return ControlPanel.activeFilters().getText();
    }

    public static void scrollFiltersTo(String filterName){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//div[@class='overview-scroll']//span[text()='" + filterName + "']")));
    }
}