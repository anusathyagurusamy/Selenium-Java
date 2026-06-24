package TestNG;
import org.testng.Assert;
import org.testng.annotations.Test;
public class DependsPgm {
	

    @Test(priority=0)
	    public void startServer() {
	        System.out.println("Server Started");
	    }

	    @Test(priority=1)
	    public void login() {
	        System.out.println("Login Done");
	      	    }

	    @Test(dependsOnMethods = {"startServer", "login"})
	    public void executeTest() {
	        System.out.println("Test Executed");
	    }
	}

