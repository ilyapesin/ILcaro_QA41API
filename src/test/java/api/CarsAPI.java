package api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CarsAPI extends BaseAPI{
    String uriGetCities = "/v1/cars/cities";

    public Response getAllCities() {
        return given().when().get(baseURL + uriGetCities)
                .thenReturn();
    }
}
