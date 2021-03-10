package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageFactory.driverTest;
import Pages.HomePageVirtual;
import Pages.LoginPage;

public class LoginTest extends driverTest { 
	//String driverPath = "D:\\browserdrivers\\chromedriver88.exe";
	//WebDriver driver; 
	LoginPage objLogin;
	//HomePageVirtual objHomePage; 
	public	String testUrl; 

	
//		@BeforeTest
//			public void startApp() {
//				System.setProperty("webdriver.chrome.driver", "D:\\browserdrivers\\chromedriver88.exe");	
//				testUrl = "https://account.klikindomaret.com/?ReturnUrl=https://virtual.klikindomaret.com/";
//    
//				driver = new ChromeDriver(); 
//		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//				//maximize window
//				driver.manage().window().maximize();
//				// driver.navigate().to(testUrl);
//				driver.get(testUrl); 
//				}

	  
		@Test 
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

} 


