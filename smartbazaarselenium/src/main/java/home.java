import browser.browser;
import excel.read;
import pages.page1;
import screenshot.capture;



public class home {
    public static void main(String[] args) throws Exception
    {
        browser.setUp();
        browser.getUrl();

        page1.searchTextBox(read.excel(1, 0));
        page1.searchTextBox1(read.excel1(1, 1));
        page1.searchTextBox2(read.excel2(1, 2));

        Thread.sleep(3000);
        //capture.screenShot("name");



        capture.screenShot(browser.properties("name"));

        Thread.sleep(3000);
        browser.closeBrowser();
    }

}