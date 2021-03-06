package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.core.Every;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import pages.SearchPage;

import static org.hamcrest.Matchers.*;

public class SearchSteps extends ScenarioSteps {

    private SearchPage searchPage;

    @Step
    public SearchSteps validateSearchPageIsLoaded() {
        Assert.assertTrue(searchPage.isPageLoaded());
        return this;
    }

    @Step
    @Then("I should see search result $searchTerm")
    public SearchSteps verifyEachResultContains(String searchTerm) {
        Assert.assertThat("SearchTerm not found.", searchPage.getSearchResults(), Every.everyItem(containsString(searchTerm)));
        return this;
    }

    // TODO сравнение с разными ожидаемыми результатами
    @Step
    public SearchSteps verifyEachResultContains(String[] searchTerm) {
        // Assert.assertThat("SearchTerm not found.", searchPage.getSearchResults(), Every.everyItem(isIn(searchTerm)));
        return this;
    }
}
