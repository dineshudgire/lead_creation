package pom;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.Baseclass;
import generic.Utilitymethods;

public class Pomclass extends Baseclass 
{
	@FindBy(xpath="//span[.='Sign in']")
	private WebElement sib;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement nextb1;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement nextb2;
	
	//sign in over
	
	@FindBy(xpath="//input[@placeholder='Search Menu..']")
	private WebElement search;
	
	@FindBy(xpath="//a[@href='/create-appointment']")
	private WebElement createappointment;
	
	@FindBy(xpath="//select[@id='business_type']")
	private WebElement bu;
	
	//make this autoincrement
	@FindBy(xpath="//input[@placeholder='Registration no.*']")
	private WebElement regno;
	
	@FindBy(xpath="//input[@value='Search with Registration Number']")
	private WebElement search1;
	
	@FindBy(xpath="//input[@placeholder='Phone no.*']")
	private WebElement phno;
	
	@FindBy(xpath="//input[@value='Search with Phone Number']")
	private WebElement search2;
	
	@FindBy(xpath="//select[@id='year']")
	private WebElement yeardd;
	
	@FindBy(xpath="//input[@id='km']")
	private WebElement km;
	
	@FindBy(xpath="//select[@id='manufacturer']")
	private WebElement manufacturer;
	
	@FindBy(xpath="//select[@id='vmodel']")
	private WebElement model;
	
	@FindBy(xpath="//select[@id='variant']")
	private WebElement variant;
	
	@FindBy(xpath="//input[@value='Check Price']")
	private WebElement search3;
	
	@FindBy(xpath="//input[@value='Create Appointment']")
	private WebElement createappointment2;
	
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement fn;
	
	@FindBy(xpath="//select[@name='hear_from']")
	private WebElement hearfrom;
	
	@FindBy(xpath="//input[@id='nearest-center-selectized']") //
	private WebElement nearestcentre;
	
	@FindBy(xpath="//input[@id='selected_date']")
	private WebElement date;
	
	//this dynamic now
	@FindBy(xpath="//a[@class='_720kb-datepicker-calendar-day ng-binding ng-scope _720kb-datepicker-today']/following-sibling::a[1]")
	private WebElement nextday;
	
	@FindBy(xpath="//a[@class='_720kb-datepicker-calendar-day ng-binding ng-scope _720kb-datepicker-today']/following-sibling::a[4]")
	private WebElement nextdayplus3;
	
	@FindBy(xpath="//div[@class='_720kb-datepicker-calendar-header']/div[1]/following-sibling::div[1]")
	private WebElement monthfetch;
	
	@FindBy(xpath="//a[@class='_720kb-datepicker-calendar-day ng-binding ng-scope _720kb-datepicker-today']")
	private WebElement cdfetch;
	
	@FindBy(xpath="//a[@title='Next']")
	private WebElement nextmonthclick;
	
	@FindBy(xpath="(//a[@title='Next'])[3]")
	private WebElement nextmonthclickinsp;
			
	@FindBy(xpath="(//a[@class='_720kb-datepicker-calendar-day ng-binding ng-scope'])[1]")
	private WebElement nextmonthdate;
	
	@FindBy(xpath="(//a[@class='_720kb-datepicker-calendar-day ng-binding ng-scope'])[6]")
	private WebElement nextmonthdateinsp;		
	
	@FindBy(xpath="(//a[@class='_720kb-datepicker-calendar-day ng-binding ng-scope'])[9]")
	private WebElement nextmonthdatea4insp;		
			
	@FindBy(xpath="(//a[@class='_720kb-datepicker-calendar-day ng-binding ng-scope'])[4]")
	private WebElement nextmonthdate4;
	
	@FindBy(xpath="//div[.='Select Time Slot']/following-sibling::select")
	private WebElement timeslot;

