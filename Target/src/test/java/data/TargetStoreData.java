package data;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class TargetStoreData extends CommonAPI
{
    @Test //test #1
    public void testTitle()
    {
        String expectedTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();

        String actuaTitle = "Target : Expect More. Pay Less.";
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
            driver.findElement(By.id("search")).sendKeys(list.get(i), Keys.ENTER);
            Thread.sleep(5000);
        }
    }

    @Test //test #3
    public void clickOnItemFromSearchResult() throws InterruptedException
    {
        driver.findElement(By.id("search")).sendKeys("mountain dew", Keys.ENTER);
        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div/div[2]/div[3]/div[2]/ul/li[1]/div/div[2]/div/div/div/div[1]/div[1]/a")).click();
        Thread.sleep(5000);
    }

    @Test //test #4
    public void addToShoppingCart() throws InterruptedException
    {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div/div[2]/div[3]/div[2]/ul/li[1]/div/div[2]/div/div/div/div[1]/div[1]/a")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[2]/div[3]/div[1]/div/div/div/div[1]/div/div/div[1]/div[2]/div/button")).click();
        Thread.sleep(5000);
    }

    @Test //test #5
    public void checkTheItemsInShoppingCart() throws InterruptedException
    {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/nav/a[8]/span[3]/div/svg")).click();
        Thread.sleep(5000);
    }

    @Test //test #6
    public void applyPromoCode() throws InterruptedException
    {
        checkTheItemsInShoppingCart();
        driver.findElement(By.id("promoCodeEntry")).sendKeys("abcde12345", Keys.ENTER);
        Thread.sleep(5000);
    }

    @Test //test #7
    public void placeOrder() throws InterruptedException
    {
        checkTheItemsInShoppingCart();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/div/div/div/div[2]/button")).click();
        Thread.sleep(5000);
    }

    @Test //test #8
    public void signIn() throws InterruptedException
    {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/nav/a[7]/span[1]/span/div/svg/path")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[7]/div/div/ul/li[1]/a/div")).click();
        Thread.sleep(5000);

        driver.findElement(By.id("login")).click();
        Thread.sleep(3000);
    }

    @Test //test #9
    public void createNewAccount() throws InterruptedException
    {
        signIn();
        driver.findElement(By.id("createAccount")).click();
        Thread.sleep(5000);
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
    public void clickOnGrocery()
    {

    }

    public void rana()
    {

    }
}
