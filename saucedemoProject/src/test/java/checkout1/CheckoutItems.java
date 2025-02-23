package checkout1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import login1.Products_Cart_Items;

public class CheckoutItems extends Products_Cart_Items {
	
	@Test(priority=39)
		void cartIcon() throws InterruptedException
		{
			driver.findElement(By.xpath("//div[contains(@id,'cart_container')]/descendant::span")).click();
			Thread.sleep(3000);
		}
		@Test(priority=40)
		void checkout() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@name='checkout'][text()='Checkout']")).click();
		}
		
		@Test(priority=41)
		void checkoutInfo() throws InterruptedException
		{
			driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Anila");
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Jose");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("61832");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='continue']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//button[text()='Finish']")).click();
			Thread.sleep(3000);
		}
	

}
