package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    private final By HomeValueInputField = By.id("homeval");
    private final By DownPaymentInputField = By.id("downpayment");
    private final By SelectDownPaymentInDollar = By.name("param[downpayment_type]");
    private final By EnterLoanAmount = By.id("loanamt");
    private final By EnterInterestRate = By.id("intrstsrate");
    private final By LoanTermInput = By.id("loanterm");
    private final By StartMonthDropDown = By.name("param[start_month]");
    private final By StartYearInputField = By.id("start_year");
    private final By PropertyTaxInputField = By.id("pptytax");
    private final By EnterPMI = By.id("pmi");
    private final By Hoi1000 = By.id("hoi");
    private final By EnterMonthlyHOA = By.id("hoa");
    private final By LoanTypeFHAfield = By.name("param[milserve]");
    private final By RefiOrBuyDropDown = By.name("param[refiorbuy]");
    private final By CalculateButton = By.name("cal");
    public WebDriver driver;

    private static final Logger LOGGER = LogManager.getLogger(Home.class);

    public Home(WebDriver driver){
        this.driver = driver;
    }

    public Home typeHomePrice(String value){
        LOGGER.debug("Typing the home price: " + value);
        ActOn.element(driver, HomeValueInputField).setValue(value);
        return this;
    }
    public Home typeDownPayment(String value){

        LOGGER.debug("Typing the down payment: " + value);
        ActOn.element(driver,DownPaymentInputField).setValue(value);
        return this;
    }
    public Home clickOnDownPaymentInDollar(){
        LOGGER.debug("click on the dollar radio button");
        ActOn.element(driver,SelectDownPaymentInDollar).click();
        return this;
    }
    public Home typeLoanAmount(String value){
        LOGGER.debug("Type the loan amount: " + value);
        ActOn.element(driver, EnterLoanAmount).setValue(value);
        return this;
    }
    public Home typeInterestRate(String value){
        LOGGER.debug("Typing the interest rate: " + value);
        ActOn.element(driver, EnterInterestRate).setValue(value);
        return this;
    }
    public Home typeLoanTermYears(String value){
        LOGGER.debug("Typing the loan terms: " + value);
        ActOn.element(driver, LoanTermInput).setValue(value);
        return this;
    }
    public Home selectMonth(String month){
        LOGGER.debug("Selecting the start month: " + month);
        ActOn.element(driver, StartMonthDropDown).selectValue(month);
        return this;
    }
    public Home typeYear(String year){
        LOGGER.debug("Typing the start year: " + year);
        ActOn.element(driver, StartYearInputField).setValue(year);
        return this;
    }
    public Home typePropertyTax(String value){
        LOGGER.debug("Typing the proterty types: " + value);
        ActOn.element(driver, PropertyTaxInputField).setValue(value);
        return this;
    }
    public Home typePmi(String value){
        LOGGER.debug("Typing the Pmi: " + value);
        ActOn.element(driver, EnterPMI).setValue(value);
        return this;
    }
    public Home typeHOI(String value){
        LOGGER.debug("Typing the HOI: " + value);
        ActOn.element(driver, Hoi1000).setValue(value);
        return this;
    }
    public Home typeHoa(String value){
        LOGGER.debug("Typing the HOA: " + value);
        ActOn.element(driver, EnterMonthlyHOA).setValue(value);
        return this;

    }
    public Home selectLoanType(String value){
        LOGGER.debug("Selecing the loan Type: " + value);
        ActOn.element(driver, LoanTypeFHAfield).selectValue(value);
        return this;
    }
    public Home selectBuyorRefioption(String value){
        LOGGER.debug("Selecting the loan type: " + value);
        ActOn.element(driver, RefiOrBuyDropDown).selectValue(value);
        return this;
    }
    public Home clickOnCalculateButton(){
        LOGGER.debug("Typing the loan terms: ");
        ActOn.element(driver, CalculateButton).click();
        return this;
    }
    public Home validateTotalMonthlyPayment(String expectedTotalMonthlyValue){
        String formattedXpath = String.format("//h3[text()='$1,611.85']",expectedTotalMonthlyValue);
        By monthlyPayment = By.xpath(formattedXpath);

        LOGGER.debug("Validating that total monthly payment is:" + expectedTotalMonthlyValue);
        AssertThat.elementAssertions(driver,monthlyPayment).elemenIsDisplayed();
        return this;
    }



}
