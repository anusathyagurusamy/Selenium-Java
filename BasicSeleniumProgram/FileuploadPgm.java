package BasicSeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadPgm {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testing.qaautomationlabs.com/file-upload.php");
		WebElement upload=driver.findElement(By.xpath("//input[@type='file']"));
		upload.sendKeys("D:\\EclipseAnusathya\\AutomationTesting\\facebook.png");
	}

}
