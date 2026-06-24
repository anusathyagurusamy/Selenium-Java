package TestNG;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardassertionPgm {

	    @Test
	    public void testHardAssertion() {

	        System.out.println("Step 1");

	        // Hard Assertion
	        Assert.assertEquals(10, 10);

	        System.out.println("Step 2");

	        // This will fail
	        Assert.assertEquals(5, 10);

	        // This line will NOT execute
	        System.out.println("Step 3");
	    }
	}

