package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.BaseTest;

public class AddUserPage extends BaseTest {
	
	@FindBy(xpath="//a[@href='logout.html'and @class]")
	WebElement logout;
	@FindBy(xpath = "//input[@id='username']")
	WebElement userName;

	@FindBy(xpath = "//input[@id='mobile']")
	WebElement mobile;

	@FindBy(xpath = "//input[@id='email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='Male']")
	WebElement genderM;

	@FindBy(xpath = "//input[@id='Female']")
	WebElement genderF;

	@FindBy(xpath = "//select[@class='form-control']")
	WebElement state;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	@FindBy(xpath = "//button[@id='submit']")
	WebElement submit;

	public AddUserPage() {
		PageFactory.initElements(driver, this);

	}

	public void createNewUser(String name, String mob, String emid, String gender, String pass) {
		/*
		 * String male_G= "M"; String f ="F";
		 */
		userName.sendKeys(name);
		mobile.sendKeys(mob);
		email.sendKeys(emid);

		if (gender.equals("Male")) {

			
			genderM.click();
		}

		else if (gender.equals("Female")) {

			
			genderF.click();
		}

		Select select = new Select(state);
		select.selectByVisibleText("HP");

		password.sendKeys(pass);
		submit.click();

	}
	
	public boolean validateLogutLabel() {
		return logout.isDisplayed();
		
	}

}
