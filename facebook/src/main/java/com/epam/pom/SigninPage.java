package com.epam.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage  {

	public static void openBrowser(WebDriver driver)				
    {							
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

	public static void loginDetails(WebDriver driver) {
		driver.findElement(By.id("email")).sendKeys("tejadt@gmail.com");							
        driver.findElement(By.id("pass")).sendKeys("nitt@123");							
    }

	public static void clickOnLogin(WebDriver driver) {
		driver.findElement(By.name("login")).click();
        driver.manage().window().maximize();
	}		
    
}


