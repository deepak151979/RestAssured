package com.ra.cucumber.serenity;

import java.util.HashMap;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class SerenitySteps {
	
	@Step
	public HashMap<String, Object> getDetails(String name, String country) {
		return SerenityRest.rest().given()
				.when()
				.get(country)
				.then()
				.log()
				.all()
				.statusCode(200)
				.extract()
				.path("findAll{it.name=='"+name+"'}.get(0)");
				//.path("findAll{it.altSpellings[2]}.get(0)");
				//.path("findAll{it.capital=='"+name+"'}.get(0)");
				
	}
	
	@Step
	public HashMap<String, Object> revDetails(String name, String country) {
		return SerenityRest.rest().given()
				.when()
				.get(country)
				.then()
				.log()
				.all()
				.statusCode(200)
				.extract()
				//.path("findAll{it.name=='"+name+"'}.get(0)");
				//.path("findAll{it.altSpellings[2]}.get(0)");
				.path("findAll{it.capital=='"+name+"'}.get(0)");
				
	}

}
