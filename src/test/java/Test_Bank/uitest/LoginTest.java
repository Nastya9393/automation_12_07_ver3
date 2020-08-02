package Test_Bank.uitest;


import Test_Bank.page.ConfirmationPage.ConfirmationPage;
import Test_Bank.page.SigninPage.SigninPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest{
    ConfirmationPage confirmationPage;
    SigninPage signinPage;

    @BeforeMethod
    public void setup() {
        signinPage = new SigninPage();
        confirmationPage = new ConfirmationPage();
        signinPage.open();
        signinPage.clearLogin();
        signinPage.clearPassword();

    }

    @Test(description = "Все заполнено верно")
    public void validData() {
        signinPage.insertLogin("demo");
        signinPage.insertPassword("demo");
        signinPage.clickLoginButton();

        Assert.assertTrue(confirmationPage.isDispalyed());

    }

    @Test(description = "Все пустое")
    public void emptyFields() {
        signinPage.clickLoginButton();

    }

    @Test(description = "Поле имя пустое")
    public void oneEmptyFields() {
        signinPage.insertPassword("demo");
        signinPage.clickLoginButton();

    }
    @Test(description = "Логин, пароль неверные")
    public void wrontData() {
        signinPage.insertLogin("2525");
        signinPage.insertPassword("5555");
        signinPage.clickLoginButton();

    }

    @Override
    @AfterTest
    public void tearDown() {
        super.tearDown();
        signinPage = null;
        confirmationPage = null;
    }


}