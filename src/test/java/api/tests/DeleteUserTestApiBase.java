package api.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class DeleteUserTestApiBase extends ApiBase {
    String endpoint = "/users/";
    String email = "marianela.morar@gmail.com";
    @Test
    public void successDelete(){

        Response response = deleteRequest(endpoint+email ,200);
    }
}
