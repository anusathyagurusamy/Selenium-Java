package TestNG;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNG.ListernerPgm.class)
public class Listener1 {
	
  @Test
	    public void testPass() {
	        System.out.println("Executing Pass Test");
	        Assert.assertTrue(true);
	    }

	    @Test
	    public void testFail() {
	        System.out.println("Executing Fail Test");
	        Assert.assertTrue(false);
	    }
	}

