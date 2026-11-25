package pages;

import com.microsoft.playwright.Page;

public class LoginPage {
	private Page page;
	private final String usernameLocator = "input[placeholder='Username']";
	private final String passwordLocator = "input[placeholder='Password']";
	private final String loginButtonLocator = "button[type='submit']";

	public LoginPage(Page page) {
		this.page = page;
	}

	public void addUsername(String username) {
		page.fill(usernameLocator, username);
	}

	public void addPassword(String password) {
		page.fill(passwordLocator, password);
	}

	public void clickLoginButton() {
		page.click(loginButtonLocator);
	}
}
