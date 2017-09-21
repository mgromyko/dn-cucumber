package pageAction;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.ControlPanel;
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

    public static boolean filterIsMissing(String filterName) throws Exception {
        switch (filterName) {
            case "Status":
                try{
                    ControlPanel.statusFilterDescription();
                } catch (NoSuchElementException e){
                    return true;
                }
                return false;
            case "Tasks":
                try{
                    ControlPanel.tasksFilterDescription();
                } catch (NoSuchElementException e){
                    return true;
                }
                return false;
            case "Users":
                try{
                    ControlPanel.usersFilterDescription();
                } catch (NoSuchElementException e){
                    return true;
                }
                return false;
            default:
                throw new Exception("You have indicated wrong filter name. Allowed options: [\"Status\",\"Tasks\",\"Users\"]");
        }
    }
}