package com.syntax.utils;

public class Constants {

//	public static final String HRMS_URL = "http://166.62.36.207/Syntax_HRM/symfony/web/index.php/auth/login";
//	
//    public static final String BROWSER="chrome";
//    
//    public static final String USERNAME="Admin";
//   
    //specify path to chrome & gecko driver
    
	public static final String WINDOWS_CHROME_DRIVER_PATH = System.getProperty("user.dir")
			+ "/src/test/resources/drivers/chromedriver.exe";

	public static final String WINDOWS_GECKO_DRIVER_PATH = System.getProperty("user.dir")
			+ "/src/test/resources/drivers/geckodriver.exe";
	
	public static final String MAC_CHROME_DRIVER_PATH = System.getProperty("user.dir")
			+ "/src/test/resources/drivers/chromedriver";

	public static final String MAC_GECKO_DRIVER_PATH = System.getProperty("user.dir")
			+ "/src/test/resources/drivers/geckodriver";

	public static final int PAGE_LOAD_TIME = 30;

	public static final int IMPLICIT_LOAD_TIME = 10;

	public static final int EXPLICIT_LOAD_TIME = 30;

	public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir")
			+ "/src/test/resources/configs/Configuration.properties";
	public static final String ATTACHED_FILE_PATH = System.getProperty("user.dir")
			+ "/src/test/resources/testdata/teufik.jpg";

	public static final String XL_DATA_FILEPATH = System.getProperty("user.dir")
			+ "/src/test/resources/testdata/HrmsTestData.xlsx";
	
	public static final String REPORT_FILEPATH=System.getProperty("user.dir")+"/target/report/Hrms.html";
	
	public static final String OS_NAME=System.getProperty("os.name");
	
	public static final String USER_NAME=System.getProperty("user.name");
	
	public static final String SCREENSHOTS_FILEPATH=System.getProperty("user.dir")+"/target/screenshots/";
	
	public static final String ATTACH_FILE_PATH = System.getProperty("user.dir")
			+ "/src/test/resources/testimage/guvercin.jpg";

	
	public static final String ATTACH_FILE_PATH_SALARY = System.getProperty("user.dir")
			+ "/src/test/resources/testimage/SalaryTestCaseFile.docx";

	public static final String EMPLOYEE_PIC_FILE_PATH = System.getProperty("user.dir")
			+ "/src/test/resources/testimage/employee.jpeg";
	public static final String ADD_ATTACHMENT_FILE_PATH =System.getProperty("user.dir")
			+ "/src/test/resources/testimage/TestAttachment.txt"; 


}
//	public static final String SYNTAX_PRACTICE_URL = "http://jiravm.centralus.cloudapp.azure.com:8081/";
//	
//
//	public static final String welcomeToTheInternetUrl = "https://the-internet.herokuapp.com";
//
//	
//	public static final String SYNTAX_PRACTICE = "https://the-internet.herokuapp.com/";
//	public static final String TOOLSQA_URL = "http://www.toolsqa.com/automation-practice-form/";
//	public static final String HER_OKUAPP = "https://the-internet.herokuapp.com/";
//	public static final String AMAZON = "https://amazon.com";
//
//}
