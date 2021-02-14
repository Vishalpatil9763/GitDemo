package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.config.Configurations;
import com.qa.config.Constants;

public class BaseTest {
	public static WebDriver driver;
	public static Properties prop;
	FileInputStream fis;

	public BaseTest() {
		prop = new Properties();
		try {
			fis = new FileInputStream(Configurations.configFilePath);
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void setUp() {

		System.setProperty(Configurations.sysChromeProperty, Configurations.chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Constants.pageLoadTime, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitTime, TimeUnit.SECONDS);
		
		driver.get("file:///D:/java/Offline%20Website/index.html");

	}
}
