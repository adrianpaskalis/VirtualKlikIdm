package Tests;

import org.testng.annotations.Test;

import PageFactory.driverTest;
import Pages.CheckoutPage;
import Pages.LoginPage;
import Pages.PaymentCenterPage;
import Pages.PbbPages;
import Pages.PdamPages;

public class PdamTest extends driverTest {
	LoginPage objLogin; 
	PdamPages  objPdamPage; 
	CheckoutPage objCheckOutPage;
	PaymentCenterPage objPCFrame;
	public	String testUrl;  
	
	
	@Test (priority=1)
	public void goToLoginPage() {
		try {
			objLogin  = new LoginPage(driver);
			
			objLogin.clickButtonLoginHome();
			
			Thread.sleep(20);
			
			} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
			}
		}
	
	@Test (priority=2)
	public void testLogin() {
		try { 
			objLogin  = new LoginPage(driver);
			objLogin.setUserName("0895634338579");
			objLogin.setPassword("indomaret");
			objLogin.clikcLogin(); 
			Thread.sleep(20);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	@Test (priority=3)
	public void goToPdamTest() {
		try { 
			objPdamPage  = new PdamPages(driver);
			objPdamPage.goToPDAM();
			Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			// TODO: handle exception
			}
		
	} 
	
	@Test (priority=4)
	public void pilihNamaPDAM() {
		try {
			objPdamPage = new PdamPages(driver);
			objPdamPage.pilihNamaPDAM();
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test (priority=5)
	public void inputTextPDAM() {
		try {
			objPdamPage = new PdamPages(driver);
			objPdamPage.inputTextPDAM("yogyakarta");
			Thread.sleep(5);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
	} 
	
	@Test (priority=6)
	public void selectInputTextPDAM() {
		try {
			objPdamPage = new PdamPages(driver);
			objPdamPage.selectInputTextPDAM();
			Thread.sleep(5);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
	} 
	
	
	@Test (priority=7)
	public void btnCancelIsDisplay() { 
		try { 
			objPdamPage = new PdamPages(driver); 
			objPdamPage.btnCancelIsDisplay();
			Thread.sleep(5);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
	} 
	
	@Test (priority=8)
	public void inputCustomerNoPDAM() { 
		try {
			objPdamPage = new PdamPages(driver); 
			objPdamPage.inputCustomerNo("DEV00000");
			Thread.sleep(10);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
	} 
	
	@Test (priority=9)
	public void goToCheckoutPDAM() { 
		try {
			objPdamPage = new PdamPages(driver); 
			objPdamPage.clickButtonBayarPDAM();
			Thread.sleep(10);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
	} 
	
	@Test (priority=10)
	public void checkOutPDAM() throws InterruptedException{
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
			e.printStackTrace();
			// TODO: handle exception
		}
		
	} 
	
	@Test (priority=11)
	public void goToPaymentCenter() throws InterruptedException{
		try { 
			objCheckOutPage = new CheckoutPage(driver);
			objCheckOutPage.goToPaymentCenter();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	} 
	@Test (priority=12)
	public void PilihAlatBayar() throws InterruptedException{
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			objPCFrame.pickPayment();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	
	} 
	
	@Test (priority=13)
	public void clickBayar() throws InterruptedException{
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			objPCFrame.clickBayar();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {	
			e.printStackTrace();
			// TODO: handle exception
		}
	
		
	} 
	
	
}