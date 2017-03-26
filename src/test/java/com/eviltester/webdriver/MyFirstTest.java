package com.eviltester.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {
    //public static void main(String[] args){

    @Test
    public void runtestdriver(){
        WebDriver driver = new FirefoxDriver();
        //B:\prog\geckodriver\geckodriver.exe
        System.setProperty("webdriver.gecko.driver","B:\\prog\\geckodriver\\geckodriver.exe");
        // if above property is not working or not opening the application in browser then try below property
        //System.setProperty("webdriver.firefox.marionette","B:\\prog\\geckodriver\\geckodriver.exe");

        driver.navigate().to("http://seleniumsimplified.com");
        Assert.assertTrue("title should start with selenium" ,
                driver.getTitle().startsWith("Selenium Simplified"));
        driver.close();
        driver.quit();
    }
}
