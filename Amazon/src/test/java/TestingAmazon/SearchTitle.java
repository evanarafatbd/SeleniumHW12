package TestingAmazon;

import CommonApi.DriverAccess;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchTitle extends DriverAccess {

    @Test
    public void testTitle(){

        String expectedTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        String actualTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        softAssert.assertEquals( actualTitle,expectedTitle,"Title did not match. So you need to double check");
        softAssert.assertAll();
        System.out.println(actualTitle);
        System.out.println(expectedTitle);
    }

}
