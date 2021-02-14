package com.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseTest;

public class RegNewMember extends BaseTest {
	@FindBy(xpath = "//input[@id='name']")
	WebElement name;

	@FindBy(xpath = "//input[@id='mobile']")
	WebElement mobile;

	@FindBy(xpath = "//input[@id='email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//button[contains(text(),'Sign In')]")
	WebElement signInBtn;

	public RegNewMember() {
		PageFactory.initElements(driver, this);
	}

	public void validateRegisterNewUser(String ftName, String mb, String em, String pass) {
		name.sendKeys(ftName);
		mobile.sendKeys(mb);
		email.sendKeys(em);
		password.sendKeys(pass);
		signInBtn.click();

		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		if (text.equals("User registered successfully.")) {
			System.out.println("correct alert message");

		}
		else {
			System.out.println("incorrect message");
		}

		alert.accept();
	}

}
