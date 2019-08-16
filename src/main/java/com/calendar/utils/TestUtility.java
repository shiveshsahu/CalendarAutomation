package com.calendar.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.calendar.base.Driver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;

public class TestUtility extends Driver{
	
	public TestUtility(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	
	 public static void takeScreenShot(String scname) throws IOException, InterruptedException  {
		  
		  TakesScreenshot screenShot = ((TakesScreenshot)driver);
		  File screenshotAs =screenShot.getScreenshotAs(OutputType.FILE);
		  Thread.sleep(5000);
		  FileUtils.copyFile(screenshotAs, new File("D:\\AutomationScreenshots\\"+scname+".png"));
	 }
	 
	 public static void scrollDown() {
		 
		 
	 }
	
	

}
