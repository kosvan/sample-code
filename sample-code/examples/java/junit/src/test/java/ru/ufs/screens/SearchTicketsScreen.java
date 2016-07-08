package ru.ufs.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class SearchTicketsScreen {
	protected AppiumDriver driver;
	
public SearchTicketsScreen (AppiumDriver driver) {
	this.driver = driver;
	}

	public WebElement hamburgerMenu() {
		WebElement hamburger = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]"));
		return this.hamburgerMenu();
		
		
	}
}
