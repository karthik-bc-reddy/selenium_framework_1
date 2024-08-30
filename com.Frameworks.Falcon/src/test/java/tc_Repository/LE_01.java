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

public class LE_01 extends BaseClass {


	@Test //(groups = {"smoke"})
	public void le_01Case() throws Exception {
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
//		ExcelUtility EUTIL = new ExcelUtility();

		String FIRSTNAME = ExcelUtility.readDataFromExcel("Lead", 3, 1);
		String LASTNAME = ExcelUtility.readDataFromExcel("Lead", 3, 2);
		String COMPANY = ExcelUtility.readDataFromExcel("Lead", 3, 3);

		HomePage hp = new HomePage(driver);
		hp.clickonLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickonNewLeadBtn();
		CreateNewLeadPage cn = new CreateNewLeadPage(driver);
		cn.createLead(FIRSTNAME + num, LASTNAME, COMPANY);

	}
}
