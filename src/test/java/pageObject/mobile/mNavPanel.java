package pageObject.mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

public class mNavPanel {
    static WebDriver driver = Driver.getCurrentDriver();

    public static WebElement menuHamburger() {
        return driver.findElement(By.xpath("//div[@id='gwt-debug-hamburger-menu-icon-container']"));
    }

    public static WebElement menuHamburgerPopUp() {
        return driver.findElement(By.xpath("//div[contains(@class,'PopupPanel')]"));
    }

    public static WebElement itemHamburgerPopUp(String hamburgerItem) {
        return driver.findElement(By.xpath("//div[contains(@class,'PopupPanel')]//*[text()='" + hamburgerItem + "']"));
    }

    public static WebElement logoutBtn() {
        return driver.findElement(By.xpath("//div[contains(@class,'PopupPanel')]//*[text()='Log-out']"));
    }

    public static WebElement callItemsToCreatePopUp() {
        return driver.findElement(By.xpath("//div[@id='gwt-debug-add-menu-icon-container']"));
    }

    public static WebElement selectItemToCreatePopUp(String itemToCreate) {
        return driver.findElement(By.xpath("//div[contains(@class,'PopupPanel')]//*[text()='" + itemToCreate + "']"));
    }

}