package Tests;

import org.testng.annotations.Test;

import PageFactory.driverTest;
import Pages.CheckoutPage;
import Pages.LoginPage;
import Pages.PaymentCenterPage;
import Pages.PlnPage; 



public class plnTest extends driverTest {
	LoginPage objLogin; 
	PlnPage objPlnPage; 
	CheckoutPage objCheckOutPage;
	PaymentCenterPage objPCFrame;
	public	String testUrl; 
	
  	@Test (priority=1)
  	public void goToLoginPage() throws InterruptedException{
		try {
			objLogin  = new LoginPage(driver);
			objLogin.clickButtonLoginHome();
			Thread.sleep(20);
			} catch (InterruptedException e) {
			
			// TODO: handle exception
			}
		}
  	
	@Test (priority=2)
	public void testLogin() throws InterruptedException{
		try { 
			objLogin  = new LoginPage(driver);
			objLogin.setUserName("0895634338579");
			objLogin.setPassword("indomaret");
			objLogin.clikcLogin(); 
			Thread.sleep(20);
			
			} catch (InterruptedException e) {
			// TODO: handle exception
			}
	}
	
	@Test (priority=3)
	public void goToPLNTest() throws InterruptedException{
		try { 
			objPlnPage  = new PlnPage(driver);
			objPlnPage.goToPLN();
			Thread.sleep(10);
			} catch (InterruptedException e) {
			// TODO: handle exception
			}	
	}  
	@Test (priority=4)
	public void goTokenListrikPLN() throws InterruptedException{ 
		try { 
			objPlnPage  = new PlnPage(driver);
			objPlnPage.gotToTokenListrikPLN();
			Thread.sleep(10);
			} catch (InterruptedException e) {
			// TODO: handle exception
			}
	} 
	@Test (priority=5)
	public void inputTokenPLN() throws InterruptedException{
		try { 
			objPlnPage  = new PlnPage(driver);
			objPlnPage.setInquiryPLN("10000000100");
			Thread.sleep(10);
			} catch (InterruptedException e) {
			// TODO: handle exception
			}
	}  
	
	@Test (priority=6)
	public void setDenomPLN() throws InterruptedException{
		try { 
			objPlnPage  = new PlnPage(driver);
			objPlnPage.setDenomPLN();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
			// TODO: handle exception
			}
		
		
	} 
	@Test (priority=7)
	public void setNominalPLN() throws InterruptedException{
		try { 
			objPlnPage  = new PlnPage(driver);
			objPlnPage.chooseDenomPLN();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
			// TODO: handle exception
			}

	} 
	
	@Test (priority=8)
	public void goToCheckOut() throws InterruptedException{
		try { 
			objPlnPage  = new PlnPage(driver);
			objPlnPage.clickButtonBayar();
			Thread.sleep(10);
			} catch (InterruptedException e) {
			// TODO: handle exception
			}
	
	} 
	
	@Test (priority=9, groups= "PLN Virtual")
	public void checkOutPLN() throws InterruptedException{
		try { 
			objCheckOutPage = new CheckoutPage(driver);
			objCheckOutPage.logoCheckoutIsDisplay();
			objCheckOutPage.konfirmasiPesananIsDisplay();
			objCheckOutPage.boxImagesIsDisplay();
			objCheckOutPage.deleteProduIsDisplay();
			objCheckOutPage.itemProdukVirtualIsDisplay();
			objCheckOutPage.itemSubtotalIsDisplay();
			objCheckOutPage.itemTotalIsDisplay();
			objCheckOutPage.inputCouponIsDisplay();
			objCheckOutPage.buttonAddCouponIsDisplay();	
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
			// TODO: handle exception
			}
		
	} 
	@Test (priority=10, groups= "PLN Virtual")
	public void goToPaymentCenter() throws InterruptedException{
		try { 
			objCheckOutPage = new CheckoutPage(driver);
			objCheckOutPage.goToPaymentCenter();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
			// TODO: handle exception
			}
	
	} 
	
	@Test (priority=11, groups= "PLN Virtual")
	public void PilihAlatBayar() throws InterruptedException{
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			objPCFrame.pickPayment();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
		
			// TODO: handle exception
			}
		
	} 
	
	@Test (priority=12, groups= "PLN Virtual")
	public void clickBayar() throws InterruptedException{
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			objPCFrame.clickBayar();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
		
			// TODO: handle exception
			}
	
	} 
	
	
}
