package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class WorkShopTasksTests {

    private static WebDriver driver;

    HomePage homePage;
    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.navigate().to("https://duckduckgo.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void task2() {
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.logo().isDisplayed(),"The Logo is Not Available");
    }

    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }


}
