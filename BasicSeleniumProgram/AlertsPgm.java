package BasicSeleniumProgram;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPgm {
	
	

	    public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.guru99.com/test/delete_customer.php");

	        driver.findElement(By.name("submit")).click();

	        Alert alert = driver.switchTo().alert();

	        // Accept
	        alert.accept();
	        //Dismiss
	        //alert.dismiss();
	        Thread.sleep(3000);
	        alert.accept();

	       // driver.quit();
	    }
	}