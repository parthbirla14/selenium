package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	public static WebDriver startApplication(WebDriver driver, String browserName, String url) 
	{
		if(browserName.equals("Chrome"))
		{
			 System.setProperty("webdriver.chrome.driver","/Users/parth/eclipse-workspace/FacebookTest/drivers/chromedriver");
				 driver = new ChromeDriver();
				 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
		else if (browserName.equals("Firefox"))
		{
			
		}
		else {
			System.out.println("do not support browser");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		return driver;
	}

	
	public static void quitBroweser(WebDriver driver)
	{
		driver.quit();
	}
}
