package pages;
import org.openqa.selenium.By;
import base.BaseClass;
public class MyLeads extends BaseClass{
			public CreateLead createLead() {
			driver.findElement(By.linkText("Create Lead")).click();
			return new CreateLead();
		}

	}

