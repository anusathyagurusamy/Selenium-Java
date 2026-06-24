package BasicSeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorsPgm {

	    public static void main(String[] args) {

	        // Launch browser
	        WebDriver driver = new ChromeDriver();

	        // Open URL
	        driver.get("https://demo.guru99.com/test/login.html");

	        // Maximize window
	        driver.manage().window().maximize();

	        // 1. ID Locator
	        driver.findElement(By.id("email")).sendKeys("test@gmail.com");

	        // 2. Name Locator
	        driver.findElement(By.name("passwd")).sendKeys("123456");

	        // 3. Link Text
	        driver.findElement(By.linkText("Forgot your password?")).click();

	        // Navigate back
	        driver.navigate().back();

	        // 4. CSS Selector
	        driver.findElement(By.cssSelector("#email")).clear();
	        driver.findElement(By.cssSelector("#email")).sendKeys("new@gmail.com");

	        // 5. XPath
	        driver.findElement(By.xpath("//input[@id='passwd']")).clear();
	        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("newpassword");

	        // 6. Class Name
	        driver.findElement(By.className("button")).click();

	        // Close browser
	       // driver.quit();
	    }
	}

