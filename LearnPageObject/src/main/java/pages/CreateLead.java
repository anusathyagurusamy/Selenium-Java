package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class CreateLead extends BaseClass {

	
	public CreateLead entercName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TEstleaf");
		return this;
		
	}
	public CreateLead enterfName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("saranya");
		return this;
		
	}
	public CreateLead enterlName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		return this;
		
	}
	public ViewLead clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLead();
		
	}
	}
