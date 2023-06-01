package E2E.tests;

import E2E.pages.SignInPage;
import E2E.pages.student.StudentCourseList;
import E2E.pages.student.StudentGrowthMarketingCourseDetails;
import E2E.pages.student.StudentHomePage;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class StudentCourseListPageTest extends BaseTest{
    StudentCourseList studentCourseList = new StudentCourseList();
    SignInPage signInPage = new SignInPage();
    StudentHomePage studentHomePage = new StudentHomePage();
    StudentGrowthMarketingCourseDetails studentGrowthMarketingCourseDetails = new StudentGrowthMarketingCourseDetails();


    @Test
    public void checkElemenOnCourseList() {
        signInPage.loginMalik();
        studentHomePage.goToCoursePage();
        studentCourseList.shouldBeElementOnComputerScienceCourse();
        studentCourseList.shouldBeElementOnGrowthMarketingCourse();
    }

    @Test
    public void searchCourse() {
        signInPage.loginMalik();
        studentHomePage.goToCoursePage();
        studentCourseList.fillFieldSearch("Growth Marketing");
        studentCourseList.searchResultDisplayExactData("Growth Marketing");
        studentCourseList.goToCourseFromSearchResult();
        studentGrowthMarketingCourseDetails.displayGrowthMarketingTitleCourse("Growth Marketing");

    }
}
