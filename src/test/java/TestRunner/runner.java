package TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import automation.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)

	@CucumberOptions(
			features="D:\\Cucumber\\feature\\LoginFeature.feature",
	       
			glue="stepDefinitions",
			
			plugin = {"html:Cucumber_Report\\Rep.html", 
					"pretty",
					"json:target/cucumber.json"}
			)
			
			


	public class runner {
		
		public static WebDriver driver;
		
		@BeforeClass
		public static void set_up() {
			driver= BaseClass.browser_Configuration("chrome");
		}
		
		
	    
		
		
		
		@AfterClass
		public static void tear_Down() {
			driver.quit();
		}
		
	}


