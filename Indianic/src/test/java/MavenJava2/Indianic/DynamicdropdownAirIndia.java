package MavenJava2.Indianic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicdropdownAirIndia {
	
	WebDriver driver;
	
	@BeforeTest
	public void SetUp() throws InterruptedException  {
		
			//To enter browser_name and Url
		driver=HelperTest.BrowserUrl("chrome", "http://www.airindia.in/index.htm");
	}

@Test
//To Enter Departure and Arrival city Name 
public void DepartureArrivalCity() throws InterruptedException {
	
	
	WebElement from=driver.findElement(By.xpath(".//*[@id='from']"));
	from.click();
	from.sendKeys("ag");
	
	DepartureCity("Agra");
	
	
	Thread.sleep(1000);
	

	WebElement to =driver.findElement(By.cssSelector("#to"));
	to.click();
	to.sendKeys("ahm");
	
	ArrivalCity("Ahmedabad");
	
	
	
}
	
	//To close all browser event
@AfterClass
public void teardown() {
	
	driver.quit();
}
	
	//selectByOptions method: To select the data by selecting the city name entered by the user.
public void DepartureCity(String TextToSelect) {
	
	try {
	WebElement autoOptions=driver.findElement(By.id("ui-id-3"));
	
	WebDriverWait wait= new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.visibilityOf(autoOptions));
	
	List<WebElement> optionToSelect= autoOptions.findElements(By.cssSelector("[id='ui-id-3'] > li >a"));
	
	for(WebElement options:optionToSelect) {
		
		if(options.getText().contains(TextToSelect)) {
			System.out.println("Trying to select "+ TextToSelect);
			
			
			System.out.println("Departure From:  "+options.getText());
			 options.click();
			break;
			}
		}
	}
	catch (NoSuchElementException e) {
		System.out.println(e.getStackTrace());
	}
	catch (Exception e) {
		System.out.println(e.getStackTrace());
	}
}

public void ArrivalCity(String TextToSelect) {
	
	try {
	WebElement autoOptions=driver.findElement(By.id("ui-id-2"));
	
	WebDriverWait wait= new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.visibilityOf(autoOptions));
	
	List<WebElement> optionToSelect= autoOptions.findElements(By.cssSelector("[id='ui-id-2'] > li >a"));
	
	for(WebElement options:optionToSelect) {
		
		if(options.getText().contains(TextToSelect)) {
			System.out.println("Trying to select "+ TextToSelect);
			
			
			System.out.println("Arrives To:  "+options.getText());
			 options.click();
			break;
			}
		}
	}
	catch (NoSuchElementException e) {
		System.out.println(e.getStackTrace());
	}
	catch (Exception e) {
		System.out.println(e.getStackTrace());
	}
}

}
