package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PageFactory.VirtualTestReports;
import PageFactory.driverTest;
import Pages.BpjsPages;
import Pages.CheckoutPage;
import Pages.DaftarTrxPage;
import Pages.HomePageVirtual;
import Pages.LoginPage;
import Pages.PaymentCenterPage;
import Pages.ThankYouPage;

public class BpjsTest extends driverTest{
	BpjsPages objBpjsPage;
	LoginPage objLogin; 
	HomePageVirtual objHomePage;
	CheckoutPage objCheckOutPage;
	PaymentCenterPage objPCFrame;
	ThankYouPage objTQPage;
	DaftarTrxPage objDaftarTrx;
	public	String testUrl; 

	
	
	@Test (priority=1)
	public void goToLoginPage() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"Go To Website for BPJS Test");
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
		VirtualTestReports.getTest().log(Status.INFO,"Login Test for BPJS Test");
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
	public void goToBPJSTest() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"Go To BPJS Test");
		try { 
			objBpjsPage  = new BpjsPages(driver);
			objBpjsPage.goToBpjs();
			Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();	
			}
		
	} 
	@Test (priority=4)
	public void searchBPJSKeyword() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"TS03 - TC16 Validate Search With Keyword'BPJS Kesehatan'");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.searchBPJSKeyword("BPJS Kesehatan");
			objHomePage.clickSearchBPJSKeyword();
			Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();	
			}
		
	} 
	@Test (priority=5)
	public void goToBpjsKesehatan() throws InterruptedException{ 
		VirtualTestReports.getTest().log(Status.INFO,"Go To Category BPJS Kesehatan");

		try { 
			objBpjsPage  = new BpjsPages(driver);
			objBpjsPage.goToSubCategoryBpjsKesehatan();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {	
			e.printStackTrace();
		}
			
	} 
	
	@Test (priority=6)
	public void inputInvalidMinNomorBpjs() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"TS05-EP06 Input Invalid Customer Number on BPJS");
		try { 
			objBpjsPage  = new BpjsPages(driver);
			objBpjsPage.inputCustomerNumberBpjs("1");	
			Thread.sleep(60);
			
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
	
	}  
	
	@Test (priority=7)
	public void validateInvalidMinNomorBpjs() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"TS05-EP07 Validate Input Invalid Customer Number on BPJS");
		try {
			objBpjsPage = new BpjsPages(driver);
			objBpjsPage.clickButtonBayarBpjsKesehatan();
			Thread.sleep(1000);
			
			objBpjsPage.ErorMessageBpjsIsDisplay();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test (priority=8)
	public void inputInvalidMaxnNomorBpjs() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"TS05-EP08 Input Invalid Max Customer Number on BPJS");
		try { 
			objBpjsPage  = new BpjsPages(driver);
			objBpjsPage.inputCustomerNumberBpjs("9999999999999");	
			Thread.sleep(60);
			
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
	
	}  
	
	@Test (priority=9)
	public void validateInvalidMaxNomorBpjs() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"TS05-EP09 Validate Input Invalid Max Customer Number on BPJS");
		try {
			objBpjsPage = new BpjsPages(driver);
			objBpjsPage.clickButtonBayarBpjsKesehatan();
			Thread.sleep(1000);
			
			objBpjsPage.ErorMessageBpjsIsDisplay();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test (priority=10)
	public void inputValidnNomorBpjs() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"TS05-EP10 Input Valid  Customer Number on BPJS");
		try { 
			objBpjsPage  = new BpjsPages(driver);
			objBpjsPage.inputCustomerNumberBpjs("DEV00000");	
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
	
	}
	
	@Test (priority=11)
	public void validateValidNomorBpjs() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"TS05-EP11 Validate Input Valid  Customer Number on BPJS");
		try {
			objBpjsPage = new BpjsPages(driver);
			objBpjsPage.clickButtonBayarBpjsKesehatan();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test (priority=12)
	public void checkOutBPJS() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"CheckOut BPJS Test");
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
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	} 
	
	@Test (priority=13)
	public void goToPaymentCenter() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"Go To Payment Center BPJS");
		try { 
			objCheckOutPage = new CheckoutPage(driver);
			objCheckOutPage.goToPaymentCenter();
			Thread.sleep(100);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		
	} 
	
	@Test (priority=14)
	public void PilihAlatBayar() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"Choose available payment Methods for BPJS Test");
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			objPCFrame.pickPayment();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	} 
	
	@Test (priority=15)
	public void clickBayar() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"Choose available Payment Methods for BPJS Test");
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			objPCFrame.clickBayar();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {	
			e.printStackTrace();
		}
	} 

	@Test (priority=16)
	public void TQPageTest() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"Thank You Page test for BPJS Test");
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
	
	@Test (priority=17)
	public void DaftarTrxTest() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"Order History Test for BPJS Test");
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
