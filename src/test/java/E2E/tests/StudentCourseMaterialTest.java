package E2E.tests;

import E2E.pages.SignInPage;
import E2E.pages.gast.HederPage;
import E2E.pages.student.StudentCoursrList;
import E2E.pages.student.StudentGrowthMarketingCourseDetails;
import E2E.pages.student.StudentHomePage;
import E2E.pages.student.StudetnDirectoryPage;
import org.junit.jupiter.api.Test;


public class StudentCourseMaterialTest extends BaseTest{

    SignInPage signInPage = new SignInPage();
    HederPage hederPage = new HederPage();
    StudentHomePage studentHomePage = new StudentHomePage();
    StudetnDirectoryPage studetnDirectoryPage = new StudetnDirectoryPage();
    StudentCoursrList studentCoursrList = new StudentCoursrList();
    StudentGrowthMarketingCourseDetails studentGrowthMarketingCourseDetails = new StudentGrowthMarketingCourseDetails();

    @Test
    public void visibilityOfDocumentsSharingOnStudentPage() {

        signInPage.clickSignInButton();
        signInPage.displayRegistrationForm();
        signInPage.enterEmail("malik@example.com");
        signInPage.enterPassword("123456");
        signInPage.clickSignInButtonInRegistrForm();
        hederPage.displayStudentDirectoryButton();
        hederPage.clickStudentDirectoryButton();
        studetnDirectoryPage.displayWelcomeTextOnStudentPage();
        studentHomePage.goToCoursePage();
        studentCoursrList.displayOurCourseTitle();
        studentCoursrList.goToGrowthMarketingCourse();
        studentGrowthMarketingCourseDetails.displayGrowthMarketingTitleCourse("Growth Marketing");
    }
}
