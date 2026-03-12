package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.Base;
import utils.WaitUtils;

public class SortingFail extends Base{
	WaitUtils wait;
    Actions action;

    //This store actual rate
    List<Integer> prices = new ArrayList<>();

    public SortingFail(WebDriver driver) {
        super(driver);
        wait = new WaitUtils(driver);
    }

    /**
     * Ashwini kumar Xpath find
     */
    @FindBy(xpath="//div[@class='sort-sortBy']")
    WebElement sortbutton;

    @FindBy(xpath="//label[normalize-space()='Price: Low to High']")
    WebElement lowtohigh;

    //price capture
    @FindBy(xpath="//span[@class='product-discountedPrice']")
    List<WebElement> pricetag;

    public void scrollonsortbutton() {
        action = new Actions(driver);
        action.moveToElement(sortbutton).perform();
    }

    public void clicklowtohighbtn() throws InterruptedException {
        WebElement low = wait.waitForClick(lowtohigh);
        low.click();
        Thread.sleep(5000);
    }

    public void ratetoinr() {
        prices.clear();

        for (WebElement price : pricetag) {
            String txt = price.getText();
            txt = txt.replaceAll("[^0-9]", "").trim();
            int num = Integer.parseInt(txt);
            prices.add(num);
        }
    }
    public boolean verifySortingFail() { 
    	List<Integer> actual = new ArrayList<>(); 
    	// take first 5 prices
    	for(int i = 0; i < 5; i++) { actual.add(prices.get(i));
    	} System.out.println("Actual First 5 Prices: " + actual); 
    	// expected sorted list
    	List<Integer> expected = new ArrayList<>(actual); 
    	Collections.sort(expected);
    	System.out.println("Expected Sorted Prices: " + expected);
    	if(actual.equals(expected)) 
    	{ 
    		return true;
    	} 
    	else
    	{ 
    		return false; 
    	} 
    	}
    }