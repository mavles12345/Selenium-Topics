package com.qa.locators;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		// Id

		driver.findElement(By.id("inputUsername")).sendKeys("selvam");

		// name

		driver.findElement(By.name("inputPassword")).sendKeys("manikam");

		// class name- submit signInBtn- No need to add full class name since each one
		// considered as sepearate class name.

		driver.findElement(By.className("signInBtn")).submit();

		// LinkText

		driver.findElement(By.linkText("Forgot your password?")).click();

		// Xpath = //tagname[@attributename='attributevalue']

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sel");

		// CssSelecto = tagname[attributename='attributevalue']

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("vam");

		// Xpath-using index to find out the unique

		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("908766");

		Thread.sleep(5000);

		// CssSelector-using index to find out the unique
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).clear();

		// Xpath - if the text is dynamically changing then we use contains with parital
		// word. (<button class="reset-pwd-btn">Reset Login</button>)
		driver.findElement(By.xpath("//button[contains(@class,'pwd')]")).click();

		// Xpath=traverse thorough tagname from parent to child

		driver.findElement(By.xpath("//form/p")).getText();

		System.out.println(driver.findElement(By.xpath("//form/p")).getText());

	
		
		//Combination of Parent to child, index and xpath

		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		//Css -Selector -ID we can as tagname#id or #id attribute
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Selvam");
		
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		
		//Css -Selector -Class name we can as tagname.Class name or .Class name attribute
		driver.findElement(By.cssSelector(".signInBtn")).submit();
		
		

	}
}
