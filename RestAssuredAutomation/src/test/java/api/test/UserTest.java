package api.test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.enpoints.UserEndpoint;
import api.payload.User;
import io.restassured.response.Response;
import junit.framework.Assert;
public class UserTest {
	
	public static Faker faker;
	public static User user; 
	@BeforeClass
	public static void setUpData()
	{
		faker= new Faker();
		user=new User();
		user.setId(faker.idNumber().hashCode());
		user.setUsername(faker.name().username());
		user.setFirstname(faker.name().firstName());
		user.setLastname(faker.name().lastName());
		user.setEmail(faker.internet().safeEmailAddress());
		user.setPassword(faker.internet().password(5, 10));
		
		
		user.setPhone(faker.phoneNumber().cellPhone());
		
	}

	@Test(priority = 1)
	
	public static void postTest()
	{
		Response response= UserEndpoint.createUser(user);
		response.then().log().all();
		Assert.assertEquals(response.statusCode(), 200);
	}
	@Test(priority = 2)
	public static void getTest()
	{
		Response response=UserEndpoint.readUser(user.getUsername());
		response.then().log().all();
		Assert.assertEquals(response.statusCode(), 200);
	}
}
