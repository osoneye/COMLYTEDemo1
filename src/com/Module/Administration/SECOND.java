package com.Module.Administration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SECOND {

        @Test
        public void Add_Role() {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.cicod.com/login");
            // driver.navigate().to("www.facebook.com");

            driver.close();
            driver.quit();

        }

    }

