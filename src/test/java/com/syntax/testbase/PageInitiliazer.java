package com.syntax.testbase;

import com.syntax.pages.ContactDetailsPageElements;
import com.syntax.pages.DashboardPageElements;
import com.syntax.pages.DependentsPageElements;
import com.syntax.pages.EmergencyPageElements;
import com.syntax.pages.EmployeeListPageElements;
import com.syntax.pages.JobPageElements;
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
