package page.ConfirmationPage;

import Driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.BasePage;

public class ConfirmationPage extends BasePage {

    WebDriver driver = DriverSingleton.getDriver();
       By confirmationWindow = By.xpath("*//[@id*\"login-form\"]/div[2]/div");
        public WebElement lookForElement(By by) {
            return driver.findElement(by);
        }

        public boolean inDisplayed() {
            return lookForElement(confirmationWindow).isDisplayed();
        }

    }



