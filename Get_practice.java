package MyRest;

import org.apache.http.impl.execchain.RequestAbortedException;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_practice {
	
	@Test
	void getDemo()
	{
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
		
		//request object
		
		RequestSpecification httprequest=RestAssured.given();
		
		// response object
		
		Response res=httprequest.request(Method.GET,"/booking");
		
		String responsebody =res.getBody().asString();
		System.out.println("body:"+responsebody);
		
		int statuscode=res.statusCode();
		System.out.println("statuscode:"+statuscode);
		
		String statusline=res.statusLine();
		
		System.out.println("statusline:"+statusline);
		
		
	}

}
