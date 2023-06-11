package E2E.tests;

import E2E.pages.helpers.CourseHelper;
import org.testng.annotations.Test;

public class CourseDetailsTest extends BaseTest {
    CourseHelper courseHelper = new CourseHelper();

    @Test
    public void searchForTiecherInTheCourseGrowthMarketing() throws InterruptedException {
        signInPage.loginMalik();
        studentHomePage.goToCoursesPage();
        courseHelper.searchCourseWithCheck("Growth Marketing");
        studentGrowthMarketingCourseDetails.tyknutTut();
        studentGrowthMarketingCourseDetails.viewAboutThisCourse();
        studentGrowthMarketingCourseDetails.printInformationAboutCourseTiecher();
    }
}

