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

public class LE_02 extends BaseClass {


	@Test//(groups = {"regression"})
	public void le_01Case() throws Exception {
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
//		ExcelUtility EUTIL = new ExcelUtility();

		String FIRSTNAME = ExcelUtility.readDataFromExcel("Lead", 6, 1);
		String LASTNAME = ExcelUtility.readDataFromExcel("Lead", 6, 2);
		String COMPANY = ExcelUtility.readDataFromExcel("Lead", 6, 3);
		String MOBILE = ExcelUtility.readDataFromExcel("Lead", 6, 4);
		String EMAIL = ExcelUtility.readDataFromExcel("Lead", 6, 5);
		String PCODE = ExcelUtility.readDataFromExcel("Lead", 6, 6);
		String COUNTRY = ExcelUtility.readDataFromExcel("Lead", 6, 7);
		String STATE = ExcelUtility.readDataFromExcel("Lead", 6, 8);
		

		HomePage hp = new HomePage(driver);
		hp.clickonLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickonNewLeadBtn();
		CreateNewLeadPage cn = new CreateNewLeadPage(driver);
		cn.createLead(FIRSTNAME + num, LASTNAME, COMPANY,MOBILE, EMAIL, PCODE, COUNTRY, STATE);

	}
}
