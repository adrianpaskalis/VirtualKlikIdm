package Tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PageFactory.VirtualTestReports;
import PageFactory.driverTest;
import Pages.CheckoutPage;
import Pages.DaftarTrxPage;
import Pages.LoginPage;
import Pages.PaymentCenterPage;
import Pages.PlnPage;
import Pages.ThankYouPage; 



public class plnTest extends driverTest {
	LoginPage objLogin; 
	PlnPage objPlnPage; 
	CheckoutPage objCheckOutPage;
	PaymentCenterPage objPCFrame;
	ThankYouPage objTQPage;
	DaftarTrxPage objDaftarTrx;
	public	String testUrl; 
	
  	@Test (priority=1)
  	public void goToLoginPage() throws InterruptedException{
  		VirtualTestReports.getTest().log(Status.INFO,"Go To Website");
		try {
			objLogin  = new LoginPage(driver);
			objLogin.clickButtonLoginHome();
			Thread.sleep(20);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
  	
	@Test (priority=2)
	public void testLogin() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"Login Test");
		try { 
			objLogin  = new LoginPage(driver);
			objLogin.setUserName("087881744704");
			objLogin.setPassword("indomaret");
			objLogin.clikcLogin(); 
			Thread.sleep(20);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	@Test (priority=3)
	public void goToPLNTest() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"Go To Category PLN");
		try { 
			objPlnPage  = new PlnPage(driver);
			objPlnPage.goToPLN();
			Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
	}  
	@Test (priority=4)
	public void goTokenListrikPLN() throws InterruptedException{ 
		VirtualTestReports.getTest().log(Status.INFO,"Go To Sub Category PLN");
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
		VirtualTestReports.getTest().log(Status.INFO,"Input Customer Number");
		try { 
			objPlnPage  = new PlnPage(driver);
			objPlnPage.setInquiryPLN("10000000100");
			Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}  
	
	@Test (priority=6)
	public void setDenomPLN() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"Choose Denominal for PLN");
		try { 
			objPlnPage  = new PlnPage(driver);
			objPlnPage.setDenomPLN();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		
	} 
	@Test (priority=7)
	public void setNominalPLN() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"Choose Denominal for PLN");
		try { 
			objPlnPage  = new PlnPage(driver);
			objPlnPage.chooseDenomPLN();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

	} 
	
	@Test (priority=8)
	public void goToCheckOut() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"Go To Checkout Page");
		try { 
			objPlnPage  = new PlnPage(driver);
			objPlnPage.clickButtonBayar();
			Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}
	
	} 
	
	@Test (priority=9)
	public void checkOutPLN() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"CheckOut Test");
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
			}
		
	} 
	@Test (priority=10)
	public void goToPaymentCenter() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"Go TO Payment Center");
		try { 
			objCheckOutPage = new CheckoutPage(driver);
			objCheckOutPage.goToPaymentCenter();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
	} 
	
	@Test (priority=11)
	public void PilihAlatBayar() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"Choose Available Methods");
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			objPCFrame.pickPayment();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	} 
	
	@Test (priority=12)
	public void clickBayar() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"Choose Available payment methods ");
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			objPCFrame.clickBayar();
			Thread.sleep(10);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
	} 
	
	@Test (priority=13)
	public void TQPageTest() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"Thank You Page Test");
		try {
			objTQPage = new ThankYouPage(driver);
			objTQPage.headerTQPIsDisplayed();
			objTQPage.keteranganStatusIsDisplayed();
			objTQPage.petunjukBayarIsDisplayed();
			objTQPage.lihatDaftarTrxIsDisplayed();
			objTQPage.backToHomeIsDisplayed();
			objTQPage.rincianPembayaranIsDisplayed();
			objTQPage.kodeBayarIsDisplayed();
			objTQPage.metodeBayarIsDisplayed();
			objTQPage.TanggalPesanIsDisplayed();
			objTQPage.batasWaktuIsDisplayed();
			objTQPage.totalBayarIsDisplayed();
			objTQPage.bottomListIsDisplayed();
			objTQPage.moreInfoIsDisplayed();
			objTQPage.goToDaftarTrx();

			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		
		
	}
	
	@Test (priority=14)
	public void DaftarTrxTest() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"Order History Test");
		try {
			objDaftarTrx = new DaftarTrxPage(driver);
			objDaftarTrx.introNextIsDisplay();
			objDaftarTrx.introCloseIsDisplay();
			objDaftarTrx.logoIsDisplay();
			objDaftarTrx.downloadAppIsDisplay();
			objDaftarTrx.facebookIsDisplay();
			objDaftarTrx.instagramIsDisplay();
			objDaftarTrx.layananIsDisplay();
			objDaftarTrx.daftarTrxIsDisplay();
			objDaftarTrx.itemSaldoIsDisplay();
			objDaftarTrx.profileIsDisplay();
			objDaftarTrx.iconRetailIsDisplay();
			objDaftarTrx.iconVirtualIsDisplay();
			objDaftarTrx.iconVirtualIsDisplay();
			objDaftarTrx.iconTiketIsDisplay();
			objDaftarTrx.btnDaftarTrxVirtualIsDisplay();
			objDaftarTrx.btnDaftarTrxRetailIsDisplay();
			objDaftarTrx.bbtnDaftarTrxTravelIsDisplay();
			objDaftarTrx.btnDaftarTrxFoodIsDisplay();
			objDaftarTrx.btnDaftarTrxTiketIsDisplay();
			objDaftarTrx.filterDaftarTrxIsDisplay();
			objDaftarTrx.detailSOdaftarTrxIsDisplay();
			objDaftarTrx.popUpDaftarTrxIsDisplay();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		
	
	
}
