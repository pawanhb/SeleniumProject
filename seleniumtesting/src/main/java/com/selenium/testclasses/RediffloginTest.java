package com.selenium.testclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffloginTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("pawanhb21@rediff.com");
		driver.findElement(By.id("password")).sendKeys("dsgdfg");
		driver.findElement(By.name("proceed")).click();
		//System.out.println(driver.findElement(By.id("div_login_error")).getText());
		String errMsg = driver.findElement(By.id("div_login_error")).getText();
		String rediffErrorMsg = "Wrong username and password combination.";
		
		if( errMsg.equals(rediffErrorMsg)) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test case failed");
		}
	}
}
