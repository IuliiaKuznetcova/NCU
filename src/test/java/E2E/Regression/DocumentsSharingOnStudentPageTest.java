package E2E.Regression;

import E2E.tests.BaseTest;
import io.qameta.allure.Issue;
import org.testng.annotations.Test;
import utils.PropertiesLoader;


public class DocumentsSharingOnStudentPageTest extends BaseTest {
    private String emailMalik = PropertiesLoader.loadProperties("emailMalik");
    private String passwordMalik = PropertiesLoader.loadProperties("passwordMalik");


    @Issue("NCU-13")
    @Test
    public void visibilityOfDocumentsSharingOnStudentPage() throws InterruptedException {
        signInPage.clickSignInButton();
        signInPage.displayRegistrationForm();
        signInPage.loginAction(emailMalik, passwordMalik);
        hederPage.displayStudentDirectoryButton();
        hederPage.clickStudentDirectoryButton();
        studetnDirectoryPage.displayWelcomeTextOnStudentPage();
        studentHomePage.goToCoursesPage();
        studentCourseList.displayOurCoursesTitle();
        studentCourseList.goToGrowthMarketingCourse();
        scrollPageToElement2023NoCode();
        studentGrowthMarketingCourseDetails.notExistsUploadCourseMaterialButton("Upload");

    }
    // TODO
    //  code functionality check
    //  studentGrowthMarketingCourseDetails.existsUploadCourseMaterialButton("Upload");

}
