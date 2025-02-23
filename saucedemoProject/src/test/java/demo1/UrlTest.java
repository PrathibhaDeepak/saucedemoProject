package demo1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import demo1.MainTest;


public class UrlTest extends MainTest{
	
	@Test
		void testurl() throws InterruptedException
		{
		
//pass the url
		driver.get("https://www.saucedemo.com/");
//wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(3000);
//maximize the url
		driver.manage().window().maximize();
		String actUrl =	driver.getCurrentUrl();
		String expUrl = "https://www.saucedemo.com/";
		Thread.sleep(3000);
		System.out.println("Actual Url: " + actUrl);
		System.out.println("Expected Url: " + expUrl);
		Thread.sleep(3000);

		Assert.assertEquals(actUrl, expUrl);
		System.out.println("Url Test passed");
		}
	@AfterMethod
	void teardown()
	{
//close the browser
		//driver.close();
		driver.quit();
		
		
}
	

}
