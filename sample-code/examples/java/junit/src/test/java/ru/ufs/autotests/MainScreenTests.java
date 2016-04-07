package com.saucelabs.appium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;

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


@SuppressWarnings("deprecation")
public class MoscowSamara {

    private AppiumDriver<WebElement> driver;

    private List<Integer> values;

    private static final int MINIMUM = 0;
    private static final int MAXIMUM = 10;

    @Before
    public void setUp() throws Exception {
        // set up appium
 
      File appDir = new File(System.getProperty("user.dir"), "../../../apps/TestApp/build/release-iphonesimulator");
      File app = new File(appDir, "e-ticket.app");
      
        
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformVersion", "8.4");
        capabilities.setCapability("deviceName", "iPhone 5");
        capabilities.setCapability("app", app.getAbsolutePath());
        driver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        values = new ArrayList<Integer>();
        
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    private void populate() {
        //populate text fields with two random number
        List<WebElement> elems = driver.findElements(By.className("UIATextField"));
        Random random = new Random();
        for (WebElement elem : elems) {
            int rndNum = random.nextInt(MAXIMUM - MINIMUM + 1) + MINIMUM;
            elem.sendKeys(String.valueOf(rndNum));
            values.add(rndNum);
        }
    }
 
    @Test
    public void testSeqrch () throws Exception {
        System.out.println("Запуск теста на выдачу результатов по направлению 'Москва-Самара'");

    	driver.findElement(By.name("trainBtn")).click();	
    	Thread.sleep(1000);
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")).click();
		driver.findElement(By.name("Очистить текст")).click();
		driver.findElement(By.name("М")).click();
		driver.findElement(By.name("о")).click();
		driver.findElement(By.name("с")).click();
		driver.findElement(By.name("к")).click();
		driver.findElement(By.name("в")).click();
		driver.findElement(By.name("а")).click();
		driver.findElement(By.name("Готово")).click();
        System.out.println("Ввели станцию отправления");
		
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[2]")).click();
		driver.findElement(By.name("Очистить текст")).click();
		driver.findElement(By.name("С")).click();
		driver.findElement(By.name("а")).click();
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[3]/UIATableCell[2]")).click();
        System.out.println("Ввели станцию назначения");
        
		driver.findElement(By.name("Готово")).click();
		driver.findElement(By.name("nextSearchBtn")).click();
    	Thread.sleep(4000);

		driver.findElement(By.name("Москва - Самара")).click();
        assertEquals("Москва - Самара", driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIAStaticText[1]")).getText());
        System.out.println("Строка 'Москва-Самара' соответствует проверяемой. Результаты поиска есть, тест успешен.");
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")).click();

        Thread.sleep(9000);
    }
    

}
