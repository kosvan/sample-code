package ru.ufs.autotests;


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
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBaseStatic {
	
	protected static AppiumDriver<WebElement> driver;
   // private List<Integer> values;

    @BeforeClass
    public static void setUp() throws Exception {
        // set up appium
      File appDir = new File(System.getProperty("user.dir"), "../../../apps/TestApp/build/release-iphonesimulator");
      File app = new File(appDir, "e-ticket.app");
      DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setCapability("platformVersion", "8.4");
      capabilities.setCapability("deviceName", "iPhone 5");
      capabilities.setCapability("app", app.getAbsolutePath());
      driver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
      // values = new ArrayList<Integer>();
    }
    
    @AfterClass
    public static void tearDown() throws Exception {
      driver.quit();
    }
}
