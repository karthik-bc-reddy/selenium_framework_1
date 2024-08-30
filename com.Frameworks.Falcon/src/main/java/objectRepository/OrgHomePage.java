package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this is the pom class for org page
 * 
 * @author Karthik BC
 *
 */

public class OrgHomePage {

	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement newOrgButton;

	public OrgHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getnewOrgButton() {
		return newOrgButton;
	}

	/**
	 * this is the business library to click on new btn
	 */

	public void clickonNewOrgBtn() {
		newOrgButton.click();
	}

}
