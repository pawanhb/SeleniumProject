package com.selenium.testclasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		List<WebElement> rows =  driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("number of rows = " +rows.size());
		
		for(int i=1; i<=rows.size(); i++ ) {

			List<WebElement> cols = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td"));
			for(WebElement col : cols) {
				System.out.print(col.getText() +" ");
			}
			System.out.println();
			if(i == 20) {
				break;
			}
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
	}
}
