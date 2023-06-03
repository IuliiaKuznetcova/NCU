package E2E.tests;

import org.testng.annotations.Test;

public class StudentDirectoryTest extends BaseTest{

    @Test
    public void goToStudentDirectory() {
        signInPage.loginMalik();
        hederPage.clickStudentDirectoryButton();
        studetnDirectoryPage.displayWelcomeTextOnStudentPage();
        hederPage.displayStudentDirectoryButton();
        hederPage.clickStudentDirectoryButton();
    }
}
