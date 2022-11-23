package com.careerhack.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateCheckBoxes {


	public static void main(String[] args) {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();	
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		
		WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		
		WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		
		checkBox1.click();
		
		if(checkBox2.isSelected()==true)
			System.out.println("The checkBox is already selected");
		
		

	}

}
