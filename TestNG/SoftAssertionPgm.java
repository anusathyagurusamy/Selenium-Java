package TestNG;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class SoftAssertionPgm {


	    @Test
	    public void testSoftAssertion() {

	        SoftAssert soft = new SoftAssert();

	        System.out.println("Step 1");

	        soft.assertEquals(10, 10); // Pass

	        System.out.println("Step 2");

	        soft.assertEquals(5, 10); // Fail (but continues)

	        System.out.println("Step 3");

	        soft.assertTrue(false); // Fail

	        System.out.println("Step 4");

	        // IMPORTANT: Collect all results
	        soft.assertAll();
	    }
	}
