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
	
  	@Test (priority=1, groups= "PLN Virtual")
  	public void goToLoginPage() throws InterruptedException{
		try {
			objLogin  = new LoginPage(driver);
			
			objLogin.clickButtonLoginHome();
			
			Thread.sleep(20);
			
		} catch (InterruptedException e) {
			
			// TODO: handle exception
		}
		}
	@Test (priority=2, groups= "PLN Virtual")
	public void testLogin() throws InterruptedException{
		try { 
			objLogin  = new LoginPage(driver);
			// login insert username + password
			objLogin.setUserName("0895634338579");
			objLogin.setPassword("indomaret");
		
			// klik buton login 
			objLogin.clikcLogin(); 
			
		//	objHomePage = new HomePageVirtual(driver);
		//Assert.assertTrue(objHomePage.getProfileUsername().toLowerCase().contains("adrian paskalis"));
			Thread.sleep(20);
			
		} catch (InterruptedException e) {
		
			// TODO: handle exception
		}
		//membuat objek halaman login 
		
		
	}
	
	@Test (priority=3, groups= "PLN Virtual")
	public void goToPLNTest() throws InterruptedException{
		try { 
			objPlnPage  = new PlnPage(driver);
			// login insert username + password
			objPlnPage.goToPLN();
			
		
		
			
			
		//	objHomePage = new HomePageVirtual(driver);
		//Assert.assertTrue(objHomePage.getProfileUsername().toLowerCase().contains("adrian paskalis"));
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
		
			// TODO: handle exception
		}
		//membuat objek halaman login 
		
		
	}  
	@Test (priority=4, groups= "PLN Virtual")

	public void goTokenListrikPLN() throws InterruptedException{ 

		try { 
			objPlnPage  = new PlnPage(driver);
			// login insert username + password
			objPlnPage.gotToTokenListrikPLN();
			
		
		
			
			
		//	objHomePage = new HomePageVirtual(driver);
		//Assert.assertTrue(objHomePage.getProfileUsername().toLowerCase().contains("adrian paskalis"));
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
		
			// TODO: handle exception
		}
		//membuat objek halaman login 
		
		
	} 
	@Test (priority=5, groups= "PLN Virtual")
	public void inputTokenPLN() throws InterruptedException{
		try { 
			objPlnPage  = new PlnPage(driver);
			// login insert username + password
			objPlnPage.setInquiryPLN("10000000100");
	
		//	objHomePage = new HomePageVirtual(driver);
		//Assert.assertTrue(objHomePage.getProfileUsername().toLowerCase().contains("adrian paskalis"));
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
		
			// TODO: handle exception
		}
		//membuat objek halaman login 
		
		
	}  
	
	@Test (priority=6, groups= "PLN Virtual")
	public void setDenomPLN() throws InterruptedException{
		try { 
			objPlnPage  = new PlnPage(driver);
			// login insert username + password
			objPlnPage.setDenomPLN();
	
		//	objHomePage = new HomePageVirtual(driver);
		//Assert.assertTrue(objHomePage.getProfileUsername().toLowerCase().contains("adrian paskalis"));
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
		
			// TODO: handle exception
		}
		//membuat objek halaman login 
		
		
	} 
	@Test (priority=7, groups= "PLN Virtual")
	public void setNominalPLN() throws InterruptedException{
		try { 
			objPlnPage  = new PlnPage(driver);
			// login insert username + password
			objPlnPage.chooseDenomPLN();
	
		//	objHomePage = new HomePageVirtual(driver);
		//Assert.assertTrue(objHomePage.getProfileUsername().toLowerCase().contains("adrian paskalis"));
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
		
			// TODO: handle exception
		}
		//membuat objek halaman login 
		
		
	} 
	
	@Test (priority=8, groups= "PLN Virtual")
	public void goToCheckOut() throws InterruptedException{
		try { 
			objPlnPage  = new PlnPage(driver);
			// login insert username + password
			objPlnPage.clickButtonBayar();
	
		//	objHomePage = new HomePageVirtual(driver);
		//Assert.assertTrue(objHomePage.getProfileUsername().toLowerCase().contains("adrian paskalis"));
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
		
			// TODO: handle exception
		}
		//membuat objek halaman login 
		
		
	} 
	
	@Test (priority=9, groups= "PLN Virtual")
	public void checkOutPLN() throws InterruptedException{
		try { 
			//objPlnPage  = new PlnPage(driver);
			// login insert username + password
			//objPlnPage.clickButtonBayar();
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
		
		//	objHomePage = new HomePageVirtual(driver);
		//Assert.assertTrue(objHomePage.getProfileUsername().toLowerCase().contains("adrian paskalis"));
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
		
			// TODO: handle exception
		}
		//membuat objek halaman login 
		
		
	} 
	@Test (priority=10, groups= "PLN Virtual")
	public void goToPaymentCenter() throws InterruptedException{
		try { 
			//objPlnPage  = new PlnPage(driver);
			// login insert username + password
			//objPlnPage.clickButtonBayar();
			objCheckOutPage = new CheckoutPage(driver);
	
			objCheckOutPage.goToPaymentCenter();
		
		//	objHomePage = new HomePageVirtual(driver);
		//Assert.assertTrue(objHomePage.getProfileUsername().toLowerCase().contains("adrian paskalis"));
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
		
			// TODO: handle exception
		}
		//membuat objek halaman login 
		
		
	} 
	
	@Test (priority=11, groups= "PLN Virtual")
	public void PilihAlatBayar() throws InterruptedException{
		try { 
			//objPlnPage  = new PlnPage(driver);
			// login insert username + password
			//objPlnPage.clickButtonBayar();
			objPCFrame = new PaymentCenterPage(driver);
			objPCFrame.pickPayment();
			
	
			
		
		//	objHomePage = new HomePageVirtual(driver);
		//Assert.assertTrue(objHomePage.getProfileUsername().toLowerCase().contains("adrian paskalis"));
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
		
			// TODO: handle exception
		}
		//membuat objek halaman login 
		
		
	} 
	
	@Test (priority=12, groups= "PLN Virtual")
	public void clickBayar() throws InterruptedException{
		try { 
			//objPlnPage  = new PlnPage(driver);
			// login insert username + password
			//objPlnPage.clickButtonBayar();
			objPCFrame = new PaymentCenterPage(driver);
			objPCFrame.clickBayar();
			
	
			
		
		//	objHomePage = new HomePageVirtual(driver);
		//Assert.assertTrue(objHomePage.getProfileUsername().toLowerCase().contains("adrian paskalis"));
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
		
			// TODO: handle exception
		}
		//membuat objek halaman login 
		
		
	} 
}
