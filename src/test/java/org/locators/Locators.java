package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		// Id
		driver.findElement(By.id("inputUsername")).sendKeys("selvam");

		// Name
		driver.findElement(By.name("inputPassword")).sendKeys("12345");

		// Class Name- submit signInBtn- considered as two class name so we can take any
		// one of it either submit or signInBtn

		driver.findElement(By.className("signInBtn")).click();

		// CSS selector - tagname[attributename=attributevalue]

		Thread.sleep(5000);

		System.out.println(driver.findElement(By.cssSelector("p[class='error']")).getText());

		// LinkTexr

		driver.findElement(By.linkText("Forgot your password?")).click();

		// Xpath

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Selvam");

		// CssSelector with multiple same attributes

		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("12345");

		// Xpath with multiple same attributes

		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

		// ID short cut

		driver.findElement(By.id("input#inputUsername")).sendKeys("jackmavles@gmail.com");

	}

}
