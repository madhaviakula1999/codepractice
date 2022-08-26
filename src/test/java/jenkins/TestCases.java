package jenkins;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;		
import org.testng.annotations.Listeners;		
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;             		


public class TestCases {				
WebDriver driver;					

//Test to pass as to verify listeners.		
@Test		
public void Login()				
{		
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();					
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    driver.findElement(By.id("email")).sendKeys("tejadt@gmail.com");							
    driver.findElement(By.id("pass")).sendKeys("nitt@123");							
    driver.findElement(By.name("login")).click();
    driver.manage().window().maximize();
    driver.close();
}		

//Forcefully failed this test as verify listener.		
@Test		
public void TestToFail()				
{		
    System.out.println("This method to test fail");					
    Assert.assertTrue(false);			
}		
}