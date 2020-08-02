package Test_Bank.Driver;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



public class DriverSingleton {
    static Logger log = LogManager.getRootLogger();

    private static WebDriver driver;
    private DriverSingleton() {
            }

    public static WebDriver getDriver() {

        if (driver == null) {
            System.setProperty("mebdriver.chrome.driver", "/home/nastya/IdeaProjects/automation_12_07/src/main/" +
                    "resources/chromedriver" );

            driver = new ChromeDriver();
            EventFiringWebDriver dr = new EventFiringWebDriver(new ChromeDriver());


                }

        return driver;


}

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
