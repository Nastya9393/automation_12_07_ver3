package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            System.setProperty("mebdriver.chrome.driver", "/home/nastya/IdeaProjects/automation_12_07/src/main/" +
                    "resources/chromedriver" );

            driver = new ChromeDriver();

                }

        return driver;


}

}
