package BasicSeleniumProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FramePgm {
    public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.guru99.com/test/guru99home/");
	        driver.manage().window().maximize();

	        // Switch to frame using ID
	        driver.switchTo().frame("a077aa5e");
	        System.out.println("Current focus"+driver.getTitle());

	        // Perform action inside frame
	        driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
	        System.out.println("Current focus"+driver.getTitle());
	        // Switch back to main page
	        driver.switchTo().defaultContent();
	     

	       // driver.quit();
	    }
	}


