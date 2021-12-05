package automation_test.mortgage_calculator_parameterized;

import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.NavigationBar;
import utilities.DateUtils;
import utilities.ReadConfigFiles;
import utilities.SQLConnector;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CalculateMortgageRateParameterized {
    private static final Logger LOGGER = LogManager.getLogger(CalculateMortgageRateParameterized.class);
    WebDriver driver;

    @BeforeMethod
    public void browserInitialization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        LOGGER.info("-------Test Name: Calculate Mortgage Rate-----");

        String browserUrl = ReadConfigFiles.getPropertyValues("Url");
        ActOn.browser(driver).openBrowser(browserUrl);
    }

    @Test
    public void calculateMonthlyPayment(){
        String date = DateUtils.returnNextMonth();
        String[] dates = date.split("-");
        String month = dates[0];
        String year = dates[1];


        try{
            ResultSet rs = SQLConnector.readData("select * from monthly_mortgage");
          while (rs.next()){
              new NavigationBar(driver)
                      .navigateToHom()
                      .typeHomePrice(rs.getNString("homevalue"))
                      .typeDownPayment(rs.getNString("downpayment"))
                      .clickOnDownPaymentInDollar()
                      .typeLoanAmount(rs.getNString("loanamount"))
                      .typeInterestRate(rs.getNString("interestrate"))
                      .typeLoanTermYears(rs.getNString("loanterm"))
                      .selectMonth(month)
                      .typeYear(year)
                      .typePropertyTax(rs.getNString("propertytax"))
                      .typePmi(rs.getNString("pmi"))
                      .typeHOI(rs.getNString("homeownerinsurance"))
                      .typeHoa(rs.getNString("monthlyhoa"))
                      .selectLoanType(rs.getNString("loantype"))
                      .selectBuyorRefioption(rs.getNString("buyorrefi"))
                      .clickOnCalculateButton()
                      .validateTotalMonthlyPayment(rs.getNString("totalmonthlypayment"));

          }
        }catch (SQLException e){
            LOGGER.error(e.getMessage());
        }

    }
    @AfterMethod
    public void quitBrowser() {
       LOGGER.info("-------End Test Case: Calculate Mortgage Rate-----");
        ActOn.browser(driver).close();
    }

}
