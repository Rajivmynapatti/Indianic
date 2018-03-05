package MavenJava2.Indianic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	@FindBy(css=".block.scheduledForm.cf>li:nth-child(1)>#from")
	WebElement From;
	
	@FindBy(css=".block.scheduledForm.cf>li:nth-child(2)>#to")
	WebElement To;
	
	public void ValidLogin(String user,String Pass) {
		
		userid.sendKeys(user);
		pass.sendKeys(Pass);
		loginButton.click();
	}
		public void SelectCity (String from, String to) throws InterruptedException {
			From.sendKeys(from);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class*='ui-autocomplete']"))); 
			List <WebElement> listItems = driver.findElements(By.cssSelector("ui-menu-item"));
			
			listItems.get(0).click();
			
			To.sendKeys(to);
			WebDriverWait wait2 = new WebDriverWait(driver, 10);
			
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class*='ui-autocomplete']"))); 
			List <WebElement> listItems1 = driver.findElements(By.cssSelector("ui-menu-item"));
			
			listItems1.get(0).click();
			
	}
}
