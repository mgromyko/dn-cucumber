package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import webDriver.Driver;

public class DashboardPage extends ControlPanel {
    static WebDriver driver = Driver.getCurrentDriver();

    public static WebElement treatDashboardElement(){
        return driver.findElement(By.xpath("//span[@class='controlHeader' and text()='Dashboard']"));
    }
}
