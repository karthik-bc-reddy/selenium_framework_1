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

public class ORG_01 extends BaseClass{

	@Test
	public void org_01Case() throws Exception {
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);

		String ORGNAME = ExcelUtility.readDataFromExcel("Organization", 2, 1);
		String EMPLOYEES = ExcelUtility.readDataFromExcel("Organization", 2, 2);
		String WEBSITE = ExcelUtility.readDataFromExcel("Organization", 2, 3);

		HomePage hp = new HomePage(driver);
		hp.clickonOrg();
		OrgHomePage op = new OrgHomePage(driver);
		op.clickonNewOrgBtn();
		CreateNewOrgPage cp = new CreateNewOrgPage(driver);
		cp.createOrganisation(ORGNAME+num, EMPLOYEES, WEBSITE);

	}
}
