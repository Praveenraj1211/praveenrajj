package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSearching {
public WebDriver driver;
	
	public HotelSearching (WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name=\"radiobutton_0\"]")
	private WebElement radiobutton;
	
	
	public WebElement getRadiobutton() {
		return radiobutton;
	}

	@FindBy(xpath = "//input[@name=\"continue\"]")
	private WebElement Continue;

	public WebElement getContinue() {
		return Continue;
	}

	
	
	
	
	

}