	@FindBy(xpath="//select[@id='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement save1;
	
	@FindBy(xpath="//h2[@id='swal2-title']")
	private WebElement refcodefetch;
	
	@FindBy(xpath="//input[@placeholder='Ref Code']")
	private WebElement refcodetext;
	
	@FindBy(xpath="//tbody/tr/td[1]")
	private WebElement refcode;
	
	//create appointment over
	
	@FindBy(xpath="//li[.=' On Boarding ']")
	private WebElement onboarding;
	
	@FindBy(xpath="(//div[@class='my-radiobox'])[1]/label[1]")
	private WebElement yes1;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement name;
	
    @FindBy(xpath="//input[@placeholder='Search location']")
	private WebElement location;
	
	@FindBy(xpath="//input[@id='address_line_1']")
	private WebElement addr1;
	
	@FindBy(xpath="//select[@name='hear_from']")
	private WebElement hearfrom1;
	
	@FindBy(xpath="//select[@name='why_to_sell']")
	private WebElement wts;
	
	@FindBy(xpath="(//div[@class='my-radiobox'])[2]/label[2]")
	private WebElement no1;
	
	@FindBy(xpath="//input[@id='CEP']")
	private WebElement cep;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email1;
	
	@FindBy(xpath="//select[@name='owner']")
	private WebElement owner;
	
	@FindBy(xpath="//input[@value='Save with Normal Inspection']")
	private WebElement submit1;
	
	//onboarding over
	
	@FindBy(xpath="//label[@for='select_inspection_date']")
	private WebElement cbox1;
	
	@FindBy(xpath="//input[@id='inspection_date']")
	private WebElement date2;
	
	@FindBy(xpath="(//a[.='26'])[3]")
	private WebElement date3;
	
	@FindBy(xpath="//select[@id='inspection_slot']")
	private WebElement timeslot2;
	
	@FindBy(xpath="//span[@id='select2-inspector-container']")
	private WebElement inspector;
	
	@FindBy(xpath="(//input[@type='search'])[4]")
	private WebElement inspector1;
	
	@FindBy(xpath="//input[@data-event-name='inspection_save_btn']")
	private WebElement submit2;
	
    //sent request to inspection app
	
	@FindBy(xpath="//div[.='Customer expected price']/following-sibling::input")
	private WebElement cmd;
	
	//bidding over
	
	@FindBy(xpath="//ul/li[10]")
	private WebElement vahancheck;
	
	@FindBy(xpath="//input[@value='Request Vahan Check']")
	private WebElement reqvc;
	
	@FindBy(xpath="//input[@value='Assign to Self']")
	private WebElement assigntoself;
	
	@FindBy(xpath="//label[.=' Individual']")
	private WebElement individual;
	
	@FindBy(xpath="//input[@value='Vahan Check Succesfully Completed']")
	private WebElement submit3;
	
	@FindBy(xpath="//ul/li[11]")
	private WebElement da;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/i[1]")
	private WebElement radio1;
	
	@FindBy(xpath="//tbody/tr[2]/td[5]/i[1]")
	private WebElement radio2;
	
	@FindBy(xpath="//tbody/tr[3]/td[5]/i[1]")
	private WebElement radio3;
	
	@FindBy(xpath="//tbody/tr[4]/td[5]/i[1]")
	private WebElement radio4;
	
	@FindBy(xpath="//tbody/tr[5]/td[5]/i[1]")
	private WebElement radio5;
	
	@FindBy(xpath="//tbody/tr[6]/td[5]/i[1]")
	private WebElement radio6;
	
	@FindBy(xpath="//tbody/tr[7]/td[5]/i[1]")
	private WebElement radio7;
	
	@FindBy(xpath="//tbody/tr[8]/td[5]/i[1]")
	private WebElement radio8;
	
	@FindBy(xpath="//tbody/tr[9]/td[5]/i[1]")
	private WebElement radio9;
	
	@FindBy(xpath="//tbody/tr[10]/td[5]/i[1]")
	private WebElement radio10;
	
	@FindBy(xpath="//tbody/tr[11]/td[5]/i[1]")
	private WebElement radio11;
	
	@FindBy(xpath="//tbody/tr[12]/td[5]/i[1]")
	private WebElement radio12;

	@FindBy(xpath="//tbody/tr[13]/td[5]/i[1]")
	private WebElement radio13;

	@FindBy(xpath="//tbody/tr[14]/td[5]/i[1]")
	private WebElement radio14;

	@FindBy(xpath="//tbody/tr[15]/td[5]/i[1]")
	private WebElement radio15;

	@FindBy(xpath="//tbody/tr[16]/td[5]/i[1]")
	private WebElement radio16;

	@FindBy(xpath="//tbody/tr[17]/td[5]/i[1]")
	private WebElement radio17;

	@FindBy(xpath="//tbody/tr[18]/td[5]/i[1]")
	private WebElement radio18;

	@FindBy(xpath="//tbody/tr[19]/td[5]/i[1]")
	private WebElement radio19;

	@FindBy(xpath="//tbody/tr[20]/td[5]/i[1]")
	private WebElement radio20;

	@FindBy(xpath="//tbody/tr[21]/td[5]/i[1]")
	private WebElement radio21;

	@FindBy(xpath="//input[@data-event-name='deductionaddition_submit_deduction_form']")
	private WebElement save2;
	
	//deduction addition over
 
    @FindBy(xpath="//ul/li[36]")
	private WebElement vehicledocs;
	
	@FindBy(xpath="//select[@name='doc_type']")
	private WebElement doc1;
	
	@FindBy(xpath="(//span[.='Select'])[1]")
	private WebElement upload1;
	
	@FindBy(xpath="//input[@data-event-name='vehicleDocuments_submit_vehicle_documents_form']")
	private WebElement save3;
	
	//vehicle documents upload over
	
	@FindBy(xpath="//ul/li[14]")
	private WebElement dealerallocated;
	
	@FindBy(xpath="(//span[@class='button-edit'])[2]")
	private WebElement edit1;
	
	@FindBy(xpath="//input[@data-event-name='dealerallocated_submit_update_shop_name_popup_form']")
	private WebElement submit4;
	
	//dealer allocated over
	
	@FindBy(xpath="//ul/li[9]")
	private WebElement negotiation;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]//div")
	private WebElement negoamt;
	
	@FindBy(xpath="//input[@placeholder='Enter offer amount']")
	private WebElement negoamt_textfield;
	
	@FindBy(xpath="(//label[.=' Yes'])[1]")
	private WebElement negoyes1;
	
	@FindBy(xpath="(//label[.=' Yes'])[2]")
	private WebElement negoyes2;
	
	@FindBy(xpath="(//input[@class='button' and @type='submit' and @value='Submit'])[2]")
	private WebElement negosubmit;
	
	// negotiation requested over
	
	@FindBy(xpath="//a[@href='/negotiations-list']")
	private WebElement negoapproval;
	
	@FindBy(xpath="//tbody/tr[1]/td[11]/div[1]")
	private WebElement negoapproval1;
	
	//negotiation approval over
	
	@FindBy(xpath="//ul/li[40]")
	private WebElement qccheck;
	
	@FindBy(xpath="//app-qc-check/div[1]/div[1]")
	private WebElement qc_req;
	
	@FindBy(xpath="//button[.='OK']")
	private WebElement qc_req_pop;
	
	@FindBy(xpath="//input[@value='Assign to Self']")
	private WebElement qc_self;
	
	@FindBy(xpath="(//span[@class='number'])[1]")
	private WebElement qcclick;
	
	@FindBy(xpath="//select[@id='6']")
	private WebElement qcdrop1;
	
	@FindBy(xpath="//select[@id='7']")
	private WebElement qcdrop2;
	
	@FindBy(xpath="//select[@id='8']")
	private WebElement qcdrop3;
	
	@FindBy(xpath="//select[@id='9']")
	private WebElement qcdrop4;
	
	@FindBy(xpath="//select[@id='10']")
	private WebElement qcdrop5;
	
	@FindBy(xpath="//select[@id='49']")
	private WebElement qcdrop6;
	
	@FindBy(xpath="//select[@id='12']")
	private WebElement qcdrop7;
	
	@FindBy(xpath="//select[@id='13']")
	private WebElement qcdrop8;
	
	@FindBy(xpath="//select[@id='14']")
	private WebElement qcdrop9;
	
	@FindBy(xpath="//select[@id='15']")
	private WebElement qcdrop10;
	
