package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

public class AdvancedSearchPage {
    static WebDriver driver = Driver.getCurrentDriver();

    public static WebElement assignedToRadioBtn(String radioBtnLabel){
        return driver.findElement(By.xpath("//div[contains(@class,'search-story-assignee')]//span[@class='radioSpanLabel' and text()='" + radioBtnLabel + "']"));
    }
}
