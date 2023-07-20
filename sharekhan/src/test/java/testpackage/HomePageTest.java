package testpackage;



import org.testng.annotations.Test;

import baseclasspackage.BaseClass;
import pompackage.HomePage;

public class HomePageTest extends BaseClass {
	HomePage home;
	
  @Test
  public void checkingaddress()  {
	  
	  home.clickOnUs();
	  
  }
}
