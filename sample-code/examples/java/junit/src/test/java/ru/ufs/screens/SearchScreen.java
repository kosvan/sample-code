package ru.ufs.screens;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class SearchScreen {
protected AppiumDriver driver;


//инициализация элементов на главном экране
public SearchScreen (AppiumDriver driver) {
	this.driver = driver;
}


private WebElement hamburger;
public WebElement hamburgerMenu() {
	hamburger = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]"));
	return this.hamburger;
}

private WebElement title;
public WebElement title() {
	title = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]"));
	return this.title;
}


private WebElement backButton;
public WebElement backButton() {
	backButton = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]"));
	return this.backButton;
}

private WebElement fromTitle;
public WebElement fromTitle() {
	fromTitle = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAStaticText[1]"));
	return this.fromTitle;
}

private WebElement whereTitle;
public WebElement whereTitle() {
	whereTitle = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAStaticText[3]"));
	return this.whereTitle;
}

private WebElement dateTitle;
public WebElement dateTitle() {
	dateTitle = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAStaticText[5]"));
	return this.dateTitle;
}

private WebElement passengerTitle;
public WebElement passengerTitle() {
	passengerTitle = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAStaticText[6]"));
	return this.passengerTitle;
}

private WebElement timeTitle;
public WebElement timeTitle() {
	timeTitle = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAStaticText[7]"));
	return this.timeTitle;
}

private WebElement timeSelectorTitle;
public WebElement timeSelectorTitle() {
	timeSelectorTitle = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAStaticText[8]"));
	return this.timeSelectorTitle;
}

private WebElement localTimeTitle;
public WebElement localTimeTitle() {
	localTimeTitle = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAStaticText[9]"));
	return this.localTimeTitle;
}

private WebElement findTicketsButton;
public WebElement findTicketsButton() {
	findTicketsButton = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[3]"));
	return this.findTicketsButton;
}

private WebElement changeStationsButton;
public WebElement changeStationsButton() {
	changeStationsButton = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[1]"));
	return this.changeStationsButton;
}

private WebElement fromStationTitle;
public WebElement fromStationTitle() {
	fromStationTitle = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAStaticText[2]"));
	return this.fromStationTitle;
}

private WebElement wereStationTitle;
public WebElement wereStationTitle() {
	wereStationTitle = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAStaticText[4]"));
	return this.wereStationTitle;
}

//иконки
private WebElement fromTrainIcon;
public WebElement fromTrainIcon() {
	fromTrainIcon = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAImage[1]"));
	return this.fromTrainIcon;
}

private WebElement departmentTrainIcon;
public WebElement departmentTrainIcon() {
	departmentTrainIcon = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAImage[3]"));
	return this.departmentTrainIcon;
}

private WebElement calendarIcon;
public WebElement calendarIcon() {
	calendarIcon = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAImage[5]"));
	return this.calendarIcon;
}

private WebElement passengersIcon;
public WebElement passengersIcon() {
	passengersIcon = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAImage[6]"));
	return this.passengersIcon;
}

private WebElement clockIcon;
public WebElement clockIcon() {
	clockIcon = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAImage[7]"));
	return this.clockIcon;
}

//место для выбора диапазона времени


//Бар выбора времени
private WebElement timeLabel;
public WebElement timeLabel() {
	timeLabel = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[2]/UIAStaticText[1]"));
	return this.timeLabel;
}


private WebElement cancelLabelModal;
public WebElement cancelLabelModal() {
	cancelLabelModal = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[2]/UIAButton[1]"));
	return this.cancelLabelModal;
}



private WebElement timeDiapasone;
public WebElement timeDiapasone() {
	timeDiapasone = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAStaticText[8]"));
	return this.timeDiapasone;
}


//модальные окна
private WebElement searchStationModalLabel;
public WebElement searchStationModalLabel() {
	searchStationModalLabel = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIASearchBar[1]/UIASearchBar[1]"));
	return this.searchStationModalLabel;
}

private WebElement stationModalLaber;
public WebElement stationModalLaber() {
	stationModalLaber = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[1]/UIAStaticText[1]"));
	return this.stationModalLaber;
}

private WebElement cancelModalButton;
public WebElement cancelModalButton() {
	cancelModalButton = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]"));
	return this.cancelModalButton;
}


//календарь

private WebElement calendarModalLabel;
public WebElement calendarModalLabel() {
	calendarModalLabel = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAStaticText[1]"));
	return this.calendarModalLabel;
}

}