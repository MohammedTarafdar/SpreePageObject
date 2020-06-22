package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LogoutPage {


    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    private WebElement logoutButton;

    @FindBy(xpath = "//div[@class='alert alert-notice']")
    private WebElement logoutMessage;

    public void logoutFunction(){
        logoutButton.click();
    }

    public void verifyLogoutMessage(){
        String signOutMessage = logoutMessage.getText();
        Assert.assertEquals(signOutMessage, "Signed out successfully.");

    }
}
