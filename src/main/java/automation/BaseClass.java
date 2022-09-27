package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

		 public static WebDriver driver;
		public static WebDriver browser_Configuration(String type) {
			if (type.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
					"D:\\Cucumber\\driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "value");
		
			driver = new FirefoxDriver();
			
		}
			driver.manage().window().maximize();
			
			return driver;
			
		}
			public static void clickonElement(WebElement element) {
				element.click();
			}
			
			public static void inputValueElement(WebElement element,String data) {
				element.sendKeys(data);
			}
			public static void onclose() {

			driver.quit();
		}
			public static void getUrl(String url) {
				driver.get(url);
			}
			

	}


