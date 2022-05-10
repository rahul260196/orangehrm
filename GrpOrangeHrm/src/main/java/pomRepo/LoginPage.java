package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="txtUsername") private WebElement userNameTextField;
	
	@FindBy(id="txtPassword") private WebElement passwordTextTextField;
	
	@FindBy(id="btnLogin") private WebElement loginButton;

	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextTextField() {
		return passwordTextTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void loginToApplication() {
		userNameTextField.sendKeys("Admin");
		passwordTextTextField.sendKeys("admin123");
		loginButton.click();
	}
	
	
}
