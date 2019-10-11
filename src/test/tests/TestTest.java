package test.tests;


import org.testng.annotations.Test;
import test.pages.HomePage;


public class TestTest extends ParentTest {

//    @DataProvider (name = "registerForm", parallel = true)
//    public  Object[][ ] registerFormValues(){
//        return new Object[][]{
//                //(String name, String surname, String email, String password)
//                {"Name","Surname","email@qwe.com","password"},
//                {"WrongName123","WrongSurname123","emailWrong","1"}
//        };
//    }
    @Test //(dataProvider = "registerForm")
    public void testTest() throws InterruptedException {
        homePage.homePageURL();
        homePage.selectDepartDate("2019-11","31");




    }




}
