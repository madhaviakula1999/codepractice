package jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action {
	@Test
	public void doubleClick() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		// Instantiating Actions class
		Actions act = new Actions(driver);
		// Locate WebElement to perform double click
		WebElement trialaction = driver.findElement(By.xpath("//a[@id='free-trial-link-anchor']"));
		// Double Click the button
		act.doubleClick(trialaction).perform();
		System.out.println("Double click operation performed");
		driver.quit();
	}

	@Test
	public void DragnDrop() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();

		// Element which needs to drag.
		WebElement From = driver.findElement(By.xpath("//*[@id='credit2']/a"));

		// Element on which need to drop.
		WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));

		// Using Action class for drag and drop.
		Actions act = new Actions(driver);

		// Dragged and dropped.
		act.dragAndDrop(From, To).build().perform();

	}

	@Test
	public void MoveToElement() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);

		WebElement moveto = driver.findElement(By.xpath("//*[@class='product-card product-card-hero']"));
		act.moveToElement(moveto).build().perform();
	}
}