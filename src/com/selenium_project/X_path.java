package com.selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[contains(@placeholder,'Email ')]"));
		email.sendKeys("Abcd@gmail.com");
		WebElement password = driver.findElement(By.xpath("(//input[@class='inputtext _55r1 _6luy'])[2]"));
		password.sendKeys("abcd");
		WebElement create_txt = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		String text = create_txt.getText();
		System.out.println(text);
		WebElement facebook_txt = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		String face_txt = facebook_txt.getText();
		System.out.println(face_txt);
		WebElement login_Btn = driver.findElement(By.xpath("//button[@type='submit']"));
		login_Btn.click();
	}

}
