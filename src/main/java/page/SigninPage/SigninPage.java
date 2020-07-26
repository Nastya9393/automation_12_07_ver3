package page.SigninPage;

import org.openqa.selenium.By;
import page.BasePage;

public class SigninPage extends BasePage {
    String pageURL = "https://idemo.bspb.ru/";
    By usernameInput = By.name("username");
    By passwordInput = By.name("password");
    By signInButton = By.id("login-button");
    By confirmationWindow = By.xpath("*//[@id*\"login-form\"]/div[2]/div");


    public static void insertLogin(String login) {
        lookForElement(usernameInput).sendKeys(login);
    }
    public void insertPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);

    }
    public void clickLoginButton(); {
        driver.findElement(signInButton).click();
    }

    @Override
    public void open() { driver.get(pageURL); }

    }




