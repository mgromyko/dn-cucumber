package pageObject.mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

public class mLoginPage {
    private static WebDriver driver = Driver.getCurrentDriver();

    public static WebElement treatLoginPageElement() {
        return driver.findElement(By.xpath("//div[text()='LOGIN']"));
    }

    public static WebElement inputEmail() {
        return driver.findElement(By.xpath("//input[@name='j_username']"));
    }

    public static WebElement inputPassword() {
        return driver.findElement(By.xpath("//input[@name='j_password']"));
    }

    public static WebElement loginBtn() {
        return driver.findElement(By.xpath("//div[text()='LOGIN']"));
    }
}
