package BasicSeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class WebTablePgm {
	    public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
	        driver.manage().window().maximize();

	        // Locate table
	        WebElement table = driver.findElement(By.tagName("table"));
	        
	        int rowCount = driver.findElements(By.xpath("//table/tbody/tr")).size();
	        int colCount = driver.findElements(By.xpath("//table/thead/tr/th")).size();

	        System.out.println("Rows: " + rowCount);
	        System.out.println("Columns: " + colCount);
	      

	        // Get all rows
	        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

	        System.out.println("Total Rows: " + rows.size());

	        // Loop through rows
	        for (WebElement row : rows) {

	            List<WebElement> cols = row.findElements(By.tagName("td"));

	            for (WebElement col : cols) {
	                System.out.print(col.getText() + " | ");
	            }
	            System.out.println();
	        }

	        driver.quit();
	    }
}
