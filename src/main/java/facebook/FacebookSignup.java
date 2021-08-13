package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


/*public class Fb_SignupPage {
	
public WebDriver driver;
public Fb_SignupPage(WebDriver ldriver)
{
this.driver=ldriver;

}
@FindBy(name="firstname") WebElement ufirstname;
@FindBy(name="lastname") WebElement ulastname;
@FindBy(name="reg_email__") WebElement uemail;

@FindBy(name="reg_passwd__") WebElement upass;

//@FindBy(xpath="//select[@title='Day']")

By heading1 =By.xpath("//select[@title='Day']");
//element(heading1).selectByVisibleText("10");
//By heading2 =By.xpath("//select[@title='Month']");
//By heading3 =By.xpath("//select[@title='Year']");




}*/
public class FacebookSignup {

WebDriver driver;

String fbUrl = "https://en-gb.facebook.com/";
String facebookUrl = "https://en-gb.facebook.com/";
public void invokeBrowser()
{
	System.setProperty("webdriver.chrome.driver","/Users/parth/eclipse-workspace/FacebookTest/drivers/chromedriver");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();

	driver.manage().deleteAllCookies();
	
	driver.get(fbUrl);
	
	String urlFromBrowser = driver.getCurrentUrl();
	
	if(urlFromBrowser.equalsIgnoreCase(facebookUrl)) {
		System.out.println("fb has redirected to facebook");
	} else {
		System.out.println("No redirection happened");
	}
}
public void facebookSignUp() {
	
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

public void closeBrowser(){
	
	driver.quit();
	
}

}

