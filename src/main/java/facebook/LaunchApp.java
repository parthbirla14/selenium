package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApp {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","/Users/parth/eclipse-workspace/FacebookTest/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
	System.out.println(driver.getTitle());
	//driver.findElement(By.xpath("//*[text() = 'English (US)']")).click();
		
	Thread.sleep(500);
		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		
		
		
		
		
		
		
		
	}

}
