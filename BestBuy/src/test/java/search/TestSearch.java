package search;

import bestbuyhomepage.BestBuyHomePage;
import data.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.List;

public class TestSearch extends BestBuyHomePage
{
    @Test
    public void testTypingOnSearchBox() throws InterruptedException
    {
        List<String> list = TestData.getListOfItems();

        for(int i = 0; i < list.size(); i++)
        {
            driver.findElement(By.id("gh-search-input")).sendKeys(list.get(i), Keys.ENTER);
            Thread.sleep(2000);
        }
    }
}
