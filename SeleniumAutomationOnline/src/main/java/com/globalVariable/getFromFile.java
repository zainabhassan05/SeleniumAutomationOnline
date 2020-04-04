package com.globalVariable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class getFromFile {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ziaha\\eclipse-workspace\\SeleniumAutomationOnline\\src\\main\\java\\com\\globalVariable\\datadriven.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
				
				

	}

}
