package org.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class Navigate {

	public static void main(String[] args) {

		

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.navigate().to("https://www.google.com/");

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().refresh();

	}

}
