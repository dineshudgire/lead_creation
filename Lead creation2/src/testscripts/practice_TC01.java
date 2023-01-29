package testscripts;

import java.awt.AWTException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.Baseclass;
import generic.Utilitymethods;
import pom.Pomclass;

public class practice_TC01 extends Baseclass
{
	@Test
	public void script1() throws InterruptedException, AWTException, UnsupportedFlavorException, IOException
	{
		Pomclass pmc=new Pomclass(driver);
		
		
		
		
		
		
		
		/*
		
		pmc.SignIn();
		Thread.sleep(4000);
		
		Set<String> pcid = driver.getWindowHandles();
		
		ArrayList<String> arlis=new ArrayList<String>(pcid);
		String cid = arlis.get(1);
		driver.switchTo().window(cid);
		
		pmc.EmailID();
		Thread.sleep(2000);
		pmc.Next1();
		Thread.sleep(8000); //here sleep is mandatory otherwise password in the next line wont be entered
		pmc.Password();
		pmc.Next2();
				
		driver.switchTo().window(arlis.get(0));	
		
		pmc.SignIn(); 
		
		Thread.sleep(4000);
		//sign in over    
		
		//Thread.sleep(80000);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Ref Code']")).sendKeys("D57F60"); //  5A5396
		//driver.findElement(By.xpath("//input[@class='button' and @type='submit' and @value='Search']")).click();
		pmc.Search4();
		
		//pmc.DealerAllocated();
		//pmc.Negotiation();
		
		//pmc.Negotiation_Approval();
		
		//pmc.QCCheck();
		//pmc.QCDrop1();
		
		//pmc.Finance();
		
        //pmc.PB_SignIn();
		
		
		
		Utilitymethods.keyboard().keyPress(KeyEvent.VK_CONTROL);
		Utilitymethods.keyboard().keyPress(KeyEvent.VK_T);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_T);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_CONTROL);
		
		Set<String> pcid1 = driver.getWindowHandles();
		ArrayList<String> arlis1=new ArrayList<String>(pcid1);
		String cid1 = arlis1.get(1);
		driver.switchTo().window(cid1);
		
		driver.get("https://test1payments.gaadi.com/");
		Thread.sleep(2000);
		pmc.PB_SignIn();
		
		String cid2 = arlis1.get(0);
		driver.switchTo().window(cid2); 
		
		//pmc.AccVerify();
	
		//pmc.DealerPayment();
		
		//pmc.SellerPayment();
		
		//pmc.Stockin();
		 
		 
		 
		 */
	}

}
