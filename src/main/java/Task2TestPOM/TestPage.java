package Task2TestPOM;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class TestPage {


    WebDriver driver= null;
    By PopularRoutesArrow = By.xpath("/html/body/main/section/div/div/div[1]/div/div/div/a[2]/span[1]");

    By PopularRoutes = By.xpath("/html/body/main/section/div/div/div[1]/div/div/div/div[2]/div/div/ul/li[1]/a");

    By ArrivalDate = By.xpath("/html/body/div[1]/table/tbody/tr[3]/td[5]/a");

    By SearchforBus= By.xpath("/html/body/main/form/div[1]/div/div[2]/div[3]/button");

    By SelectSeats= By.cssSelector("div.rSetForward:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > input:nth-child(5)");

    By BoardingPoint = By.partialLinkText("Boarding Point");

    By DroppingPoint = By.partialLinkText("Dropping Point");

    By SeatNo = By.xpath("//*[@id=\"Forward80\"]");

    By CustomerDetails = By.xpath("//*[@id=\"Forwardprofile-tab\"]");

    By MobileNumber =By.xpath("//*[@id=\"mobileNo\"]");

    By PassengerMail = By.xpath("//*[@id=\"email\"]");

    By PassengerName = By.xpath("//*[@id=\"passengerNameForward0\"]");

    By SelectGender = By.xpath("//*[@id=\"genderCodeIdForward0\"]");

    By EnterAge = By.xpath("//*[@id=\"passengerAgeForward0\"]");

    By SelectConcession =By.xpath("//*[@id=\"concessionIdsForward0\"]");

    By MakePayment = By.xpath("//*[@id=\"PgBtn\"]");
    public TestPage(WebDriver driver) {
        this.driver = driver;}

    public void ClickOnRightArrow(){
        driver.findElement(PopularRoutesArrow).click();
    }
    public void SelectRoute(){
        driver.findElement(PopularRoutes).click();
    }

    public void SelectArrivalDate(){
        driver.findElement(ArrivalDate).click();
    }
    public void SearchForBuses(){
        driver.findElement(SearchforBus).click();
    }
    public void ClickOnSelectSeats(){
        driver.findElement(SelectSeats).click();
    }
    public void SelectBoarding(){
        driver.findElement(BoardingPoint).click();
    }
    public void SelectDropping(){
        driver.findElement(DroppingPoint);
        String Dropping = driver.switchTo().activeElement().getAttribute("Dropping");
    }
    public void SelectSeatNumber(){
        driver.findElement(SeatNo).click();
    }
    public void EnterCustomerDetails(){

        driver.findElement(CustomerDetails).click();
    }
    public void EnterMobileNumber(int num){
        driver.findElement(MobileNumber).sendKeys("6789125987");
    }
    public void EnterPassengerMail(String text){
        driver.findElement(PassengerMail).sendKeys(text);
    }
    public void EnterPassengerName(String text){
        driver.findElement(PassengerName).sendKeys(text);

    }
    public void SelectGenderType(){
       WebElement Gender = driver.findElement(SelectGender);
        Select selectObject =new Select(Gender);
        selectObject.selectByVisibleText("MALE");
    }
    public void EnterAgeNumber(int num){
        driver.findElement(EnterAge).sendKeys("19");
    }
    public void PressSelectConcession(){
       WebElement concession=  driver.findElement(SelectConcession);
        Select selectObject =new Select(concession);
        selectObject.selectByVisibleText("GENERAL PUBLIC");
    }
    public void ClickMakePayment(){
       WebElement Payment=  driver.findElement(MakePayment);
       Payment.click();
    }

}
