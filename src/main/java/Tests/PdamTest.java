package Tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PageFactory.VirtualTestReports;
import PageFactory.driverTest;
import Pages.CheckoutPage;
import Pages.DaftarTrxPage;
import Pages.LoginPage;
import Pages.PaymentCenterPage;
import Pages.PbbPages;
import Pages.PdamPages;
import Pages.ThankYouPage;

public class PdamTest extends driverTest {
	LoginPage objLogin; 
	PdamPages  objPdamPage; 
	CheckoutPage objCheckOutPage;
	PaymentCenterPage objPCFrame;
	ThankYouPage objTQPage;
	DaftarTrxPage objDaftarTrx;
	public	String testUrl;  
	
	
	@Test (priority=1)
	public void goToLoginPage() {
		VirtualTestReports.getTest().log(Status.INFO,"Go To Website");
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
		VirtualTestReports.getTest().log(Status.INFO,"Login Tests");
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
	public void goToPdamTest() {
		VirtualTestReports.getTest().log(Status.INFO,"Go To PDAM Test");
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
		VirtualTestReports.getTest().log(Status.INFO,"Go To PDAM Yogyakarta");
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
		VirtualTestReports.getTest().log(Status.INFO,"search Kota PDAM");
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
		VirtualTestReports.getTest().log(Status.INFO,"Choose Input Text PDAM");
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
		VirtualTestReports.getTest().log(Status.INFO,"btn Cancel Book Test PDAM");
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
		VirtualTestReports.getTest().log(Status.INFO,"Input Customer Number PDAM");
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
		VirtualTestReports.getTest().log(Status.INFO,"Go To Checkout PDAM");
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
		VirtualTestReports.getTest().log(Status.INFO,"Checkout Test");
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
		VirtualTestReports.getTest().log(Status.INFO,"Go To Payment Center");
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
		VirtualTestReports.getTest().log(Status.INFO,"Choose Available Payment Methods");
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
	
	@Test (priority=14)
	public void TQPageTest() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"ThankYou Page Test");
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
	
	@Test (priority=15)
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
