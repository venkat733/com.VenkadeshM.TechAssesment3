package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Register.feature",glue="com.VenkadeshM.TechAssessment3",plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class JuintRunnerRegister {

}
