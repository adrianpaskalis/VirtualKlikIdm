package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PageFactory.VirtualTestReports;
import PageFactory.driverTest;
import Pages.HomePageVirtual;
import Pages.LoginPage;

public class LoginTest extends driverTest { 
	//WebDriver driver; 
	LoginPage objLogin;
	public	String testUrl; 

	  	@Test 
	  	public void goToLoginPage() throws InterruptedException{ 
	  		VirtualTestReports.getTest().log(Status.INFO,"TS01-Go To Website");
			try {
					objLogin  = new LoginPage(driver);
					objLogin.clickButtonLoginHome();
					Thread.sleep(20);
				
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	  	
		@Test 
		public void LoginInvalidUsernameMin() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"TS01-EP01 - Login Invalid Min Username Valid Pass");
		try { 
				objLogin  = new LoginPage(driver);
				objLogin.setUserName("0");
				objLogin.setPassword("indomaret");
				objLogin.clikcLogin(); 
				objLogin.AlertOnLogin();
				Thread.sleep(20);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
		@Test 
		public void LoginInvalidUsernameMax() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"TS01-EP02 - Login Invalid Max Username Valid Pass");
		try { 
			objLogin  = new LoginPage(driver);
			objLogin.setUserName("08999999999999999999999999");
			objLogin.setPassword("indomaret");
			objLogin.clikcLogin(); 
			objLogin.AlertOnLogin();
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
		
//		@Test 
//		public void switchToAlert() throws InterruptedException {
//			
//		try {
//			objLogin  = new LoginPage(driver);
//	
//			Thread.sleep(10);
//		}catch (InterruptedException e){
//			e.printStackTrace();
//			
//		}
//	}
		@Test 
		public void LoginInvalidPasswordMin() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"TS01-EP04 - Login Valid Username Invalid Min Pass");
		try { 
			objLogin  = new LoginPage(driver);
			objLogin.setUserName("0895634338579");
			objLogin.setPassword("a");
			objLogin.clikcLogin(); 
			objLogin.AlertOnLogin();
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
		
		@Test 
		public void LoginInvalidPasswordMax() throws InterruptedException{
		VirtualTestReports.getTest().log(Status.INFO,"TS01-EP05 - Login Valid Username Invalid Max Pass");
		try { 
			objLogin  = new LoginPage(driver);
			objLogin.setUserName("0895634338579");
			objLogin.setPassword("abcdefghijklmnopqrstuvwxyz");
			objLogin.clikcLogin(); 
			objLogin.AlertOnLogin();
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		
		
		@Test 
			public void LoginValidUsernamePassword() throws InterruptedException{
			VirtualTestReports.getTest().log(Status.INFO,"TS01-EP03 - Login Valid Username and Valid Password");
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
		
} 


