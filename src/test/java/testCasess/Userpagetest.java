package testCasess;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.UserPage;

public class Userpagetest extends BaseTest {
	public Loginpage loginpage;
	public HomePage homePage;
	public UserPage userPage;

	public Userpagetest() {
		super();
	}

	@BeforeMethod
	public void initilization() {
		BaseTest.setUp();
		loginpage = new Loginpage();
		homePage = new HomePage();
		userPage = new UserPage();

		loginpage.validateLogin();
		homePage.clickOnUserLink();

	}

	@Test
	public void validateTextOnTbaleTest() {
		String asdfg =userPage.validateTextInTable();
		Assert.assertEquals(asdfg, "1 Kiran kiran@gmail.com 1111111111 Yes Male Maharashtra Delete");
		

	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}	

}
