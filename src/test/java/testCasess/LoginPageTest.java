package testCasess;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;

public class LoginPageTest extends BaseTest {
		Loginpage loginpage;
	HomePage homePage;
		public LoginPageTest() {
			super();

		}

		@BeforeMethod
		public void initilization() {
			BaseTest.setUp();

			loginpage = new Loginpage();

		}

		@Test
		public void loginPageLinkTest() {
			String link = loginpage.validateAdminLink();
			Assert.assertEquals(link, "AdminLTE");
		}

		@Test
		public void loginPageTest() throws InterruptedException {
			   homePage = loginpage.validateLogin();
			Thread.sleep(3000);
			Assert.assertEquals(driver.getTitle(), "AdminLTE 2 | Dashboard");

		}

		@AfterMethod
		public void tearDown() {
			driver.quit();

		}

	}


