package Runner;

import org.openqa.selenium.WebDriver;

import automation.BaseClass;
import automation.Pom;

	public class runner extends BaseClass {
	    public static WebDriver driver = browser_Configuration("chrome");
	    
	    public static Pom pom = new Pom(driver); 
	    
      public static void main(String[] args) {
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		inputValueElement(pom.get_instance_LN().getUsername(), "praveenraj1222");
		
		inputValueElement(pom.get_instance_LN().getPassword(), "Praveen@123");
		
        clickonElement(pom.get_instance_LN().getLogin());
        
		inputValueElement(pom.get_instance_CD().getLocation(), "New York");
		
		inputValueElement(pom.get_instance_CD().getHotels(),"Hotel Sunshine");
		
		inputValueElement(pom.get_instance_CD().getroomtype(),"Super Deluxe");
		
		inputValueElement(pom.get_instance_CD().getRoomnos(),"8-Eight");
		
		inputValueElement(pom.get_instance_CD().getDatepickin(),"09/09/2022");
		
		inputValueElement(pom.get_instance_CD().getDatepickout(),"10/09/2022");
		
		inputValueElement(pom.get_instance_CD().getAdultroom(),"4-Four");
		
		inputValueElement(pom.get_instance_CD().getChilroom(),"3-Three");
		
        clickonElement(pom.get_instance_CD().getSubmit());	
        
        clickonElement(pom.get_instance_HS().getRadiobutton());
        
        clickonElement(pom.get_instance_HS().getContinue());
        
		inputValueElement(pom.get_instance_PD().getFirstname(),"Chandru");
		
		inputValueElement(pom.get_instance_PD().getlastname(),"Srinivasan");
		
		inputValueElement(pom.get_instance_PD().getAddress(), " 1511 Pillayar Kovil Thottam, Lakshmi Nagar, Bhavani,Erode-638316");
		
		inputValueElement(pom.get_instance_PD().getCcnum(), "1234567891234567");
		
		inputValueElement(pom.get_instance_PD().getCctype(), "VISA");
		
		inputValueElement(pom.get_instance_PD().getCcexpmonth(), "August");
		
		inputValueElement(pom.get_instance_PD().getCcexpyear(),  "2022");
		
		inputValueElement(pom.get_instance_PD().getCcvnum(),"123");
		 
		clickonElement(pom.get_instance_PD().getBooknow());
		
      }
}


