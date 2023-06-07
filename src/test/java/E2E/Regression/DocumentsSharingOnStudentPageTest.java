package E2E.Regression;

import E2E.tests.BaseTest;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Issue;
import org.testng.annotations.Test;
import utils.PropertiesLoader;

import static com.codeborne.selenide.Selenide.$x;

public class DocumentsSharingOnStudentPageTest extends BaseTest {
    private String emailMalik = PropertiesLoader.loadProperties("emailMalik");
    private String passwordMalik = PropertiesLoader.loadProperties("passwordMalik");


    @Issue("NCU-13")
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
        studentHomePage.scrollPageToElement2023NoCode();
        studentGrowthMarketingCourseDetails.onExistsUploadCourseMaterialButton("Upload");

    }
    //TODO
    // code functionality check
    // studentGrowthMarketingCourseDetails.existsUploadCourseMaterialButton("Upload");
}
