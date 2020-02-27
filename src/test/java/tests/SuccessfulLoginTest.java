package tests;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.TestData;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

@RunWith(SerenityParameterizedRunner.class)
public class SuccessfulLoginTest extends BaseTest {
    private String userEmail;
    private String userPassword;

    public SuccessfulLoginTest(String userEmail, String userPassword) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    @TestData
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {"matrizzza@gmail.com", "!$6gMPQzDN&cE_)"},
                {"MATRIZZZA@gmail.com", "!$6gMPQzDN&cE_)"},
                {"MATRIZZZA@GMAIL.COM", "!$6gMPQzDN&cE_)"}
        });
    }

    @Test
    public void successfulLogin() {
        user
                .auth()
                .openLandingPage()
                .login(userEmail, userPassword);
        user
                .homePage()
                .validateHomePageIsLoaded();
    }
}
