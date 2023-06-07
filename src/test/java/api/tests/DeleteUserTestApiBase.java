package api.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteUserTestApiBase extends ApiBase {
    String endpoint = "/users/";
    String email = "carlton.corkery@hotmail.com";
    @BeforeMethod

    //TODO удаляет дважды, хотя автометод удаления на каждый тест я убрала

    @Test
    public void successDelete(){

        deleteRequest(endpoint+email ,200);
    }
}
