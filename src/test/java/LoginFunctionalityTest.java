import base.TestBase;
import org.testng.annotations.Test;

public class LoginFunctionalityTest extends TestBase {

    @Test
    public void loginLinkTest() throws InterruptedException {
        loginPage.loginLinkClick();
        goSleep(5000);
    }

    @Test
    public void loginTestWithValidCredential(){
        loginPage.loginLinkClick();
        loginPage.loginWithValidCredential();
        loginPage.verifyLoginMessage();
    }

}
