package com.selenium.testclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverCommands {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//navigating to a webpage
		//driver.get("https://google.com");
		
		//driver.navigate().to("https://google.com");
		
		//finding an element
		//driver.findElement(By.id(id))
		driver.get("https://www.wikipedia.org/");
		
		//Maximize
		driver.manage().window().maximize();
		
//		//Fullscreen
//		driver.manage().window().fullscreen();
//		
//		//find element
//		WebElement element = driver.findElement(By.id("searchInput"));
//		
//		//binding text to an element
//		element.sendKeys("xndgkndxlkfn");
//		
//		//clearing text
//		element.clear();
//		
//		//clicking an element
//		element.click();
		
		//Type find element and bind text
		driver.findElement(By.id("searchInput")).sendKeys("Donald Trump");
		
		//click
		driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).click();
		
		//navigate backwards
		driver.navigate().back();
		
		//forward
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}
}
