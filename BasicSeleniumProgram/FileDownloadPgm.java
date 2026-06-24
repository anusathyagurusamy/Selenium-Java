package BasicSeleniumProgram;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadPgm {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://testing.qaautomationlabs.com/file-download.php");
		
		WebElement text=driver.findElement(By.id("textInput"));
		text.sendKeys("Hi, Hello Welcome To Innovel");
		
		WebElement generate=driver.findElement(By.xpath("/html/body/div/div[1]/section/div/div/div/div[2]/div/div/div/div/button"));
		generate.click();
		
		Thread.sleep(2000);
		
		WebElement download=driver.findElement(By.xpath("//a[@id='downloadLink']"));
		download.click();
		
		String downloadDir = "C:\\Users\\Anusathya G\\Downloads";
		// Validate
		File dir = new File(downloadDir);
		File[] files = dir.listFiles();

		boolean found = false;

		for (File f : files) {
		    if (f.getName().contains("myfile")) {
		        found = true;
		        break;
		    }
		}

		if (found) {
		    System.out.println("Test Passed");
		} else {
		    System.out.println("Test Failed");
		}
		
		
	}

}
