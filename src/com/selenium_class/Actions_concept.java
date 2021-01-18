package com.selenium_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_concept {
	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement gift_Card = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
		Actions a = new Actions(driver);
		a.contextClick(gift_Card).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement best_Sellers = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		Actions b = new Actions(driver);
		b.contextClick(best_Sellers).build().perform();
		Robot bs = new Robot();
		bs.keyPress(KeyEvent.VK_DOWN);
		bs.keyRelease(KeyEvent.VK_DOWN);

		bs.keyPress(KeyEvent.VK_ENTER);
		bs.keyRelease(KeyEvent.VK_ENTER);

		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions mob = new Actions(driver);
		mob.contextClick(mobile).build().perform();
		Robot mo = new Robot();
		mo.keyPress(KeyEvent.VK_DOWN);
		mo.keyRelease(KeyEvent.VK_DOWN);

		mo.keyPress(KeyEvent.VK_ENTER);
		mo.keyRelease(KeyEvent.VK_ENTER);

		WebElement new_Release = driver.findElement(By.xpath("//a[text()='New Releases']"));
		Actions nr = new Actions(driver);
		nr.contextClick(new_Release).build().perform();
		Robot nr1 = new Robot();
		nr1.keyPress(KeyEvent.VK_DOWN);
		nr1.keyRelease(KeyEvent.VK_DOWN);

		nr1.keyPress(KeyEvent.VK_ENTER);
		nr1.keyRelease(KeyEvent.VK_ENTER);

		WebElement customer_Service = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		Actions cs = new Actions(driver);
		cs.contextClick(customer_Service).build().perform();
		Robot cser = new Robot();
		cser.keyPress(KeyEvent.VK_DOWN);
		cser.keyRelease(KeyEvent.VK_DOWN);

		cser.keyPress(KeyEvent.VK_ENTER);
		cser.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
