package utilitypackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.io.FileHandler;

import baseclasspackage.BaseClass;

public class UtilityClass extends BaseClass{

	public static void waits(long waittime) throws InterruptedException {
		
		Thread.sleep(waittime);
	}
	
	public static void ScreenShots(WebDriver driver) throws IOException {
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Ajinkya\\OneDrive\\Desktop\\New folder\\Java\\sharekhan\\TC.png");
		FileHandler.copy(file, dest);
	}
	
}
