package Tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import PageFactory.driverTest;
import Pages.CheckoutPage;
import Pages.LoginPage;
import Pages.PaymentCenterPage;
import Pages.PlnPage;
import Pages.PulsaPage;

public class PulsaTest extends driverTest {
	LoginPage objLogin; 
	PulsaPage objPulsaPage; 
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
				e.printStackTrace();

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
			e.printStackTrace();

		}
	}
	
	@Test (priority=3)
	public void goToPulsaTest() throws InterruptedException{
		try { 
			objPulsaPage  = new PulsaPage(driver);
			objPulsaPage.goToPulsa();
			Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();

			// TODO: handle exception
			}
		
	}
	
	@Test (priority=4)
	public void goToCategoryPulsa() throws InterruptedException{ 

		try { 
			objPulsaPage  = new PulsaPage(driver);
			objPulsaPage.goToCategoryPulsa();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {	
			e.printStackTrace();
			// TODO: handle exception
		}
			
	} 
	
	@Test (priority=5)
	public void inputNomorPulsa() throws InterruptedException{
		try { 
			objPulsaPage  = new PulsaPage(driver);
			objPulsaPage.inputNomorPulsa("081500100100");	
		
			Thread.sleep(10);
			
		} catch (InterruptedException e) {		
			e.printStackTrace();

			// TODO: handle exception
		}
	
	}  
	
	@Test (priority=6)
	public void setDenomPulsa() throws InterruptedException{
		try { 
			objPulsaPage  = new PulsaPage(driver);
			objPulsaPage.pilihDenomPulsa();
			Thread.sleep(20);
		
		} catch (InterruptedException e) {	
			e.printStackTrace();
			// TODO: handle exception
		}
	
	} 
	
	@Test (priority=7)
	public void pilihPulsa25() throws InterruptedException{
		try {
			objPulsaPage = new PulsaPage(driver);
			objPulsaPage.pilihPulsa25();
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test (priority=8)
	public void goToCheckOutPulsa() throws InterruptedException{
		try {
			objPulsaPage = new PulsaPage(driver);
			objPulsaPage.clickButtonBayarPulsa();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test (priority=9)
	public void checkOutPulsa() throws InterruptedException{
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
	
	@Test (priority=10)
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
	
	@Test (priority=11)
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
	
	@Test (priority=12)
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
