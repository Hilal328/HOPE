package com.syntax.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.syntax.utils.ConfigsReader;

public class BaseClass {

	public static WebDriver driver;
	
	public static String OS_NAME = System.getProperty("os.name");
	
	public static void setUp() {
			
		ConfigsReader.readProperties("src/test/resources/configs/Configuration.properties");
		
		String browser = ConfigsReader.getProperty("browser");
	
		
		if(browser.equalsIgnoreCase("chrome")) {
			if(OS_NAME.contains("Mac")) {
				System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
				
			}else if(OS_NAME.contains("Windows")){
				System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			}
			
			driver = new ChromeDriver();
		
		} else if(browser.equalsIgnoreCase("firefox")) {
			if(OS_NAME.contains("Mac")) {
				System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver");
			}else if(OS_NAME.contains("Windows")) {
				System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
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