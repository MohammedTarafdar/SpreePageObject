package base;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Driver {


    public static WebDriver driver;


    public void setBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://spree.shiftedtech.com/");

    }


    /*public void setDriver() {
        if (getProperty("browser").equalsIgnoreCase("firefox")) {
            initFirefox();
        } else {
            // set deafult browser;
            initFirefox();
        }
        setDriverProperties();
    }

    public void initFirefox() {
        driver = new FirefoxDriver();
    }

    public void initChrome() {

        System.setProperty("webdriver.chrome.driver", "chrome driver path");


    }

    public void setDriverProperties() {
        driver.manage().window().maximize();
        driver.get(getProperty("appUrl"));
    }*/

    public void closeBrowser(){
       // Thread.sleep(5000);
        driver.close();
    }

    public void quitBrowser(){

        driver.quit();
    }




    /*public void goSleep() throws InterruptedException {
        Thread.sleep(5000);
    }*/


}
