package com.Module.Administration;

import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class ADD_ROLE  {
    //

    @Test
    public void Add_Role() throws IOException, InterruptedException {



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       driver.get("https://www.cicod.com/login");
       // driver.navigate().to("www.facebook.com");




        driver.close();
        driver.quit();

            }
}
