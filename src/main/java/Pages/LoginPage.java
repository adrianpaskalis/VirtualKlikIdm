package Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import PageFactory.LoginWithPageFactory;

public class LoginPage extends LoginWithPageFactory{ 
// WebDriver driver;

	//By userNameVirtual = By.name("Email"); 
	//By passwordVirtual = By.name("Password");
	//By Login = By.xpath("//*[@id=\"site-content\"]/div/div/div[1]/div/form/div[2]/button");
	
 @FindBy(name="Email")
//	
 public WebElement userNameVirtual;

 @FindBy(name="Password")

public  WebElement passwordVirtual;    

  @FindBy(xpath ="//*[@id=\"site-content\"]/div/div/div[1]/div/form/div[2]/button")

 public  WebElement login;
	
	public  LoginPage (WebDriver driver) {
		super(driver);
	}  
	
	public void setUserName(String strUserName) throws NoSuchElementException{
		try {
			userNameVirtual.sendKeys(strUserName);
		} catch  (NoSuchElementException e) {
			// TODO: handle exception
		}
		
	} 
	
	public void setPassword(String strPassword) throws NoSuchElementException
	{
		try {
			waitElement();
			passwordVirtual.sendKeys(strPassword); 
			
		} catch ( NoSuchElementException e) {
			// TODO: handle exception
		}
	
	}
	
	public void clikcLogin() throws NoSuchElementException{
		try {
			waitElement();
			login.click();
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		}
		
	}
	 /**

     * This POM method will be exposed in test case to login in the application

     * @param strUserName

     * @param strPasword

     * @return

     */ 
//	  public void loginToVirtualIdm(String strUserName,String strPasword){
//
//	        //Fill user name
//
//	        this.setUserName(strUserName);
//
//	        //Fill password
//
//	        this.setPassword(strPasword);
//
//	        //Click Login button
//
//	        this.clikcLogin();        
//	    }

	}
	
	

