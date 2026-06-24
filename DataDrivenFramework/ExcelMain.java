package DataDrivenFramework;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ExcelMain {

		
			@Test(dataProvider = "practiceFormData")
		    public void seleniumPracticeForm(String email,String password) throws InterruptedException
		    {
		 
		        ChromeDriver driver = new ChromeDriver();
		        driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
			    // To enter the email
		        driver.findElement(By.id("email")).sendKeys(email);
		        //To enter the password
		        driver.findElement(By.id("password")).sendKeys(password);
		        Thread.sleep(3000);
		        driver.close();
		    }
			
			@DataProvider(name = "practiceFormData")
		    public static Object[][] getPracticeData() throws IOException {
				String fileLocation = "D:\\EclipseAnusathya\\AutomationTesting\\testdata\\myexcel.xlsx";
		        return ExcelRead.getExcelData();
		    }
		}

