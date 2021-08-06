package com.backbase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.backbase.basepackage.BaseClass;

public class NewArticlePage extends BaseClass {

	@FindBy(xpath = "//input[@formcontrolname=\"title\"]") WebElement articleTitle;
	@FindBy(xpath = "//input[@formcontrolname=\"description\"]") WebElement articleType;
	@FindBy(xpath = "//input[@formcontrolname=\"body\"]") WebElement articleDesc;
	@FindBy(xpath = "//input[@placeholder=\"Enter tags\"]") WebElement articleTags;
	@FindBy(xpath = "//button[contains(text(),'Publish Article')]") WebElement pubArticle;
	
	
	
	public NewArticlePage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage enterArticleDetails(String artTitle,String artType,String artDesc,String artTags) {
		articleTitle.sendKeys(artTitle);
		articleType.sendKeys(artType);
		articleDesc.sendKeys(artDesc);
		articleTags.sendKeys(artTags);
		pubArticle.click();
		return new HomePage(); 
	}
}
