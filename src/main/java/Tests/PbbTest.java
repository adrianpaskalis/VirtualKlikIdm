package Tests;

import org.testng.annotations.Test;

import PageFactory.driverTest;
import Pages.CheckoutPage;
import Pages.DaftarTrxPage;
import Pages.LoginPage;
import Pages.PaymentCenterPage;
import Pages.PbbPages;
import Pages.SamsatPage;
import Pages.ThankYouPage;

public class PbbTest extends driverTest {
	LoginPage objLogin; 
	PbbPages  objPbbPage; 
	CheckoutPage objCheckOutPage;
	PaymentCenterPage objPCFrame;
//	ThankYouPage objTQPage;
	DaftarTrxPage objDaftarTrx;
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
	public void goToPbbTest() {
		try { 
			objPbbPage  = new PbbPages(driver);
			objPbbPage.goToPBB();
			Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			// TODO: handle exception
			}
		
	} 
	
	@Test (priority=4)
	public void goToPbbTangsel() { 

		try { 
			objPbbPage  = new PbbPages(driver);
			objPbbPage.pilihPBBTangsel();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {	
			e.printStackTrace();
			// TODO: handle exception
		}
			
	 }
	
	@Test (priority=5)
	public void goToPbbJakarta() { 

		try { 
			objPbbPage  = new PbbPages(driver);
			objPbbPage.pilihPBBJakarta();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {	
			e.printStackTrace();
			// TODO: handle exception
		}
			
	} 
	
	
	@Test (priority=6)
	public void inputNomorPajak() { 

		try { 
			objPbbPage  = new PbbPages(driver);
			objPbbPage.inputNomorPajak("DEV00000");
			Thread.sleep(10);
			
		} catch (InterruptedException e) {	
			e.printStackTrace();
			// TODO: handle exception
		}
			
	} 
	
	@Test (priority=7)
	public void logoPbbInputIsDisplay() {
		try { 
			objPbbPage = new PbbPages(driver); 
			objPbbPage.logoPBBisDisplay();
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test (priority=8)
	public void logoPBBTangselInputIsDisplay() {
		try { 
			objPbbPage = new PbbPages(driver); 
			objPbbPage.logoPBBTangselisDisplay();
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test (priority=9)
	public void btnCancelIsDisplay() { 
		try { 
			objPbbPage =  new PbbPages(driver);
			objPbbPage.btnCancelIsDisplay();
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test (priority=10)
	public void btnCancelTangselIsDisplay() { 
		try { 
			objPbbPage =  new PbbPages(driver);
			objPbbPage.btnCancelTangselIsDisplay();
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test (priority=11)
	public void clickListPajak() {
		try {
			objPbbPage =  new PbbPages(driver);
			objPbbPage.clickListPajak();
			Thread.sleep(6);
		} catch (InterruptedException e) {	
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	@Test (priority=12)
	public void clickListPajakTangsel() {
		try {
			objPbbPage =  new PbbPages(driver);
			objPbbPage.clickListPajakTangsel();
			Thread.sleep(6);
		} catch (InterruptedException e) {	
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	@Test (priority=13) 
	public void textInputTahunPajakIsDisplay() { 
		try {
			objPbbPage = new PbbPages(driver); 
			objPbbPage.textInputPajakIsDisplay();
			Thread.sleep(6);
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	@Test (priority=14) 
	public void textInputTahunPajakTangselIsDisplay() { 
		try {
			objPbbPage = new PbbPages(driver); 
			objPbbPage.textInputPajakTangselIsDisplay();
			Thread.sleep(6);
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	@Test (priority=15)
	public void pilihTahunPajak() {
		try {
			objPbbPage = new PbbPages(driver); 
			objPbbPage.pilihTahunPajak();
			Thread.sleep(6);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test (priority=16)
	public void pilihTahunPajakTangsel() {
		try {
			objPbbPage = new PbbPages(driver); 
			objPbbPage.pilihTahunPajakTangsel();
			Thread.sleep(6);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test (priority=16)
	public void goToCheckoutPbbJakarta() {
		try {
			objPbbPage = new PbbPages(driver); 
			objPbbPage.clickBtnBayarPBB();
			Thread.sleep(5);
		} catch (InterruptedException e){
			e.printStackTrace();
			
		}
	}
	
	@Test (priority=17)
	public void goToCheckoutPbbTangsel() {
		try {
			objPbbPage = new PbbPages(driver); 
			objPbbPage.clickBtnBayarPBBTangsel();
			Thread.sleep(5);
		} catch (InterruptedException e){
			e.printStackTrace();
			
		}
	}
	
	@Test (priority=18)
	public void checkOutPbb() throws InterruptedException{
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
	
	@Test (priority=19)
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
	@Test (priority=20)
	public void PilihAlatBayar() throws InterruptedException{
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			objPCFrame.pickPaymentIsaku();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	
	} 
	
	@Test (priority=21)
	public void clickBayar() throws InterruptedException{
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			objPCFrame.clickBayarIsaku();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {	
			e.printStackTrace();
			// TODO: handle exception
		}
	
		
	} 
	
//	@Test (priority=22)
//	public void TQPageTest() throws InterruptedException{
//		try {
//			objTQPage = new ThankYouPage(driver);
//			objTQPage.headerTQPIsDisplayed();
//			objTQPage.keteranganStatusIsDisplayed();
//			objTQPage.petunjukBayarIsDisplayed();
//			objTQPage.lihatDaftarTrxIsDisplayed();
//			objTQPage.backToHomeIsDisplayed();
//			objTQPage.rincianPembayaranIsDisplayed();
//			objTQPage.kodeBayarIsDisplayed();
//			objTQPage.metodeBayarIsDisplayed();
//			objTQPage.TanggalPesanIsDisplayed();
//			objTQPage.batasWaktuIsDisplayed();
//			objTQPage.totalBayarIsDisplayed();
//			objTQPage.bottomListIsDisplayed();
//			objTQPage.moreInfoIsDisplayed();
//			objTQPage.goToDaftarTrx();
//
//			Thread.sleep(10);
//			
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} 
//	}
	
	@Test (priority=22)
	public void DaftarTrxTest() throws InterruptedException{
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
