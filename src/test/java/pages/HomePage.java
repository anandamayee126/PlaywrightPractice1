package pages;

import com.microsoft.playwright.Page;

public class HomePage {
	private Page page;
	
	public HomePage(Page page) {
		this.page= page;
		
	}
	
	private final String timeLocator="span.oxd-main-menu-item--name";
	public void clickTime() {
		page.click(timeLocator);
	}

}
