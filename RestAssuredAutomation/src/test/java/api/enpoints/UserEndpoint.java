package api.enpoints;

import com.aventstack.extentreports.gherkin.model.Given;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class UserEndpoint {
	
			//POST
	public static Response createUser(User payload)
	{
		Response response=(Response) given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				.when().post(Routes.post_url);
				
		return response;
							
	}
	
	//GET
	public static Response readUser(String Username)
	{
		Response response=given()
				.pathParam("username", Username)
				.when().get(Routes.get_url);
				
		return response;
							
	}
	//PUT
	public static Response updateUser(User payload, String username)
	{
		Response response=given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.when().get(Routes.get_url);
				
		return response;
	//DELETE
}
}
