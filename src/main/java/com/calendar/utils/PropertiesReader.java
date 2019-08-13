package com.calendar.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class PropertiesReader {
	
	public static String Read_prop(String SKey) throws IOException{
	
		FileInputStream fis= new FileInputStream("C:\\Users\\shivesh.sahu\\git\\repository\\AppiumTest\\src\\main\\java\\com\\calendar\\config\\config.properties");
		
		Properties prop= new Properties();
		prop.load(fis);
		
		return prop.getProperty(SKey);
			
	
}
}
