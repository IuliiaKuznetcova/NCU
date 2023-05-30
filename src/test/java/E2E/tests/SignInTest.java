package E2E.tests;

import E2E.pages.*;
import E2E.pages.gast.HederPage;
import E2E.pages.student.StudentDetailsPage;
import E2E.pages.student.StudentHomePage;
import E2E.pages.student.StudetnDirectoryPage;
import org.junit.Test;

public class SignInTest extends BaseTest {
    SignInPage signInPage = new SignInPage();
    HederPage hederPage = new HederPage();
    StudetnDirectoryPage studentDirectoryPage = new StudetnDirectoryPage();
    StudentDetailsPage studentDetailsPage = new StudentDetailsPage();
    StudentHomePage studentHomePage = new StudentHomePage();

    @Test
    public void loginWitStudentValidCredentials() {

        signInPage.clickSignInButton();
        signInPage.displayRegistrationForm();
        signInPage.enterEmail("malik@example.com");
        signInPage.enterPassword("123456");
        signInPage.clickSignInButtonInRegistrForm();
        hederPage.displayStudentDirectoryButton();
    }

    @Test
    public void searchForCreatedStudent() {
        signInPage.clickSignInButton();
        signInPage.displayRegistrationForm();
        signInPage.enterEmail("malik@example.com");
        signInPage.enterPassword("123456");
        signInPage.clickSignInButtonInRegistrForm();
        hederPage.displayStudentDirectoryButton();
        hederPage.clickStudentDirectoryButton();
        studentDirectoryPage.displayWelcomeTextOnStudentPage();
        studentDirectoryPage.fillFieldSearch("Iuliia Kuz");
        studentDirectoryPage.searchResultDisplayExactData();
        studentDirectoryPage.viewProfileButton();
        studentDetailsPage.displayStudenFullNameExactData();
        studentHomePage.signOutStudent();




    }
}