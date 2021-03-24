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
	
	@FindBy (xpath="//*[@id=\"BPISAKU\"]")
	public WebElement IsakuXpath; 
	
	@FindBy (id="BPISAKU")
	public WebElement IsakuID;
	
	@FindBy (xpath="//*[@id=\"popupSeamlessISaku\"]/div/div[1]/div/div/div[1]/a")
	public WebElement CloseIsaku;
	
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
	
	public void pickPaymentIsaku() throws NoSuchElementException{
		try {
			waitElementLong();
			PaymentCenterFrame();
			IsakuID.click();
			System.out.println("ISaku BISA");
			
		}catch (NoSuchElementException e ) {
			System.out.println("Isaku BISA");
			IsakuXpath.click();
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
		
		public void clickBayarIsaku() throws NoSuchElementException{
			try {
				
				waitElementLong();
				btnBayar.click();
				waitElement(); 
				CloseIsaku.click();
				
				defaultContent();
			
				
			}catch (NoSuchElementException e) {
				System.out.println(e);
			} 
	}
} 
