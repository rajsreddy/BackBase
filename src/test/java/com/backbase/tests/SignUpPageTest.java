package com.backbase.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.backbase.basepackage.BaseClass;
import com.backbase.pages.HomePage;

public class SignUpPageTest extends BaseClass {
	HomePage hg;
	
	@Test(priority = 2)
	public void verifyLogo() {
		test = extent.createTest("verifyLogo");
		boolean flag = lg.validateLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 1)
	public void loginTest() {
		test = extent.createTest("loginTest");
		hg= lg.login(prop.getProperty("username"),prop.getProperty("password"),prop.getProperty("mail"));
		String actUrl = driver.getCurrentUrl();
		String expUrl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		Assert.assertEquals(actUrl, expUrl);
	}

}
