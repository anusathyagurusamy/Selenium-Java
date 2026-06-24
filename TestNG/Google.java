package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google {
	@Test
	public void Chrome()
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://chatgpt.com/");
		  System.out.println("Test1 Thread ID: " + Thread.currentThread().getId());
		//driver.close();
	}
	

}
