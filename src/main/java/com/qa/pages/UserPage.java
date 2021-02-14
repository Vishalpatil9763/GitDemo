package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseTest;

public class UserPage extends BaseTest {
	@FindBy(xpath = "//button[contains(text(),'Add User')]")
	WebElement addUserButton;

	public UserPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateTextInTable() {
		List<WebElement> list = driver.findElements(By.xpath("//table//tr[2]"));
		String name=null;
		for (int i = 0; i < list.size(); i++) {
			 name=list.get(i).getText();
			System.out.println("value from table is "+ name);
			if(name.equals("kiran")) {
				list.get(i).getText();
				break;
				
			}
			
			
		}
		return name;
			

		

	}

	public AddUserPage  clickOnAddUserButton() {
		addUserButton.click();
		return new AddUserPage();
	}

}
