package E2E.tests;

import org.testng.annotations.Test;
import utils.PropertiesLoader;

public class SignInTest extends BaseTest {
    private String emailMalik = PropertiesLoader.loadProperties("emailMalik");
    private String passwordMalik = PropertiesLoader.loadProperties("passwordMalik");
    @Test
    public void visibilityOfDocumentsSharingOnStudentPage () {
        signInPage.clickSignInButton();
        signInPage.displayRegistrationForm();
        signInPage.loginAction(emailMalik, passwordMalik);
        hederPage.displayStudentDirectoryButton();
        hederPage.clickStudentDirectoryButton();
        studetnDirectoryPage.displayWelcomeTextOnStudentPage();
        studentHomePage.goToCoursesPage();
        studentCourseList.displayOurCoursesTitle();
        studentCourseList.goToGrowthMarketingCourse();
        studentGrowthMarketingCourseDetails.displayGrowthMarketingTitleCourse("Growth Marketing");
        //studentGrowthMarketingCourseDetails.existsUploadCourseMaterialButton("Upload");
        //studentGrowthMarketingCourseDetails.onExistsUploadCourseMaterialButton("Upload");
    }

    @Test
    public void loginWitStudentValidCredentials() {
        signInPage.clickSignInButton();
        signInPage.loginAction(emailMalik, passwordMalik);
        hederPage.clickStudentDirectoryButton();
        studetnDirectoryPage.displayWelcomeTextOnStudentPage();
    }

    @Test
    public void loginWitStudentValidCredentialsPr() {
        signInPage.clickSignInButton();
        signInPage.loginAction(emailMalik, passwordMalik);
        hederPage.clickStudentDirectoryButton();
        studetnDirectoryPage.displayWelcomeTextOnStudentPage();
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
        studentHomePage.checkSignOutStudent();
    }
}