package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this is the pom class for create org page
 * 
 * @author Karthik BC
 *
 */
public class CreateNewOrgPage {

	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement orgName;

	@FindBy(xpath = "//input[@name='employees']")
	private WebElement employees;

	@FindBy(xpath = "//input[@name='website']")
	private WebElement website;

	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phNo;

	@FindBy(xpath = "//input[@name='otherphone']")
	private WebElement otherPhno;

	@FindBy(xpath = "//input[@name='email1']")
	private WebElement email;

	@FindBy(xpath = "//input[@name='bill_city']")
	private WebElement billingCity;

	@FindBy(xpath = "//input[@name='bill_state']")
	private WebElement billingState;

	@FindBy(xpath = "(//input[@name='button'])[3]")
	private WebElement saveBtn;

	public CreateNewOrgPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getEmployees() {
		return employees;
	}

	public WebElement getWebsite() {
		return website;
	}

	public WebElement getPhNo() {
		return phNo;
	}

	public WebElement getOtherPhno() {
		return otherPhno;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getBillingCity() {
		return billingCity;
	}

	public WebElement getBillingState() {
		return billingState;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	/**
	 * this is the business lib to create an org for TC 01
	 * @param organisationName
	 * @param web
	 * @param emp
	 */

	public void createOrganisation(String organisationName, String web, String emp) {
		orgName.sendKeys(organisationName);
		website.sendKeys(web);
		employees.sendKeys(emp);
		saveBtn.click();
	}

	/**
	 * this is the business lib to create an org for TC 02
	 * @param organisationName
	 * @param web
	 * @param emp
	 * @param mobno
	 * @param otherPhone
	 * @param mailId
	 */

	public void createOrganisation(String organisationName, String web, String emp, String mobno, String otherPhone,
			String mailId) {
		orgName.sendKeys(organisationName);
		website.sendKeys(web);
		employees.sendKeys(emp);
		phNo.sendKeys(mobno);
		otherPhno.sendKeys(otherPhone);
		email.sendKeys(mailId);
		saveBtn.click();
	}

	/**
	 * this is the business lib to create an org for TC 03
	 * @param organisationName
	 * @param web
	 * @param emp
	 * @param mobno
	 * @param otherPhone
	 * @param mailId
	 * @param city
	 */

	public void createOrganisation(String organisationName, String web, String emp, String mobno, String otherPhone,
			String mailId, String city) {
		orgName.sendKeys(organisationName);
		website.sendKeys(web);
		employees.sendKeys(emp);
		phNo.sendKeys(mobno);
		otherPhno.sendKeys(otherPhone);
		email.sendKeys(mailId);
		billingCity.sendKeys(city);
		saveBtn.click();
	}

	/**
	 * this is the business lib to create an org for TC 04
	 * @param organisationName
	 * @param web
	 * @param emp
	 * @param mobno
	 * @param otherPhone
	 * @param mailId
	 * @param city
	 * @param state
	 */

	public void createOrganisation(String organisationName, String web, String emp, String mobno, String otherPhone,
			String mailId, String city, String state) {
		orgName.sendKeys(organisationName);
		website.sendKeys(web);
		employees.sendKeys(emp);
		phNo.sendKeys(mobno);
		otherPhno.sendKeys(otherPhone);
		email.sendKeys(mailId);
		billingCity.sendKeys(city);
		billingState.sendKeys(state);
		saveBtn.click();
	}

}
