package TestNG;
import org.testng.annotations.Test;

public class Priority {
	
	
		    @Test(priority = 1)
	    public void launchBrowser() {
	        System.out.println("Browser Launched");
	    }

	    @Test(priority = 2)
	    public void login() {
	        System.out.println("User Logged In");
	    }

	    @Test(priority = 3)
	    public void logout() {
	        System.out.println("User Logged Out");
	    }
	}

