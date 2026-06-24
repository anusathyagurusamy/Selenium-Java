package BasicSeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPgm {


	    public static void main(String[] args) throws InterruptedException {
	    	//ChromeDriver Instantiation
	    	ChromeDriver driver=new ChromeDriver();
	    	driver.get("https://vinothqaacademy.com/mouse-event/");
	    	driver.manage().window().maximize();
	    	//Action Class Instantiation
	    	Actions action =new Actions(driver); 
	    	//DoubleClick
	    	WebElement doubl=driver.findElement(By.xpath("//button[@id='doubleBtn']"));
	    	action.doubleClick(doubl).perform();
	    	//RightClick
	    	WebElement right=driver.findElement(By.xpath("//button[@id='rightBtn']"));
	    	action.contextClick(right).perform();
	    	//Drag and Drop
	    	WebElement source=driver.findElement(By.xpath("//div[@id='dragItem']"));
	    	WebElement des=driver.findElement(By.xpath("//div[@id='dropZone']"));
	    	action.dragAndDrop(source, des).build().perform();
	    	//a.dragAndDrop(src,des).perform();
	    	//Mouse Hover
	    	WebElement tooltip=driver.findElement(By.xpath("//div[@id='tooltipTarget']"));
	    	action.moveToElement(tooltip).perform();
	    	action.scrollToElement(tooltip).perform();
	    	//WebElement slider=driver.findElement(By.xpath("//div[@id='slider']"));
	    	//action.scrollToElement(slider).perform();
	    }
	}