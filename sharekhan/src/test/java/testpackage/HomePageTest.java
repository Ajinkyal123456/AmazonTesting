package testpackage;



import org.testng.annotations.Test;

import baseclasspackage.BaseClass;
import pompackage.HomePage;

public class HomePageTest extends BaseClass {
	HomePage home;
	
  @Test
  public void Us()  {
	  
	  home.clickOnUs();
	  
  }
  @Test
  public void Pas() {
	  home.enterpass();
  }
  @Test
  public void login() {
	  home.loginbutton();
  }
}
