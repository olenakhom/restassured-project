package client;

import dto.MovieDto;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestAssuredClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestAssuredClient.class);

    public RestAssuredClient(String baseUrl) {
        RestAssured.baseURI = baseUrl;
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    public MovieDto getMovies(Map<String, ?> params) {
        Response response =
                given()
                        .log()
                        .all()
                        .queryParams(params)
                        .queryParam("apikey", "PlzBanMe")
                        .when()
                        .get();

        response.
                then()
                .log().all()
                .statusCode(200);

        MovieDto movie = response.getBody().as(MovieDto.class);

        return movie;
    }

}
