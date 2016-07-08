package ru.ufs.screens;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class MainScreen {
protected AppiumDriver driver;


//инициализация элементов на главном экране
public MainScreen (AppiumDriver driver) {
	this.driver = driver;
}

//Гамбургер
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

//Основная кнопка
public WebElement mainButton;
public WebElement mainButton () {
	mainButton = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]"));
	return this.mainButton;
}

//кнопка "найти билет" на поиске
public WebElement findButton;
public WebElement findButton () {
	findButton = driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[3]");
	return this.findButton;
}



//Текст "Сервис предосталвяется бла бла бла
public WebElement textUFS;
public WebElement textUFS () {
	textUFS = driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIAStaticText[2]");
	return this.textUFS;
}

//Логотип "УФС"
public WebElement UFSLogo;
public WebElement UFSLogo () {
	UFSLogo = driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIAImage[12]");
	return this.UFSLogo;
}

//Пункт "Поиск Билетов"
public WebElement SearchTicketsHamburger;
public WebElement SearchTicketsHamburger () {
	SearchTicketsHamburger = driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]");
	return this.SearchTicketsHamburger;
}




//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]

public void GoToSearchScreen () {
	//может я уже там где надо?
	String titleText = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]")).getText();
	System.out.println("Title text is: " + titleText);
	if (!((titleText.equals("Поиск билетов")) ||(titleText.equals("Search tickets")) || (titleText.equals("Suche Tickets")))) 
	{
	hamburgerMenu().click();
	SearchTicketsHamburger().click();
	}
}

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
