package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@ValidCredentials",features="src/test/resources/Features/Login.feature",glue="com.VenkadeshM.TechAssessment3",plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class JunitRunnerLogin {


}
