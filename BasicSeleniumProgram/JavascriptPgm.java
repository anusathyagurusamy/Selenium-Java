package BasicSeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavascriptPgm {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//Scroll down by pixel
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(2000);
		//Scroll UP by Pixel
		js.executeScript("window.scrollBy(0,-100);");
		Thread.sleep(2000);
		//Scroll to footer
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(2000);
		
		 // Locate email input field
        WebElement email = driver.findElement(By.xpath("//*[@id=\"_R_1h6kqsqppb6amH1_\"]"));

        // Scroll to email field
        js.executeScript("arguments[0].scrollIntoView(true);", email);

        // Enter text using JavaScript
        js.executeScript("arguments[0].value='anu';", email);

		}

}
