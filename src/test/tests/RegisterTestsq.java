package test.tests;

import com.beust.jcommander.Parameter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import test.pages.WorkRegisterPage;

public class RegisterTestsq extends ParentTest {

    @DataProvider (name = "registerForm", parallel = true)
    public  Object[][ ] registerFormValues(){
        return new Object[][]{
                //(String name, String surname, String email, String password)
                {"Name","Surname","email@qwe.com","password"},
                {"WrongName123","WrongSurname123","emailWrong","1"}
        };
    }
    @Test (dataProvider = "registerForm")
    public void registerTest( String name, String surname, String email, String password){

        webDriver.get("https://www.work.ua/jobseeker/register/");
        attachBrowserScreenShot(webDriver);
        WorkRegisterPage workRegisterPage = new WorkRegisterPage(webDriver);
        workRegisterPage.fillRegisterForm(name, surname, email, password);
        attachBrowserScreenShot(webDriver);
        attachString("huynya");


    }

    @Test
    public void consoleVariableWriter( ){
        System.out.println(System.getProperty("baseUrl"));




    }
}
