package TestCase;

import browser.browser;
import pages.page1;
import pages.page2;
import excel.read;
import screenshot.capture;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Test3 extends browser{
    @BeforeTest
    public void open() throws Exception
    {
        browser.setUp();
        browser.getUrl();
    }
    @Test (priority = 1)
    public void textBox() throws Exception
    {
        page1.searchTextBox(read.excel(1, 0));
        page1.searchTextBox1(read.excel1(1, 1));
        page1.searchTextBox2(read.excel2(1, 2));
        //page1.select(read.excel(1, 1));
    }
    @Test (priority = 2)
    public void textBoxSelection() throws Exception
    {
       // page2.select(read.excel(1, 2));

        capture.screenShot("URL Selected");

       /* String ar = driver.getCurrentUrl();
        boolean result = ar.contains(read.excel(1, 2));
        Assert.assertTrue(result);*/
    }
    @AfterTest
    public void close()
    {
        browser.closeBrowser();
    }

}