package com.selenium_project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement alert = driver.findElement(By.xpath("//button[contains(text(), '    click the button to')]"));
		alert.click();
		Thread.sleep(2000);
		Alert simple_Alert = driver.switchTo().alert();
		simple_Alert.accept();
		driver.switchTo().defaultContent();
		WebElement ok_And_Cancel = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		ok_And_Cancel.click();
		WebElement confirmbox_Btn = driver.findElement(By.xpath("//button[contains(text(),'confirm box')] "));
		confirmbox_Btn.click();
		
		
		
		//Alert confirm_Alert = driver.switchTo().alert();
		//confirm_Alert.accept();
		driver.switchTo().defaultContent();
		WebElement alert_With_TXBtn = driver.findElement(By.xpath("//a[text()='Alert with Textbox '] "));
		alert_With_TXBtn.click();
		WebElement box_Btn = driver.findElement(By.xpath("(//button[contains(text(),'prompt box')])"));
		box_Btn.click();
		Thread.sleep(2000);
		Alert prompt_Alert = driver.switchTo().alert();
		String text = prompt_Alert.getText();
		System.out.println(text);
		Thread.sleep(2000);
		prompt_Alert.accept();
		//driver.switchTo().defaultContent();
		System.out.println("prompt alert completed");
		WebElement video_Btn = driver.findElement(By.xpath("//a[text()='Video']"));
		video_Btn.click();
		
		System.out.println("here");
	}

}
