package Test_Bank.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Test_Bank.Driver.DriverSingleton;

import java.util.concurrent.TimeUnit;

public class BasePage {
    private static WebDriver driver = DriverSingleton.getDriver();

    public WebElement lookForElement(By by) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver.findElement(by);
    }

    protected void open(String pageURL) {
    }
}