package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.core.Every;
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
    public SearchSteps verifyEachResultContains(String searchTerm) {
        Assert.assertThat("SearchTerm not found.", searchPage.getSearchResults(), Every.everyItem(containsString(searchTerm)));
        return this;
    }
}
