import base.TestBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogoutFunctionalityTest extends TestBase {


    @BeforeTest
    public void setUp(){
        loginPage.loginLinkClick();
        loginPage.loginWithValidCredential();
        loginPage.verifyLoginMessage();

    }


    @Test
    public void LogoutTest(){
        logoutPage.logoutFunction();
        logoutPage.verifyLogoutMessage();
    }




}
