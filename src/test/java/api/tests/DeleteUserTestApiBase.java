package tests;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class DeleteUserTest extends BaseTest {
    String endpoint = "/users/";
    String email = "letty.daniel@hotmail.com";
    @Test
    public void successDelete(){
        Response response = deleteRequest(endpoint+email ,200);
    }



}
