package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Resource.baseClass;
import com.Resource.commonMethods;
import com.Resource.constants;

import PageObjectModel.HomePageObject;
import PageObjectModel.RegistrationPageObject;

public class RegisterTestcases extends baseClass {

	public static String randomEmail = "";

	@Test
	public void verifyRegistrationwithBlankData() throws IOException, InterruptedException {

		Thread.sleep(3000);

		HomePageObject hpo = new HomePageObject(driver);

		commonMethods.putExplicitWait(driver, 10, hpo.clickonmyAccount());
		hpo.clickonmyAccount().click();
		hpo.clickonregister().click();

		RegistrationPageObject rop = new RegistrationPageObject(driver);

		rop.enterfirstName().clear();
		rop.enterfirstName().sendKeys("");
		rop.enterlastName().clear();
		rop.enterlastName().sendKeys("");
		rop.enterEmail().clear();
		rop.enterEmail().sendKeys("");

		rop.enterTelephone().sendKeys("");
		rop.enterPassword().sendKeys("");
		rop.enterPasswordConfirm().sendKeys("");

		rop.ClickonSubscribe().sendKeys("");

		rop.AcceptPrivatePolicy().click();

		rop.ClickonContinueButton().click();

//		SoftAssert sa = new SoftAssert();
//		
//		String firstNameErrorMsg = constants.firstNameErrorMsg;
//		
//		String lastNameErrorMsg = constants.lastNameErrorMsg;
//		
//		sa.assertEquals(rop.CaptureFirstNameErrorMsg().getText(), firstNameErrorMsg);
//		
//		sa.assertEquals(rop.CaptureLastNameErrorMsg().getText(), lastNameErrorMsg);
//		
//		sa.assertAll();

		commonMethods.handleAssertions(rop.CaptureFirstNameErrorMsg().getText(), constants.firstNameErrorMsg);

		commonMethods.handleAssertions(rop.CaptureLastNameErrorMsg().getText(), constants.lastNameErrorMsg);

	}

//	public String generateRandomEmail() {
//		
//		return System.currentTimeMillis()+"@gmail.com";
//	}

	@Test
	public void verifyRegistrationwithValidData() throws IOException, InterruptedException {

		Thread.sleep(3000);

		randomEmail = generateRandomEmail();

		RegistrationPageObject rop = new RegistrationPageObject(driver);

		commonMethods.putExplicitWait(driver, 10, rop.enterfirstName());

		rop.enterfirstName().clear();
		rop.enterfirstName().sendKeys(constants.firstname);
		rop.enterlastName().sendKeys(constants.Lastname);

		rop.enterEmail().sendKeys(randomEmail);

		rop.enterTelephone().sendKeys(constants.telephone);

		rop.enterPassword().sendKeys(constants.password);

		rop.enterPasswordConfirm().sendKeys(constants.confirmpassword);

		rop.ClickonSubscribe().click();

		rop.ClickonContinueButton().click();

//		
//		SoftAssert sa = new SoftAssert();
//		
//		String successURL = constants.successURL;
//		
//		sa.assertEquals(driver.getCurrentUrl(), successURL);
//		
//		sa.assertAll();

		commonMethods.handleAssertions(driver.getCurrentUrl(), constants.successURL);

	}

}
