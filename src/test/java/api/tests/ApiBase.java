package api.tests;

import api.dto.ValidUserCredentials;
import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWebDriver;


public class ApiBase {

    final static String BASE_URI_API = "https://studio-api.softr.io/v1/api";
    final static String API_KEY = "khIbAyJIU5CIuh1oDuBRx1s49";
    final static String DOMAIN = "jere237.softr.app";

    String endpoint = "/users/";
    Faker faker = new Faker();
    public String fullName = faker.name().fullName();
    public String email = faker.internet().emailAddress();

    @BeforeMethod
    public void setUp() {
        Configuration.browserCapabilities = new ChromeOptions().addArguments("-remote-allow-origins=*");
    }

    @BeforeMethod
    public void successfulCreateUserApiAndUi() {
        ValidUserCredentials requestBody = ValidUserCredentials.builder()
                .full_name(fullName)
                .email(email)
                .password("777555")
                .generate_magic_link(false)
                .build();
        postRequest(endpoint, 201, requestBody);
    }


    static RequestSpecification specification = new RequestSpecBuilder() {
    }
            .setUrlEncodingEnabled(false)
            .setBaseUri(BASE_URI_API)
            .setContentType(ContentType.JSON)
            .addHeader("Softr-Api-Key", API_KEY)
            .addHeader("Softr-Domain", DOMAIN)
            .build();


    public Response postRequest(String endPoint, Integer responseCode, Object body) {
        RestAssured.filters(new AllureRestAssured());
        Response response = RestAssured.given()
                .spec(specification)
                .body(body)
                .when()
                .log().all()
                .post(endPoint)
                .then().log().all()
                .extract().response();
        response.then().assertThat().statusCode(responseCode);
        return response;
    }


    public Response deleteRequest(String endPoint, Integer responseCode) {
        RestAssured.filters(new AllureRestAssured());
        Response response = RestAssured.given()
                .spec(specification)
                .when()
                .log().all()
                .delete(endPoint)
                .then().log().all()
                .extract().response();
        response.then().assertThat().statusCode(responseCode);
        return response;
    }

}
