package pages;

import base.PageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends PageBase {

    @FindBy(xpath = "//a[contains(text(),'Login')]")
    private WebElement loginLink;

    @FindBy(xpath = "//h3[@class='panel-title']")
    private WebElement panelTitle;

    @FindBy(xpath = "//input[@id='spree_user_email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='spree_user_password']")
    private WebElement password;

    @FindBy(xpath = "//input[@name='commit']")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement loginSuccessMessage;

    public void loginLinkClick(){
        loginLink.click();
        String panelText = panelTitle.getText();
        Assert.assertEquals(panelText, "Login as Existing Customer");
    }

    public void loginWithValidCredential(){
        email.sendKeys("hellogenius.shift@gmail.com");
        password.sendKeys("shift1234");
        loginButton.click();
    }


    public void verifyLoginMessage(){
        String loginMessage = loginSuccessMessage.getText();
        Assert.assertEquals(loginMessage, "Logged in successfully");

    }
}
