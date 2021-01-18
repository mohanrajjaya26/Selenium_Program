package com.selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_x_path {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=mobile&ref=nb_sb_noss");
		driver.manage().window().maximize();
		WebElement redmi_ph = driver.findElement(By.xpath(
				"//div[@id='search']/div/div[2]/div/span[3]/div[2]/div[20]/div/span/div/div/div[2]/div/div/div/span/a/div/img"));
		redmi_ph.click();
		System.out.println("here");
		driver.close();
		
	}

}
