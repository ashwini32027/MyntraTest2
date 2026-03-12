package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;
import base.Base;
import utils.WaitUtils;

public class Searchproduct extends Base{
	Searchproduct(WebElement driver){
		super(driver);
	}
	
	@FindBy(xpath="//a[@href='/men-tshirts']")
	WebElement mentshirt;
	@FindBy(xpath="//a[@class='desktop-main'][normalize-space()='Men']")
	WebElement men;
	Actions action;
	
	WaitUtils wait;
	public void openMenTshirtPage(){
		wait = new WaitUtils(driver);
		action = new Actions(driver);
		action.moveToElement(men).perform();
		WebElement menshirt = wait.waitForVisibility(mentshirt);
		action.moveToElement(menshirt).click().perform();
	}
	public boolean isProductPageVisible() {
		return driver.getCurrentUrl.contains("men-tshirts");
	}
}
