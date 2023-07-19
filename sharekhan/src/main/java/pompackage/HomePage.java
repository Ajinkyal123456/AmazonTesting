package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//*[@id='nav-logo-sprites']")private WebElement logo;
	@FindBy(xpath="//*[@id='glow-ingress-line2']")private WebElement address;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void AddressSelection() {
		address.click();
	}
}
