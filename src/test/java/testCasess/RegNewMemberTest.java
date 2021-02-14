package testCasess;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.AddUserPage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.RegNewMember;
import com.qa.pages.UserPage;
import com.qa.utill.TestUtil;

public class RegNewMemberTest extends BaseTest {
	public Loginpage loginpage;
	public HomePage homePage;
	public UserPage userPage;
	public AddUserPage adduserPage;
	public TestUtil testUtil;
	public RegNewMember regNewMember;

	public RegNewMemberTest() {
		super();
	}

	@BeforeMethod
	public void initilization() {
		BaseTest.setUp();
		loginpage = new Loginpage();
		regNewMember = new RegNewMember();
		
		loginpage.clickOnRegNewMember();
	}

	@Test
	public void validateRgNewUserMember() {
		regNewMember.validateRegisterNewUser("vishal", "7350167620", "vishalPatil@gmail.com", "sahhara");
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		//sdriver.quit();
		
	}

}
