package steps;

import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.SearchPage;

import static org.hamcrest.Matchers.*;

public class SearchSteps extends ScenarioSteps {

    private SearchPage searchPage;

    public SearchSteps validateSearchPageIsLoaded() {
        Assert.assertTrue(searchPage.isPageLoaded());
        return this;
    }

    public SearchSteps verifyEachResultContains(String searchTerm) {
        // реализовать метод !! HW#3
        for (WebElement searchResult: searchPage.getSearchResults()
             ) {
            ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", searchResult);
            Assert.assertThat(searchResult.getText().toLowerCase(), containsString(searchTerm));
        }
        return this;
    }
}
