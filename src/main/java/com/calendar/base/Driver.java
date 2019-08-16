package com.calendar.base;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Driver {
	
	  
		public static AndroidDriver<MobileElement> driver;
		    
		    public Driver(AndroidDriver<MobileElement> driver) {
		        this.driver = driver;
		        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		    }

}
