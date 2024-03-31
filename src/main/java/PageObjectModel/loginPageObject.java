package PageObjectModel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObject {
	
	public WebDriver driver;  // Globally Declared 
	private By email = By.xpath("//input[@name='email']");
	
	private By password = By.xpath("//input[@name='password']");
	
	private By login = By.xpath("//input[@value='Login']");
	

	public loginPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
	}

	public WebElement enteremail() {
		
		return driver.findElement(email);
		
	}
	
	public WebElement enterPassword() {
		
		return driver.findElement(password);
		
	}
	
	public WebElement clickonLogin() {
		
		return driver.findElement(login);
		
	}
	
	
	
}
