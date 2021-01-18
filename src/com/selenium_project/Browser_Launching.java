package com.selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launching {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		// Maximize
		driver.manage().window().maximize();
		
		// Title
		String title = driver.getTitle();
		System.out.println(title);

		// CurrentUrl
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// Navigation

		driver.navigate().to("https://www.amazon.com/");

		// back

		driver.navigate().back();

		// forward
		driver.navigate().refresh();

		// Quit
		driver.quit();

	}

}
