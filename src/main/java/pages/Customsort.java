package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.Base;
import utils.WaitUtils;

public class Customsort extends Base {
	WaitUtils wait;
	Actions action;
	public Customsort(WebDriver driver) {
		super(driver);
		wait=new WaitUtils(driver);
	}
	
	//This store actual rate 
	List<Integer>prices=new ArrayList<>();
	/**
	 * Ashwini kumar Xpath find
	 */
	@FindBy(xpath="//div[@class='sort-sortBy']")
	WebElement sortbutton;
	
	@FindBy(xpath="//label[normalize-space()='Customer Rating']")
	WebElement customerating;
	
//rating
@FindBy(xpath="//div[@class='index-overallRating']//div[contains(text(),'5')]")
WebElement rating;
	
	public void scrollonsortbutton()
	{
		action= new Actions(driver);
		action.moveToElement(sortbutton).perform();;
	}
	public void sortbyrate()
	{
		WebElement low=wait.waitForClick(customerating);
		low.click();
	}
	public void allproduct()
	{
	List<WebElement>totalproduct=driver.findElements(By.xpath("//li[@class='product-base']"));
	totalproduct.get(0).click();
	Set<String> window=driver.getWindowHandles();
	ArrayList<String>windows=new ArrayList<String>(window);
	driver.switchTo().window(windows.get(1));
	}
	public boolean ratingverify()
	{
		String txt=rating.getText();
	    txt = txt.replaceAll("[^0-9]","").trim();
	    int star=Integer.parseInt(txt);
	    if(star>=1)
	    {
	    	return true;
	    }
	   return false;

	}
	
	

}
