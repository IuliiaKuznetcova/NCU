package E2E.tests;

import E2E.pages.helpers.CourseHelper;
import E2E.pages.teacher.TeacherDirectoryPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$x;

public class SearchTests extends BaseTest {
    CourseHelper courseHelper = new CourseHelper();
    TeacherDirectoryPage teacherDirectoryPage = new TeacherDirectoryPage();

    @Test
    public void searchInformationAboutThisCourseGrowthMarketing() throws InterruptedException {
        signInPage.loginMalik();
        studentHomePage.goToCoursesPage();
        courseHelper.searchCourseWithCheck("Growth Marketing");
        studentGrowthMarketingCourseDetails.tyknutTut();
        studentGrowthMarketingCourseDetails.viewAboutThisCourse();
    }

    @Test
    public void searchForTeacherInTheCourseGrowthMarketing() throws InterruptedException {
        signInPage.loginMalik();
        studentHomePage.goToCoursesPage();
        courseHelper.searchCourseWithCheck("Growth Marketing");
        studentGrowthMarketingCourseDetails.tyknutTut();
        studentGrowthMarketingCourseDetails.viewAboutThisCourse();
        // TODO сделать проверку на содержание раздела с преподавателями
    }

    @Test
    public void searchForAnExistingStudent() throws InterruptedException {
        signInPage.clickSignInButton();
        signInPage.loginMalik();
        signInPage.clickSignInButtonInRegistrForm();
        hederPage.displayStudentDirectoryButton();
        hederPage.clickStudentDirectoryButton();
        studentDirectoryPage.displayWelcomeTextOnStudentPage();
        courseHelper.searchStudentWithCheck("Michael Thomas");
        studentDetailsPage.backToStudentDirectory();
        studentHomePage.checkSignOutStudent();
    }

    @Test
    public void searchForAnExistingProfessor() throws InterruptedException {
        signInPage.clickSignInButton();
        signInPage.loginMalik();
        signInPage.clickSignInButtonInRegistrForm();
        Thread.sleep(1000);
        hederPage.displayProfessorDirectoryButton();
        hederPage.clickProfessorDirectoryButton();
        Thread.sleep(1000);
        studentHomePage.displayTitleProfessorSpotlight();
        courseHelper.searchProfessorWithCheck("Marie Curie");
        //studentDetailsPage.backToStudentDirectory();
        //studentHomePage.checkSignOutStudent();
    }

}
