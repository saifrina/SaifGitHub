package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RealApr {

    private final By CalculatorTab = By.xpath("//label[1][text()='Calculator']");
    private final By HomePrice = By.name("HomeValue");
    private final By DownPaymentInDollar = By.name("DownPaymentSel");
    private final By DownPaymenInputField = By.name("DownPayment");
    private final By InterestRateInputField = By.name("Interest");
    private final By CalculateRateButton = By.name("calculate");
    private final By ActualAprRate = By.xpath("//*[@id='analysisDiv']/table/tbody/tr/td/strong[text()='Actual APR:']/../../td[2]/strong");

    private static final Logger LOGGER = LogManager.getLogger(Home.class);
    public WebDriver driver;

    public RealApr(WebDriver driver){
        this.driver = driver;
    }
    public RealApr waitForPageToLoad(){
        LOGGER.debug("Waiting for the Real Page to load");
        ActOn.wait(driver,CalculatorTab).waitForElementToBeVisible();
        return this;
    }

    public RealApr typeHomePrice(String value){
        LOGGER.debug("Typing the home price: " + value);
        ActOn.element(driver, HomePrice).setValue(value);
        return this;
    }
    public RealApr clickDownPaymentInDollar(){
        LOGGER.debug("Clicking on the radio button down payment in Dollar");
        ActOn.element(driver,DownPaymentInDollar).click();
        return this;
    }
    public RealApr typeDownPayment(String value){
        LOGGER.debug("Typing the down payment: " + value);
        ActOn.element(driver,DownPaymenInputField).setValue(value);
        return this;
    }
    public RealApr typeInterestRate(String value){
        LOGGER.debug("Typing the interest rate: " + value);
        ActOn.element(driver, InterestRateInputField).setValue(value);
        return this;
    }
    public RealApr clickOnCalculateButton(){
        LOGGER.debug("Clicking on the Calculate Button");
        ActOn.element(driver, CalculateRateButton).click();
        return this;
    }
    public RealApr validateRealAprRate(String expectedAprRate){
        LOGGER.debug("Validate the Real Apr rete is: " + expectedAprRate);
        String actualReaAprRate = ActOn.element(driver, ActualAprRate).getTextValue();
        Assert.assertEquals(actualReaAprRate, "3.130%");
        return this;

    }

}
