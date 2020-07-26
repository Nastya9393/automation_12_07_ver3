package uitest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.ConfirmationPage.ConfirmationPage;
import page.SigninPage.SigninPage;

import static org.testng.Assert.assertTrue;

public class LoginTest {
    SigninPage signinPage;
    ConfirmationPage confirmationPage;

    @BeforeMethod
    public void setup() {
        signinPage = new SigninPage();
        signinPage.open();

    }

    @Test
    public void successfulLoginTest() {

        signinPage.insertLogin("demo");
        signinPage.insertPassword ("demo");
        signinPage.clickLoginButton();

    assertTrue(confirmationPage.inDisplayed());

    }
    @AfterMethod
    public void tearDown() {
        signinPage = null;

    }
}
