package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.BaseTests;
import pages.Searchproduct;

public class SearchproductTest extends BaseTests{
	Searchproduct sp;
	
	@BeforeMethod
	public void initilize() {
		sp=new Searchproduct(driver);
	}
	@Test
	public void VerifyOpenMenTshirt() {
		sp.openMenTshirtPage();
		Assert.assertTrue(sp.isProductPageVisible(), "Men Tshirt Page is not Visible");
	}
}
