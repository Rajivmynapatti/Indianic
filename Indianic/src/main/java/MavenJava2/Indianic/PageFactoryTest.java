package MavenJava2.Indianic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactoryTest {
	
	 WebDriver driver;

	public PageFactoryTest(WebDriver driver) {
		this.driver=driver;
		
	}
	@FindBy(id="username")
	WebElement userid;
	
	@FindBy(id="password")
WebElement pass;
	
	@FindBy(xpath=".//*[@id='login']/button")
	WebElement loginButton;
	
	public void ValidLogin(String user,String Pass) {
		
		userid.sendKeys(user);
		pass.sendKeys(Pass);
		loginButton.click();
	}
}
