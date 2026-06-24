package BasicSeleniumProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathPgm {
	

	  public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://demo.guru99.com/test/login.html");
	        driver.manage().window().maximize();

	        // Locate Email using XPath (by attribute)
	        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");

	        // Locate Password using XPath
	        driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("123456");

	        // Click Sign in using text()
	        driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();

	        driver.quit();
	    }
}
