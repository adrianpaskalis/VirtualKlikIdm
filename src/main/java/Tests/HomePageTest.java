package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PageFactory.VirtualTestReports;
import PageFactory.driverTest;
import Pages.HomePageVirtual;
import Pages.LoginPage;

public class HomePageTest extends driverTest {
	
	HomePageVirtual objHomePage;
	LoginPage objLogin; 
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
			}
		}
	
	@Test (priority=2)
	public void testLogin() {
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
	public void UITestLogo() {
		VirtualTestReports.getTest().log(Status.INFO,"TS02-TC01 Validate Logo Is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.logoIsDisplay();
			Thread.sleep(10);	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test (priority=4)
	public void verifyPageTitle() {
		try { 
			VirtualTestReports.getTest().log(Status.INFO,"TS02-TC01 Validate Title Virtual KlikIndomaret");
			String expectedTitle = "Beli Pulsa Online, Mudah & Aman | KlikIndomaret"; 
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle);
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	} 
	
	@Test (priority=5)
	public void UITestFacebook() throws InterruptedException{ 
		VirtualTestReports.getTest().log(Status.INFO,"TS02-TC02 Validate Icon Facebook is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.facebookIsDisplay();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test (priority=6)
	public void UITestInstagram() throws InterruptedException{ 
		VirtualTestReports.getTest().log(Status.INFO,"TS02-TC03 Validate Icon Instagram is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.instagramIsDisplay();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 

	@Test (priority=7)
	public void UITestDownload() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"TS02-TC04 Validate Download Apps Is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.downloadAppIsDisplay();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test (priority=8)
	public void UITestLayananPelanggan() throws InterruptedException{ 
		VirtualTestReports.getTest().log(Status.INFO,"TS02-TC05 Validate Customer Care Is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.layananIsDisplay();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	} 
	
	@Test (priority=9)
	public void UITestDaftarTrx() throws InterruptedException{ 
		VirtualTestReports.getTest().log(Status.INFO,"TS02-TC06 Validate Order History Is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.daftarTrxIsDisplay();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Test (priority=10)
	public void UITestItemSaldo() throws InterruptedException{ 
		VirtualTestReports.getTest().log(Status.INFO,"TS02-TC07 Validate Item Saldo Is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.itemSaldoIsDisplay();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 

	@Test (priority=11)
	public void UITestUserProfile() throws InterruptedException{ 
		VirtualTestReports.getTest().log(Status.INFO,"TS02-TC08 Validate Profile Is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.profileIsDisplay();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	} 
	
	@Test (priority=12)
	public void UITestSearch() throws InterruptedException{ 
		VirtualTestReports.getTest().log(Status.INFO,"TS02-TC09 Validate Search Is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.searchIsDisplay();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	
	@Test (priority=13) 
	public void UITestBanner() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"TS02-TC10 Validate Banner Is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.bannerIsDisplay();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	} 
	
	@Test (priority=14) 
	public void btnNextBannerVirtualValidate() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"TS02-TC11 Validate Next Button Banner Is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.btnNextBannerVirtualValidate();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	
	@Test (priority=15) 
	public void btnPrevBannerVirtualValidate() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"TS02-TC12 Validate Prev Button Banner Is Display");
		try { 
			objHomePage  = new HomePageVirtual(driver);
			objHomePage.btnPrevBannerVirtualValidate();
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	
	
//	@Test (priority=16)
//	public void searchPulsa() throws InterruptedException{ 
//		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC13 Validate Search With Keyword 'Pulsa' ");
//		try { 
//			objHomePage  = new HomePageVirtual(driver);	
//			objHomePage.searchPulsaKeyword("Pulsa");
//			objHomePage.clickSearchPulsaKeyword();
//			Thread.sleep(10);
//			
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	} 
//	
//	@Test (priority=17)
//	public void searchPLN() throws InterruptedException{ 
//		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC14 Validate Search With Keyword 'Token' ");
//
//		try { 
//			objHomePage  = new HomePageVirtual(driver);	
//			objHomePage.searchPLNKeyword("Token");
//			objHomePage.clickSearchPLNKeyword();
//			Thread.sleep(10);
//			
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	@Test (priority=18)
//	public void searchSamsat() throws InterruptedException{ 
//		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC15 Validate Search With keyword 'Samsat Jawa Timur' ");
//
//		try { 
//			objHomePage  = new HomePageVirtual(driver);	
//			objHomePage.searchSamsatKeyword("Samsat Jawa timur");
//			objHomePage.clickSearchSamsatKeyword();
//			Thread.sleep(10);
//			
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	
//	@Test (priority=19)
//	public void searchBPJS() throws InterruptedException{ 
//		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC16 Validate Search With Keyword 'BPJS Sehat' ");
//
//		try { 
//			objHomePage  = new HomePageVirtual(driver);	
//			objHomePage.searchBPJSKeyword("BPJS sehat");
//			objHomePage.clickSearchBPJSKeyword();
//			Thread.sleep(10);
//			
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	} 
//	
//	@Test (priority=19)
//	public void searchPBB() throws InterruptedException{ 
//		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC17 Validate Search With Keyword 'PBB Jakarta'");
//
//		try { 
//			objHomePage  = new HomePageVirtual(driver);	
//			objHomePage.searchPBBKeyword("PBB Jakarta");
//			objHomePage.clickSearchPBBKeyword();
//			Thread.sleep(10);
//			
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	} 
//	
//	@Test (priority=20)
//	public void searchPDAM() throws InterruptedException{ 
//		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC18 Validate Search With Keyword 'PDAM Yogyakarta' ");
//		try { 
//			objHomePage  = new HomePageVirtual(driver);	
//			objHomePage.searchPDAMKeyword("PDAM yogyakarta");
//			objHomePage.clickSearchPDAMKeyword();
//			Thread.sleep(10);
//			
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}  
	//kurang validate category pulsa  test priority 21
	@Test (priority=21)
	public void validateCategoryPulsa() throws InterruptedException { 
		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC19 Validate Category Pulsa & Paket Data");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryPulsaIsDisplay(); 
			objHomePage.validateCategoryPulsa();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test (priority=22)
	public void validateCategoryEmoney() throws InterruptedException { 
		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC20 Validate Category Uang Elektronik");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryEmoneyIsDisplay(); 
			objHomePage.validateCategoryEmoney();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test (priority=23)
	public void validateCategoryESasmat() throws InterruptedException { 
		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC21 Validate Category ESamsat");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryESamsatIsDisplay(); 
			objHomePage.validateCategoryEsamsat();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test (priority=24)
	public void validateCategoryPLN() throws InterruptedException { 
		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC22 Validate Category PLN");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryPLNIsDisplay(); 
			objHomePage.validateCategoryPln();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test (priority=25)
	public void validateCategoryBPJS() throws InterruptedException { 
		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC23 Validate Category BPJS");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryBPJSIsDisplay(); 
			objHomePage.validateCategoryBpjs();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test (priority=26)
	public void validateCategoryInternet() throws InterruptedException { 
		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC24 Validate Category Internet dan TV Kabel");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryInternetTVKabelIsDisplay(); 
			objHomePage.validateCategoryInternetTVKabel();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test (priority=27)
	public void validateCategoryGame() throws InterruptedException { 
		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC25 Validate Category Voucher Game");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryVoucherGameIsDisplay(); 
			objHomePage.validateCategoryVoucherGame();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test (priority=28)
	public void validateCategoryStreaming() throws InterruptedException { 
		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC26 Validate Category Streaming");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryStreamingIsDisplay(); 
			objHomePage.validateCategoryStreaming();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test (priority=29)
	public void validateCategoryGas() throws InterruptedException { 
		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC27 Validate Category Gas");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryGasIsDisplay(); 
			objHomePage.validateCategoryGas();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test (priority=30)
	public void validateCategoryPBB() throws InterruptedException { 
		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC28 Validate Category PBB");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryPBBIsDisplay(); 
			objHomePage.validateCategoryPBB();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test (priority=31)
	public void validateCategoryPDAM() throws InterruptedException { 
		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC29 Validate Category PDAM");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryPDAMIsDisplay(); 
			objHomePage.validateCategoryPDAM();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test (priority=32)
	public void validateCategoryTelomPascaBayar() throws InterruptedException { 
		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC30 Validate Category Telkom & Telpon (Pasca Bayar)");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryTelkomTelponIsDisplay(); 
			objHomePage.validateCategoryTelkomTelpon();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test (priority=33)
	public void validateCategoryIPL() throws InterruptedException { 
		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC31 Validate Category Iurang Pemeliharaan Lingkungan");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryIPLIsDisplay(); 
			objHomePage.validateCategoryIPL();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test (priority=34)
	public void validateCategoryAsuransi() throws InterruptedException { 
		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC32 Validate Category Asuransi");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryAsuransiIsDisplay(); 
			objHomePage.validateCategoryAsuransi();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test (priority=35)
	public void validateCategoryMultiFinance() throws InterruptedException {
		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC33 Validate Category Multi Finance");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryMultiFinanceiIsDisplay(); 
			objHomePage.validateCategoryMultiFinance();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test (priority=36)
	public void validateCategoryPendidikan() throws InterruptedException { 
		VirtualTestReports.getTest().log(Status.INFO,"TS03-TC34 Validate Category Pendidikan");

		try { 
			objHomePage = new HomePageVirtual(driver); 
			objHomePage.categoryPendidikaniIsDisplay(); 
			objHomePage.validateCategoryPendidikan();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	

	
	
	
//	@Test (priority=12)
//	public void ValidateCategoryPulsa() {
//		try { 
//			
//		}
	//}
}
