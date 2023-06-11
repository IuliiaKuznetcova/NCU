package E2E.tests;

import org.testng.annotations.Test;
import utils.PropertiesLoader;

public class StudentDirectoryTest extends BaseTest {
    private String emailMalik = PropertiesLoader.loadProperties("emailMalik");
    private String passwordMalik = PropertiesLoader.loadProperties("passwordMalik");

    @Test
    public void goToStudentDirectory() throws InterruptedException {
        signInPage.loginMalik();
        hederPage.clickStudentDirectoryButton();
        studetnDirectoryPage.displayWelcomeTextOnStudentPage();
        hederPage.displayStudentDirectoryButton();
        hederPage.clickStudentDirectoryButton();
    }

    @Test
    public void loginWitStudentValidCredentials() throws InterruptedException {
        signInPage.clickSignInButton();
        signInPage.loginAction(emailMalik, passwordMalik);
        hederPage.clickStudentDirectoryButton();
        studetnDirectoryPage.displayWelcomeTextOnStudentPage();
    }

}
