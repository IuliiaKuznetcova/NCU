package E2E.tests;

import org.testng.annotations.Test;

public class CourseDetailsTest extends BaseTest{

    @Test
    public void searchForTiecherInTheCourseGrowthMarketing() {
        signInPage.loginMalik();
        studentHomePage.goToCoursesPage();
        studentCourseList.fillFieldSearch("Growth Marketing");
        studentCourseList.searchResultDisplayExactData("Growth Marketing");
        studentCourseList.goToCourseFromSearchResult();
        //studentGrowthMarketingCourseDetails.displayGrowthMarketingTitleCourse("Growth Marketing");
        studentGrowthMarketingCourseDetails.dysplayngInformationAboutCourseTiecher();
    }
}
