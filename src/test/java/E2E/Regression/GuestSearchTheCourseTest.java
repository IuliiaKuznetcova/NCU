package E2E.Regression;

import E2E.pages.guest.SearchPage;
import E2E.tests.BaseTest;
import io.qameta.allure.Issue;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;


public class GuestSearchTheCourseTest extends BaseTest {
    SearchPage searchPage = new SearchPage();


    @Issue("NCU-28")
    @Test
    public void goToCoursesPageComputerScience() {
        searchPage.clickCoursesButton();
        searchPage.goToCoursesPage("Computer Science");
    }


    // TODO
    //  code functionality check
    //  computerSciencePage = $(byText("I agree to the")); in SearchPage


}
