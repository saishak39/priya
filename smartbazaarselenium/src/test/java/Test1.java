package TestCase;

import browser.browser;
import screenshot.capture;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 extends browser{
    @BeforeTest
    public void open() throws Exception
    {
        browser.setUp();
        browser.getUrl();
    }
    @Test
    public void title() throws Exception
    {
        capture.screenShot("Title");
       // Assert.assertEquals(driver.getTitle(), "Home - Smartbazaar");
    }
    @AfterTest
    public void close()
    {
        browser.closeBrowser();
    }
}