package tc_Repository;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import genericUtilityOrLib.ListenersImplementationClass;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

@Listeners(ListenersImplementationClass.class)

public class LE_03 extends BaseClass {


	@Test//(groups = {"sanity"})
	public void le_01Case() throws Exception {
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
//		ExcelUtility EUTIL = new ExcelUtility();

		String FIRSTNAME = ExcelUtility.readDataFromExcel("Lead", 10, 1);
		String LASTNAME = ExcelUtility.readDataFromExcel("Lead", 10, 2);
		String COMPANY = ExcelUtility.readDataFromExcel("Lead", 10, 3);
		String TITLE = ExcelUtility.readDataFromExcel("Lead", 10, 4);
		String STATE = ExcelUtility.readDataFromExcel("Lead", 10, 5);
		String COUNTRY = ExcelUtility.readDataFromExcel("Lead", 10, 6);
		

		HomePage hp = new HomePage(driver);
		hp.clickonLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickonNewLeadBtn();
		CreateNewLeadPage cn = new CreateNewLeadPage(driver);
		cn.createLead(FIRSTNAME + num, LASTNAME, COMPANY,TITLE, STATE, COUNTRY);

	}
}
