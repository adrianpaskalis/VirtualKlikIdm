package Tests;

import org.testng.annotations.Test;

import PageFactory.driverTest;
import Pages.CheckoutPage;
import Pages.LoginPage;
import Pages.PaymentCenterPage;
import Pages.PulsaPage;
import Pages.SamsatPage;

public class SamsatTest extends driverTest {
	LoginPage objLogin; 
	SamsatPage objSamsatPage; 
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
	public void goToSamsatTest() throws InterruptedException{
		try { 
			objSamsatPage  = new SamsatPage(driver);
			objSamsatPage.goToSamsat();
			Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			// TODO: handle exception
			}
		
	} 
	
	@Test (priority=4)
	public void goToSamsatJatim() throws InterruptedException{ 

		try { 
			objSamsatPage  = new SamsatPage(driver);
			objSamsatPage.pilihSamsatJatim();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {	
			e.printStackTrace();
			// TODO: handle exception
		}
			
	} 
	
	@Test (priority=4)
	public void goToSamsatBanten() throws InterruptedException{ 

		try { 
			objSamsatPage  = new SamsatPage(driver);
			objSamsatPage.pilihSamsatBanten();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {	
			e.printStackTrace();
			// TODO: handle exception
		}
			
	} 
	
	@Test (priority=5)
	public void setKodePembayaran() throws InterruptedException{
		try { 
			objSamsatPage  = new SamsatPage(driver);
			objSamsatPage.setKodePembayaran("DEV00000");	
		
			Thread.sleep(20);
			
		} catch (InterruptedException e) {		
			e.printStackTrace();
			// TODO: handle exception
		}
	
	}  
	
	@Test (priority=5)
	public void setNomorPolisi() throws InterruptedException{
		try { 
			objSamsatPage  = new SamsatPage(driver);
			objSamsatPage.setNomorPolisi("DEV00000");	
		
			Thread.sleep(20);
			
		} catch (InterruptedException e) {		
			e.printStackTrace();
			// TODO: handle exception
		}
	
	}  
	
	@Test (priority=6)
	public void setNomorMesin() throws InterruptedException{
		try { 
			objSamsatPage  = new SamsatPage(driver);
			objSamsatPage.setNomorMesin("DEV00000");
			Thread.sleep(20);
		
		} catch (InterruptedException e) {	
			e.printStackTrace();
			// TODO: handle exception
			
		}
	
	} 
	
	@Test (priority=7)
	public void setNomorKTP() throws InterruptedException{
		try {
			objSamsatPage = new SamsatPage(driver);
			objSamsatPage.setNomorKTP("3603281311980003");
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=8)
	public void goToCheckOutSamsatJatim() throws InterruptedException{
		try {
			objSamsatPage = new SamsatPage(driver);
			objSamsatPage.clickButtonBayarJatim();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			
		}
	} 
	
	@Test(priority=8)
	public void goToCheckOutSamsatBanten() throws InterruptedException{
		try {
			objSamsatPage = new SamsatPage(driver);
			objSamsatPage.clickButtonBayarBanten();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			
		}
	}
	
	@Test (priority=9)
	public void checkOutSamsat() throws InterruptedException{
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
