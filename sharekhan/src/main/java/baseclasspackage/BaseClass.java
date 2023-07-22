package baseclasspackage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
 static protected WebDriver driver;
  
  
  public void LaunchingBrowser(){
	
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("incognito");
		
		opt.addArguments("start-maximized");
		
		 driver=new ChromeDriver(opt);
		 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
		
}

