package E2E.tests;

import E2E.pages.*;
import E2E.pages.gast.HederPage;
import E2E.pages.student.*;
import org.junit.jupiter.api.Test;


public class SignInTest extends BaseTest {
    SignInPage signInPage = new SignInPage();
    HederPage hederPage = new HederPage();
    StudetnDirectoryPage studentDirectoryPage = new StudetnDirectoryPage();
    StudentDetailsPage studentDetailsPage = new StudentDetailsPage();
    StudentHomePage studentHomePage = new StudentHomePage();
    StudetnDirectoryPage studetnDirectoryPage = new StudetnDirectoryPage();
    StudentCoursrList studentCoursrList = new StudentCoursrList();
    StudentGrowthMarketingCourseDetails studentGrowthMarketingCourseDetails = new StudentGrowthMarketingCourseDetails();
    @Test
    public void visibilityOfDocumentsSharingOnStudentPage () {

        signInPage.loginAction("malik@example.com","123456");
        hederPage.displayStudentDirectoryButton();
        hederPage.clickStudentDirectoryButton();
        studetnDirectoryPage.displayWelcomeTextOnStudentPage();
        studentHomePage.goToCoursePage();
        studentCoursrList.displayOurCourseTitle();
        studentCoursrList.goToGrowthMarketingCourse();
        studentGrowthMarketingCourseDetails.displayGrowthMarketingTitleCourse("Growth Marketing");
        //studentGrowthMarketingCourseDetails.existsUploadCourseMaterialButton("Upload");
        //studentGrowthMarketingCourseDetails.onExistsUploadCourseMaterialButton("Upload");
    }


    @Test
    public void loginWitStudentValidCredentials() {

        signInPage.clickSignInButton();
        signInPage.displayRegistrationForm();
        signInPage.enterEmail("malik@example.com");
        signInPage.enterPassword("123456");
        signInPage.clickSignInButtonInRegistrForm();
        hederPage.displayStudentDirectoryButton();
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