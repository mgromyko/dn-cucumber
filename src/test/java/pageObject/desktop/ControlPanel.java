package pageObject.desktop;

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

    public static WebElement checkedFilterParentOption(String optionName) {
        return driver.findElement(By.xpath("//td[div/a/@class='aCheckBox checked']/following-sibling::td/div[text()='" + optionName + "']"));
    }

    public static WebElement uncheckedFilterParentOption(String optionName) {
        return driver.findElement(By.xpath("//td[div/a/@class='aCheckBox']/following-sibling::td/div[text()='" + optionName + "']"));
    }

    public static WebElement checkedFilterChildOption(String optionName) {
        return driver.findElement(By.xpath("//div[a/@class='aCheckBox checked']//*[text()='" + optionName + "']"));
    }

    public static WebElement uncheckedFilterChildOption(String optionName) {
        return driver.findElement(By.xpath("//div[a/@class='aCheckBox']//*[text()='" + optionName + "']"));
    }

    public static WebElement cancelBtnFilterPopUp() {
        return driver.findElement(By.xpath("//div[@class='popupContent']//a[text()='Cancel']"));
    }

    public static WebElement enterBtnFilterPopUp() {
        return driver.findElement(By.xpath("//div[@class='popupContent']//a[text()='Enter']"));
    }

    public static WebElement applyBtnEnabled() {
        return driver.findElement(By.xpath("//*[@id='applyButton' and not(contains(@class,'disabled'))]"));
    }

    public static WebElement applyBtnDisabled() {
        return driver.findElement(By.xpath("//*[@id='applyButton' and contains(@class,'disabled')]"));
    }

    public static WebElement activeFilters() {
        return driver.findElement(By.xpath("//span[@class='active-filters']"));
    }
}
