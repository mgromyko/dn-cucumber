package pageObject.desktop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

public class DashboardPage extends ControlPanel {
    static WebDriver driver = Driver.getCurrentDriver();

    public static WebElement treatDashboardElement() {
        return driver.findElement(By.xpath("//span[@class='controlHeader' and text()='Dashboard']"));
    }

    public static class StoryList {
        public static WebElement storyTitle(String expectedTitle) {
            return driver.findElement(By.xpath("//span[@class='elementTitleContent']/a[contains(text(),'" + expectedTitle + "')]"));
        }
    }
}
