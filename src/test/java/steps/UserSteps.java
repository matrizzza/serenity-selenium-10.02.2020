package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

import static org.hamcrest.Matchers.is;

public class UserSteps extends ScenarioSteps {

    @Steps
    HomeSteps homeSteps;
    @Steps
    LoginSteps loginSteps;
    @Steps
    SearchSteps searchSteps;

    public HomeSteps homePage() {
        return homeSteps;
    }

    public LoginSteps auth(){
        return loginSteps;
    }

    public SearchSteps searchPage(){
        return searchSteps;
    }

    @Step
    public UserSteps validatePageTitle(String pageTitle){
        Assert.assertThat("Wrong page title!", getDriver().getTitle(), is("LinkedIn"));
        return this;
    }
}
