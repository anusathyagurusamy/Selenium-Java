package TestNG;
import org.testng.annotations.Test;
public class GroupsPgm {
		@Test(groups = {"smoke", "login"})
	    public void loginTest() {
	        System.out.println("Login Test");
	    }

	    @Test(groups = {"regression", "search"})
	    public void searchProduct() {
	        System.out.println("Search Product");
	    }

	    @Test(groups = {"regression", "cart"})
	    public void addToCart() {
	        System.out.println("Add To Cart");
	    }

	    @Test(groups = {"regression", "payment"})
	    public void paymentTest() {
	        System.out.println("Payment Test");
	    }

	    @Test(groups = {"sanity", "logout"})
	    public void logoutTest() {
	        System.out.println("Logout Test");
	    }
	}
