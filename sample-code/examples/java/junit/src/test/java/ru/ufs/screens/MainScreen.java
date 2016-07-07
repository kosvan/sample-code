package ru.ufs.screens;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class Screen {
protected AppiumDriver driver;



public Screen (AppiumDriver driver) {
	this.driver = driver;
}

private WebElement hamburger;
public WebElement hamburgerMenu() {
	hamburger = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]"));
	return this.hamburger;
}

//методы по работе с кнопкой "купить билеты"
public void mainButtonTap () {
	WebElement Button = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]"));
	Button.click();
	System.out.println("Кликнули по кнопке 'Купить Билеты'");
}

public WebElement mainButton;
public WebElement mainButton () {
	mainButton = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]"));
	return this.mainButton;
}


//public void gamburgerClick() {
//	driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click(); 
//	}



public void ChangeLocale (String lang) {
	String comparetext;
	switch(lang) {
    case "ru": 

    	hamburgerMenu().click();

    	comparetext = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")).getText();
    	if (comparetext.equals("Поиск билетов")) 
    	{
    		System.out.println("Локализация уже на русском");
    		hamburgerMenu().click();
    	} 
    	else 
    	{	
    		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIAStaticText[1]")).click();
    		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[2]")).click();
    		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[1]")).click();
    	}
		break;
		
    case "en": 
    	hamburgerMenu().click();
    	comparetext = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")).getText();
    	System.out.println("comparetext " + comparetext );
    	if (comparetext.equals("Search tickets")) 
    	{
    		System.out.println("Локализация уже на английском");
    		hamburgerMenu().click();
    	} 
    	else 
    	{	
    		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIAStaticText[1]")).click();
    		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[2]")).click();
    		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[2]")).click();
    	}
		break;
    case "de": 
    	hamburgerMenu().click();
    	comparetext = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")).getText();
    	System.out.println("comparetext " + comparetext );
    	if (comparetext.equals("Suche Tickets")) 
    	{
    		System.out.println("Локализация уже на немецком");
    		hamburgerMenu().click();
    	} 
    	else 
    	{	
    		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIAStaticText[1]")).click();
    		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[2]")).click();
    		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[3]")).click();
    	}
		break;
	default: 
	    System.out.println("непонятный параметр");;
	    break;
}
	

}

}
