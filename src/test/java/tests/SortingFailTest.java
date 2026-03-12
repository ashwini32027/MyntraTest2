package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.BaseTests;
import pages.Ascedndingorder;
import pages.Searchproduct;

public class SortingFailTest extends BaseTests{
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
			asc.ratetoinr();
			Assert.assertFalse(asc.verifyratelowtohigh());
		
		}

	}
