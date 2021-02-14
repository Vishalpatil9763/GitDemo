package testCasess;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.AddUserPage;
import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.UserPage;
import com.qa.utill.TestUtil;

public class AddUserPageTest extends BaseTest {
	public Loginpage loginpage;
	public HomePage homePage;
	public UserPage userPage;
	public AddUserPage adduserPage;
	public TestUtil testUtil;

	public AddUserPageTest() {
		super();

	}

	@BeforeMethod
	public void initilizatin() {
		BaseTest.setUp();
		loginpage = new Loginpage();
		homePage = new HomePage();
		userPage = new UserPage();
		adduserPage = new AddUserPage();
		testUtil = new TestUtil();

		loginpage.validateLogin();
		homePage.clickOnUserLink();
		userPage.clickOnAddUserButton();

	}
	@DataProvider
	public Object[][] gettestdata() throws EncryptedDocumentException, IOException {
		Object[][] ob=testUtil.getDataFromExcel();
		return ob;
	}

	@Test(dataProvider="gettestdata")
	public void createNewUserTest(String userName,String mobile,String email,String gender,String password) {
		adduserPage.createNewUser(userName, mobile, email, gender, password);

	}

	
	@Test
	public void validateLoginBtn() {
		boolean logo = adduserPage.validateLogutLabel();
		Assert.assertEquals(true, false);


	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
