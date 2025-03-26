package api.enpoints;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class Routes {
public static String base_url="https://petstore.swagger.io/";

//user model
public static String get_url= base_url+ "/user/{username}";
public static String post_url=base_url+ "/user/";
public static String put_url=base_url+ "/user/{username}";
public static String delete_url=base_url+ "/user/{username}";
RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
//reqBuilder.setBaseUri("");
}
