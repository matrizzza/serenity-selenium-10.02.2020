package pages;

import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@At("https://linkedin.com/feed/")
public class HomePage extends PageObject {

    @FindBy(xpath = "//input[@role='combobox']")
    private WebElement serachField;

    @FindBy(xpath = "//li[@id='profile-nav-item']")
    private WebElement profileNavItem;

    public void searchFor(String searchTerm){
        serachField.sendKeys(searchTerm);
        serachField.sendKeys(Keys.ENTER);
    }

    public boolean isPageLoaded(){
        return profileNavItem.isDisplayed();
    }
}
