package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.Base;
import utils.WaitUtils;

public class Descednigorder extends Base {
	WaitUtils wait;
	Actions action;
	//This store actual rate 
	List<Integer>prices=new ArrayList<>();
	public Descednigorder(WebDriver driver) {
		 super(driver);
		wait = new WaitUtils(driver);
		// TODO Auto-generated constructor stub
	        }
	/**
	 * Ashwini kumar Xpath find
	 */
	@FindBy(xpath="//div[@class='sort-sortBy']")
	WebElement sortbutton;
	
	@FindBy(xpath="//label[normalize-space()='Price: High to Low']")
	WebElement hightolow;
	
//price capture
	@FindBy(xpath="//span[@class='product-discountedPrice']")
	List<WebElement>pricetag;

	public void scrollonsortbutton()
	{
		action= new Actions(driver);
		action.moveToElement(sortbutton);
	}
	public void clickhightolow()
	{
		WebElement low=wait.waitForClick(hightolow);
		low.click();
	}
	public void ratetoinr()
	{
		for(int i=0;i<pricetag.size();i++)
		{
			String txt=pricetag.get(i).getText();
		    txt = txt.replaceAll("[^0-9]","").trim();
		    System.out.println(txt);
		    int num=Integer.parseInt(txt);
		    prices.add(num);
		}
	}
	
	public boolean verifyratehightolow()
	{
		for(int i=0;i<5;i++)
		{
			if(prices.get(i)>=prices.get(i+1))
			{
				continue;
			}
			else
			{
				return false;
			}
			
		}
		return true;
	}
	
	
	

}
