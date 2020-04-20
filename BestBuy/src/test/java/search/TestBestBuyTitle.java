package search;

import bestbuyhomepage.BestBuyHomePage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestBestBuyTitle extends BestBuyHomePage
{
    @Test
    public void testTitle()
    {
        String expectedTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();

        String actuaTitle = "Best Buy | Official Online Store | Shop Now & Save";
        softAssert.assertEquals(actuaTitle, expectedTitle, "Title did not match!");
        softAssert.assertAll();

        System.out.println(actuaTitle);
        System.out.println(expectedTitle);
    }
}
