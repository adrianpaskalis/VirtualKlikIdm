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
	
	@FindBy (xpath="//*[@id=\"402\"]")
	
	public WebElement BcaVA;
	
	@FindBy (id="402")
	public WebElement ATM;

	
	@FindBy (id="payButton")
	public WebElement btnBayar; 

	public PaymentCenterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	} 
	
	public void pickPayment() throws NoSuchElementException{
		try {
			waitElementLong();
			PaymentCenterFrame();
			BcaVA.click();
			System.out.println("BCA VA BISA");
			
		}catch (NoSuchElementException e ) {
			System.out.println("ATM BISA");
			ATM.click();
		} 
		
	}
	
		public void clickBayar() throws NoSuchElementException{
			try {
				
				waitElementLong();
				btnBayar.click();
				defaultContent();
			
				
			}catch (NoSuchElementException e) {
				System.out.println(e);
			} 
		
	}
} 
