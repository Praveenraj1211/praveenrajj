package automation;

import org.openqa.selenium.WebDriver;

public class Pom {
public WebDriver driver;
	
	private Login LN;
	
	private CoustomerDetails CD;
	
	private HotelSearching HS;
	
	private personalDetails PD;
	
	public Pom(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public Login get_instance_LN() {
		if (LN==null) {
			LN= new Login(driver); 
		}
		return LN;
	}
	
	public CoustomerDetails get_instance_CD() {
		if (CD==null) {
			CD=new CoustomerDetails(driver);
		}
		return CD;
	}
	
	public HotelSearching get_instance_HS() {
		if (HS==null) {
			HS=new HotelSearching(driver);
		}
		return HS;
	}
	
	public personalDetails get_instance_PD() {
		if (PD==null) {
			PD=new personalDetails(driver);
		}
		return PD;
	}

}


