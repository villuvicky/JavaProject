package com.mustknow.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Props_file {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream=new  FileInputStream("config.properties");
		Properties properties=new Properties();
		properties.load(fileInputStream);
		String name=properties.getProperty("browser");
		String loc=properties.getProperty("location");
		if(name.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver",loc );
	 driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.co.in");
}
	}
}

