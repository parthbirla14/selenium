package Test_Signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FB_Signup_Test {
public	WebDriver driver;
	
@Test
public class FacebookSignupTest {
	
	WebDriver driver;
	
	String fbUrl = "https://en-gb.facebook.com/";
	String facebookUrl = "https://en-gb.facebook.com/";
	
	@BeforeClass
	public void invokeBrowser(){
		System.setProperty("webdriver.chrome.driver","/Users/parth/eclipse-workspace/FacebookTest/drivers/chromedrivere");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		driver.get(fbUrl);
		
		String urlFromBrowser = driver.getCurrentUrl();
		
		Assert.assertEquals(urlFromBrowser, facebookUrl, "No redirection happened");
		
		
	}
	
	
	
	
	@Test
	public void facebookSignUp() {
		
		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("User");
		driver.findElement(By.name("reg_email__")).sendKeys("testuser@test.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("testPassword");
		
		Select selDate = new Select(driver.findElement(By.xpath("//select[@title='Day']")));
		Select selMonth = new Select(driver.findElement(By.xpath("//select[@title='Month']")));
		Select selYear = new Select(driver.findElement(By.xpath("Year")));
		
		selDate.selectByVisibleText("14");
		selMonth.selectByVisibleText("sept");
		selYear.selectByVisibleText("1990");
		
		driver.findElement(By.xpath("//lable()text()='Male']")).click();
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}
	
	
	@AfterClass
	public void closeBrowser(){
		
		driver.quit();
		
	}

}}
