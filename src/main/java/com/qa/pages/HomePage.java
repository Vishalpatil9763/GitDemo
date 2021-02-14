package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseTest;

public class HomePage extends BaseTest {
	@FindBy(xpath = "//a[@href='users.html']")
	WebElement userLink;
	
	@FindBy(xpath = "//a[@href='operators.html']")
	WebElement operatorlink;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public UserPage clickOnUserLink() {
		userLink.click();
		return new UserPage();
		
	}
	
	public Operatorpage clickOnOperatorLink() {
		operatorlink.click();
		return new Operatorpage();
		
	}
	
	
	
	
	
	
}