	@FindBy(xpath="//select[@id='16']")
	private WebElement qcdrop11;
	
	@FindBy(xpath="//select[@id='48']")
	private WebElement qcdrop12;
	
	@FindBy(xpath="//select[@id='17']")
	private WebElement qcdrop13;
	
	@FindBy(xpath="//select[@id='18']")
	private WebElement qcdrop14;
	
	@FindBy(xpath="//select[@id='19']")
	private WebElement qcdrop15;
	
	@FindBy(xpath="//select[@id='46']")
	private WebElement qcdrop16;
	
	@FindBy(xpath="//select[@id='47']")
	private WebElement qcdrop17;
	
	@FindBy(xpath="//select[@id='20']")
	private WebElement qcdrop18;
	
	@FindBy(xpath="//select[@id='21']")
	private WebElement qcdrop19;
	
	@FindBy(xpath="//select[@id='22']")
	private WebElement qcdrop20;
	
	@FindBy(xpath="//select[@id='23']")
	private WebElement qcdrop21;
	
	@FindBy(xpath="//select[@id='24']")
	private WebElement qcdrop22;
	
	@FindBy(xpath="//select[@id='25']")
	private WebElement qcdrop23;
	
	@FindBy(xpath="//select[@id='26']")
	private WebElement qcdrop24;
	
	@FindBy(xpath="//select[@id='27']")
	private WebElement qcdrop25;
	
	@FindBy(xpath="//select[@id='43']")
	private WebElement qcdrop26;
	
	@FindBy(xpath="//select[@id='28']")
	private WebElement qcdrop27;
	
	@FindBy(xpath="//select[@id='29']")
	private WebElement qcdrop28;
	
	@FindBy(xpath="//select[@id='30']")
	private WebElement qcdrop29;
	
	@FindBy(xpath="//select[@id='31']")
	private WebElement qcdrop30;
	
	@FindBy(xpath="//select[@id='32']")
	private WebElement qcdrop31;
	
	@FindBy(xpath="//select[@id='33']")
	private WebElement qcdrop32;
	
	@FindBy(xpath="//select[@id='35']")
	private WebElement qcdrop33;
	
	@FindBy(xpath="//select[@id='36']")
	private WebElement qcdrop34;
	
	@FindBy(xpath="//select[@id='37']")
	private WebElement qcdrop35;
	
	@FindBy(xpath="//select[@id='38']")
	private WebElement qcdrop36;
	
	@FindBy(xpath="//select[@id='39']")
	private WebElement qcdrop37;
	
	@FindBy(xpath="//select[@id='40']")
	private WebElement qcdrop38;
	
	@FindBy(xpath="//select[@id='41']")
	private WebElement qcdrop39;
	
	@FindBy(xpath="//select[@id='44']")
	private WebElement qcdrop40;
	
	@FindBy(xpath="//select[@id='45']")
	private WebElement qcdrop41;
	
	@FindBy(xpath="//textarea[@id='42']")
	private WebElement qcdrop42;
	
	@FindBy(xpath="//input[@value='Approve']")
	private WebElement qcapprovebtn;
	
	//qc check over
	
	@FindBy(xpath="//ul/li[12]")
	private WebElement finance;
	
	@FindBy(xpath="//select[@id='ncdPaymentProcessType']")
	private WebElement dropdown;
	
	@FindBy(xpath="//select[@name='payment_process_type']")
	private WebElement dropdown2;
	
	@FindBy(xpath="//input[@id='ncd_reaccount_no']")
	private WebElement confaccno;
	
	@FindBy(xpath="//input[@id='ncd_account_no']")
	private WebElement accno;
	
	@FindBy(xpath="//input[@name='ncd_ifsc']")
	private WebElement ifsc;
	
	@FindBy(xpath="//input[@id='ncd_owner_name']")
	private WebElement accname;
	
	@FindBy(xpath="//select[@name='first_address_proof_type']")
	private WebElement addproof;
	
	@FindBy(xpath="//input[@id='aadhaar_number']")
	private WebElement adhar;
	
	@FindBy(xpath="//input[@id='first_pan_card']")
	private WebElement pan;
	
	@FindBy(xpath="(//span[.='Select'])[1]")
	private WebElement adharfront;
	
	@FindBy(xpath="(//span[.='Select'])[2]")
	private WebElement adharback;
	
	@FindBy(xpath="(//span[.='Select'])[3]")
	private WebElement panimage;
	
	@FindBy(xpath="(//span[.='Select'])[4]")
	private WebElement bankproof;
	
	@FindBy(xpath="//input[@class='button fr']")
	private WebElement accsave;
	
	//account request sent over
	
	@FindBy(xpath="//span[.='Sign in']")
	private WebElement pb_sib;

	@FindBy(xpath="//input[@type='email']")
	private WebElement pb_email;

	@FindBy(xpath="//span[text()='Next']")
	private WebElement pb_nextb1;

	@FindBy(xpath="//input[@type='password']")
	private WebElement pb_pass;

	@FindBy(xpath="//span[text()='Next']")
	private WebElement pb_nextb2;

	//PB sign in over
	
	@FindBy(xpath="(//tbody/tr[1]/td[12]/a/i)[1]")
	private WebElement editbtn;
	
	@FindBy(xpath="//input[@placeholder='PAN Number']")
	private WebElement pannumber;
	
	@FindBy(xpath="(//button[.='Submit'])[3]")
	private WebElement pansubmit;
	
	@FindBy(xpath="//input[@placeholder='Aadhar Card Number']")
	private WebElement adharnumber;
	
	@FindBy(xpath="(//button[.='Submit'])[5]")
	private WebElement adharsubmit;
	
	@FindBy(xpath="(//img[@src='../../../assets/images/close-model.svg'])[2]")
	private WebElement cross;
	
	@FindBy(xpath="(//button[.='Enquiry'])[1]")
	private WebElement enquiry;
	
	@FindBy(xpath="//ul/li[15]")
	private WebElement dealerpayment;
	
	//@FindBy(xpath="(//ul/li[8]//div[contains(.,'Rs')])[2]")  //we can use contains also to fetch text
	@FindBy(xpath="//ul/li[8]/div/div")   //we can dynamically also fetch text
	private WebElement dealertoken;
	
