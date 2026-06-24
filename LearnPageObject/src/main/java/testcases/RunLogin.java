package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.WelcomePage;
import pages.login;

public class RunLogin extends BaseClass {
	@Test
	public void runLogin()
	{
		System.out.println(driver);
		login lp=new login();
		/*lp.enterUname();
		lp.enterPwd();
		lp.clickLogin();
		WelcomePage wp=new WelcomePage();
		wp.clickCrmsfa();*/
	lp.enterUname().enterPwd().clickLogin().clickCrmsfa().clickLeads().createLead().entercName().enterfName().enterlName().clickSubmit().verifyLeads();
	}

}
