package com.syntax.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.syntax.utils.ConfigsReader;
import com.syntax.utils.Constants;

public class BaseClass {

	public static WebDriver driver;
	
	public static String OS_NAME = System.getProperty("os.name");
	
	public static void setUp() {
			
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		
		String browser = ConfigsReader.getProperty("browser").toLowerCase();
	
		
		if(browser.equals("chrome")) {
			if(OS_NAME.contains("Mac")) {
				System.setProperty("webdriver.chrome.driver", Constants.MAC_CHROME_DRIVER_PATH);
				
			}else if(OS_NAME.contains("Windows")){
				System.setProperty("webdriver.chrome.driver", Constants.WINDOWS_CHROME_DRIVER_PATH);
			}
			
			driver = new ChromeDriver();
		
		} else if(browser.equals("firefox")) {
			if(OS_NAME.contains("Mac")) {
				System.setProperty("webdriver.gecko.driver", Constants.MAC_GECKO_DRIVER_PATH);
			}else if(OS_NAME.contains("Windows")) {
				System.setProperty("webdriver.gecko.driver", Constants.WINDOWS_GECKO_DRIVER_PATH);
			}
			
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		driver.get(ConfigsReader.getProperty("url"));
		
	}
	
	public static void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}
}