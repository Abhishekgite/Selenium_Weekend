package com.Resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class baseClass {
	
	public WebDriver driver;  // Globally Declared
	
	public Properties prop;
	
	public void intializeDriver() throws IOException {
			
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\Resource\\data.properties");
	
	// to access the properties file
    prop = new Properties();
	
	prop.load(fis);
	
	String broswerName = prop.getProperty("broswer");
	
	if (broswerName.equalsIgnoreCase("chrome")) {
		
		 driver = new ChromeDriver();
		
	} else if(broswerName.equalsIgnoreCase("firefox")) {

		 driver = new FirefoxDriver();
	}
	else if(broswerName.equalsIgnoreCase("Edge")) {

		 driver = new EdgeDriver();

	
	}

	}
	
	@BeforeSuite
	public void ExtentReport() {
		
		extendManager.setup();
	}
	
	@AfterSuite
	public void endReport() {
		
		extendManager.endReport();
	}
	
	@BeforeClass
	public void launchBroswer() throws IOException {
		
		intializeDriver();
		
		driver.get(prop.getProperty("url"));
	}
	
	public String generateRandomEmail() {
		
		return System.currentTimeMillis()+"@gmail.com";
}
}
