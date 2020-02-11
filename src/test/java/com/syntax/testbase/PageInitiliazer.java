package com.syntax.testbase;

import com.syntax.pages.AddEmployeePageWebElements;
import com.syntax.pages.ContactDetailsPageElements;
import com.syntax.pages.DashboardPageElements;
import com.syntax.pages.DependentsPageElements;
import com.syntax.pages.EmergencyPageElements;
import com.syntax.pages.EmployeeListPageElements;
<<<<<<< Updated upstream
=======
import com.syntax.pages.JobDetailsPageElements;
>>>>>>> Stashed changes
import com.syntax.pages.LoginPagesElements;
import com.syntax.pages.PersonaDetailsPageElements;
import com.syntax.pages.QualificationsPageElements;
import com.syntax.pages.SalaryPageElements;

public class PageInitiliazer extends BaseClass {
	protected static LoginPagesElements login;
	protected static DashboardPageElements dashboard;
	protected static EmployeeListPageElements emplist;
	protected static PersonaDetailsPageElements pdetails;
	protected static ContactDetailsPageElements contact;
	protected static EmergencyPageElements emergency;
	protected static DependentsPageElements depend;
<<<<<<< Updated upstream
=======
	protected static JobDetailsPageElements job;
>>>>>>> Stashed changes
	protected static QualificationsPageElements qualification;
	protected static SalaryPageElements salary;
	protected static AddEmployeePageWebElements addEmp;
	public static void initializeAllPage() {

		login = new LoginPagesElements();
		dashboard = new DashboardPageElements();
		pdetails = new PersonaDetailsPageElements();
		emplist=new EmployeeListPageElements();
		contact=new ContactDetailsPageElements();
		emergency=new  EmergencyPageElements();
		depend =new  DependentsPageElements();
		qualification=new QualificationsPageElements();
		salary=new SalaryPageElements();
		addEmp=new AddEmployeePageWebElements();
		job=new JobDetailsPageElements();
		
	}
}
