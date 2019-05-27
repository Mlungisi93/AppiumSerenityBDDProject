package com.expleo.appium.Steps;


import com.expleo.appium.PageObject.CalculatorPageObjects;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.pagefactory.*;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CalculatorSteps  {

    CalculatorPageObjects calculatorPageObjects =new CalculatorPageObjects();

       @Step
    public void openCalculator() throws MalformedURLException, InterruptedException {
        calculatorPageObjects.OpenTheCalculator();
    }

    @Step
    public void addTwoIntegers()
    {
         calculatorPageObjects.pressOne();
         assertThat("1 text not found!!", calculatorPageObjects.getInputNumberSpace().getText(), equalTo("1"));

         calculatorPageObjects.pressPlusOperator();
        assertThat("There is no + operator",calculatorPageObjects.getInputNumberSpace().getText().contains("+"), equalTo(true));

        calculatorPageObjects.pressOne();
        assertThat("Is not 1+1", calculatorPageObjects.getInputNumberSpace().getText().equalsIgnoreCase("1+1"), equalTo(true));
    }

  @Step
    public void assertTheResultAs(String expected) throws InterruptedException {

        // Write code here that turns the phrase above into concrete actions
        assertThat("Invalid answer: 2", calculatorPageObjects.getOutputSpace().getText().equalsIgnoreCase("2"), equalTo(true));

       calculatorPageObjects.pressEqaulsoperator();
        Thread.sleep(4000);
        assertThat("Results element not found",calculatorPageObjects.getOutputSpace().isDisplayed(), equalTo(true));
        assertThat("Is not 2", calculatorPageObjects.getOutputSpace().getText().equalsIgnoreCase(expected), equalTo(true));
        calculatorPageObjects.closeTheCalculator();

    }



}
