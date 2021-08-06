package com.backbase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.backbase.basepackage.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath = "//a[@routerlink='/editor']") WebElement newArticle;
	@FindBy(xpath = "//a[@class=\"btn btn-sm btn-outline-secondary\"]/span[1]") WebElement editArticle;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public NewArticlePage clickOnNewArticle() {
		newArticle.click();
		return new NewArticlePage();
	}
	public boolean validateArticle() {
		// TODO Auto-generated method stub
		editArticle.isDisplayed();
		return false;
	}

}
