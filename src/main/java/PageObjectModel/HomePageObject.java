package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {
	
	public WebDriver driver;
	private By myAccount = By.xpath("//i[@class='fa fa-user']");
	
	private By register = By.xpath("//a[contains(text(),'Register')]");
	
	private By login = By.xpath("//a[contains(text(),'Login')]");
	
	
	public HomePageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
	}

	public WebElement clickonmyAccount() {
	
	return driver.findElement(myAccount);
		
	}
	
	public WebElement clickonregister() {
		
	return driver.findElement(register);
			
	}

	public WebElement clickonLogin() {
		
	return driver.findElement(login);
				
	}
}
