package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Resource.baseClass;
import com.Resource.constants;

import PageObjectModel.HomePageObject;
import PageObjectModel.loginPageObject;


public class LoginPageObject extends baseClass {
	
	@Test
	public void invalidLoginTest() throws IOException, InterruptedException {
		
		Thread.sleep(3000);
		
		HomePageObject hpo = new HomePageObject(driver);
		hpo.clickonmyAccount().click();
		hpo.clickonLogin().click();
		
	
		
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		loginPageObject lop = new loginPageObject(driver);
		
		lop.enteremail().sendKeys(RegisterTestcases.randomEmail);
		
		lop.enterPassword().sendKeys(constants.password);
		
		lop.clickonLogin().click();
		
		
		
	}

}
