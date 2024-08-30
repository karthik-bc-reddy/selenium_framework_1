package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Karthik BC
 *
 */

public class LoginPage {

	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='user_password']")
	private WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	/**
	 * this is the business Library to do the login operation
	 * @param uname
	 * @param pass
	 */

	public void loginOpertaion(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
	}

}
