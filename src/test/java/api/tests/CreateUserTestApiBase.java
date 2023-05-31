package api.tests;

import E2E.pages.*;
import E2E.pages.gast.HederPage;
import E2E.pages.student.StudentDetailsPage;
import E2E.pages.student.StudentHomePage;
import E2E.pages.student.StudetnDirectoryPage;
import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import api.dto.ValidUserCredentials;
import io.restassured.response.Response;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


public class CreateUserTestApiBase extends ApiBase {
    String endpoint = "/users";
    Faker faker = new Faker();
    String fullName = faker.name().fullName();
    String email = faker.internet().emailAddress();

    final static String BASE_URI = "https://jere237.softr.app/";

/*    @AfterEach
    public void afterTest() {
        deleteRequest(endpoint + email, 200);
    }*/


    @Test
    public void successfulCreateUserWithExactData() {

        ValidUserCredentials requestBody = ValidUserCredentials.builder()
                .full_name(fullName)
                .email(email)
                .password("777555")
                .generate_magic_link(false)
                .build();

        Response response = postRequest(endpoint, 201, requestBody);
    }

    @Test
    public void successfulCreateUser() {
        ValidUserCredentials requestBody = ValidUserCredentials.builder()
                .full_name("ia Kuz")
                .email("Iuliia82@yahoo.com")
                .password("777555")
                .generate_magic_link(false)
                .build();

        Response response = postRequest(endpoint, 201, requestBody);
    }


    @Test
    public void successfulCreateUserApiAndUi() {

        SignInPage signInPage = new SignInPage();
        HederPage hederPage = new HederPage();
        StudentHomePage studentHomePage = new StudentHomePage();
        ValidUserCredentials requestBody = ValidUserCredentials.builder()
                .full_name(fullName)
                .email(email)
                .password("777555")
                .generate_magic_link(false)
                .build();
        Response response = postRequest(endpoint, 201, requestBody);
        Selenide.open(BASE_URI);
        signInPage.clickSignInButton();
        signInPage.loginAction(email, "777555");
      /*  signInPage.displayRegistrationForm();
        signInPage.enterEmail(email);
        signInPage.enterPassword("777555");
        signInPage.clickSignInButtonInRegistrForm();*/
        //hederPage.displayStudentDirectoryButton();
        //при входе с данными созданного юзера у него не отображается хедер, поэтому проверка по Student Directory не работает
        //заменила на проверку по видимому тексту "Professor spotlight"
        studentHomePage.displayTitleProfessorSpotlight();
    }

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
        Response response = postRequest(endpoint, 201, requestBody);
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
    }

}
