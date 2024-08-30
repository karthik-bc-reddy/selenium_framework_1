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

public class LE_04 extends BaseClass {


	@Test//(groups = {"smoke", "regression"})
	public void le_01Case() throws Exception {
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
//		ExcelUtility EUTIL = new ExcelUtility();

		String FIRSTNAME = ExcelUtility.readDataFromExcel("Lead", 14, 1);
		String LASTNAME = ExcelUtility.readDataFromExcel("Lead", 14, 2);
		String COMPANY = ExcelUtility.readDataFromExcel("Lead", 14, 3);
		String MOBILE = ExcelUtility.readDataFromExcel("Lead", 14, 4);
		String EMAIL = ExcelUtility.readDataFromExcel("Lead", 14, 5);
		String PCODE = ExcelUtility.readDataFromExcel("Lead", 14, 6);
		String COUNTRY = ExcelUtility.readDataFromExcel("Lead", 14, 7);
		String STATE = ExcelUtility.readDataFromExcel("Lead", 14, 8);
		String AREVENUE = ExcelUtility.readDataFromExcel("Lead", 14, 9);
		String TITLE = ExcelUtility.readDataFromExcel("Lead", 14, 10);

		HomePage hp = new HomePage(driver);
		hp.clickonLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickonNewLeadBtn();
		CreateNewLeadPage cn = new CreateNewLeadPage(driver);
		cn.createLead(FIRSTNAME + num, LASTNAME, COMPANY, MOBILE, EMAIL, PCODE, COUNTRY, STATE, AREVENUE, TITLE);

	}
}
