package ru.ufs.autotests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import junit.framework.Assert;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import ru.ufs.screens.*;

public class MainScreenTests extends TestBaseStatic  {
	
	
	Screen mainScreen = new Screen(driver);
	
    @Test
    public void test1 () throws Exception 
    {  	   
    	
    }
    
    @Test
    public void testClickOnSandwich() throws Exception 
    {
    	try {
	System.out.println("Запуск теста testClickOnSandwich");
    	    } catch (Exception e) {
    	 	 System.out.println("произошла ошибка при выполнении. Стектрейс: "+  e); 
    	 	 assertEquals (0,1);
    		}
    }        					 
    
    @Test
    public void testCheckPurchaseATicketButton() throws Exception  
    {
    
    mainScreen.mainButtonTap();
	System.out.println("Запуск теста testCheckPurchaseATicketButton");
    }

    @Test
    public void testTextMainButtonRu() throws Exception
    {
    System.out.println(mainScreen.mainButtonGetText());
    mainScreen.ChangeLocale("ru");
    Assert.assertEquals(mainScreen.mainButtonGetText(), "Купить билет");
    }
    
    @Test
    public void testTextMainButtonEn() throws Exception
    {
    System.out.println(mainScreen.mainButtonGetText());
    mainScreen.ChangeLocale("en");
    Assert.assertEquals(mainScreen.mainButtonGetText(), "Purchase a ticket");
    }
    
    @Test
    public void testTextMainButtonDe() throws Exception
    {
    System.out.println(mainScreen.mainButtonGetText());
    mainScreen.ChangeLocale("de");
    Assert.assertEquals(mainScreen.mainButtonGetText(), "Das Ticket kaufen");
    }
    
    @Test
    public void changeLocale() throws Exception 
    {
    	System.out.println("Метод смены локализации");
    	mainScreen.ChangeLocale("de");
    }
}
