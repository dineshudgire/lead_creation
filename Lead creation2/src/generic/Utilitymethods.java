package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utilitymethods {
	
	public static void scroll(WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,5000)");
	}
	
	public static void horizontalscroll(WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(5000,0)");
	}
	
	public static void scrolltopertiele(WebDriver driver, int x, int y)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public static void dropdown(WebElement ele, String value)
	{
		Select sel=new Select(ele);
		sel.selectByVisibleText(value);
	}
	
	//practice my temp
	public static Select dropdown1(WebElement ele)
	{
		Select sel=new Select(ele);
		return sel;
	}

	
	public static Robot keyboard() throws AWTException
	{
		Robot rbt=new Robot();
		return rbt;
	}
	
	public static Actions actionsperform(WebDriver driver)
	{
		Actions act=new Actions(driver);
		return act;
	}
	
	public static ArrayList<String> controlswitch(WebDriver driver)
	{
		Set<String> pcid = driver.getWindowHandles();
		ArrayList<String> arlis=new ArrayList<String>(pcid);
		return arlis;
		//String cid = arlis.get(1);
		//driver.switchTo().window(cid);
	}


}
