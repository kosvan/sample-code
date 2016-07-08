package ru.ufs.autotests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import ru.ufs.autotests.base.TestBaseStatic;
import ru.ufs.screens.MainScreen;

public class MainScreenTextEn extends TestBaseStatic {
	
	MainScreen mainScreen = new MainScreen(driver);

	@Before
	public void change() throws Exception
    {
		//устанавливаем англ локализацию, если она не была установлена до этого
		if (!mainScreen.mainButton().getText().equals("Find a ticket") ) {
		mainScreen.ChangeLocale("en");
		}
    }
 
	
    @Test
    public void testTextMainButtonRu() throws Exception
    {
    Assert.assertEquals(mainScreen.mainButton().getText(), "Find a ticket");
    }
    
    
    @Test
    public void testTextUFS() throws Exception
    {
    	Assert.assertEquals(mainScreen.textUFS().getText(), "The service provided by UFS, Ltd");
    }
    
    @Test 
    public void testLogoUFS() throws Exception
    {
    	System.out.println(mainScreen.UFSLogo().getSize().height);
    	Assert.assertEquals(mainScreen.UFSLogo.getSize().height, 44);
    	Assert.assertEquals(mainScreen.UFSLogo.getSize().width, 44);
    }
    
    
    
    
}
