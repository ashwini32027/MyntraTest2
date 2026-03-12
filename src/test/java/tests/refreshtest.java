package tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import BaseTest.BaseTests;
import pages.Ascedndingorder;
import pages.Searchproduct;

public class refreshtest extends BaseTests {
	Searchproduct sp;
	Ascedndingorder asc;
		
		@BeforeMethod
		public void initilize() {
			sp=new Searchproduct(driver);
			asc=new Ascedndingorder(driver);
		}
		
		
		@Test
		public void ascorder() throws InterruptedException
		{
		    sp.openMenTshirtPage();
		    Assert.assertTrue(sp.isProductPageVisible(), "Men Tshirt Page is not Visible");

		    asc.scrollonsortbutton();
		    asc.clicklowtohighbtn();
		    Thread.sleep(3000); 
		    asc.ratetoinr();
		    // before refresh
		    boolean beforeRefresh = asc.verifyratelowtohigh();

		    driver.navigate().refresh();
		    Thread.sleep(3000); 
		    

		 // capture prices after refresh
	        asc.ratetoinr();
	        boolean afterRefresh = asc.verifyratelowtohigh();

	        Assert.assertEquals(beforeRefresh, afterRefresh);
		}
}
