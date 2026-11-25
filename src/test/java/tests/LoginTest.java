package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	@Test
	  void test1() {
		test.info("Navigating to Login page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage logingpg = new LoginPage(page);
		HomePage homepage= new HomePage(page);
		
		test.info("Adding username");
		logingpg.addUsername("Admin");
		
		test.info("Adding password");
		logingpg.addPassword("admin123");
		
		logingpg.clickLoginButton();
		homepage.clickTime();
	}
	@Test
	void test2() {
		test.info("Navigating to Login page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/logi");
		LoginPage logingpg = new LoginPage(page);
		HomePage homepage= new HomePage(page);
		
		test.info("Adding username");
		logingpg.addUsername("Admin");
		
		test.info("Adding password");
		logingpg.addPassword("admin123");
		
		logingpg.clickLoginButton();
		homepage.clickTime();
	}
}
