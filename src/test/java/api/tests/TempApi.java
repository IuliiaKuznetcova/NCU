package api.tests;

import E2E.pages.SignInPage;
import E2E.pages.guest.HederPage;
import E2E.pages.student.StudentDetailsPage;
import E2E.pages.student.StudentHomePage;
import E2E.pages.student.StudetnDirectoryPage;
import api.dto.ValidUserCredentials;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;
import utils.PropertiesLoader;

public class TempApi extends ApiBase {
    private String emailMalik = PropertiesLoader.loadProperties("emailMalik");
    private String passwordMalik = PropertiesLoader.loadProperties("passwordMalik");
    final static String BASE_URI = "https://jere237.softr.app";

    @Test
    public void successfulCreateUserApiAndUi1() {
        SignInPage signInPage = new SignInPage();
        HederPage hederPage = new HederPage();
        StudetnDirectoryPage studetnDirectoryPage = new StudetnDirectoryPage();
        StudentHomePage studentHomePage = new StudentHomePage();
        StudentDetailsPage studentDetailsPage = new StudentDetailsPage();
        ValidUserCredentials requestBody = ValidUserCredentials.builder()
                .full_name(fullName)
                .email(email)
                .password("777555")
                .generate_magic_link(false)
                .build();
        postRequest(endpoint, 201, requestBody);
        Selenide.open(BASE_URI);
        signInPage.clickSignInButton();
        signInPage.displayRegistrationForm();
        signInPage.enterEmail("malik@example.com");
        signInPage.enterPassword("123456");
        signInPage.clickSignInButtonInRegistrForm();
        hederPage.displayStudentDirectoryButton();
        hederPage.clickStudentDirectoryButton();
        studetnDirectoryPage.displayWelcomeTextOnStudentPage();
        studetnDirectoryPage.fillFieldSearch(fullName);
        studetnDirectoryPage.searchResultDisplayRandomData(fullName);
        studetnDirectoryPage.viewProfileButton();
        studentDetailsPage.displayStudenFullNameRandomData(fullName);
        studentHomePage.checkSignOutStudent();
        deleteRequest(endpoint+email ,200);
    }

    @Test
    public void successfulCreateUserApiAndUi2() {
        SignInPage signInPage = new SignInPage();
        HederPage hederPage = new HederPage();
        StudetnDirectoryPage studetnDirectoryPage = new StudetnDirectoryPage();
        StudentHomePage studentHomePage = new StudentHomePage();
        StudentDetailsPage studentDetailsPage = new StudentDetailsPage();
        ValidUserCredentials requestBody = ValidUserCredentials.builder()
                .full_name(fullName)
                .email(email)
                .password("777555")
                .generate_magic_link(false)
                .build();
        postRequest(endpoint, 201, requestBody);
        Selenide.open(BASE_URI);
        signInPage.clickSignInButton();
        signInPage.displayRegistrationForm();

       /* signInPage.enterEmail("malik@example.com");
        signInPage.enterPassword("123456");
        signInPage.clickSignInButtonInRegistrForm();*/
        signInPage.loginAction(emailMalik, passwordMalik);
        hederPage.displayStudentDirectoryButton();
        hederPage.clickStudentDirectoryButton();
        studetnDirectoryPage.displayWelcomeTextOnStudentPage();
        studetnDirectoryPage.fillFieldSearch(fullName);
        studetnDirectoryPage.searchResultDisplayRandomData(fullName);
        studetnDirectoryPage.viewProfileButton();
        studentDetailsPage.displayStudenFullNameRandomData(fullName);
        studentHomePage.checkSignOutStudent();
        deleteRequest(endpoint+email ,200);
    }

}
