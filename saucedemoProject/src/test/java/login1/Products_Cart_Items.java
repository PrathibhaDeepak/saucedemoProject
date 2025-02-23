package login1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Products_Cart_Items extends LoginValid1 {
	@Test(priority=20)
	void backpack() throws InterruptedException
	{
		
		driver.findElement(By.xpath("(//div[contains(@class,'item_img')])[1]")).click();
		Thread.sleep(2000);
		String expPrice1 = "$29.99";
		String actPrice1 = driver.findElement(By.xpath("(//button[text()='Add to cart']/preceding-sibling::div)[3]")).getText();
		System.out.println("Backpack-Expected Price: " + expPrice1);
		System.out.println("Backpack-Actual Price: " + actPrice1);
		Thread.sleep(2000);
		Assert.assertEquals(actPrice1, expPrice1);
		System.out.println("Backpack Price Test Passed!");
		System.out.println("--------------------------------");
	}
	
	@Test(priority=22)
	void addtocartbpack() throws InterruptedException
	{
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
		Thread.sleep(3000);
	}
	@Test(priority=23)
	void backprod() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[contains(@class,'left')]/child::button")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=24)
	void bikelight() throws InterruptedException
	{		
		driver.findElement(By.xpath("(//div[contains(@class,'item_img')]/descendant::img)[2]")).click();
		Thread.sleep(3000);
		
		
			System.out.println("Bike light added to Cart -Test Passed!");
			System.out.println("--------------------------------");
			Thread.sleep(2000);

	}
	@Test(priority=25)
	void addtocartlight() throws InterruptedException
	{
		//driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
		Thread.sleep(3000);
	}
	@Test(priority=26)
	void backprodl() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[contains(@class,'left')]/child::button")).click();
		Thread.sleep(4000);

	}
	@Test(priority=27)
	void boltTshirt() throws InterruptedException
	{		
		driver.findElement(By.xpath("(//div[contains(@class,'item_img')]/descendant::img)[3]")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(4000);

			System.out.println("Bolt T-Shirt added to Cart -Test Passed!");
			System.out.println("--------------------------------");
			Thread.sleep(3000);

	}
	@Test(priority=28)
	void backprod2()
	{
		driver.findElement(By.xpath("//div[contains(@class,'left')]/child::button")).click();
	}
	
	@Test(priority=29)
	void redTshirt() throws InterruptedException
	{		
		driver.findElement(By.xpath("(//div[contains(@class,'item_img')]/descendant::img)[6]")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(4000);

			System.out.println("Red T-Shirt added to Cart -Test Passed!");
			System.out.println("--------------------------------");
			Thread.sleep(3000);

	}
	/*
	 * @Test(priority=29) void backprod3() {
	 * driver.findElement(By.xpath("//div[contains(@class,'left')]/child::button")).
	 * click(); }
	 */
		
	
	
		
}

