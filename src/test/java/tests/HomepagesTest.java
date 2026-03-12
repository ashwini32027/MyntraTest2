package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.BaseTests;
import pages.HomePage;

public class HomepagesTest extends BaseTests{
	HomePage hp;
	
	@BeforeMethod
	void initialize() {
		hp=new HomePage(driver);
	}
@Test
void verifyHomePage() {
	Assert.assertTrue(hp.verifyHomePage());
	Assert.assertTrue(hp.verifyTitlee());
}
}
