package data;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class StaplesStore extends CommonAPI
{
    @Test //test #1
    public void testTitle()
    {
        String expectedTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();

        String actuaTitle = "Staples® Official Online Store";
        softAssert.assertEquals(actuaTitle, expectedTitle, "Title did not match!");
        softAssert.assertAll();

        System.out.println(actuaTitle);
        System.out.println(expectedTitle);
    }

    @Test //test #2
    public void testTypingOnSearchBox() throws InterruptedException
    {
        List<String> list = TestData.getListOfItems();

        for(int i = 0; i < list.size(); i++)
        {
            driver.findElement(By.id("searchInput")).sendKeys(list.get(i), Keys.ENTER);
            Thread.sleep(2000);
        }
    }

    @Test //test #3
    public void clickOnItemFromSearchResult()
    {

    }

    @Test //test #4
    public void addToShoppingCart()
    {

    }

    @Test //test #5
    public void checkTheItemsInShoppingCart()
    {

    }

    @Test //test #6
    public void applyPromoCode()
    {

    }

    @Test //test #7
    public void placeOrder()
    {

    }

    @Test //test #8
    public void signIn()
    {

    }

    @Test //test #9
    public void createNewAccount()
    {

    }

    @Test //test #10
    public void getPhoneNumber()
    {

    }

    @Test //test #11
    public void goToTheSignUpForEmailPage()
    {

    }


    @Test //test #12
    public void readData()
    {

    }

    @Test //test #13
    public void selectYourLocalStore()
    {

    }

    @Test //test #14
    public void clickOnTermsAndConditions()
    {

    }

    @Test //test #15
    public void clickOnCleaningSupplies()
    {

    }
}
