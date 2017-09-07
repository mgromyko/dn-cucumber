package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

public class TopPanel {
    static WebDriver driver = Driver.getCurrentDriver();

    public static WebElement menuHamburger(){
        return driver.findElement(By.xpath("//a[@class='menu-hamburger']"));
    }

    public static WebElement logoutBtn(){
        return driver.findElement(By.xpath("//*[@id='logoutId']"));
    }

    public static WebElement selectedMenuItem(){
        return driver.findElement(By.xpath("//*[@class='gwt-Anchor menu-item main-menu-selected']"));
    }
}
