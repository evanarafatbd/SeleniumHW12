package TestingAmazon;

import AmazonData.SearchData;
import CommonApi.DriverAccess;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.List;

import static org.openqa.selenium.Keys.ENTER;

public class TestingItems extends DriverAccess {

   @Test
    public void testTypingOnSearchBox()throws InterruptedException{

        List<String> list = SearchData.ListOfItems();
        for(int i = 0; i<list.size(); i++){
            driver.findElement(By.cssSelector("#twotabsearchtextbox")).clear();
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys(list.get(i), Keys.ENTER);
            Thread.sleep(2000);




        }

    }


}
