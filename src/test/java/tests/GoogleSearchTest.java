package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleHomePage;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void testGoogleHomePageLoads() {
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.open();

        Assert.assertTrue(googleHomePage.getTitle().contains("Google"));
        Assert.assertTrue(googleHomePage.isSearchBoxVisible(), "Search box should be visible");
    }
}
