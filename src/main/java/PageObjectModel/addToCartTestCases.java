package PageObjectModel;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addToCartTestCases {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iphone");
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		
		// we get the all details of iphone price
		
		WebElement iphonePrice = driver.findElement(By.xpath("//p[@class='price']"));
		
		String a = iphonePrice.getText();
		
		String word[]= a.split("\\s+");
		
		System.out.println(Arrays.toString(word));
		
		System.out.println(word[0]);
		
		// We need to remove the $ from the price $123.20
		
		String liveprice = word[0];
		
		String iphonePriceafterRemovingDollor = liveprice.replaceAll("[$,]", "");
		
		System.out.println(iphonePriceafterRemovingDollor);
		
		// Add the Samsung Details
		
		 driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[3]")).click();
		 
		 driver.findElement(By.xpath("//input[@placeholder='Search']")).clear();
		 
		 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Samsung");
		 
		 driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		 
		// Get the price of the Samsung
		 
		 WebElement samsungPrice = driver.findElement(By.xpath("//p[@class='price']"));
			String b = samsungPrice.getText();

			String wordsb[] = b.split("\\s+");

			System.out.println(Arrays.toString(wordsb));

			System.out.println(wordsb[0]);

			// We need to remove the $ from the price $242.00 (Samsung Phone)

			String samsung = wordsb[0];
			String samsungPriceafterRemovingDollor = samsung.replaceAll("[$,]", "");
			System.out.println(samsungPriceafterRemovingDollor);
			
			// Xpath of the Add the cart of Samsung Mobile
			
			driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[5]")).click();
			
			// convert the string to double iphone
			
			double d = Double.parseDouble(iphonePriceafterRemovingDollor);
			System.out.println("Iphone " + d);

			// Samsung
			
			double d1 = Double.parseDouble(samsungPriceafterRemovingDollor);
			System.out.println("Samsung " + d1);

			double f = Double.parseDouble(iphonePriceafterRemovingDollor)
					+ Double.parseDouble(samsungPriceafterRemovingDollor);

			System.out.println("Total Amount is " + f);
		}


		   
		
		
 }


