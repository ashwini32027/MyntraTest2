package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.BaseTests;
import pages.Ascedndingorder;
import pages.Searchproduct;

public class SortingEnableTest extends BaseTests {

    Searchproduct sp;
    Ascedndingorder asc;

    @BeforeMethod
    public void initialize()
    {
        sp = new Searchproduct(driver);
        asc = new Ascedndingorder(driver);
    }

    @Test
    public void verifySortingOptionEnabled()
    {
        // Navigate to Men Tshir page
        sp.openMenTshirtPage();

        //  Scroll to sorting button
        asc.scrollonsortbutton();

        //  Verify sorting button enabled
        boolean status = asc.isSortButtonEnabled();

        Assert.assertTrue(status, "Sorting button is not enabled");
    }
}