package com.calendar.test;

import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.calendar.base.Baseclass;
import com.calendar.pages.CalendarHome;
import com.calendar.pages.EventPage;
import com.calendar.utils.ExcelReadData;
import com.calendar.utils.TestUtility;
import com.calendar.utils.ExtentReports.ExtentTestManager;

public class AddEvent extends Baseclass{
	
	String sheetName= "Sheet1";
	
	
	@DataProvider(name="Calendar")
	public Object[][] Calendar() throws InvalidFormatException, IOException{
		Object data[][] = ExcelReadData.getTestData(sheetName);
		System.out.println(data);
		return data;
	}
	
	@Test(dataProvider= "Calendar",priority=2)
	public void creatNewEvent(String Eventname, String Guests, String Location, String Descriptions, Method method) throws IOException, InterruptedException {
		ExtentTestManager.startTest(method.getName(), "click+ to create event");
		CalendarHome Calendarhome= new CalendarHome(driver);
		Calendarhome.add();
		//Thread.sleep(2000);
		System.out.println("output:"+ Eventname +Guests+ Location +Descriptions);
		EventPage Eventpage= new EventPage(driver);
		Eventpage.createEvent(Eventname, Guests, Location, Descriptions);
		Eventpage.done();
		TestUtility.takeScreenShot("creatNewEvent");
		
		
	}
	
	

}
