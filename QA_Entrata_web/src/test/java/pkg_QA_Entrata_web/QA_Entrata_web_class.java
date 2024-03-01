package pkg_QA_Entrata_web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QA_Entrata_web_class {
	public static WebDriver driver;
	   @BeforeTest(description = "Driver Initiallisation and Open entrata.com Homepage")
	   public void beforeEachTest() {
		  
	   //Driver Initiallisation
	   WebDriverManager.chromedriver().driverVersion("122.0.6261.94").setup(); 
    driver =  new ChromeDriver(); 
  
	   // Open entrata.com Homepage
	   driver.get("https://www.entrata.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   }
	   
	  @Test(priority = 1,description = "Test Home Page Title")
	    public void testHomePageTitle() {
		  
	        // Verify page title
	        String expectedTitle = "Property Management Software | Entrata";
	        String actualTitle = driver.getTitle();
	        System.out.println(actualTitle);
	        Assert.assertEquals(actualTitle, expectedTitle,"Title is not matching");
	    }
	  @Test(priority = 2,description = "Test Sign Button")
	  
	    public void testElementPresenceSignIn() {
	        // Verify presence of a specific element
	        WebElement signInButton = driver.findElement(By.linkText("Sign In"));
	        Assert.assertTrue(signInButton.isDisplayed(),"Sign In link is not displayed");
	    
	    }
	  @Test(priority = 3,description = "Test Watch Demo Button")
	  
	    public void ButtonClickableWatchDemo() {
	        // Verify presence of a specific element
	        WebElement watchDemoButton = driver.findElement(By.linkText("Watch Demo"));
	        Assert.assertTrue(watchDemoButton.isDisplayed() ,"Watch Demo link is not displayed");
	        Assert.assertTrue(watchDemoButton.isEnabled(),"Watch Demo link is not Enabled");

	    }
	  @Test(priority = 4,description = "Test Navigation bar")
	  
	    public void test_navigation_bar() {
		  //Assert the presence of "Solutions" dropdown
		    WebElement Solution=driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[2]/div[2]/div[1]"));
		    Assert.assertTrue(Solution.isDisplayed(), "Solution dropDown is not Displayed");
		    
		   //Assert the presence of "Products" dropdown
		    WebElement Products=driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[2]/div[1]/div[1]"));
		    Assert.assertTrue(Products.isDisplayed(), "Products dropDown is not Displayed");

		    //Assert the presence of "Resources" dropdown
		    WebElement Resources= driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[2]/div[3]/div[1]"));
		    Assert.assertTrue(Resources.isDisplayed(), "Resources dropDown is not Displayed");


	  }

	  @Test(priority = 5,description = "Verify Social Media Links")
	    public void testSocialMediaLinks() {
	        // Find social media links
	        WebElement twitterLink = driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/footer/div[2]/div[1]/div/div[1]/a[3]"));
	        WebElement linkedinLink = driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/footer/div[2]/div[1]/div/div[1]/a[4]"));
	        WebElement facebookLink = driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/footer/div[2]/div[1]/div/div[1]/a[1]"));
	        // Assertions
	        Assert.assertTrue(twitterLink.isDisplayed(), "Twitter link is not displayed");
	        Assert.assertTrue(linkedinLink.isDisplayed(), "LinkedIn link is not displayed");
	        Assert.assertTrue(facebookLink.isDisplayed(), "Facebook link is not displayed");
	    }
	  
	@Test(priority = 6,description = "Click on Acccept Cookies Button")
	    public void testAcceptCookies () {
	        // Find operating system Button
	        WebElement accept = driver.findElement(By.xpath("//*[@id=\"rcc-confirm-button\"]"));
	        Assert.assertTrue(accept.isDisplayed(), "Acccept Cookies  is not displayed");
	        Assert.assertTrue(accept.isEnabled(), "Acccept Cookies  is not Enabled");
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        accept.click();
	  }
	       
	 @Test(priority = 7,description = "Verify that Learn More Button navigate to another page ")
	    public void testoperatingsystemButton () {
	        // Find Learn More Button
	        WebElement LearnMoreButton = driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[2]/div[4]/div/div/div[2]/div/a"));	  
	        Actions actions = new Actions(driver);
	        actions.moveToElement(LearnMoreButton).click().build().perform();	        
	        // Verify page url
	       String expectedurl = "https://go.entrata.com/forrester-tei-study";
	        String actualurl = driver.getCurrentUrl();
	        System.out.println(actualurl);
	        Assert.assertEquals(actualurl, expectedurl,"Url is not matching");
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        }
	 @Test(priority = 8,description = "Complete the form to read the full study. ")
	    public void Completetheform () {
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //completed form field
	    //Verify first name  and enter value
	    
	   WebElement firstName= driver.findElement(By.name("FirstName"));
  Assert.assertTrue(firstName.isDisplayed(), "First Name  is not displayed");
  Assert.assertTrue(firstName.isEnabled(), "First Name  is not Enabled");       
  firstName.sendKeys("Reena");
  
	    //Verify last name  and enter value
  
  WebElement lastName= driver.findElement(By.name("LastName"));
  Assert.assertTrue(lastName.isDisplayed(), " Last Name  is not displayed");
  Assert.assertTrue(lastName.isEnabled(), " Last Name  is not Enabled");       
  lastName.sendKeys("kale");
  
	    //Verify  Email  and enter value

  WebElement Email= driver.findElement(By.name("Email"));
  Assert.assertTrue(Email.isDisplayed(), "Email  is not displayed");
  Assert.assertTrue(Email.isEnabled(), "Email is not Enabled");       
  Email.sendKeys("Reena12kale@gmail.com");
  
	    //Verify phone and enter value

  WebElement Phone= driver.findElement(By.name("Phone"));
  Assert.assertTrue(Phone.isDisplayed(), "Phone  is not displayed");
  Assert.assertTrue(Phone.isEnabled(), "Phone  is not Enabled");       
  Phone.sendKeys("123456789");
  
	    //Verify Company name and enter value

  WebElement Company= driver.findElement(By.name("Company"));
  Assert.assertTrue(Company.isDisplayed(), "Company  is not displayed");
  Assert.assertTrue(Company.isEnabled(), "Company  is not Enabled");       
  Company.sendKeys("Entrata");
  
	    //Verify Job Title name and enter value

  WebElement Title= driver.findElement(By.name("Title"));
  Assert.assertTrue(Title.isDisplayed(), "Title  is not displayed");
  Assert.assertTrue(Title.isEnabled(), "Title  is not Enabled");       
  Title.sendKeys("QA");
  
	    //Verify Unit count and enter value

  WebElement Unit_Count__c= driver.findElement(By.name("Unit_Count__c"));
  Assert.assertTrue(Unit_Count__c.isDisplayed(), "Unit Count   is not displayed");
  Assert.assertTrue(Unit_Count__c.isEnabled(), "Unit Count not Enabled");       
  Select s=new Select(Unit_Count__c);
  s.selectByValue("11 - 100");
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	 }
	 @AfterTest(description = "	Driver switch to main window and close")
	   public void afterEachTest() {
		  
	   //Driver switch to main window and close
	   driver.switchTo().defaultContent();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.close();
	   }
}
