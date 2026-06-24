package TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataproviderPgm {


	    @DataProvider(name = "userData")
	    public Object[][] data() {
	        return new Object[][] {
	            {"Hari", 25},
	            {"Ravi", 30},
	            {"Kumar", 28}
	        };
	    }

	    @Test(dataProvider = "userData")
	    public void userTest(String name, int age) {
	        System.out.println(name + " - " + age);
	    }
	}
