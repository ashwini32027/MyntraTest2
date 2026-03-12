package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseTests;
import pages.HomePage;

public class HomepagesTest extends BaseTests {
	


	public class HomePageTest extends BaseTests {

		 @Test
		    public void verifyHomePageTest() {

		        HomePage hp = new HomePage(driver);

		        boolean urlCheck = hp.verifyHomePage();
		        boolean titleCheck = hp.verifyHomePage();

		        Assert.assertTrue(urlCheck);
		        Assert.assertTrue(titleCheck);
		    }
	}
		}