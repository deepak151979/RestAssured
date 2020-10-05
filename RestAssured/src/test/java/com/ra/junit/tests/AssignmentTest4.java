package com.ra.junit.tests;
import org.json.simple.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.*;
import net.serenitybdd.junit.runners.SerenityRunner;
/*
@RunWith(SerenityRunner.class)
public class AssignmentTest4 {	
		
		@Test
		public void assignment4TC01() {
			
			JSONObject json=new JSONObject();
			json.put("username","deepak1507");
			json.put("password","Jira1234");
			
			Response resp = RestAssured.given()
			.header("Content-Type","application/json")
			.body(json)
			.post("http://localhost:8080/rest/auth/1/session");
			
			System.out.println(resp.getStatusCode()); System.out.println(resp.getCookies());System.out.println(resp.prettyPrint());
			String sessionID = resp.getCookies().get("JSESSIONID");
			
			Response response = RestAssured.given().contentType(ContentType.JSON)
			.cookie("JSESSIONID", sessionID)
			.body("{\r\n" + 
					"    \"fields\": {\r\n" + 
					"       \"project\":\r\n" + 
					"       {\r\n" + 
					"          \"key\": \"RES\"\r\n" + 
					"       },\r\n" + 
					"       \"summary\": \"This is my 1st Issue in JIRA from API.\",\r\n" + 
					"       \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n" + 
					"       \"issuetype\": {\r\n" + 
					"          \"name\": \"Bug\"\r\n" + 
					"       }\r\n" + 
					"   }\r\n" + 
					"}")
			.post("http://localhost:8080/rest/api/2/issue/");
			
			System.out.println(response.getBody().jsonPath().prettify());
			//System.out.println("Final output :"+response.getBody().jsonPath());
		}

	} */



