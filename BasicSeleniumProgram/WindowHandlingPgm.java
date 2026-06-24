package BasicSeleniumProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandlingPgm {
		public static void main(String[] args) throws InterruptedException {
			
			//Instantiate chrome Driver
		        ChromeDriver driver=new ChromeDriver();
				
				// Get the parent window
				driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
				driver.manage().window().maximize();
				
				// To get the Parent window name
				String parentwindow=driver.getWindowHandle();
				System.out.println(parentwindow);
				
				//switch to next window by triggering next tab button
				driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[1]")).click();
				
				//To get the address of all windows
				Set<String> allwindow= driver.getWindowHandles();
		        System.out.println(allwindow);
		        
		        //To know the driver status
		        System.out.println(driver.getCurrentUrl());
		        System.out.println(driver.getTitle());
		       
		        // To switch to childwindow
		        List<String> list=new ArrayList<String>(allwindow);
		        driver.switchTo().window(list.get(1)); 
		        System.out.println(driver.getTitle());
		        
		       /* //To Locate element in Parent Window
		        WebElement selenium =driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[2]"));
		        selenium.click(); */
		         
		        //Interact in the child window
		    
		        driver.findElement(By.xpath("/html/body/div/header/div[3]/a")).click();
		        System.out.println(driver.getWindowHandle());
		        
		        //Again Handling Windows since we are opened new window again
		      //handle allwindows 
		        Set<String> allwindows1=driver.getWindowHandles();
		        System.out.println(allwindows1);
		        //To clear the list and add new set of strings
		        list.clear();
		        list.addAll(allwindows1);
		        //To switch the driver to the new  child window
		    
		        driver.switchTo().window(list.get(2));
		        System.out.println(driver.getTitle());
		       // driver.findElement(By.xpath("//a[text()='Login']")).click();

		        
		        //Interact in  the second child window
		        WebElement Login=driver.findElement(By.xpath("/html/body/header/div/div[2]/a[4]"));
		        Login.click();
		        driver.switchTo().window(list.get(1));
		        Thread.sleep(3000);
		        System.out.println(driver.getTitle());
		        driver.switchTo().window(list.get(0));
		        Thread.sleep(3000);
		        System.out.println(driver.getTitle());
		    // To close the child windows
		        for (String close : allwindows1) {
		       	 if(!close.equals(parentwindow))
		       	 {
		       		 driver.switchTo().window(close);
		       		 driver.close();
		       	 }
		        }
		}
		}

