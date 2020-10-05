package com.ra.junit.tests;

import static org.hamcrest.Matchers.hasValue;
import static org.junit.Assert.assertThat;

import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.ra.cucumber.serenity.SerenitySteps;
import com.ra.testbase.TestBase;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class AssignmentTest2 extends TestBase {
		
		@Steps
		SerenitySteps steps;
		
		@Test
		public void assignment2TC01(){				
			HashMap<String, Object> value = steps.revDetails("Oslo", "/norway");
			System.out.println("The value of :" +value);
			assertThat(value,hasValue("Oslo"));		
		}
		
}
