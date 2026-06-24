package BasicSeleniumProgram;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotPgm {
	
	    public static void main(String[] args) throws IOException {

	        // Launch browser
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();

	        // Take screenshot
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File src = ts.getScreenshotAs(OutputType.FILE);

	        // Save screenshot
	        File dest = new File("facebook.png");
	        FileHandler.copy(src, dest);

	        System.out.println("Screenshot captured successfully");
	        System.out.println(dest.getAbsolutePath());

	        // Close browser
	        driver.quit();
	    }
	}

