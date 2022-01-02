package com.cybertek.tests;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ChercherTest {

    /*
     1. Go to https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver
    2. Click on "Click me, to Open an alert after 5 seconds"
    3. Explicitly wait until alert is present
    4. Then handle the Javascript alert
     */

    WebDriver driver; //declare our reference for the object

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //  set up implicitly wait
        driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3333);
        driver.quit();

    }

    @Test
    public void alertPresent(){

        //1. Go to https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        //2. Click on "Click me, to Open an alert after 5 seconds"
        driver.findElement(By.id("alert")).click();

        WebDriverWait wait = new WebDriverWait()



    }


}
