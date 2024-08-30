package tc_Repository;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import genericUtilityOrLib.ListenersImplementationClass;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

@Listeners(ListenersImplementationClass.class)

public class ORG_03 extends BaseClass{
	
	@Test
	public void org_03Case() throws Exception, Exception {
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		
		String ORGNAME = ExcelUtility.readDataFromExcel("Organization", 12, 1);
		String EMPLOYEES = ExcelUtility.readDataFromExcel("Organization", 12, 2);
		String WEBSITE = ExcelUtility.readDataFromExcel("Organization", 12, 3);
		String PHONE = ExcelUtility.readDataFromExcel("Organization", 12, 4);
		String OTHPHN = ExcelUtility.readDataFromExcel("Organization", 12, 5);
		String EMAIL = ExcelUtility.readDataFromExcel("Organization", 12, 6);
		String CITY = ExcelUtility.readDataFromExcel("Organization", 12, 7);
		
		HomePage hp = new HomePage(driver);
		hp.clickonOrg();
		OrgHomePage op = new OrgHomePage(driver);
		op.clickonNewOrgBtn();
		CreateNewOrgPage cp = new CreateNewOrgPage(driver);
		cp.createOrganisation(ORGNAME+num, WEBSITE, EMPLOYEES, OTHPHN, PHONE, EMAIL, CITY);
	}

}
