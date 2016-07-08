package ru.ufs.autotests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import ru.ufs.autotests.base.TestBaseStatic;
import ru.ufs.screens.MainScreen;

public class MainScreenTextRu extends TestBaseStatic {
	
	MainScreen mainScreen = new MainScreen(driver);

	@Before
	public void change() throws Exception
    {
		//устанавливаем русс локализацию, если она не была установлена до этого
		if (!mainScreen.mainButton().getText().equals("Найти билет") ) {
		mainScreen.ChangeLocale("ru");
		}
    }
 
	
    @Test
    public void testTextMainButtonRu() throws Exception
    {
    Assert.assertEquals(mainScreen.mainButton().getText(), "Найти билет");
    }
    
    
    @Test
    public void testTextUFS() throws Exception
    {
    	Assert.assertEquals(mainScreen.textUFS().getText(), "Сервис предоставляется ООО \"УФС\"");
    }
    
    @Test 
    public void testLogoUFS() throws Exception
    {
    	System.out.println(mainScreen.UFSLogo().getSize().height);
    	Assert.assertEquals(mainScreen.UFSLogo.getSize().height, 44);
    	Assert.assertEquals(mainScreen.UFSLogo.getSize().width, 44);
    }
    
    
    
    
}
