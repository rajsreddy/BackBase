package com.backbase.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.backbase.basepackage.BaseClass;
import com.backbase.pages.HomePage;

public class HomePageTest extends BaseClass{
	
	HomePage hg;
	
	@Test(priority = 3)
	public void newArticleTest() throws InterruptedException {
		hg= lg.login(prop.getProperty("username"),prop.getProperty("password"),prop.getProperty("mail"));
		hg.clickOnNewArticle();
		Thread.sleep(2000);
		String actUrl = driver.getCurrentUrl();
		String expUrl = "https://candidatex:qa-is-cool@qa-task.backbasecloud.com/";
		Assert.assertEquals(actUrl, expUrl);
	}

}
