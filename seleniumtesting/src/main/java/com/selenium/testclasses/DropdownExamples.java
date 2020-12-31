package com.selenium.testclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownExamples {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://www.echoecho.com/htmlforms11.htm");
		//driver.findElement(By.name("dropdownmenu")).sendKeys("Cheese");
		driver.get("https://www.wikipedia.org/");
		//driver.findElement(By.id("searchLanguage")).sendKeys("Esperanto");
		WebElement select = driver.findElement(By.id("searchLanguage"));
		Select dropdown = new Select(select);
		
		dropdown.selectByIndex(2); //selecting by index
		dropdown.selectByVisibleText("Esperanto");//selecting by visible text
		dropdown.selectByValue("hi");//selecting by value
	}
}
