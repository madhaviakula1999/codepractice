package com.epam.Utils;

import org.openqa.selenium.WebDriver;
import com.epam.BrowserDetails.BrowserDetails;

import java.time.Duration;


public class SetUpDriver {
	
    protected WebDriver driver;

    public WebDriver setUpDriver(String browserName) {
       BrowserDetails browser = new BrowserDetails();
        driver = browser.openBrowser(browserName);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }

}

