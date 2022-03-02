package apiTests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class ApiTest {
    public String baseUrl = "https://gorest.co.in";
    public String endpoint = "/public/v2/users";

    @Test
    public void createRequest() {
        String requestBody = """
                {
                   "name": "Ms. Meena Khan",
                   "email": "meena_khan_ms@prosacco-hart5",
                   "gender": "male",
                   "status": "inactive"
                }
                      """;
        var response = given().baseUri(baseUrl).contentType(ContentType.JSON)
                .header("Authorization", "Bearer 6d5ec15b538ca517305a938eb57bc48c011b07282929b706254bd39a8c26bebb")
                .body(requestBody).when().post(endpoint)
                .then().log().body()
                .assertThat().statusCode(201)
                .body("name" , is(equalTo("Ms. Meena Khan")));

    }
}
