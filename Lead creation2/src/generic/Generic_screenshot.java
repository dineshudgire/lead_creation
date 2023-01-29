package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_screenshot {
	
	public static void getPhoto(WebDriver driver) throws IOException
	{
		Date d=new Date();
		String d1 = d.toString().replaceAll(":", "-");
		TakesScreenshot tss=(TakesScreenshot) driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dst=new File("./photos/"+d1+".png");
		FileHandler.copy(src, dst);
		
	}


}
