package com.careerhack.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JuneGoogleBase {

	public WebDriver driver;
	
	String browser = "chrome";

	public void launchBrowser() {
		
		if (browser == "chrome") {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser == "firefox") {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("Wrong Browser");
		}

		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
	}//end of launchBrowser
	
	public void closeBrowser() {
		
		driver.close();
	}

}
