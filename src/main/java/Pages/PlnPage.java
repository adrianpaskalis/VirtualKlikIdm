package Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import PageFactory.LoginWithPageFactory;

public class PlnPage extends LoginWithPageFactory {
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[4]/div/a")
	public WebElement IconPLN; 
	
	@FindBy (xpath="//*[@id=\"3f74698b-6cc6-4f84-b507-bb02eb2f9567\"]")
	public WebElement TokenListrikPLN;
	
	@FindBy (xpath="//*[@id=\"nomor_prabayar_NoMeter\"]")
	public WebElement InputToken; 
	
	@FindBy (xpath="//*[@id=\"3f74698b-6cc6-4f84-b507-bb02eb2f9567\"]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/div/div")
	public WebElement pilihDenom;

	@FindBy (xpath="//*[@id=\"3f74698b-6cc6-4f84-b507-bb02eb2f9567\"]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/div/ul/li[1]")
	public WebElement pilih20k;
	
	@FindBy (xpath="//*[@id=\"3f74698b-6cc6-4f84-b507-bb02eb2f9567\"]/div[3]/div/div[2]/button")
	public WebElement buttonBayar; 

	
 	public PlnPage(WebDriver driver) {
		super(driver);
	}
	
	public  void  goToPLN() throws NoSuchElementException{
		try { 
			
			waitElement();
			IconPLN.click();
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
		
	} 

	
	public  void  gotToTokenListrikPLN() throws NoSuchElementException{
		try { 
			
			waitElement();
			TokenListrikPLN.click();
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
		
	} 
	
	public  void  setInquiryPLN(String strInquiryPln) throws NoSuchElementException{
		try { 
			
			waitElement();
			InputToken.sendKeys(strInquiryPln);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
		
	} 
	
	
	public void setDenomPLN() throws NoSuchElementException{
		try {
			waitElement(); 
			pilihDenom.click();
			
		} catch (NoSuchElementException e) {
			
		}
	} 
	
	
	public void chooseDenomPLN() throws NoSuchElementException{
		try {
			waitElement(); 
			pilih20k.click();
			
		} catch (NoSuchElementException e) {
			
		}
	} 
	
	
	public void clickButtonBayar() throws NoSuchElementException{
		try {
			waitElementLong(); 
			buttonBayar.click();
			waitElementLong(); 
			
		} catch (NoSuchElementException e) {
			
		}
	}
}
