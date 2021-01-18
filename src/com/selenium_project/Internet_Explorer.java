package com.selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Internet_Explorer {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concept\\Driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
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

		driver.navigate().to("https://www.facebook.com/");

		// back

		driver.navigate().back();

		// forward
		driver.navigate().refresh();

		// Quit
		driver.quit();
		

	}

}
