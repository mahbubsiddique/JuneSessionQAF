package com.careerhack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JuneHomePage {
	
	WebDriver driver;
	
	public JuneHomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	// What is Page Object Model?
	// Its concept that makes each element and action on the element reusable

	// WebElement searchBox = driver.findElement(By.name("q"));
	@FindBy(name = "q")
	WebElement searchBox;

	// searchBox.sendKeys(string);
	public void enterSearchterm(String string) {
		searchBox.sendKeys(string);
	}

	// WebElement searchButton = driver.findElement(By.name("btnK"));
	// searchButton.submit();
	@FindBy(name="btnK")
	 WebElement searchButton;
	
	public void clickSearch() {
		searchButton.submit();
	}
	
	

}
