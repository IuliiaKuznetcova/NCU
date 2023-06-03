package api.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteUserTestApiBase extends ApiBase {
    /*String endpoint = "/users/";
    String email = "stephan.kertzmann@gmail.com";*/
    @BeforeMethod
//TODO удаляет дважды, нужно починить

    @Test
    public void successDelete(){

        Response response = deleteRequest(endpoint+email ,200);
    }
}
