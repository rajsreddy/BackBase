package com.backbase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.backbase.basepackage.BaseClass;

public class SignUpPage extends BaseClass {
	
	@FindBy(xpath = "//*[@formcontrolname='username']") WebElement userName;
	@FindBy(xpath = "//*[@formcontrolname='password']") WebElement pwd;
	@FindBy(xpath = "//*[@formcontrolname='email']") WebElement email;
	@FindBy(xpath = "//*[@class='navbar-brand']") WebElement logo;
	@FindBy(xpath = "//a[contains(text(),'Sign up')]") WebElement signup;
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
		
	public boolean validateLogo() {
		logo.isDisplayed();
		return true;
	}
	
	public HomePage login(String uname,String pswd,String mail) {
		signup.click();
		userName.sendKeys(uname);
		email.sendKeys(mail);
		pwd.sendKeys(pswd);
		signup.click();
		return new HomePage();
	}

}
