package com.expleo.appium;
import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src\\test\\resources\\Adding.feature",
        glue = "StepDefs")
public class RunnerTest {


}
