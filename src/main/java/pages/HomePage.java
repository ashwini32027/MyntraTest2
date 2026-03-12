package pages;

import org.openqa.selenium.WebDriver;

import base.Base;

public class HomePage extends Base {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	public boolean verifyhome() {
		String url = driver.getCurrentUrl();
		return driver.getCurrentUrl().equals(url);
	}
		public boolean titl() {
			String title=driver.getTitle();
			return driver.getTitle().equals(title);
		}
	}

