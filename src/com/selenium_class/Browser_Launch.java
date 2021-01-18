package com.selenium_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https:\\facebook\\");
}
}
