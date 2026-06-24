package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox {
	@Test
	public void Chrome()
	{
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://chatgpt.com/");
		  System.out.println("Test1 Thread ID: " + Thread.currentThread().getId());	
		//driver.close();
	}
	

}
