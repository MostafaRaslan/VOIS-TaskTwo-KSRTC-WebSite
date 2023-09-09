package TaskTwo;

import Task2ExcelSheet.Task2ExcelUtils;
import Task2TestPOM.TestPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;
import java.util.HashMap;

public class TaskTwo {
    WebDriver driver = new FirefoxDriver();
    TestPage ActionDone = new TestPage(driver);
    Task2ExcelUtils data;
    int input1;
    String input2;
    String input3;
    int input4;

    @Given("User is on Website KRSTC")
    public void user_is_on_website_krstc() {
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
        MutableCapabilities capabilities = new MutableCapabilities();
        HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
        browserstackOptions.put("resolution", "1024x768");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String projectPath = System.getProperty("user.dir");
        data = new Task2ExcelUtils(projectPath + "/Excel/Task2Sheet.xlsx", "Sheet1");
    }

    @When("Select The Required Route")
    public void Select_The_Required_Route() {
        ActionDone.ClickOnRightArrow();
        ActionDone.SelectRoute();
    }

    @When("Select The Arrival Date")
    public void Select_The_Arrival_Date() {
        ActionDone.SelectArrivalDate();
    }

    @When("Click Search Buses")
    public void Click_Search_Buses() {
        ActionDone.SearchForBuses();
    }

    @When("Press Click On Select Seats")
    public void Press_Click_On_Select_Seats() {
        ActionDone.ClickOnSelectSeats();
    }

    @When("Press Click On Select Boarding")
    public void Press_Click_On_Select_Boarding() {
        ActionDone.SelectBoarding();
    }

    @When("Press Click On Select Dropping")
    public void Press_Click_On_Select_Dropping() {
        ActionDone.SelectDropping();
    }

    @When("Select The Required SeatNo")
    public void Select_The_Required_SeatNo() {
        ActionDone.SelectSeatNumber();
    }

    @When("Enter The Passenger Details")
    public void Enter_The_Passenger_Details() {

        ActionDone.EnterCustomerDetails();
    }

    @When("Enter The Mobile Number")
    public void Enter_The_Mobile_Number() {
        input1 = (int) Task2ExcelUtils.getCellDataNumber(1, 2);
        ActionDone.EnterMobileNumber(input1);
    }

    @When("Enter The Passenger Mail")
    public void Enter_The_Passenger_Mail() {
        input2 = Task2ExcelUtils.getCellDataString(1, 3);
        ActionDone.EnterPassengerMail(input2);
    }

    @When("Enter The Passenger Name")
    public void Enter_The_Passenger_Name() {
        input3 = Task2ExcelUtils.getCellDataString(0, 0);
        ActionDone.EnterPassengerName(input3);
    }

    @When("Provide The Gender Type")
    public void Provide_The_Gender_Type() {
        ActionDone.SelectGenderType();
    }

    @When("Provide Age Number")
    public void Provide_Age_Number() {
        input4 = (int) Task2ExcelUtils.getCellDataNumber(1, 1);
        ActionDone.EnterAgeNumber(input4);
    }

    @When("Provide Concession")
    public void Provide_Concession() {
        ActionDone.PressSelectConcession();
    }
    @When("Payments")
    public void Payments() {
        ActionDone.ClickMakePayment();
    }
        @And("Close Browser")
        public void Close_Browser() {
            driver.quit();
        }
}