package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import pages.HomePage;

import static org.hamcrest.Matchers.is;

public class HomeSteps extends ScenarioSteps {
    private HomePage homePage;


    @Step
    public HomeSteps searchFor(String searchTerm) {
        homePage.searchFor(searchTerm);
        waitABit(1500);
        return this;
    }

    @Step
    public HomeSteps validateHomePageIsLoaded() {
        Assert.assertTrue("Page is not loaded", homePage.isPageLoaded());
        return this;
    }
}
