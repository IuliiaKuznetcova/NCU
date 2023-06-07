package E2E.Regression;

import E2E.pages.SignInPage;
import E2E.pages.guest.HederPage;
import E2E.pages.student.StudentHomePage;
import api.dto.ValidUserCredentials;
import api.tests.ApiBase;
import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class CreateUserRegressionApiTest extends ApiBase {
    String endpoint = "/users/";
    Faker faker = new Faker();
  /*  String fullName = faker.name().fullName();
    String email = faker.internet().emailAddress();*/


    final static String BASE_URI = "https://jere237.softr.app";

    @Test
    public void successfulCreateUserApiAndUi() {
        SignInPage signInPage = new SignInPage();
        HederPage hederPage = new HederPage();

        ValidUserCredentials requestBody = ValidUserCredentials.builder()
                .full_name(fullName)
                .email(email)
                .password("777555")
                .generate_magic_link(false)
                .build();
        postRequest(endpoint, 201, requestBody);
        Selenide.open(BASE_URI);
        signInPage.clickSignInButton();
        signInPage.loginAction(email, "777555");
        hederPage.displayStudentDirectoryButton();
        deleteRequest(endpoint+email ,200);
    }
    //TODO
    // code functionality check
    // StudentHomePage studentHomePage = new StudentHomePage();
    // studentHomePage.displayTitleProfessorSpotlight();
}
