package api.tests;

import E2E.pages.*;
import E2E.pages.guest.HederPage;
import E2E.pages.student.StudentDetailsPage;
import E2E.pages.student.StudentHomePage;
import E2E.pages.student.StudetnDirectoryPage;
import com.codeborne.selenide.Selenide;
import api.dto.ValidUserCredentials;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utils.PropertiesLoader;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class CreateUserTestApiBase extends ApiBase {

    private String emailMalik = PropertiesLoader.loadProperties("emailMalik");
    private String passwordMalik = PropertiesLoader.loadProperties("passwordMalik");
    final static String BASE_URI = "https://jere237.softr.app";

    @Test
    public void successfulCreateUserWithExactData() {
        ValidUserCredentials requestBody = ValidUserCredentials.builder()
                .full_name(fullName)
                .email(email)
                .password("777555")
                .generate_magic_link(false)
                .build();
        postRequest(endpoint, 201, requestBody);

        // deleteRequest(endpoint+email ,200);
    }

    @Test
    public void successfulCreateUser() {
        ValidUserCredentials requestBody = ValidUserCredentials.builder()
                .full_name("Ja Kuz")
                .email("ja82@yahoo.com")
                .password("777555")
                .generate_magic_link(false)
                .build();
        postRequest(endpoint, 201, requestBody);

        // deleteRequest(endpoint+email ,200);
    }

    @Test
    public void successfulCreateUserApiAndUiWithLoginCheck() {
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
        signInPage.loginAction(emailMalik, passwordMalik);
        hederPage.displayStudentDirectoryButton();
        hederPage.clickStudentDirectoryButton();
        studetnDirectoryPage.displayWelcomeTextOnStudentPage();
        studetnDirectoryPage.fillFieldSearch(fullName);
        studetnDirectoryPage.searchResultDisplayRandomData(fullName);
        studetnDirectoryPage.viewProfileButton();
        studentDetailsPage.displayStudenFullNameRandomData(fullName);
        studentHomePage.checkSignOutStudent();

        //deleteRequest(endpoint+email ,200);
    }

    // TODO Если удаление ставить в самом тесте (совет Ивана),
    //  а он не проходит, то не проходит и уделение


    @AfterMethod
    public void afterTest() {
        deleteRequest(endpoint + email, 200);
        closeWebDriver();
    }

  /*  @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }*/
}
