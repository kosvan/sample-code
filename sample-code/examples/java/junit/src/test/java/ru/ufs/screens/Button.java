package ru.ufs.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ru.ufs.autotests.base.TestBaseStatic;

class Button extends TestBaseStatic {
	WebElement mainButton = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]"));;
	public void mainButtonClick (WebElement Button) 
	{
		Button.click();
	}
	
	public String getName (WebElement Button) {
		return Button.getText();
	}

	String ggg = getName(mainButton);
}