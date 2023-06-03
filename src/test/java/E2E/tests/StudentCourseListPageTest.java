package E2E.tests;

import org.testng.annotations.Test;

public class StudentCourseListPageTest extends BaseTest{

    @Test
    public void checkFirstWidgetTitle() {
        signInPage.loginMalik();
        studentHomePage.goToCoursesPage();
        //studentCourseList.checkFirstWidgetTitle();
       // studentCourseList.checkAllWidgetTitle();
        }
    @Test
    public void searchCourse() {
        signInPage.loginMalik();
        studentHomePage.goToCoursesPage();
        studentCourseList.fillFieldSearch("Growth Marketing");
        studentCourseList.searchResultDisplayExactData("Growth Marketing");
        studentGrowthMarketingCourseDetails.displayGrowthMarketingTitleCourse("Growth Marketing");

    }
}
