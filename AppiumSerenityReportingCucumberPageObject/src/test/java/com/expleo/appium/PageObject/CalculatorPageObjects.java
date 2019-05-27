package com.expleo.appium.PageObject;



import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CalculatorPageObjects{

    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;

    public void androidSetUpAppium() throws MalformedURLException {
        System.out.println("setup driver");


        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Samsung");
        caps.setCapability("udid", "emulator-5554"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "7.0.0");
        caps.setCapability("skipUnlock","true");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity","com.android.calculator2.Calculator");
        caps.setCapability("noReset","false");
        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);

        wait = new WebDriverWait(driver, 10);


    }
    public CalculatorPageObjects() {
        try {
            androidSetUpAppium();
            PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    @AndroidFindBy(id = "com.android.calculator2:id/digit_1")
    private WebElement one;


    @AndroidFindBy(id = "com.android.calculator2:id/formula")
    private WebElement inputNumberSpace;

    @AndroidFindBy(id = "com.android.calculator2:id/op_add")
    private WebElement plusOperator;

    @AndroidFindBy(id = "com.android.calculator2:id/result")
    private WebElement outputSpace;

    @AndroidFindBy(id = "com.android.calculator2:id/eq")
    private WebElement equalOperator;



    public void pressOne() {

        assertThat(one.isDisplayed(), equalTo(true));
        one.click();

    }

    public void pressPlusOperator() {
        assertThat(plusOperator.isDisplayed(), equalTo(true));
        plusOperator.click();
    }

    public void pressEqaulsoperator() {
        assertThat("No = Operator!!!", equalOperator.isDisplayed(), equalTo(true));
        equalOperator.click();
    }

    public WebElement getOne() {
        return one;
    }

    public WebElement getInputNumberSpace() {
        return inputNumberSpace;
    }

    public WebElement getPlusOperator() {
        return plusOperator;
    }

    public WebElement getOutputSpace() {
        return outputSpace;
    }

    public WebElement getEqualOperator() {
        return equalOperator;
    }



    public void closeTheCalculator()
    {

    }
    public void OpenTheCalculator() throws InterruptedException {
        try {



        Thread.sleep(1000);

    } catch (InterruptedException e) {

        e.printStackTrace();
    }
    }
}
