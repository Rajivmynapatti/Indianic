package MavenJava2.Indianic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class WebdriverTest {
	
	
	WebDriver driver;
	@Test(priority=1)
	public void setup() throws InterruptedException {
		
		driver=HelperTest.browser("firefox", "https://the-internet.herokuapp.com/login");
		
		PageFactoryTest login=PageFactory.initElements(driver, PageFactoryTest.class);
		
		login.ValidLogin("tomsmith", "SuperSecretPassword!");
		
		Thread.sleep(2000);
	}

	@AfterTest
	
	public void teardown() {
		
		driver.quit();
		
		
	}
}
