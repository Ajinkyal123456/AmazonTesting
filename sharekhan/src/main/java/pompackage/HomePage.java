package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class HomePage  {

	@FindBy(xpath="//*[@name='username']")private WebElement username;
	@FindBy(xpath="//*[@name='password']")private WebElement password;
	@FindBy(xpath="//*[text()=' Login ']")private WebElement loginbtn;
	
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void senddatatoUsername()  {
		username.sendKeys("Admin");	
	}
	public void enterpass() {
		password.sendKeys("admin123");
	}
	public void loginbutton() {
		loginbtn.click();
	}
	
}
