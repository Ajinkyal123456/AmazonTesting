package baseclasspackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pompackage.HomePage;

public class BaseClass {
 public static WebDriver driver;
 protected HomePage home;

@BeforeClass
	public void LaunchingBrowser(){
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("incognito");
		
		opt.addArguments("start-maximized");
		
		
		
		 driver=new ChromeDriver(opt);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@BeforeClass
public void object() {
	HomePage home=new HomePage(driver);
	
}

		
    

//@AfterClass
	//public void TearDown() {
	//	driver.close();
	//}
}
