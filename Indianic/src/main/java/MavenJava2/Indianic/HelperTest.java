package MavenJava2.Indianic;




	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class HelperTest {

		static WebDriver driver;
		 	public static  WebDriver BrowserUrl (String EnterBrowserName, String EnterUrlLink) {
			
			if(EnterBrowserName.equalsIgnoreCase("firefox")) {
				
				System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else if(EnterBrowserName.equalsIgnoreCase("Chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver2.20\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get(EnterUrlLink);
			
			return driver;
		}
		
	}



