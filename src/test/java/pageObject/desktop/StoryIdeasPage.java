package pageObject.desktop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

public class StoryIdeasPage {
    static WebDriver driver = Driver.getCurrentDriver();

    public static WebElement textInSection(String expectedText, String sectionName) {
        return driver.findElement(By.xpath("//div[@class='sectionHeading' and span/text()='" + sectionName + "']/following-sibling::div//*[contains(text(),'" + expectedText + "')]"));

    }
}
