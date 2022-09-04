package com.epam.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	static WebDriver driver;

	public static void homePageShouldBevisible(WebDriver driver) {
		driver.findElement(By.xpath("//input[@placeholder=\"Search Facebook\"][1]"));
	}

	public static void enterTextInsearchbar(WebDriver driver) {
		driver.findElement(By.xpath("//input[@placeholder=\"Search Facebook\"][1]")).sendKeys("Madhavi");
	}

}
