package TestingFaceBook;

import CommonApi.DriverAccess;
import FaceBookData.FbSearchData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.List;

@Test
public class TestingFBNames extends DriverAccess {

    public void TestNames() throws InterruptedException{

        List<String> list = FbSearchData.ListOfItems();
        for(int i = 0; i<list.size(); i++) {
            //if you want to find by ID
            driver.findElement(By.id("email")).sendKeys(list.get(i), Keys.ENTER);
            /*driver.findElement(By.cssSelector("")).clear(); //if you want to find by cssSelector */
            Thread.sleep(2000);
        }


    }
}