	@FindBy(xpath="//select[@ng-model='adjust_payment_field.mode']")
	private WebElement dealerpm;
	
	@FindBy(xpath="//input[@id='amount']")
	private WebElement dtokenamt;
	
	@FindBy(xpath="//input[@class='button fr']")
	private WebElement dtokensave;
	
	@FindBy(xpath="//a[.='Reconciliation']")
	private WebElement reconciliation_tab;

	@FindBy(xpath="//tr[2]/td[2]")
	private WebElement recotemp;
	
	@FindBy(xpath="(//a[@href='javascript:void(0);'])[2]")   //tbody/tr[1]/td[12]/a[1]/i    (//i[@class='fa fa-check'])[1]
	private WebElement tickicon;
	
	@FindBy(xpath="//input[@placeholder='UTR Number']")
	private WebElement utrtext;
	
	@FindBy(xpath="//input[@placeholder='Amount']")
	private WebElement amttext;
	
	@FindBy(xpath="(//button[@class='bttn btn-prime'])[1]")
	private WebElement recopopsave;
	
	@FindBy(xpath="//ul/li[5]/div/div")
	private WebElement dealerbulkfetch;
	
	@FindBy(xpath="//a[@class='bttn bttn-full btn-prime']")
	private WebElement pbsearch;
	
	@FindBy(xpath="(//i[@class='fa fa-money'])[1]")
	private WebElement ledgericontemp;
	
	@FindBy(xpath="(//select[@id='purpose'])[1]")
	private WebElement sellerpurpose;
	
	@FindBy(xpath="(//select[@id='token_amounts'])[1]")
	private WebElement sellertokendd;
	
	@FindBy(xpath="//a[.='Payment']")
	private WebElement paymentstab;
	
	@FindBy(xpath="//a[.='RESET']")
	private WebElement resetbtn;
	
	@FindBy(xpath="(//div[@class='price ng-binding'])[7]")
	private WebElement sellerbulkfetch;
	
	@FindBy(xpath="//input[@id='amount']")
	private WebElement sellerbulktext;
	
	@FindBy(xpath="//button[.='OK']")
	private WebElement sellerokbtn;
	
	@FindBy(xpath="//ul/li[13]")
	private WebElement stockintab;
	
	@FindBy(xpath="//span[@id='select2-stockin-container']")
	private WebElement stockindd;
	
	@FindBy(xpath="(//input[@role='textbox'])[4]")
	private WebElement stockinddtext;
	
	@FindBy(xpath="//input[@data-tab-name='stockin']")
	private WebElement stockinsave;
	
/*	@FindBy(xpath="")
	private WebElement ;
	
	@FindBy(xpath="")
	private WebElement ;
	
	@FindBy(xpath="")
	private WebElement ;
	
	 */
	
	
	public Pomclass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public void SignIn() throws InterruptedException
	{
		sib.click();
		//Thread.sleep(3000);
	}
	
	public void EmailID() throws InterruptedException
	{
		//email.sendKeys("dinesh.udgire@girnarsoft.co.in");
		wait.until(ExpectedConditions.elementToBeClickable(email)).sendKeys("dinesh.udgire@girnarsoft.co.in");
		//Thread.sleep(2000);
		//Thread.sleep(2000);
	}
	
	public void Next1() throws InterruptedException
	{
		//nextb1.click();
		wait.until(ExpectedConditions.elementToBeClickable(nextb1)).click();
		//Thread.sleep(8000); //here sleep is mandatory otherwise password in the next line wont be entered
	}
	
	public void Password()
	{
		//pass.sendKeys(prop.getProperty("password"));
		wait.until(ExpectedConditions.elementToBeClickable(pass)).sendKeys(prop.getProperty("password"));
	}
	
	public void Next2()
	{
		nextb2.click();
	}
	
	//sign in over

    public void CreateAppointment() throws InterruptedException
    {
    	Thread.sleep(10000);
    	//search.sendKeys("create appointment");
    	wait.until(ExpectedConditions.elementToBeClickable(search)).sendKeys("create appointment");
        //Thread.sleep(7000);
    	//createappointment.click();
        wait.until(ExpectedConditions.elementToBeClickable(createappointment)).click();
    	//Thread.sleep(2000);
    	Thread.sleep(10000);
    }
    
