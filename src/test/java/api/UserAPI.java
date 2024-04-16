package api;

import dto.UserDTO;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UserAPI extends BaseAPI{
    String uriLogin = "/v1/user/login/usernamepassword";

    public Response getResponseLoginUser(UserDTO user) {
        return RestAssured.given()
                .body(user)
                .when()
                .post(baseURL + uriLogin)
                .thenReturn();
    }

    public String getTokenFromResponse(Response response) {

        return response.path("accessToken");
    }
}
