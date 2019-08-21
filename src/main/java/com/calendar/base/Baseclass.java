package com.calendar.base;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.calendar.utils.PropertiesReader;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Baseclass {
	
	public static AndroidDriver<MobileElement> driver;
	
	@BeforeSuite
	public void test() throws IOException, InterruptedException, MalformedURLException  {
		
		  DesiredCapabilities cap=new DesiredCapabilities();
		  cap.setCapability(MobileCapabilityType.BROWSER_NAME,"" );
		
		  cap.setCapability(MobileCapabilityType.DEVICE_NAME,PropertiesReader.Read_prop("deviceName"));
		  System.out.println("*************"+PropertiesReader.Read_prop("deviceName"));
		  cap.setCapability(MobileCapabilityType.PLATFORM_NAME,PropertiesReader.Read_prop("platformName"));
		  System.out.println("$$$$$$$$$$$$$$$$$"+PropertiesReader.Read_prop("platformName"));
		  cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,
		  PropertiesReader.Read_prop("platformVersion"));
		  System.out.println("$$$$$$$************$$$$$$$$$$"+PropertiesReader.Read_prop("platformVersion"));
		  
		  cap.setCapability("appPackage", PropertiesReader.Read_prop("appPackage"));
		  cap.setCapability("appActivity", PropertiesReader.Read_prop("appActivity"));
	
		  cap.setCapability("autoGrantPermissions",true);
		  cap.setCapability("noReset", true);
		  cap.setCapability("deviceReadyTimout","20");
		  cap.setCapability("autoDismissAlerts", true);
		  cap.setCapability("unicodeKeyboard", true);
		  cap.setCapability("resetKeyboard", true);
		  
		
		
		driver = new AndroidDriver<MobileElement>(new URL("http:/0.0.0.0:4723/wd/hub"), cap);
		
		
	}
	
	  @AfterSuite public void afterMethod() {
	  
	  driver.quit();
	  
	  }
	 
}
	


