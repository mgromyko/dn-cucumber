package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

public class ControlPanel {
    static WebDriver driver = Driver.getCurrentDriver();

    public static WebElement controlHeader() {
        return driver.findElement(By.xpath("//span[@class='controlHeader']"));
    }

    public static WebElement moreFiltersLink() {
        return driver.findElement(By.xpath("//a[contains(text(),'More filters')]"));
    }

    public static WebElement hideFiltersLink() {
        return driver.findElement(By.xpath("//a[contains(text(),'Hide filters')]"));
    }

    public static WebElement statusFilterDescription() {
        return driver.findElement(By.xpath("//span[text()='Status']/following::div[@class='comboCaption inline-list-box-label'][1]"));
    }

    public static WebElement tasksFilterDescription() {
        return driver.findElement(By.xpath("//span[text()='Tasks']/following::div[@class='comboCaption inline-list-box-label'][1]"));
    }

    public static WebElement usersFilterDescription() {
        return driver.findElement(By.xpath("//span[text()='Users']/following::div[@class='comboCaption inline-list-box-label'][1]"));
    }
}
