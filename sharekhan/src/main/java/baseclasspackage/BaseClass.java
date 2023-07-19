package baseclasspackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
WebDriver driver;


@BeforeClass
	public void LaunchingBrowser() {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("incognito");
		
		opt.addArguments("start-maximized");
		
		 driver=new ChromeDriver(opt);
		
		driver.get("https://www.amazon.in/");
	}
@AfterClass
	public void TearDown() {
		driver.close();
	}
}
