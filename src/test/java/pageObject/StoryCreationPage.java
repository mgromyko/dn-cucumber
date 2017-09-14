package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

public class StoryCreationPage {
    static WebDriver driver = Driver.getCurrentDriver();

    public static WebElement treatStoryCreationElement(){
        return driver.findElement(By.xpath("//div[@class='headTitle']/span[text()='Story']"));
    }

    public static WebElement descriptionTextArea(){
        return driver.findElement(By.xpath("//div[@class='editable-panel-deck' and contains(.//a, 'Enter description here')]/div/textarea"));
    }

    public static WebElement addTextIcon(){
        return driver.findElement(By.xpath("//td[@class='add-publication']/div/div[1]"));
    }

    public static WebElement addPhotoIcon(){
        return driver.findElement(By.xpath("//td[@class='add-publication']/div/div[2]"));
    }

    public static WebElement addPhotoGalleryIcon(){
        return driver.findElement(By.xpath("//td[@class='add-publication']/div/div[3]"));
    }

    public static WebElement addGraphicIcon(){
        return driver.findElement(By.xpath("//td[@class='add-publication']/div/div[4]"));
    }

    public static WebElement addVideoIcon(){
        return driver.findElement(By.xpath("//td[@class='add-publication']/div/div[5]"));
    }

    public static WebElement addAudioIcon(){
        return driver.findElement(By.xpath("//td[@class='add-publication']/div/div[6]"));
    }

    public static WebElement saveLinkTop(){
        return driver.findElement(By.xpath("//div[@class='saveLinks']/a[text()='Save']"));
    }

    public static WebElement cancelLinkTop(){
        return driver.findElement(By.xpath("//div[@class='saveLinks']/a[text()='Cancel']"));
    }

    public static WebElement saveBtnBottom(){
        return driver.findElement(By.xpath("//div[@class='buttons-bottom']/a[text()='Save']"));
    }

    public static WebElement saveAndNextBtnBottom(){
        return driver.findElement(By.xpath("//div[@class='buttons-bottom']/a[text()='Save & Next']"));
    }

    public static WebElement cancelBtnBottom(){
        return driver.findElement(By.xpath("//div[@class='buttons-bottom']/a[text()='Cancel']"));
    }

    public static class TasksPanel{
        public static WebElement textArticleLabel(){
            return driver.findElement(By.xpath("//div[@class='removeBlock']/div[text()='Text']"));
        }

        public static WebElement deleteLinkContextMenu(){
            return driver.findElement(By.xpath("//a[@class='gwt-Anchor' and text()='Delete']"));
        }
    }

}