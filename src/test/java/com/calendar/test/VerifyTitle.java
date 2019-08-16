package com.calendar.test;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

import com.calendar.base.Baseclass;
import com.calendar.pages.CalendarHome;
import com.calendar.utils.TestUtility;
import com.calendar.utils.ExtentReports.ExtentTestManager;



//@Listeners(com.calendar.utils.Listeners.TestListeners.class)
public class VerifyTitle extends Baseclass{
	
	
	
	@Test(priority=1)
	public void verifyAdd(Method method) throws InterruptedException, IOException  {
		ExtentTestManager.startTest(method.getName(), "click+ to create event");
		CalendarHome Calendarhome= new CalendarHome(driver);
		Calendarhome.add();
		Thread.sleep(2000);
		TestUtility.takeScreenShot("addevent");
		Calendarhome.cancel();
		
	}
	

}
