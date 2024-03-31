package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageObject {

	public WebDriver driver; // Globally declared
	private By firstname = By.xpath("//input[@name='firstname']");

	private By lastname = By.xpath("//input[@name='lastname']");

	private By email = By.xpath("//input[@name='email']");

	private By telephone = By.xpath("//input[@name='telephone']");

	private By password = By.xpath("//input[@name='password']");

	private By passwordconfirm = By.xpath("//input[@name='confirm']");

	private By subscribe = By.xpath("(//input[@name='newsletter'])[2]");

	private By privatepolicy = By.xpath("//input[@name='agree']");

	private By continueButton = By.xpath("//input[@value='Continue']");
	
	private By firstNameErrorMsg = By.xpath("(//div[@class='text-danger'])[1]");

	private By lastNameErrorMsg = By.xpath("(//div[@class='text-danger'])[2]");
	
	public RegistrationPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub

		this.driver = driver2;
	}

	public WebElement enterfirstName() {

		return driver.findElement(firstname);

	}

	public WebElement enterlastName() {

		return driver.findElement(lastname);

	}

	public WebElement enterEmail() {

		return driver.findElement(email);

	}

	public WebElement enterTelephone() {

		return driver.findElement(telephone);

	}

	public WebElement enterPassword() {

		return driver.findElement(password);

	}

	public WebElement enterPasswordConfirm() {

		return driver.findElement(passwordconfirm);

	}

	public WebElement ClickonSubscribe() {

		return driver.findElement(subscribe);

	}

	public WebElement AcceptPrivatePolicy() {

		return driver.findElement(privatepolicy);

	}

	public WebElement ClickonContinueButton() {

		return driver.findElement(continueButton);

	}
	
	public WebElement CaptureFirstNameErrorMsg() {

		return driver.findElement(firstNameErrorMsg);
	
}
	
	public WebElement CaptureLastNameErrorMsg() {

		return driver.findElement(lastNameErrorMsg);
	
}
}
