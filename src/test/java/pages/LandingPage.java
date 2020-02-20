package pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.linkedin.com/")
public class LandingPage extends PageObject {
//    @FindBy(xpath = "/html/body/nav/a[3]")
//    WebElement singInButton;
//
//    @FindBy(xpath = "//*[@id=\"username\"]")
//    WebElement userEmailField;
//
//    @FindBy(xpath = "//*[@id=\"password\"]")
//    WebElement userPasswordField;
//
//    @FindBy(xpath = "//button[@aria-label='Sign in']")
//    WebElement logginButton;

    @FindBy(xpath = "//input[@name='session_key']")
    private WebElement userEmailField;

    @FindBy(xpath = "//input[@name='session_password']")
    private WebElement userPasswordField;

    @FindBy(xpath = "//button[@aria-label='i18n_sign-in']")
    private WebElement loginButton;

    public void login(String userEmail, String userPassword){
        userEmailField.sendKeys(userEmail);
        userPasswordField.sendKeys(userPassword);
        loginButton.click();
    }
}
