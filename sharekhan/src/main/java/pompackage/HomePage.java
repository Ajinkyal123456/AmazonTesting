package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import baseclasspackage.BaseClass;




public class HomePage  extends BaseClass {

	@FindBy(xpath="//*[@name='username']")private WebElement username;
	@FindBy(xpath="//*[@name='password']")private WebElement password;
	@FindBy(xpath="//*[text()=' Login ']")private WebElement loginbtn;
	
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnUs()  {
		username.sendKeys("Admin");	
	}
	public void enterpass() {
		password.sendKeys("admin123");
	}
	public void loginbutton() {
		loginbtn.click();
	}
	
}
