package testpackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import baseclasspackage.BaseClass;
import pompackage.HomePage;

public class HomePageTest extends BaseClass {
	HomePage home;
	
	
	@BeforeClass
	public void launchb() throws InterruptedException {
		LaunchingBrowser();
		home=new HomePage(driver);
		Thread.sleep(2000);
	}
	
  @Test
  public void Us()  {
	  
	  
	  home.senddatatoUsername();
	  
  }
  
  @Test
  public void Pass() {
	  home.enterpass();
  }
  @Test  
  public void login() {
	  home.loginbutton();
  }
  
}
