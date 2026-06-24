package BasicSeleniumProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckPgm {


	    public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.guru99.com/test/radio.html");

	        // Input field (using another page)
	        driver.navigate().to("https://demo.guru99.com/test/login.html");
	        driver.findElement(By.id("email")).sendKeys("admin@gmail.com");

	        // Go back for checkbox & radio
	        driver.navigate().to("https://demo.guru99.com/test/radio.html");

	        // Checkbox
	        WebElement checkbox = driver.findElement(By.id("vfb-6-0"));
	        if (!checkbox.isSelected()) {
	            checkbox.click();
	        }

	        // Radio button
	        WebElement radio = driver.findElement(By.id("vfb-7-1"));
	        if (!radio.isSelected()) {
	            radio.click();
	        }

	        //driver.quit();
	    }
	}

