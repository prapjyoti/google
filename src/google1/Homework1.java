package google1;
/*
Navigate to google https://www.google.com/
In Google search type "nopCommerce demo store" and click search
Click on the link "nopCommerce demo store"
Click on Computers and Verify that the user successfully navigated to Computers page.
Navigate to google https://www.google.com/
In Google search type "nopCommerce demo store" and click search
Click on the link "nopCommerce demo store"
Click on Electronics and Verify that the user successfully navigated to Electronics page.
Above same test do for Apparel, Digital downloads, Books, Jewelry, Gift Cards.

 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Homework1 {
    WebDriver driver;//global variable declare

    @Before

    public void setUp() {

        String baseUrl = "https://www.google.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    //In Google search type "nopCommerce demo store" and click search
    //Click on Computers and Verify that the user successfully navigated to Computers page.
//Navigate to google https://www.google.com/
    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {

        //driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//body[@class='EM1Mrb']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Computers")).click();
    }

    //Click on the link "nopCommerce demo store"
    //Click on Electronics and Verify that the user successfully navigated to Electronics page.
    @Test
    public void verifyUserShouldNavigateToElectronicPageSuccessfully() {

        driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.navigate().to("https://demo.nopcommerce.com/");//use navigate to method
        driver.findElement(By.linkText("Electronics")).click();//find element by using linkText locator
    }
    //Click on the link "nopCommerce demo store"
    //Click on Apparel and Verify that the user successfully navigated to Apparel page.
    @Test
    public void verifyUserShouldNavigateToApparelPageSuccessfully() {

        driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Apparel")).click();
    }
    //Click on the link "nopCommerce demo store"
    //Click on Apparel and Verify that the user successfully navigated to Apparel page.
    @Test
    public void verifyUserShouldNavigateToDigitalDownLoadsPageSuccessfully() {

        driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Digital downloads")).click();
    }
    //Click on the link "nopCommerce demo store"
    //Click on Books and Verify that the user successfully navigated to Books page.
    @Test
    public void verifyUserShouldNavigateBooksPageSuccessfully() {

        driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Books")).click();
    }
    //Click on the link "nopCommerce demo store"
    //Click on Jewelry and Verify that the user successfully navigated to Jewelry page.
    @Test
    public void verifyUserShouldNavigateJewelryPageSuccessfully() {

        driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Jewelry")).click();
    }
    //Click on the link "nopCommerce demo store"
    //Click on Gift Cards and Verify that the user successfully navigated to Gift Cards page.
    @Test
    public void verifyUserShouldNavigateGiftCardsPageSuccessfully() {

        driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).sendKeys(Keys.ENTER);
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Gift Cards")).click();
    }
    //using after method and use driver quit as closing the browser and other windows associated with driver
    @After
    public void tearDown() {

        driver.quit();
    }

}
