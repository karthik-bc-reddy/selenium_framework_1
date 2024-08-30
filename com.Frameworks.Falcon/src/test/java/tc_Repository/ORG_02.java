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

public class ORG_02 extends BaseClass{
	
	@Test
	public void org_02Case() throws Exception, Exception {
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		
		String ORGNAME = ExcelUtility.readDataFromExcel("Organization", 7, 1);
		String EMPLOYEES = ExcelUtility.readDataFromExcel("Organization", 7, 2);
		String WEBSITE = ExcelUtility.readDataFromExcel("Organization", 7, 3);
		String PHONE = ExcelUtility.readDataFromExcel("Organization", 7, 4);
		String OTHPHN = ExcelUtility.readDataFromExcel("Organization", 7, 5);
		String EMAIL = ExcelUtility.readDataFromExcel("Organization", 7, 6);
		
		HomePage hp = new HomePage(driver);
		hp.clickonOrg();
		OrgHomePage op = new OrgHomePage(driver);
		op.clickonNewOrgBtn();
		CreateNewOrgPage cp = new CreateNewOrgPage(driver);
		cp.createOrganisation(ORGNAME+num, WEBSITE, EMPLOYEES, OTHPHN, PHONE, EMAIL);
	}

}
