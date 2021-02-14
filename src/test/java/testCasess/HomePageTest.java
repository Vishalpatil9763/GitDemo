package testCasess;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;

public class HomePageTest extends BaseTest {
	public Loginpage loginpage;
	public HomePage homePage;

	public HomePageTest() {
		super();

	}

	@BeforeMethod
	public void initilization() {
		BaseTest.setUp();
		loginpage = new Loginpage();
		homePage = new HomePage();
		loginpage.validateLogin();

	}

	@Test
	public void clickOnUserlinktest() {
		homePage.clickOnUserLink();

	}

}
