package page;

import Driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    String pageURL = "";
    WebDriver driver = DriverSingleton.getDriver();

    public WebElement lookForElement(By by) {
        return driver.findElement(by);

    }
}