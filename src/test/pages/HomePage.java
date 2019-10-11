package test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends ParentPage{







//    @FindBy(xpath =".//input[@id='first_name']" )
//    public WebElement firstNameInput;


    @FindBy (id = "fsc-origin-search")
    public WebElement originSearch;

    @FindBy (id = "fsc-destination-search")
    public WebElement destinationSearch;

    @FindBy (id = "depart-fsc-datepicker-button")
    public WebElement departDatePickerButton;

    @FindBy (id="return-fsc-datepicker-button")
    public WebElement returnDatePickerButton;

    @FindBy (id="depart-calendar__bpk_calendar_nav_select")
    public Select departMonthSelect;



    @FindBy (xpath = ".//button[contains(@class, 'calendar-date') and not(contains(@class,'--blocked' )) and not(contains(@class,'--outside' ))]/span")
    public  List<WebElement> availableDayList;



    public  void homePageURL(){
        webDriver.get("https://www.skyscanner.com.ua/");
    }

    public void selectDepartDate  (String yearMonth, String day) throws InterruptedException {
        departDatePickerButton.click();
        //value format YYYY-MM
        // departMonthSelect.selectByValue(yearMonth);
        Thread.sleep(2000);
        for (int i = 0; i < availableDayList.size() ; i++) {
            if(availableDayList.get(i).getText().equals(day)){
                availableDayList.get(i).click();
            }
        }
        Thread.sleep(2000);
    }



    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }





}
