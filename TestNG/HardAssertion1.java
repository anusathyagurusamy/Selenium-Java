package TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class HardAssertion1 {
	

		 WebDriver driver;

	    @BeforeMethod
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	    }

	    @Test
	    public void verifyTitle() {
	        String actualTitle = driver.getTitle();
	        String expectedTitle = "Google";

	        // Hard Assertion
	        Assert.assertEquals(actualTitle, expectedTitle);
	        
	        System.out.println("Title Verified Successfully");
	    }

	    @AfterMethod
	    public void teardown() {
	        driver.quit();
	    }
	}
	
