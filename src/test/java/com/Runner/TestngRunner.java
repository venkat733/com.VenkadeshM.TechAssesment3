package com.Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



	@CucumberOptions(tags="@ValidCredentials",features="src/test/resources/Features/Login.feature",glue="com.VenkadeshM.TechAssessment3")

	public class TestngRunner extends AbstractTestNGCucumberTests {
		@Override
		@DataProvider(parallel=true)
		public Object[][] scenarios(){
			return super.scenarios();
		}
	}


