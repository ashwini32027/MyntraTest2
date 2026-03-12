package pages;

import org.openqa.selenium.WebDriver;

import base.Base;

public class HomePage extends Base {

    public HomePage(WebDriver driver) {
        super(driver);
        
    }

    public boolean verifyHomePage() {
        return driver.getCurrentUrl().contains("myntra");
    }

    public boolean verifyTitlee() {
        return driver.getTitle().contains("Myntra");
    }
}