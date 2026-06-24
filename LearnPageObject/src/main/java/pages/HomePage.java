package pages;

import org.openqa.selenium.By;
import base.BaseClass;
public class HomePage extends BaseClass{
			public MyLeads clickLeads() {
			driver.findElement(By.linkText("Leads")).click();
			return new MyLeads();
		}

	}