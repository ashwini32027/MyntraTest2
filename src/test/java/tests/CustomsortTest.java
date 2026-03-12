package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.BaseTests;
import pages.Customsort;
import pages.Searchproduct;

public class CustomsortTest extends BaseTests {
	Searchproduct sp;
	Customsort sort;
	@BeforeMethod
	public void initilize() {
		sp=new Searchproduct(driver);
		sort=new Customsort(driver);
	}
	@Test
	public void customerrating() {
		sp.openMenTshirtPage();
		Assert.assertTrue(sp.isProductPageVisible(), "Men Tshirt Page is not Visible");
     sort.scrollonsortbutton();
     sort.sortbyrate();
     sort.allproduct();
     Assert.assertTrue(sort.ratingverify());
	}

}
