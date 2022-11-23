package com.careerhack.steps;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.careerhack.common.JuneGoogleBase;
import com.careerhack.pages.JuneHomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JuneSessionGoogleSearch extends JuneGoogleBase{
	
	
	@Given("I am on google homepage")
	public void i_am_on_google_homepage() {
		
		launchBrowser();
	
	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {
		
		JuneHomePage jhp = new JuneHomePage(driver);
		jhp.enterSearchterm(string);
		
		
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		
		JuneHomePage jhp = new JuneHomePage(driver);
		jhp.clickSearch();

			
	}

	@Then("I receive relavant results")
	public void i_receive_relavant_results() {
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Assert -- validation -- expected vs Actual
		
		String[] pTitles = title.split("-");
		//System.out.println(Arrays.toString(pTitles));
		String part2Title = pTitles[1];
		System.out.println(part2Title.trim());
		
		Assert.assertEquals(part2Title.trim(), "Google Search");
		
		
		WebElement results = driver.findElement(By.id("result-stats"));
		
		String numberofResults = results.getText();
		
		System.out.println(numberofResults);
		//Assert.assertEquals(numberofResults, "About 729,000,000 results (0.46 seconds) ");
		closeBrowser();
	}

}
