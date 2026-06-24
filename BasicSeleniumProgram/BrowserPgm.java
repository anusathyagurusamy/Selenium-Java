package BasicSeleniumProgram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserPgm {
	

	    public static void main(String[] args) throws InterruptedException {

	        // Step 1: Launch Browser
	        WebDriver driver = new ChromeDriver();

	        // Step 2: Open URL
	        driver.get("https://www.google.com");

	        // Step 3: Maximize Window
	        driver.manage().window().maximize();

	        // Step 4: Get Title
	        System.out.println("Page Title: " + driver.getTitle());

	        // Step 5: Get Current URL
	        System.out.println("Current URL: " + driver.getCurrentUrl());

	        // Step 6: Navigate to another site
	        driver.navigate().to("https://www.facebook.com");
	        Thread.sleep(2000);

	        // Step 7: Navigate Back
	        driver.navigate().back();
	        Thread.sleep(2000);

	        // Step 8: Navigate Forward
	        driver.navigate().forward();
	        Thread.sleep(2000);

	        // Step 9: Refresh Page
	        driver.navigate().refresh();
	        Thread.sleep(2000);

	        // Step 10: Minimize Window
	        driver.manage().window().minimize();
	        Thread.sleep(2000);

	        // Step 11: Fullscreen
	        driver.manage().window().fullscreen();
	        Thread.sleep(2000);

	        // Step 12: Close Browser (current window)
	        // driver.close();

	        // Step 13: Quit Browser (all windows)
	        driver.quit();
	    }
	}

