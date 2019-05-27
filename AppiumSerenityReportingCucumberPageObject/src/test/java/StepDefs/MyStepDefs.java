package StepDefs;

import com.expleo.appium.Steps.CalculatorSteps;
import cucumber.api.java.en.*;

import net.thucydides.core.annotations.Steps;

import java.net.MalformedURLException;
import java.net.URL;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MyStepDefs {

@Steps
CalculatorSteps calculatorSteps;



    @Given("That the calculator is opened")
    public void that_the_calculator_is_opened() throws MalformedURLException, InterruptedException {

     calculatorSteps.openCalculator();
    }

    @When("I add two numbers")
    public void i_add_two_numbers() throws InterruptedException {

     calculatorSteps.addTwoIntegers();

    }

    @Then("The correct results should be displayed")
    public void the_correct_results_should_be_displayed() throws InterruptedException {
    calculatorSteps.assertTheResultAs("2");
    }



}
