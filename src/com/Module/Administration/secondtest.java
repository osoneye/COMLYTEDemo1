package com.Module.Administration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class secondtest {


    @BeforeMethod
    public void beforeM() throws IOException, InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cicod.com/login");
        // driver.navigate().to("www.facebook.com");




        driver.close();
        driver.quit();

    }






    @Test
    public void Add_Role() throws IOException, InterruptedException {



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cicod.com/login");
        // driver.navigate().to("www.facebook.com");




        driver.close();
        driver.quit();

    }

    @Test
    public void Add_Rolee() throws IOException, InterruptedException {



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cicod.com/login");
        // driver.navigate().to("www.facebook.com");




        driver.close();
        driver.quit();

    }




}
