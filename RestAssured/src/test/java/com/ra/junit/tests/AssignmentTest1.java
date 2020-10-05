package com.ra.junit.tests;
import java.util.HashMap;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ra.cucumber.serenity.SerenitySteps;
import com.ra.testbase.TestBase;

import static org.hamcrest.Matchers.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class AssignmentTest1 extends TestBase {
		
	@Steps
	SerenitySteps steps;
	
	@Test
	public void assignmentTC01(){				
		HashMap<String, Object> value = steps.getDetails("India", "/INDIA");
		System.out.println("The value of :" +value);
		assertThat(value,hasValue("India"));//Republic of India	
		assertThat(value,hasValue("India"));
	}
	/*
	@Test
	public void assignmentTC02(){
		HashMap<String, Object> value = steps.getDetails("India", "/XYZ");
		System.out.println("The value of :" +value);				
		assertThat(value,hasValue("Republic of India"));
	} */
}
