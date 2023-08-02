package browser;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser
{
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void setUp() throws Exception
    {
        String choice = browser.properties("browser");//Gets browser information from properties file
        if (choice.equalsIgnoreCase("Chrome"))
            browser.chromeDriver();
        else if (choice.equalsIgnoreCase("Edge"))
            browser.edgeDriver();
        else
            System.out.print("Please check the browser data");
    }
    public static String properties(String browser) throws Exception
    {
        String filePath = System.getProperty("user.dir")+"\\src\\main\\resources\\configure.properties";
        FileReader reader = new FileReader(filePath);
        Properties p = new Properties();
        p.load(reader);
        return p.getProperty(browser);
    }

    static void chromeDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver =  new ChromeDriver();
    }

    static void edgeDriver()
    {
        WebDriverManager.edgedriver().setup();
        driver =  new EdgeDriver();
    }

    public static void getUrl() throws Exception
    {
        driver.manage().window().maximize();
        driver.get(browser.properties("url"));
    }

    public static void closeBrowser()

    {
        driver.quit();
    }
}