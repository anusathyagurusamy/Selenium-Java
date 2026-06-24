package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Edge {
	@Test
	public void EdgeBrowser()
	{
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://chatgpt.com/");
		  System.out.println("Test1 Thread ID: " + Thread.currentThread().getId());
		//driver.close();
	}
	

}
