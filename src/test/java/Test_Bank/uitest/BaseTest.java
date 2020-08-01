package Test_Bank.uitest;

import Test_Bank.Driver.DriverSingleton;
import org.testng.annotations.AfterMethod;

public class BaseTest {

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        DriverSingleton.closeDriver();
    }
}
