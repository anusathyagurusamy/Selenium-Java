package BasicSeleniumProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementPgm {

	public static void main(String[] args) {
		
				WebDriver driver = new ChromeDriver();
		        driver.get("https://www.facebook.com");

		        // Locate elements
		        WebElement username = driver.findElement(By.name("email"));
		        WebElement password = driver.findElement(By.name("pass"));
		        WebElement loginBtn=driver.findElement(By.xpath("//div[@aria-label='Log in']"));
		        
		        
		        // Perform actions
		        username.sendKeys("testuser");
		        password.sendKeys("123456");

		        System.out.println("Username field displayed: " + username.isDisplayed());

		        loginBtn.click();

		        driver.quit();
		    }
		}
