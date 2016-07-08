package ru.ufs.autotests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import ru.ufs.autotests.base.TestBaseStatic;
import ru.ufs.screens.MainScreen;
import ru.ufs.screens.SearchScreen;


public class SearchScreenRuTests extends TestBaseStatic {
	MainScreen mainScreen = new MainScreen(driver);
	SearchScreen searchScreen = new SearchScreen(driver);

	//переходим на экран "поиск поездов"
	@Before
	public void HeaderCheckText() throws Exception {
		//mainScreen.ChangeLocale("ru");
		mainScreen.GoToSearchScreen();
	}

	@Test
	public void checkTitle () throws Exception {
    	Assert.assertEquals(searchScreen.title().getText(), "Поиск билетов");
	}
	
	@Test
	public void checkWhereLabel () throws Exception {
    	Assert.assertEquals(searchScreen.whereTitle().getText(), "Куда");
	}
	
	
	@Test
	public void checkFromLabel () throws Exception {
    	Assert.assertEquals(searchScreen.fromTitle().getText(), "Откуда");
	}
	
	@Test
	public void checkFromLabel2 () throws Exception {
    	Assert.assertEquals(searchScreen.fromTitle().getText(), "Откуда");
	}
	
	@Test
	public void checkDateTitle () throws Exception {
    	Assert.assertEquals(searchScreen.dateTitle().getText(), "Сегодня, 07 июля, чт");
	}
	
	@Test
	public void checkPassengerTitle () throws Exception {
    	Assert.assertEquals(searchScreen.passengerTitle().getText(), "1 взрослый");
	}
	
	@Test
	public void checkTimeSelectorTitle () throws Exception {
    	Assert.assertEquals(searchScreen.timeSelectorTitle().getText(), "00:00 - 24:00");
	}	
	
	@Test
	public void checkLocalTimeTitle () throws Exception {
    	Assert.assertEquals(searchScreen.localTimeTitle().getText(), "мск");
	}	
	
	@Test
	public void checkFindTicketsButton () throws Exception {
    	Assert.assertEquals(searchScreen.findTicketsButton().getText(), "Искать билеты");
	}	
	
	@Test
	public void checkChangeStationsButton () throws Exception {
		String arriveStation = new String (searchScreen.fromStationTitle().getText());
		String departmentStation = new String (searchScreen.wereStationTitle().getText());
		searchScreen.changeStationsButton().click();
		Assert.assertEquals(searchScreen.fromStationTitle().getText(), departmentStation);
		Assert.assertEquals(searchScreen.wereStationTitle().getText(), arriveStation);
	}	
	
	@Test
	public void checkTimeSelectorBar () throws Exception {
		searchScreen.timeDiapasone().click();
		String timeLabel = searchScreen.timeLabel().getText();
		Assert.assertEquals(timeLabel, "Время");
	}
	
	
	
}
