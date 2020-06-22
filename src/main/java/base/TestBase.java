package base;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.LoginPage;
import pages.LogoutPage;

public class TestBase extends Driver {


    public static LoginPage loginPage;
    public static LogoutPage logoutPage;





    @BeforeSuite
    public void setup() {

            setBrowser();

            loginPage = PageFactory.initElements( driver, LoginPage.class );
            logoutPage = PageFactory.initElements(driver, LogoutPage.class);
        }


    @AfterSuite
    public  void tearDown(){
            quitBrowser();

        }




}
