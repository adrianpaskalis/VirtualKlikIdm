package Pages;


import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import PageFactory.LoginWithPageFactory;
import PageFactory.driverTest;

public class PaymentCenterPage extends LoginWithPageFactory {
	public WebDriver driver; 
	
	@FindBy (id="paymentCenterFrame")
	public WebElement PCFrame;
	
	@FindBy (id="402")
	public WebElement BcaVA;
	
	@FindBy (id="payButton")
	public WebElement btnBayar; 

	public PaymentCenterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	} 
	
	public void pickPayment() throws NoSuchElementException{
		try {
			
			waitElement();
			PaymentCenterFrame();
			BcaVA.click();
			
			
		}catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
		
	}
	
		public void clickBayar() throws NoSuchElementException{
			try {
				
				waitElement();
				btnBayar.click();
				defaultContent();
				waitElement();
				
			}catch (NoSuchElementException e) {
				// TODO: handle exception
			} 
		
	}
} 
