package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseTest;

public class Loginpage extends BaseTest {

	@FindBy(xpath = "//a[@href='index2.html']")
	WebElement adminLteLink;

	@FindBy(id = "email")
	WebElement username;

	@FindBy(id = "password")
	WebElement pwd;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement signinButn;

	@FindBy(xpath = "//a[contains(text(),'Register a new membership')]")
	WebElement regNewMember;

	public Loginpage() {

		PageFactory.initElements(driver, this);

	}

	public String validateAdminLink() {
		String linkText = adminLteLink.getText();
		return linkText;

	}

	public HomePage validateLogin() {

		username.sendKeys("kiran@gmail.com");
		pwd.sendKeys("123456");
		signinButn.click();
		return new HomePage();

	}

	public RegNewMember clickOnRegNewMember() {
		regNewMember.click();
		return new RegNewMember();

	}

}
