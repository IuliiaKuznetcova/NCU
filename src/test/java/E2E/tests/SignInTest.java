package E2E.tests;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;
import utils.PropertiesLoader;

import static com.codeborne.selenide.Selenide.$x;

public class SignInTest extends BaseTest {
    //TODO
    // Не видит Малика, хотя он есть в BaseTest
    private String emailMalik = PropertiesLoader.loadProperties("emailMalik");
    private String passwordMalik = PropertiesLoader.loadProperties("passwordMalik");
    private SelenideElement scroll = $x(" //*[@id=\"home-footer\"]/section/div/div[3]/div[1]/small");
    //TODO NCU-13




    @Test
    public void searchForCreatedStudent() {
        signInPage.clickSignInButton();
        signInPage.displayRegistrationForm();
        signInPage.enterEmail("malik@example.com");
        signInPage.enterPassword("123456");
        signInPage.clickSignInButtonInRegistrForm();
        hederPage.displayStudentDirectoryButton();
        hederPage.clickStudentDirectoryButton();
        studentDirectoryPage.displayWelcomeTextOnStudentPage();
        studentDirectoryPage.fillFieldSearch("Iuliia Kuz");
        studentDirectoryPage.searchResultDisplayExactData();
        studentDirectoryPage.viewProfileButton();
        studentDetailsPage.displayStudenFullNameExactData();
        studentHomePage.checkSignOutStudent();
    }
}