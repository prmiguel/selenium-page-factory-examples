package test.automation.examples.cura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(css = "#txt-username")
    private WebElement usernameTextField;

    @FindBy(css = "#txt-password")
    private WebElement passwordTextField;

    @FindBy(css = "#btn-login")
    private WebElement loginButton;

    public LoginPage(WebDriver wd) {
        PageFactory.initElements(wd, this);
    }

    public void loginWithCredentials(String username, String password) {
        usernameTextField.sendKeys(username);
        passwordTextField.sendKeys(password);
        loginButton.click();
    }
}
