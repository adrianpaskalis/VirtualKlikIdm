package Pages;


import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	
	@FindBy (id="RKPON")
	public WebElement cimbRekpon;
	
	@FindBy (id="saldoKlikCheck")
	public WebElement saldoKlik;
	
	@FindBy (xpath ="//*[@id=\"openSubTotal\"]")
	public WebElement SubTotal; 
	
	@FindBy (xpath="//*[@id=\"popupSeamlessISaku\"]/div/div[1]/div/div/div[1]/a")
	public WebElement CloseIsaku;
	
	@FindBy (id="payButton")
	public WebElement btnBayar; 
	
	@FindBy (xpath = "//*[@id=\"pc-backChannel\"]/a")
	public WebElement btnBack;
	
	

	public PaymentCenterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	} 
	
	public void validateIsaku() throws NoSuchElementException {
		try {
			
		
			IsakuXpath.click();
			
		
			btnBack.click();
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		}	
	}
	
	public void validateBCAVA() throws NoSuchElementException {
		try {
			
			
			BcaVA.click();
			
			btnBack.click();
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		}	
	} 
	
	public void validateATM() throws NoSuchElementException {
		try {
		
			ATM.click();
			
			btnBack.click();
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		}	
	}
	
	public void validateRekpon() throws NoSuchElementException {
		try {
			
		
			cimbRekpon.click();
			
			btnBack.click();
			defaultContent();
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		}	
	}
	
	
	public void validateSaldoKlik() throws NoSuchElementException {
		try {
			PaymentCenterFrame();
			waitElementClickable(cimbRekpon);
			cimbRekpon.click();
		
			btnBack.click();
			
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		}	
	}
	
	public void validateSubTotal() throws NoSuchElementException {
		try {
			PaymentCenterFrame();
			SubTotal.click();
			
	
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		}	
	}
	public void pickPayment() throws NoSuchElementException{
		try {
			waitElementLong();
			PaymentCenterFrame();
			BcaVA.click();
			//System.out.println("BCA VA BISA");
			
		}catch (NoSuchElementException e ) {
			//System.out.println("ATM BISA");
			e.printStackTrace();
			ATM.click();
		} 
		
	}
	
	public void pickPaymentIsaku() throws NoSuchElementException{
		try {
			waitElementLong();
			PaymentCenterFrame();
			IsakuID.click();
			//System.out.println("ISaku BISA");
			
		}catch (NoSuchElementException e ) {
			e.printStackTrace();
			//System.out.println("Isaku BISA");
			
			IsakuXpath.click();
		} 
		
	}
	
	
		public void clickBayar() throws NoSuchElementException{
			try {
				waitElementLong();
				btnBayar.click();
				defaultContent();
			}catch (NoSuchElementException e) {
				e.printStackTrace();
				//System.out.println(e);
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
				//System.out.println(e);
				e.printStackTrace();
			} 
	}
} 
