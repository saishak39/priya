package pages;

import browser.browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class page1 extends browser {
    public static void searchTextBox(String smartbazaar) throws Exception {
        driver.findElement(By.xpath("//div[@class='sgpb-popup-dialog-main-div-theme-wrapper-2']/img")).click();//pop up handled
        driver.findElement(By.xpath("//div[@id='cookie-law-info-bar']/span/a[2]")).click();// accept cookie settings

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.titleIs("Home - Smartbazaar"));//Thread.sleep

        driver.findElement(By.xpath("//div[@class='account-user']/a/i[@class='fa fa-user-circle-o']")).click();//login/reg links appear
        driver.findElement(By.xpath("//ul[@class='af-my-account-menu prime-color']/li/a[@class='af-my-account-admin']")).click();//clicks registration link

        driver.findElement(By.xpath("//input[@id='reg_username']")).sendKeys(smartbazaar);//username

    }

    public static void searchTextBox1(String smartbazaar) throws Exception {
        driver.findElement(By.xpath("//input[@id='reg_email' and @class='woocommerce-Input woocommerce-Input--text input-text']")).sendKeys(smartbazaar);//email address
    }

    public static void searchTextBox2(String smartbazaar) throws Exception {
        driver.findElement(By.xpath("//span[@class='password-input']/input[@id='reg_password']")).sendKeys(smartbazaar);//password
        driver.findElement(By.xpath("//button[@class='woocommerce-Button woocommerce-button button woocommerce-form-register__submit']")).click();
    }
}













