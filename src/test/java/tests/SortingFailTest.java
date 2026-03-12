package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.BaseTests;
import pages.Searchproduct;
import pages.SortingFail;
	public class SortingFailTest extends BaseTests {

	    Searchproduct sp;
	    SortingFail sf;

	    @BeforeMethod
	    public void initialize() {
	        sp = new Searchproduct(driver);
	        sf = new SortingFail(driver);
	    }

	    @Test
	    public void verifySortingFailure() throws InterruptedException {

	        // Step 1: Open Men Tshirt page
	        sp.openMenTshirtPage();
	        Assert.assertTrue(sp.isProductPageVisible(),
	                "Men Tshirt Page is not visible");

	        // Step 2: Apply sorting
	        sf.scrollonsortbutton();
	        sf.clicklowtohighbtn();

	        // Step 3: Capture prices
	        sf.ratetoinr();

	        // Step 4: Verify sorting failure (negative test)
	        Assert.assertTrue(sf.verifySortingFail(),
	                "Sorting should fail but it passed");
	    }
	}