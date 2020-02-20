package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class SearchTest extends BaseTest {

    @Before
    public void before() {
        user
                .auth()
                .login("matrizzza@gmail.com", "!$6gMPQzDN&cE_)");
    }

    @Test
    public void searchBySearchTermTest() {
        user
                .validatePageTitle("")
                .homePage()
                .validateHomePageIsLoaded()
                .searchFor("hr");
        user
                .validatePageTitle("")
                .searchPage()
                .validateSearchPageIsLoaded()
                .verifyEachResultContains("hr");
    }
}
