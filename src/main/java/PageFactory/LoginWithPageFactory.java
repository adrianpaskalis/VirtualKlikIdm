package PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class LoginWithPageFactory {

    /**

     * All WebElements are identified by @FindBy annotation

     */

    public WebDriver driver;

//    @FindBy(name="Email")
//	
//    WebElement userNameVirtual;
//
//    @FindBy(name="password")
//
//    WebElement passwordVirtual;    
//
//    
//
//    @FindBy(xpath = "\"//*[@id=\\\"site-content\\\"]/div/div/div[1]/div/form/div[2]/button\"")

//    WebElement login;

    public LoginWithPageFactory(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    } 
    
    public void waitElement(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    } 
    
    public void waitElementLong(){
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

    } 
    
    public void currentUrl() {
		 driver.getCurrentUrl();

    }
    
    public void PaymentCenterFrame() {
    	driver.switchTo().frame("paymentCenterFrame");
    } 
    
    public void defaultContent() {
    	driver.switchTo().defaultContent();
    }
    
    //Set user name in textbox

//    public void setUserName(String strUserName){
//
//        userNameVirtual.sendKeys(strUserName);     
//    }
//
//    //Set password in password textbox
//
//    public void setPassword(String strPassword){
//
//    passwordVirtual.sendKeys(strPassword);
//
//    }
//
//    //Click on login button
//
//    public void clickLogin(){
//
//            login.click();
//
//    }  
//
//    //Get the title of Login Page
//
//    
//
//    /**
//
//     * This POM method will be exposed in test case to login in the application
//
//     * @param strUserName
//
//     * @param strPasword
//
//     * @return
//
//     */
//
//    public void loginToVirtual(String strUserName,String strPasword){
//
//        //Fill user name
//
//        this.setUserName(strUserName);
//
//        //Fill password
//
//        this.setPassword(strPasword);
//
//        //Click Login button
//
//        this.clickLogin();           
//
//    }

}