    public void BU() throws AWTException, InterruptedException
    {
    	//Utilitymethods.dropdown1(bu).selectByValue("c2d");
    	bu.click();
    	Utilitymethods.keyboard().keyPress(KeyEvent.VK_DOWN);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_DOWN);
		Utilitymethods.keyboard().keyPress(KeyEvent.VK_ENTER);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
    }
    
    public void RegNoAndPhNo() throws InterruptedException
    {
    	//make this autoincrement
    	Random r = new Random();
		List<Integer> codes = new ArrayList<>();
		for (int i = 0; i < 10; i++)
		{
		    int x = r.nextInt(9999);
		    while (codes.contains(x))
		        x = r.nextInt(9999);
		    codes.add(x);
		}
		String str = String.format("%04d", codes.get(0));
		System.out.println(str);
		System.out.println(str);
    	
		String regno1="mp12qe"+str;
		System.out.println(regno1);
    	regno.sendKeys(regno1);
    	search1.click();
    	//Thread.sleep(3000);
    	//phno.sendKeys("7848060233");
    	wait.until(ExpectedConditions.elementToBeClickable(phno)).sendKeys("7848060233");
    	search2.click();
    	Thread.sleep(3000);
    }
    
    public WebElement YearDD()
    {
    	return yeardd;
    }
    
    public void KM()
    {
    	km.sendKeys("1000");
    }
    
    public WebElement Manufacturer()
    {
    	return manufacturer;
    }
    
    public WebElement Model()
    {
    	return model;
    }
    
    public WebElement Variant()
    {
    	return variant;
    }
    
    public void Search3() throws InterruptedException
    {
    	search3.click();
    	//Thread.sleep(5000);
    	//createappointment2.click();
    	wait.until(ExpectedConditions.elementToBeClickable(createappointment2)).click();
    	fn.sendKeys("Dinesh");
    	//Thread.sleep(2000);
    }
    
    public WebElement HearFrom()
    {
    	return hearfrom;
    }
    
    public void NearestCenter() throws InterruptedException
    {
    	nearestcentre.sendKeys("golf");
    	nearestcentre.sendKeys(Keys.ENTER);
    }
    
    //make this dynamic
    public void Date() throws InterruptedException
    {
    	date.click();
        
    	String monthraw = monthfetch.getText();
    	System.out.println(monthraw);
    	String monthname = monthraw.replace(" 2023", "");
    	System.out.println(monthname);
    	
    	String cdraw = cdfetch.getText();
    	int  cd= Integer.parseInt(cdraw);
    	
    	String nxtday = nextday.getText();
    	int x = Integer.parseInt(nxtday);
    	
    	String s1="Saturday";
		 String s2="Sunday";
		 String s3="March";
		 String s4="June";
		 String s5="September";
		 
		 Calendar cal = Calendar.getInstance(); 
		 SimpleDateFormat sdf = new SimpleDateFormat("dd");
		 String date = sdf.format(cal.getTime());
		 int currentdate = Integer.parseInt(date);
		 System.out.println(date);
		
		 Format f1 = new SimpleDateFormat("EEEE");
		 String str = f1.format(new Date());
		 System.out.println(str);
    	
    	if(cd==28||cd==29||cd==30||cd==31)
    	{
    		if(monthname.equals(s3)||monthname.equals(s4)||monthname.equals(s5))
        	{
    			nextmonthclick.click();
    			//Thread.sleep(3000);
    			//nextmonthdate4.click();
    			wait.until(ExpectedConditions.elementToBeClickable(nextmonthdate4)).click();
        	}
    		else 
    		{
    			nextmonthclick.click(); 
    			//Thread.sleep(3000);
        		//nextmonthdate.click();
        		wait.until(ExpectedConditions.elementToBeClickable(nextmonthdate)).click();
    		}
    	}
    	else
    	{
    		 if(x==currentdate)
    		 {
    			 if (str.equals(s1))
    			 {
    				 nextdayplus3.click();
    			 }
    			 else if(str.equals(s2))
    			 {
    				 nextdayplus3.click();
    			 }
    			 else{
    				 nextday.click();
    			 }
    		 }
    	}

    	Thread.sleep(2000);
    }
    
    public WebElement TimeSlot()
    {
    	return timeslot;
    }
    
    public WebElement City()
    {
    	return city;
    }
    
    public void Save1() throws InterruptedException
    {
    	save1.click();
    	Thread.sleep(5000);
    }
    
    public void Search4() throws InterruptedException, AWTException
    {
    	Thread.sleep(2000);
		/*Utilitymethods.keyboard().keyPress(KeyEvent.VK_CONTROL);
		Utilitymethods.keyboard().keyPress(KeyEvent.VK_SHIFT);
		Utilitymethods.keyboard().keyPress(KeyEvent.VK_E);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_CONTROL);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_SHIFT);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_E); */
		
    	String refcoderaw = refcodefetch.getText();
    	System.out.println("ref code = "+refcoderaw);
    	Utilitymethods.keyboard().keyPress(KeyEvent.VK_ENTER);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_ENTER);
		//Thread.sleep(2000);
    	//refcodetext.sendKeys(refcoderaw);
    	wait.until(ExpectedConditions.elementToBeClickable(refcodetext)).sendKeys(refcoderaw);
    	Utilitymethods.keyboard().keyPress(KeyEvent.VK_ENTER);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_ENTER);
    	//Thread.sleep(4000);
    	//refcode.click();
    	wait.until(ExpectedConditions.elementToBeClickable(refcode)).click();
    	//Thread.sleep(5000);
    	Thread.sleep(10000);
    }
    
    //create appointment over
    
    public void Onboarding() throws InterruptedException
    {
    	//onboarding.click();
    	wait.until(ExpectedConditions.elementToBeClickable(onboarding)).click();
    	//Thread.sleep(3000);
    	//yes1.click();
    	wait.until(ExpectedConditions.elementToBeClickable(yes1)).click();
    	name.sendKeys("Dinesh");
    	location.sendKeys("delhi");
    	Thread.sleep(2000);
    	location.sendKeys(Keys.ENTER);
    	//Thread.sleep(2000);
    	//addr1.sendKeys("smv");
    	wait.until(ExpectedConditions.elementToBeClickable(addr1)).sendKeys("smv");
    }
    
    public WebElement HearFrom1()
    {
    	return hearfrom;
    }
    
    public WebElement WTS()
    {
    	return wts;
    }
    
    public void No1()
    {
    	no1.click();
    	cep.sendKeys("200000");
    	email1.sendKeys("sample@gmail.com");
    }
    
    public WebElement Owner()
    {
    	return owner;
    }
    
    public void Submit1() throws InterruptedException
    {
    	submit1.click();
    	Thread.sleep(7000);
    }
    
    //onboarding over
    
    public void CBox1() throws InterruptedException
    {
    	//cbox1.click();
    	wait.until(ExpectedConditions.elementToBeClickable(cbox1)).click();
    	Thread.sleep(3000);
    	Utilitymethods.scroll(driver);
		Utilitymethods.scroll(driver);
    	
		
		//make this dynamic
    	date2.click();
    	Thread.sleep(2000);
    	String monthraw = monthfetch.getText();
    	System.out.println(monthraw);
    	String monthname = monthraw.replace(" 2023", "");
    	System.out.println(monthname);
    	
    	String cdraw = cdfetch.getText();
    	int  cd= Integer.parseInt(cdraw);
    	
    	String nxtday = nextday.getText();
    	int x = Integer.parseInt(nxtday);
    	
    	String s1="Saturday";
		 String s2="Sunday";
		 String s3="March";
		 String s4="June";
		 String s5="September";
		 
		 Calendar cal = Calendar.getInstance(); 
		 SimpleDateFormat sdf = new SimpleDateFormat("dd");
		 String date = sdf.format(cal.getTime());
		 int currentdate = Integer.parseInt(date);
		 System.out.println(date);
		
		 Format f1 = new SimpleDateFormat("EEEE");
		 String str = f1.format(new Date());
		 System.out.println(str);
    	
    	if(cd==28||cd==29||cd==30||cd==31)
    	{
    		if(monthname.equals(s3)||monthname.equals(s4)||monthname.equals(s5))
        	{
    			nextmonthclickinsp.click();
    			//Thread.sleep(3000);
    			//nextmonthdatea4insp.click();
    			wait.until(ExpectedConditions.elementToBeClickable(nextmonthdatea4insp)).click();
        	}
    		else 
    		{
    			nextmonthclickinsp.click(); 
    			//Thread.sleep(3000);
        		//nextmonthdateinsp.click();
        		wait.until(ExpectedConditions.elementToBeClickable(nextmonthdateinsp)).click();
    		}
    	}
    	else
    	{
    		 if(x==currentdate)
    		 {
    			 if (str.equals(s1))
    			 {
    				 nextdayplus3.click();
    			 }
    			 else if(str.equals(s2))
    			 {
    				 nextdayplus3.click();
    			 }
    			 else{
    				 nextday.click();
    			 }
    		 }
    	}

    	Thread.sleep(2000);
    	//date3.click();
    	Thread.sleep(3000);
    }
    
    public WebElement TimeSlot2()
    {
    	return timeslot2;
    }
    
    public void Inspector() throws InterruptedException
    {
    	//Thread.sleep(2000);
    	//inspector.click();
    	wait.until(ExpectedConditions.elementToBeClickable(inspector)).click();
    	inspector1.sendKeys("vikas");
    	inspector1.sendKeys(Keys.ENTER);
    	Thread.sleep(4000);
    	Utilitymethods.scroll(driver);
    	Utilitymethods.scroll(driver);
    	
    	
    	/*cmd.sendKeys("newman run C:\Users\User\Desktop\C2D Publish Vehichle sel.postman_collection.json");
    	Thread.sleep(2000);
		Utilitymethods.keyboard().keyPress(KeyEvent.VK_CONTROL);
		Utilitymethods.keyboard().keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_A);
		Utilitymethods.keyboard().keyPress(KeyEvent.VK_X);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_X);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000); */
		
    	
    	submit2.click();
    	Thread.sleep(4000);
    	
    	//sent request to inspection app
    }
    
    public void CMD() throws AWTException, InterruptedException
    {

		Utilitymethods.keyboard().keyPress(KeyEvent.VK_WINDOWS);
		Utilitymethods.keyboard().keyPress(KeyEvent.VK_R);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_WINDOWS);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_R);
		Thread.sleep(2000);
		Utilitymethods.keyboard().keyPress(KeyEvent.VK_DOWN);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_DOWN);
		Utilitymethods.keyboard().keyPress(KeyEvent.VK_ENTER);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_ENTER);
    }
    
    //bidding over [db]
    
    public void VahanCheck() throws InterruptedException
    {
    	Thread.sleep(200000);
    	vahancheck.click();
    	Thread.sleep(8000);
    	reqvc.click();
    	Thread.sleep(4000);
    	assigntoself.click();
    	Thread.sleep(4000);
    	individual.click();
    	submit3.click();
    	Thread.sleep(6000);
    }
    
    public void DA() throws InterruptedException
    {
    	da.click();
    	Thread.sleep(4000);
    	radio1.click();
    	radio2.click();
    	radio3.click();
    	radio4.click();
    	radio5.click();
    	Thread.sleep(2000);
    	radio6.click();
    	radio7.click();
    	radio8.click();
    	radio9.click();
    	radio10.click();
    	Thread.sleep(2000);
    	radio11.click();
    	radio12.click();
    	radio13.click();
    	radio14.click();
    	radio15.click();
    	Thread.sleep(2000);
    	radio16.click();
    	radio17.click();
    	radio18.click();
    	radio19.click();
    	Thread.sleep(2000);
    	//radio20.click();
    	//radio21.click();
    	save2.click();
    	Thread.sleep(5000);
    }
    
    //deduction addition over
    
    public void VehicleDocs() throws InterruptedException
    {
    	vehicledocs.click();
    	Thread.sleep(5000);
    }
    
    public WebElement Doc1()
    {
    	return doc1;
    }
    
    public void Upload1() throws InterruptedException, IOException
    {
    	upload1.click();
    	Thread.sleep(2000);
    	Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\fileupload.exe");
    	Thread.sleep(10000);
    	save3.click();
    	Thread.sleep(10000);
    }
    
    //doc2 declaration and utilization not done, directly used the above doc1 methods 
    
    //vehicle documents upload over
    
    public void DealerAllocated() throws InterruptedException
    {
    	dealerallocated.click();
    	Thread.sleep(4000);
    	edit1.click();
    	Thread.sleep(2000);
    	submit4.click();
    	Thread.sleep(5000);
    }
    
    //dealer allocated over
    
    public void Negotiation() throws InterruptedException
    {
    	negotiation.click();
    	Thread.sleep(3000);
    	String negoamount = negoamt.getText();
    	Thread.sleep(2000);
    	String negoamount1 = negoamount.replace("₹", "");
    	String negoamount2 = negoamount1.replace(",", "");
    	//int negoamount_final = Integer.parseInt(negoamount2); ---> this is not required, as negoamount2 and negoamount_final both output are same and for negoamount_final we will get error while using in sendKeys
    	System.out.println(negoamount2);
    	negoamt_textfield.sendKeys(negoamount2);
    	
    	negoyes1.click();
    	negoyes2.click();
    	negosubmit.click();
    	Thread.sleep(5000);
    }
    
    // negotiation requested over
    
    public void Negotiation_Approval() throws InterruptedException
    {
    	search.sendKeys("negotiation approval");
    	Thread.sleep(7000);
    	negoapproval.click();
    	Thread.sleep(2000);
    	negoapproval1.click();
    	Thread.sleep(1000);
    	Alert pop = driver.switchTo().alert();
    	pop.accept();
    	Thread.sleep(4000);
    	driver.navigate().back();
    	Thread.sleep(3000);
    }
    
  //negotiation approval over
    
    public void QCCheck() throws InterruptedException
    {
    	qccheck.click();
    	Thread.sleep(10000);

    	Set<String> pcid = driver.getWindowHandles();
		ArrayList<String> arlis=new ArrayList<String>(pcid);
		String cid = arlis.get(1);
		driver.switchTo().window(cid);
    	
    	qc_req.click();
    	Thread.sleep(1000);
    	qc_req_pop.click();
    	Thread.sleep(2000);
    	qc_self.click();
    	Thread.sleep(1000);
    	qc_req_pop.click();
    	Thread.sleep(2000);
    	qcclick.click();
    }
    
    public void QCDrop1() throws AWTException, InterruptedException
    {
    	Utilitymethods.dropdown(qcdrop1, "Submitted");
    	Utilitymethods.dropdown(qcdrop2, "Submitted");
    	Utilitymethods.dropdown(qcdrop3, "NA");
    	Utilitymethods.dropdown(qcdrop4, "NA");
    	Utilitymethods.dropdown(qcdrop5, "Completed");
    	Utilitymethods.dropdown(qcdrop6, "NA");
    	Utilitymethods.dropdown(qcdrop7, "NA");
    	Utilitymethods.dropdown(qcdrop8, "NA");
    	Utilitymethods.dropdown(qcdrop9, "NA");
    	Utilitymethods.dropdown(qcdrop10, "NA");
    	Utilitymethods.dropdown(qcdrop11, "NA");
    	Utilitymethods.dropdown(qcdrop12, "NA");
    	Utilitymethods.dropdown(qcdrop13, "NA");
    	Utilitymethods.dropdown(qcdrop14, "NA");
    	Utilitymethods.dropdown(qcdrop15, "NA");
    	Utilitymethods.dropdown(qcdrop16, "NA");
    	Utilitymethods.dropdown(qcdrop17, "NA");
    	Utilitymethods.dropdown(qcdrop18, "NA");
    	Utilitymethods.dropdown(qcdrop19, "NA");
    	Utilitymethods.dropdown(qcdrop20, "NA");
    	Utilitymethods.dropdown(qcdrop21, "NA");
    	Utilitymethods.dropdown(qcdrop22, "NA");
    	Utilitymethods.dropdown(qcdrop23, "NA");
    	Utilitymethods.dropdown(qcdrop24, "NA");
    	Utilitymethods.dropdown(qcdrop25, "NA");
    	Utilitymethods.dropdown(qcdrop26, "NA");
    	Utilitymethods.dropdown(qcdrop27, "NA");
    	Utilitymethods.dropdown(qcdrop28, "NA");
    	Utilitymethods.dropdown(qcdrop29, "NA");
    	Utilitymethods.dropdown(qcdrop30, "NA");
    	Utilitymethods.dropdown(qcdrop31, "NA");
    	Utilitymethods.dropdown(qcdrop32, "NA");
    	Utilitymethods.dropdown(qcdrop33, "NA");
    	Utilitymethods.dropdown(qcdrop34, "NA");
    	Utilitymethods.dropdown(qcdrop35, "NA");
    	Utilitymethods.dropdown(qcdrop36, "NA");
    	Utilitymethods.dropdown(qcdrop37, "NA");
    	Utilitymethods.dropdown(qcdrop38, "NA");
    	Utilitymethods.dropdown(qcdrop39, "NA");
    	Utilitymethods.dropdown(qcdrop40, "NA");
    	Utilitymethods.dropdown(qcdrop41, "NA");
    	
    	qcdrop42.sendKeys("testing");
    	qcapprovebtn.click();
    	Thread.sleep(5000);
    	Utilitymethods.keyboard().keyPress(KeyEvent.VK_CONTROL);
		Utilitymethods.keyboard().keyPress(KeyEvent.VK_W);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_W);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_CONTROL);
		
		Set<String> pcid = driver.getWindowHandles();
		ArrayList<String> arlis=new ArrayList<String>(pcid);
		String cid = arlis.get(0);
		driver.switchTo().window(cid);
		Thread.sleep(2000);
    }
    
    //qc check over
    
    public void Finance() throws InterruptedException, IOException, AWTException
    {
    	finance.click();
    	Thread.sleep(4000);
    	Utilitymethods.dropdown(dropdown, "C2D");
    	Thread.sleep(2000);
    	Utilitymethods.dropdown(dropdown2, "1st Party");
    	confaccno.sendKeys("08090100018537");
    	accno.sendKeys("08090100018537");
    	ifsc.sendKeys("BARB0RAJAJI");
    	accname.sendKeys("dineshudgire");
    	Utilitymethods.dropdown(addproof, "Aadhaar card");
    	Thread.sleep(3000);
    	adhar.sendKeys("397788000234");
    	pan.sendKeys("AFAPU3990A");
    	adharfront.click();
    	Thread.sleep(2000);
    	Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\fileupload.exe");
    	Thread.sleep(18000);
    	adharback.click();
    	Thread.sleep(2000);
    	Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\fileupload.exe");
    	Thread.sleep(18000);
    	panimage.click();
    	Thread.sleep(2000);
    	Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\fileupload.exe");
    	Thread.sleep(18000);
    	bankproof.click();
    	Thread.sleep(2000);
    	Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\fileupload.exe");
    	Thread.sleep(18000);
    	accsave.click();
    	Thread.sleep(5000);
    	
    	//account request sent over
    	
    	Utilitymethods.keyboard().keyPress(KeyEvent.VK_CONTROL);
		Utilitymethods.keyboard().keyPress(KeyEvent.VK_T);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_T);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_CONTROL);
		
		Set<String> pcid = driver.getWindowHandles();
		ArrayList<String> arlis=new ArrayList<String>(pcid);
		String cid = arlis.get(1);
		driver.switchTo().window(cid);
		
		driver.get("https://test1payments.gaadi.com/");
		Thread.sleep(2000);
    }
    
    public void PB_SignIn() throws InterruptedException
    {
    	pb_sib.click();
    	Thread.sleep(5000);
    	//Thread.sleep(3*60*1000);
    }

    public void PB_EmailID()
    {
    	pb_email.sendKeys("dinesh.udgire@girnarsoft.co.in");
    }

    public void PB_Next1()
    {
    	pb_nextb1.click();
    }

    public void PB_Password()
    {
    	pb_pass.sendKeys(prop.getProperty("password")); 
    }

    public void PB_Next2()
    {
    	pb_nextb2.click();
    }

    //PB sign in over
    
    public void AccVerify() throws InterruptedException
    {
    	editbtn.click();
    	Thread.sleep(2000);
    	pannumber.sendKeys("pan no test");
    	pansubmit.click();
    	Thread.sleep(2000);
    	adharnumber.sendKeys("adhar no test");
    	adharsubmit.click();
    	Thread.sleep(2000);
    	cross.click();
    	Thread.sleep(5000);
    	enquiry.click();
    	Thread.sleep(6000);
    	
    	String cid = Utilitymethods.controlswitch(driver).get(0);
    	driver.switchTo().window(cid);
    	Thread.sleep(2000);
    }
    
    public void DealerPayment() throws InterruptedException, AWTException
    {
    	dealerpayment.click();
    	Thread.sleep(4000);
    	String dtoken = dealertoken.getText();
    	String dealtoken = dtoken.replace("Rs. ", "");
    	System.out.println(dealtoken);
    	Utilitymethods.dropdown(dealerpm, "Adjust amount from dealer ledger balance");
    	dtokenamt.sendKeys(dealtoken);
    	Thread.sleep(3000);
    	dtokensave.click();
    	Thread.sleep(9000);
    	
    	String id = Utilitymethods.controlswitch(driver).get(1);
    	driver.switchTo().window(id);
    	reconciliation_tab.click();
    	Thread.sleep(4000);
    	System.out.println("check 1");
    	recotemp.click();
    	Utilitymethods.scroll(driver);
    	Utilitymethods.scroll(driver);
    	Utilitymethods.scroll(driver);
    	Utilitymethods.scroll(driver);
    	Utilitymethods.scroll(driver);
    	
    	System.out.println("check 2");
    	Point loc = tickicon.getLocation();
    	int x = loc.getX();
    	int y = loc.getY();
    	System.out.println(x+" , "+y);
    	Utilitymethods.scrolltopertiele(driver, 2500, y);
    	Thread.sleep(2000);
    	Utilitymethods.keyboard().keyPress(KeyEvent.VK_RIGHT);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_RIGHT);
		System.out.println("r1");
		Utilitymethods.keyboard().keyPress(KeyEvent.VK_RIGHT);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_RIGHT);
		System.out.println("r2");
		Utilitymethods.keyboard().keyPress(KeyEvent.VK_RIGHT);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_RIGHT);
		
		
		
		Utilitymethods.actionsperform(driver).moveToElement(ledgericontemp);
		
		
    	System.out.println("check 3");
    	tickicon.click();
    	System.out.println("check 4");
    	Thread.sleep(3000);
    	utrtext.sendKeys("test utr");
    	amttext.sendKeys(dealtoken);
    	recopopsave.click();
    	Thread.sleep(4000);
    	String id1 = Utilitymethods.controlswitch(driver).get(0);
    	driver.switchTo().window(id1);
    	driver.navigate().refresh();
    	Thread.sleep(15000);
    	
    	String dealerbulkraw = dealerbulkfetch.getText();
    	String dealerbulk = dealerbulkraw.replace("Rs. ", "");
    	Utilitymethods.dropdown(dealerpm, "Adjust amount from dealer ledger balance");
    	dtokenamt.sendKeys(dealerbulk);
    	dtokensave.click();
    	Thread.sleep(8000);
    	
    	driver.switchTo().window(id);
    	pbsearch.click();
    	Thread.sleep(4000);
    	tickicon.click();
    	Thread.sleep(3000);
    	utrtext.sendKeys("test utr");
    	amttext.sendKeys(dealerbulk);
    	recopopsave.click();
    	Thread.sleep(4000);
    	driver.switchTo().window(id1);
    }
    
    public void SellerPayment() throws InterruptedException
    {
    	finance.click();
    	Thread.sleep(5000);
    	Utilitymethods.dropdown(dropdown, "C2D");
    	Thread.sleep(4000);
    	Utilitymethods.dropdown(sellerpurpose, "Token");
    	Thread.sleep(4000);
    	Utilitymethods.dropdown(sellertokendd, "100");
    	Thread.sleep(2000);
    	accsave.click();
    	Thread.sleep(2000);
    	sellerokbtn.click();
    	Thread.sleep(10000);
    	
    	String id = Utilitymethods.controlswitch(driver).get(1);
    	driver.switchTo().window(id);
    	paymentstab.click();
    	Thread.sleep(8000);
    	resetbtn.click();
    	Thread.sleep(4000);
    	enquiry.click();
    	Thread.sleep(8000);   
    	
    	String id1 = Utilitymethods.controlswitch(driver).get(0);
    	driver.switchTo().window(id1);
    	driver.navigate().refresh();
    	Thread.sleep(15000);
    	Utilitymethods.dropdown(dropdown, "C2D");
    	Utilitymethods.dropdown(sellerpurpose, "Bulk");
    	String sellerbulkraw = sellerbulkfetch.getText();
    	String sellerbulkraw1 = sellerbulkraw.replace("₹", "");
    	String sellerbulk = sellerbulkraw1.replace(",", "");
    	System.out.println(sellerbulk);
    	
    	sellerbulktext.sendKeys(sellerbulk);
    	accsave.click();
    	Thread.sleep(2000);
    	sellerokbtn.click();
    	Thread.sleep(10000);
    	
    	driver.switchTo().window(id);
    	resetbtn.click();
    	Thread.sleep(4000);
    	enquiry.click();
    	Thread.sleep(8000);
    	
    	driver.switchTo().window(id1);
    }
    
    public void Stockin() throws InterruptedException, AWTException
    {
    	stockintab.click();
    	Thread.sleep(5000);
    	stockindd.click();
    	Thread.sleep(2000);
    	stockinddtext.sendKeys("ncd_virtual yard delhi");
    	Utilitymethods.keyboard().keyPress(KeyEvent.VK_ENTER);
		Utilitymethods.keyboard().keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		stockinsave.click();
		Thread.sleep(6000);
    }
 
}
