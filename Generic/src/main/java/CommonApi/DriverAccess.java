package CommonApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class DriverAccess {


   public WebDriver driver = null;

   //Accessing Driver and Opening Browser

    @BeforeMethod
    @Parameters({"url"})
    public void  setDriver(String url) {
        System.setProperty("webdriver.chrome.driver", "/Users/evanarafatbd/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }


    //Closing Browser After
    @AfterMethod
    public void cleanUp() {
        driver.close();
    }

}

