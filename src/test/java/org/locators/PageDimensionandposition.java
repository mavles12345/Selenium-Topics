package org.locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageDimensionandposition {

	public static void main(String[] args) throws Throwable {

//		WebDriverManager.edgedriver().setup();
//
//		WebDriver driver = new EdgeDriver();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		Dimension d = new Dimension(500, 500);

		driver.manage().window().setSize(d);

		Thread.sleep(10000);

		Point p = new Point(250, 250);

		driver.manage().window().setPosition(p);

	}

}
