package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class MainTest {
	
	public WebDriver driver;
	
	@BeforeClass
	void basetest()
	{
		driver = new ChromeDriver();
	}

}
