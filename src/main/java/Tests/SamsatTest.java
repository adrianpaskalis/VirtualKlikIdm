package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageFactory.VirtualTestReports;
import PageFactory.driverTest;
import Pages.CheckoutPage;
import Pages.DaftarTrxPage;
import Pages.LoginPage;
import Pages.PaymentCenterPage;
import Pages.PulsaPage;
import Pages.SamsatPage;
import Pages.ThankYouPage;
import com.aventstack.extentreports.Status;

public class SamsatTest extends driverTest {
	LoginPage objLogin; 
	SamsatPage objSamsatPage; 
	CheckoutPage objCheckOutPage;
	PaymentCenterPage objPCFrame;
	ThankYouPage objTQPage;
	DaftarTrxPage objDaftarTrx;
	public	String testUrl; 
	 
	@Test (priority=1)
	public void goToLoginPage() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"safasfa");
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
		VirtualTestReports.getTest().log(Status.INFO, "Login Test Started");
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
		VirtualTestReports.getTest().log(Status.INFO, "Go To Category Samsat");
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
		VirtualTestReports.getTest().log(Status.INFO, "Go To Samsat Jatim");

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
		VirtualTestReports.getTest().log(Status.INFO, "Go To Samsat Banten");
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
		VirtualTestReports.getTest().log(Status.INFO, "Set Kode Bayar");
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
		VirtualTestReports.getTest().log(Status.INFO, "Set Nomor Polisi");
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
		VirtualTestReports.getTest().log(Status.INFO, "Set Nomor Mesin");
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
		VirtualTestReports.getTest().log(Status.INFO, "Set Nomor KTP");
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
		VirtualTestReports.getTest().log(Status.INFO, "Go To CheckOut Page");
		try {
			objSamsatPage = new SamsatPage(driver);
			objSamsatPage.clickButtonBayarJatim();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			
		}
	} 
	
	@Test(priority=8)
	public void goToCheckOutSamsatBanten() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO, "Go To Checkout");
		try {
			objSamsatPage = new SamsatPage(driver);
			objSamsatPage.clickButtonBayarBanten();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			
		}
	}
	
	@Test (priority=9)
	public void checkOutSamsat() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO, "Testing On Checkout");
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
		VirtualTestReports.getTest().log(Status.INFO, "Go To Payment Center");
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
		VirtualTestReports.getTest().log(Status.INFO, "Pilih Metode Bayar");
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
		VirtualTestReports.getTest().log(Status.INFO, "Click Button Bayar");
		try { 
			objPCFrame = new PaymentCenterPage(driver);
			objPCFrame.clickBayar();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {	
			e.printStackTrace();
			// TODO: handle exception
		}
	
		
	} 
	
	@Test (priority=13)
	public void TQPageTest() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO, "Testing on TQ Page");
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
		VirtualTestReports.getTest().log(Status.INFO, "Testing on Daftar Transaksi");
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
			String actualText = objDaftarTrx.popUpDaftarTrxIsDisplay();
			String expectedText = "Ringkasan Pembayaran";
			Assert.assertEquals(actualText, expectedText);
			System.out.println(actualText);
			System.out.println(expectedText);
		
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
