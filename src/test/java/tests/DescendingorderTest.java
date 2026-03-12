package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.BaseTests;
import pages.Ascedndingorder;
import pages.Descednigorder;
import pages.Searchproduct;

public class DescendingorderTest extends BaseTests {
	Searchproduct sp;
	Descednigorder dsc;
	
		
		@BeforeMethod
		public void initilize() {
			sp=new Searchproduct(driver);
			dsc=new Descednigorder(driver);
		}
		
		@Test
		public void dscorder() throws InterruptedException
		{
			sp.openMenTshirtPage();
			Assert.assertTrue(sp.isProductPageVisible(), "Men Tshirt Page is not Visible");
			dsc.scrollonsortbutton();
			dsc.clickhightolow();
			dsc.ratetoinr();
			Assert.assertTrue(dsc.verifyratehightolow());
		
		}
	

}
