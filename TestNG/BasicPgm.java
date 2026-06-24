package TestNG;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
public class BasicPgm {
	

	    @BeforeMethod
	    public void setup() {
	        System.out.println("Browser Launched");
	    }

	    @Test
	    public void homePageTest() {
	        System.out.println("Home Page Test Executed");
	    }

	    @AfterMethod
	    public void teardown() {
	        System.out.println("Browser Closed");
	    }
	}
	
