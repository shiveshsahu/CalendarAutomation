package com.calendar.pages;

import org.openqa.selenium.support.PageFactory;

import com.calendar.base.Driver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalendarHome extends Driver {
	
	
	@AndroidFindBy(id="com.android.calendar:id/new_event")
	public AndroidElement addevent;
	
	@AndroidFindBy(id="com.android.calendar:id/action_cancel")
	public AndroidElement cancel;
		
	/*
	 * public CalendarHome(AndroidDriver<MobileElement> driver) {
	 * PageFactory.initElements(new AppiumFieldDecorator(driver), this); }
	 */
	 
	  public CalendarHome(AndroidDriver<MobileElement> driver) { 
		  super(driver);
		  }
	 

	public void add()  {
		addevent.click();
		}
	
	public void cancel() {
		cancel.click();
	}
	
}