package com.selenium_class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	static int indexOfTotalCases;
	static int indexOfTotalRecovered;
	static int indexOfCountryName;
	static String countryName = "Canada";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// Headers
		List<WebElement> allHeaders = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		for (int i = 0; i < allHeaders.size(); i++) {
			String headings = allHeaders.get(i).getText();
			String value = headings.replaceAll("\n", " ");
			if (value.equalsIgnoreCase("Total Cases")) {
				indexOfTotalCases = i;
				System.out.println("Index Of Total Cases is:" + indexOfTotalCases);
			} else if (value.equalsIgnoreCase("Total Recovered")) {
				indexOfTotalRecovered = i;
				System.out.println("Index Of Total Covered is:" + indexOfTotalRecovered);
			} else if (value.contains("Country")) {
				indexOfCountryName = i;
				System.out.println("Index Of Country is:" + indexOfCountryName);
			}
		}
		// traverse into body
		// Get all rows
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr"));
		// Iterate row
		for (int i = 0; i < allRows.size(); i++) {
			// Get All columns using tag name 'td'
			List<WebElement> allData = allRows.get(i).findElements(By.tagName("td"));
			// Iterate columns
			for (int j = 0; j < allData.size(); j++) {
				// if India is in the particular column, get all the required fields
				if (allData.get(j).getText().equals(countryName)) {
					System.out.println("Country Name :" + allData.get(indexOfCountryName).getText());
					System.out.println("Total Cases :" + allData.get(indexOfTotalCases).getText());
					System.out.println("Total Recovered :" + allData.get(indexOfTotalRecovered).getText());

				}

			}

		}
	}

}
