package com.backbase.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.backbase.basepackage.BaseClass;
import com.backbase.pages.HomePage;

public class NewArticlePageTest extends BaseClass{
	
	HomePage hg;
	
	@Test(priority = 4)
	public void verifyEditArticle() {
		test = extent.createTest("verifyEditArticle");
		boolean flag = hg.validateArticle();
		Assert.assertTrue(flag);
	}

}
