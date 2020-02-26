package tests;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.TestData;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

@RunWith(SerenityParameterizedRunner.class)
public class SearchTest extends BaseTest {
    private String searchTerm;

    public SearchTest(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    @TestData
    public static Collection<Object[]> testData(){
        return Arrays.asList(new Object[][]{
                {"HR"},
                {"hr"},
                {"Human Resources"}
        });
    }

    @Before
    public void before() {
        user
                .auth()
                .login("matrizzza@gmail.com", "!$6gMPQzDN&cE_)");
    }

    @Test
    public void searchBySearchTermTest() {
        user
                //.validatePageTitle("LinkedIn")
                .homePage()
                .validateHomePageIsLoaded()
                .searchFor(searchTerm);
        user
                //.validatePageTitle("\"hr\" | Поиск | LinkedIn")
                .searchPage()
                .validateSearchPageIsLoaded()
                .verifyEachResultContains("h");
    }
}
