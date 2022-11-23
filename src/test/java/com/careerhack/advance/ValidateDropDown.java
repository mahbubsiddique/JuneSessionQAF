package com.careerhack.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateDropDown {

	public static void main(String[] args) {
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();	
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		
		
		WebElement dropDown = driver.findElement(By.cssSelector("select[id='dropdown']"));
		
		Select s = new Select(dropDown);
		
		//select by index
		//select by value
		//select by visible text
		
		s.selectByVisibleText("Option 2");
		

	}

}
