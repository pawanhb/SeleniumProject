package com.selenium.testclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CsssSelectors {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		final String EXPECTED_TITLE = "Google";
		
//		driver.get("http://www.echoecho.com/htmlforms01.htm");
//		driver.findElement(By.cssSelector("input#identifier]")).sendKeys("djkbhsfj");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.com");
//		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals(EXPECTED_TITLE)) {
			System.out.println("Test Passesd");
		} else {
			System.out.println("Test Failed");
		}
		driver.findElement(By.cssSelector("input.gLFyf")).sendKeys("Css selectors");
		driver.findElement(By.cssSelector("input[name*='tn']")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
	}
}
