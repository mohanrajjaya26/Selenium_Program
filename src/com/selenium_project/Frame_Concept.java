package com.selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Concept {
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame("singleframe");
		WebElement text_Btn = driver.findElement(By.xpath("//input[@type='text']"));
		text_Btn.sendKeys("singleframes");
		System.out.println("Single Frame completed");
		driver.switchTo().defaultContent();
		
		
}

}
