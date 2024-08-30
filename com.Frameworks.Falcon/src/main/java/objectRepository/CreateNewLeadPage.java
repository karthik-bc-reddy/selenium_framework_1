package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this is the pom class for create lead page
 * 
 * @author Karthik BC
 *
 */

public class CreateNewLeadPage {

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@name='company']")
	private WebElement company;

	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mobile;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@name='code']")
	private WebElement postelCode;

	@FindBy(xpath = "//input[@name='country']")
	private WebElement country;

	@FindBy(xpath = "//input[@name='state']")
	private WebElement state;

	@FindBy(xpath = "//input[@name='annualrevenue']")
	private WebElement annualRevenue;

	@FindBy(xpath = "//input[@name='designation']")
	private WebElement title;

	@FindBy(xpath = "(//input[@name='button'])[3]")
	private WebElement saveBtn;

	public CreateNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPostelCode() {
		return postelCode;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getAnnualRevenue() {
		return annualRevenue;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	/**
	 * this is the business lib to create an org for TC 01
	 * @param fName
	 * @param lName
	 * @param office
	 */

	public void createLead(String fName, String lName, String office) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		company.sendKeys(office);
		saveBtn.click();
	}

	/**
	 * this is the business lib to create an org for TC 02
	 * @param fName
	 * @param lName
	 * @param office
	 * @param phone
	 * @param mailId
	 * @param pcode
	 * @param coun
	 * @param stat
	 */

	public void createLead(String fName, String lName, String office, String phone, String mailId, String pcode,
			String coun, String stat) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		company.sendKeys(office);
		mobile.sendKeys(phone);
		email.sendKeys(mailId);
		postelCode.sendKeys(pcode);
		country.sendKeys(coun);
		state.sendKeys(stat);
		saveBtn.click();
	}

	/**
	 * this is the business lib to create an org for TC 03
	 * @param fName
	 * @param lName
	 * @param office
	 * @param desig
	 * @param coun
	 * @param stat
	 */

	public void createLead(String fName, String lName, String office, String desig, String coun, String stat) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		company.sendKeys(office);
		title.sendKeys(desig);
		country.sendKeys(coun);
		state.sendKeys(stat);
		saveBtn.click();
	}

	/**
	 * this is the business lib to create an org for TC 04
	 * @param fName
	 * @param lName
	 * @param office
	 * @param phone
	 * @param mailId
	 * @param pcode
	 * @param coun
	 * @param stat
	 * @param annuallSal
	 * @param desig
	 */

	public void createLead(String fName, String lName, String office, String phone, String mailId, String pcode,
			String coun, String stat, String annuallSal, String desig) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		company.sendKeys(office);
		mobile.sendKeys(phone);
		email.sendKeys(mailId);
		postelCode.sendKeys(pcode);
		country.sendKeys(coun);
		state.sendKeys(stat);
		annualRevenue.sendKeys(annuallSal);
		title.sendKeys(desig);
		saveBtn.click();
	}

}
