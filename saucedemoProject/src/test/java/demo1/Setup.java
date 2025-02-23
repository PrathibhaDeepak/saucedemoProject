package demo1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Setup extends MainTest {
	
	
	@BeforeMethod
	void setbrowser() throws InterruptedException
	{
//initialize driver instance
		//driver = new ChromeDriver();
//pass the url
		driver.get("https://www.saucedemo.com/");
//wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(3000);
//maximize the url
		driver.manage().window().maximize();
		
		
		
	}
	@Test(priority=1)
	void setlogin() throws InterruptedException
	{
//locate webEle and pass the username
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
//locate webEle and pass the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(3000);
//click on the Login button
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.name("login-button")).click();

	}
	
	@AfterMethod
	void teardown() throws InterruptedException
	{
//close the browser
		//driver.close();
		Thread.sleep(3000);
		System.out.println(" Test passed Browser closed successfully!");
		driver.quit();
		
		
}

}
