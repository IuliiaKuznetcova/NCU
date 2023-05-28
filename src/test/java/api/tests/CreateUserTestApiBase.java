package tests;

import com.github.javafaker.Faker;
import dto.ValidUserCredentials;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;


public class CreateUserTest extends BaseTest {
    String endpoint = "/users";


    Faker faker = new Faker();
    String fullName = faker.name().fullName();
    String email = faker.internet().emailAddress();

/*    @AfterMethod
    public void afterTest() {
        deleteRequest(endpoint+email,200);
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

    public void successfulCreateUser1() {
        ValidUserCredentials requestBody = ValidUserCredentials.builder()
                .full_name("Iuliia Kuz")
                .email("Iuliia78@yahoo.com")
                .password("777555")
                .generate_magic_link(false)
                .build();

        Response response = postRequest(endpoint, 201, requestBody);
    }


}
