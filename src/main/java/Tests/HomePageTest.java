package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageFactory.driverTest;
import Pages.HomePageVirtual;
import Pages.LoginPage;

public class HomePageTest extends driverTest {
	
	HomePageVirtual objHomePage;
	public	String testUrl; 

	
	@Test (priority=1, groups= "HomePageVirtual")
	public void UITestLogo() throws InterruptedException{
		try { 
			objHomePage  = new HomePageVirtual(driver);
			// login insert username + password
			objHomePage.logoIsDisplay();
		
		
			
			
		//	objHomePage = new HomePageVirtual(driver);
		//Assert.assertTrue(objHomePage.getProfileUsername().toLowerCase().contains("adrian paskalis"));
			Thread.sleep(20);
			
		} catch (InterruptedException e) {
		
			// TODO: handle exception
		}
		//membuat objek halaman login 
		
		
	} 
	
	@Test (priority=2, groups= "HomePageVirtual")
	public void UITestDownload() throws InterruptedException{
		try { 
			
			
			objHomePage  = new HomePageVirtual(driver);
			// login insert username + password
			objHomePage.downloadAppIsDisplay();
		
		
			
			
		//	objHomePage = new HomePageVirtual(driver);
		//Assert.assertTrue(objHomePage.getProfileUsername().toLowerCase().contains("adrian paskalis"));
			Thread.sleep(20);
			
		} catch (InterruptedException e) {
		
			// TODO: handle exception
		}
		//membuat objek halaman login 
		
		
	}
	
	

	
	@Test (priority=3, groups= "HomePageVirtual")
	public void UITestFacebook() throws InterruptedException{ 
		try { 
			objHomePage  = new HomePageVirtual(driver);
			// login insert username + password
			objHomePage.facebookIsDisplay();
		
		
			
			
		//	objHomePage = new HomePageVirtual(driver);
		//Assert.assertTrue(objHomePage.getProfileUsername().toLowerCase().contains("adrian paskalis"));
			Thread.sleep(20);
			
		} catch (InterruptedException e) {
		
			// TODO: handle exception
		}
		//membuat objek halaman login 
		
		
	} 

	@Test (priority=4, groups= "HomePageVirtual")
	public void UITestInstagram() throws InterruptedException{ 
		try { 
			objHomePage  = new HomePageVirtual(driver);
			// login insert username + password
			objHomePage.instagramIsDisplay();
		
		
			
			
		//	objHomePage = new HomePageVirtual(driver);
		//Assert.assertTrue(objHomePage.getProfileUsername().toLowerCase().contains("adrian paskalis"));
			Thread.sleep(20);
			
		} catch (InterruptedException e) {
		
			// TODO: handle exception
		}
		//membuat objek halaman login 
		
		
	} 

	@Test (priority=5, groups= "HomePageVirtual")
	public void UITestLayananPelanggan() throws InterruptedException{ 
		try { 
			objHomePage  = new HomePageVirtual(driver);
			// login insert username + password
			objHomePage.layananIsDisplay();
		
		
			
			
		//	objHomePage = new HomePageVirtual(driver);
		//Assert.assertTrue(objHomePage.getProfileUsername().toLowerCase().contains("adrian paskalis"));
			Thread.sleep(20);
			
		} catch (InterruptedException e) {
		
			// TODO: handle exception
		}
		//membuat objek halaman login 
		
		
	} 
	
	@Test (priority=6, groups= "HomePageVirtual")
	public void UITestDaftarTrx() throws InterruptedException{ 
		try { 
			objHomePage  = new HomePageVirtual(driver);
			// login insert username + password
			objHomePage.daftarTrxIsDisplay();
		
		
			
			
		//	objHomePage = new HomePageVirtual(driver);
		//Assert.assertTrue(objHomePage.getProfileUsername().toLowerCase().contains("adrian paskalis"));
			Thread.sleep(20);
			
		} catch (InterruptedException e) {
		
			// TODO: handle exception
		}
		//membuat objek halaman login 
		
		
	} 
	
	@Test (priority=7, groups= "HomePageVirtual")
	public void UITestItemSaldo() throws InterruptedException{ 
		try { 
			objHomePage  = new HomePageVirtual(driver);
			// login insert username + password
			objHomePage.itemSaldoIsDisplay();
		
		
			
			
		//	objHomePage = new HomePageVirtual(driver);
		//Assert.assertTrue(objHomePage.getProfileUsername().toLowerCase().contains("adrian paskalis"));
			Thread.sleep(20);
			
		} catch (InterruptedException e) {
		
			// TODO: handle exception
		}
		//membuat objek halaman login 
		
		
	} 

	@Test (priority=8, groups= "HomePageVirtual")
	public void UITestUserProfile() throws InterruptedException{ 
		try { 
			objHomePage  = new HomePageVirtual(driver);
			// login insert username + password
			objHomePage.profileIsDisplay();
		
		
			
			
		//	objHomePage = new HomePageVirtual(driver);
		//Assert.assertTrue(objHomePage.getProfileUsername().toLowerCase().contains("adrian paskalis"));
			Thread.sleep(20);
			
		} catch (InterruptedException e) {
		
			// TODO: handle exception
		}
		//membuat objek halaman login 
		
		
	} 
}
