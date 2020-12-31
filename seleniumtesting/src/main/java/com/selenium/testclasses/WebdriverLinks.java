package com.selenium.testclasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//driver.findElement(By.linkText("English")).click();
		//System.out.println(driver.findElement(By.id("js-link-box-en")).getText());
		//driver.findElement(By.id("js-link-box-en")).click();
		List<WebElement> links =  driver.findElements(By.tagName("a"));
		
		System.out.println("***********Total number of links************" +links.size());
		for(WebElement link : links) {
			System.out.println(link.getText());
		}
	}
}
