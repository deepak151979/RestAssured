package com.ra.junit.tests;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
/*
@RunWith(SerenityRunner.class)
public class AssignmentTest3 {

	@Test
	public void init() {
		String bdy =	" ' { '+\r\n" +
						" ' \"id\":54\", '+\r\n" +
						" ' \"name\":\"TestA\", '+\r\n" +
						" ' \"year\":2020\", '+\r\n" +
						" ' \"job\":\"Tstlead\" '+\r\n" +
						" ' } ';";
		
		RestAssured.baseURI="https://reqres.in";
		String Resp = SerenityRest.given()					  
					  .body(bdy)
					  .when()
					  .post("/api/client/")
					  .then().assertThat().log().all()
					  .statusCode(201)			  
					  .and().contentType(ContentType.JSON).and()
					  .extract().response().asString();
					  System.out.println("Response is \t " +Resp);
				
					  
	}
}*/
