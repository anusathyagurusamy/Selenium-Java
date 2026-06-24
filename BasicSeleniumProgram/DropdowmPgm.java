package BasicSeleniumProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdowmPgm {
	

	    public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.guru99.com/test/newtours/register.php");
	        driver.manage().window().maximize();

	        // Locate dropdown using name
	        WebElement country=driver.findElement(By.name("country"));
	        
	        Select countryDropdown = new Select(country);

	        // Select by visible text
	       // countryDropdown.selectByVisibleText("INDIA");

	        // Select by value
	        //countryDropdown.selectByValue("INDIA");

	        // Select by index
	        countryDropdown.selectByIndex(4);

	       // driver.quit();
	    }
	}

