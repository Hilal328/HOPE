package com.syntax.testbase;


import com.hrms.pages.ContactDetailsPageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.DependentsPageElements;
import com.hrms.pages.EmergencyPageElements;
import com.hrms.pages.EmployeeListPageElements;
import com.hrms.pages.JobPageElements;
import com.hrms.pages.LoginPagesElements;
import com.hrms.pages.PersonaDetailsPageElements;
import com.hrms.pages.QualificationsPageElements;
import com.hrms.pages.SalaryPageElements;

public class PageInitiliazer extends BaseClass {
	protected static LoginPagesElements login;
	protected static DashboardPageElements dashboard;
	protected static EmployeeListPageElements emplist;
	protected static PersonaDetailsPageElements pdetails;
	protected static ContactDetailsPageElements contact;
	protected static EmergencyPageElements emergency;
	protected static DependentsPageElements depend;
	protected static JobPageElements job;
	protected static QualificationsPageElements qualification;
	protected static SalaryPageElements salary;
	public static void initializeAllPage() {

		login = new LoginPagesElements();
		dashboard = new DashboardPageElements();
		pdetails = new PersonaDetailsPageElements();
		emplist=new EmployeeListPageElements();
		contact=new ContactDetailsPageElements();
		emergency=new  EmergencyPageElements();
		depend =new  DependentsPageElements();
		job=new JobPageElements();
		qualification=new QualificationsPageElements();
		salary=new SalaryPageElements();
	}
}
