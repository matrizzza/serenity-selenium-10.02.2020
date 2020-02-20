package steps;

import net.thucydides.core.steps.ScenarioSteps;
import pages.SearchPage;

public class SearchSteps extends ScenarioSteps {

    private SearchPage searchPage;

    public SearchSteps validateSearchPageIsLoaded() {
        return this;
    }

    public SearchSteps verifyEachResultContains(String searchTerm) {
        // реализовать метод !! HW#3
        return this;
    }
}
