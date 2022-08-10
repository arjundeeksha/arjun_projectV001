package com.MRSampleProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstWDProgram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./servers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chromedriver.chromium.org/");
		driver.manage().window().maximize();

		driver.quit();
		System.out.println("Execution Done...");
		
	}
}
