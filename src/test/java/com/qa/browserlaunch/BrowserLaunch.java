package com.qa.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import junit.framework.Assert;

public class BrowserLaunch {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();

		// WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/login/");

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		
		Assert.assertEquals("Log in to Facebook", driver.getTitle());

	}

}
