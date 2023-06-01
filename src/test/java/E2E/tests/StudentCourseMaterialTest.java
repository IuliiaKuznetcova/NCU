package E2E.tests;

import E2E.pages.SignInPage;
import E2E.pages.gast.HederPage;
import E2E.pages.student.StudentGrowthMarketingCourseDetails;
import E2E.pages.student.StudetnDirectoryPage;

public class StudentCourseMaterialTest extends BaseTest{

    SignInPage signInPage = new SignInPage();
    HederPage hederPage = new HederPage();
    StudetnDirectoryPage studetnDirectoryPage = new StudetnDirectoryPage();
    StudentGrowthMarketingCourseDetails studentGrowthMarketingCourseDetails = new StudentGrowthMarketingCourseDetails();
public void metod() {

        signInPage.clickSignInButton();
        signInPage.displayRegistrationForm();
        signInPage.loginAction("malik@example.com","123456");
        hederPage.clickStudentDirectoryButton();
        studetnDirectoryPage.displayWelcomeTextOnStudentPage();
        hederPage.displayStudentDirectoryButton();
        hederPage.clickStudentDirectoryButton();
}
}
