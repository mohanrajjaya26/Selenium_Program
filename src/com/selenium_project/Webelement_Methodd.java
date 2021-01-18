package com.selenium_project;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Methodd {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement sign_Btn = driver.findElement(By.xpath("(//yt-formatted-string[@id='text'])[2]"));
		sign_Btn.click();

		WebElement email = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[1]"));
		email.sendKeys("rajinimurugan1@gmail.com");

		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concept\\ScreenShot\\youtube1.png");
		FileUtils.copyFile(source, destination);

		driver.quit();
	}

}
