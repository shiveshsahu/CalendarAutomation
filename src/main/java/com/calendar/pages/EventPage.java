package com.calendar.pages;

import com.calendar.base.Driver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EventPage extends Driver {
	
	@AndroidFindBy(xpath = "(//*[@text='Event name'])")
	public AndroidElement eventname;
	
	@AndroidFindBy(id = "com.android.calendar:id/attendees")
	public AndroidElement guests;
	
	@AndroidFindBy(id = "com.android.calendar:id/location")
	public AndroidElement location;
	
	@AndroidFindBy(id = "com.android.calendar:id/description")
	public AndroidElement description;
	
	@AndroidFindBy(id = "com.android.calendar:id/action_done")
	public AndroidElement done;
	
	public EventPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	public void createEvent(String Eventname, String Guests, String Location, String Descriptions) throws InterruptedException {
		Thread.sleep(5000);
		eventname.sendKeys(Eventname);
		guests.sendKeys(Guests);
		location.sendKeys(Location);
		description.sendKeys(Descriptions);	
	}
	
	public void done(){
		done.click();
	}
}
