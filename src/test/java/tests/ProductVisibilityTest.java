package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.BaseTests;
import pages.Ascedndingorder;
import pages.Searchproduct;

public class ProductVisibilityTest extends BaseTests {

    Searchproduct sp;
    Ascedndingorder asc;

    @BeforeMethod
    public void initialize()
    {
        sp = new Searchproduct(driver);
        asc = new Ascedndingorder(driver);
    }

    @Test
    public void verifyNoProductAfterSorting() throws InterruptedException
    {
        sp.openMenTshirtPage();

        asc.scrollonsortbutton();
        asc.clicklowtohighbtn();

        boolean status = asc.isProductListEmpty();

        Assert.assertFalse(status, "No products are visible after sorting");
    }
}