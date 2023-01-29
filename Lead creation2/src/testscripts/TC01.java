package testscripts;

import java.awt.AWTException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.SwingUtilities;

import org.testng.annotations.Test;

import generic.Baseclass;
import generic.Utilitymethods;
import pom.Pomclass;

public class TC01 extends Baseclass
{
	@Test
	public void script1() throws InterruptedException, AWTException, UnsupportedFlavorException, IOException
	{
		Pomclass pmc=new Pomclass(driver);
		pmc.SignIn();
		
		Set<String> pcid = driver.getWindowHandles();
		ArrayList<String> arlis=new ArrayList<String>(pcid);
		String cid = arlis.get(1);
		driver.switchTo().window(cid);
		
		pmc.EmailID();
		pmc.Next1();
		pmc.Password();
		pmc.Next2();
				
		driver.switchTo().window(arlis.get(0));	
		
		pmc.SignIn();
		
		//sign in over
		
		pmc.CreateAppointment();
		pmc.BU();       //selecting bu manually will avoid creating ncd lead issue
		pmc.RegNoAndPhNo();
		Utilitymethods.dropdown(pmc.YearDD(), "2020");
		pmc.KM();
		Utilitymethods.dropdown(pmc.Manufacturer(), "Volkswagen");
		Utilitymethods.dropdown(pmc.Model(), "Polo");
		Utilitymethods.dropdown(pmc.Variant(), "GT 1.5 TDI");
		pmc.Search3();
		
		Utilitymethods.scroll(driver);
		Utilitymethods.scroll(driver);
		
		Utilitymethods.dropdown(pmc.HearFrom(), "Radio");
		pmc.NearestCenter();
		pmc.Date();
		Utilitymethods.dropdown(pmc.TimeSlot(), "10:00 AM-11:00 AM");
		Utilitymethods.dropdown(pmc.City(), "New Delhi");
		//Thread.sleep(20000);
		pmc.Save1();
		pmc.Search4(); 
		
		//create appointment over
		
		pmc.Onboarding();
		Utilitymethods.dropdown(pmc.HearFrom1(), "Radio");
		Utilitymethods.dropdown(pmc.WTS(), "Finance need");
		pmc.No1();
		Utilitymethods.dropdown(pmc.Owner(), "One");
		pmc.Submit1();
		
		//onboarding over
		
		pmc.CBox1();
		Utilitymethods.dropdown(pmc.TimeSlot2(), "06:00 PM-07:00 PM");
		pmc.Inspector();
		
		//sent request to inspection app
		
		
		
		/*
		
		
		
		//pmc.CMD();
		
		Thread.sleep(500000);
		Thread.sleep(60000);
		//bidding over
		
		pmc.VahanCheck();
		pmc.DA();
		
		//deduction addition over
		
		pmc.VehicleDocs();
		Utilitymethods.dropdown1(pmc.Doc1()).selectByValue("Auto Insurance");
		pmc.Upload1();
		Utilitymethods.dropdown1(pmc.Doc1()).selectByValue("Insurance Transfer");
		pmc.Upload1();
		
		pmc.DealerAllocated();
		pmc.Negotiation();
		pmc.Negotiation_Approval();
		pmc.QCCheck();
		pmc.QCDrop1();
		pmc.Finance();
		
        pmc.PB_SignIn();
		
		//PB sign in over
        
        pmc.AccVerify();
        pmc.DealerPayment();
        pmc.SellerPayment();
		pmc.Stockin();
		
		
		
		*/
		
		
		
		
		//use wait.until where ever applicable
		//restassured jar files to automate api is pending
		//two issues not fixed 1) ncd lead getting created if we select c2d 2)not able to click reconciliation tab tick icon
		
		//test temp
		
		
		
	}	


}
