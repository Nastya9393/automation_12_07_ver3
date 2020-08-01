package Test_Bank.uitest;


import org.testng.annotations.AfterMethod;
import Test_Bank.Driver.DriverSingleton;

public class BaseTest {

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        DriverSingleton.closeDriver();
    }
}

